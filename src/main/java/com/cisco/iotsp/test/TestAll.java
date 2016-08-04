package com.cisco.iotsp.test;

import java.util.UUID;

import com.cisco.iotsp.client.things.model.Thing;
import com.cisco.iotsp.helper.AuthenticationHelper;
import com.cisco.iotsp.sample.SampleAccounts;
import com.cisco.iotsp.sample.SampleAccountsCreate;
import com.cisco.iotsp.sample.SampleClaims;
import com.cisco.iotsp.sample.SampleClaimsCreate;
import com.cisco.iotsp.sample.SampleLastNObservationsApi;
import com.cisco.iotsp.sample.SampleObservations;
import com.cisco.iotsp.sample.SamplePresence;
import com.cisco.iotsp.sample.SampleSchemas;
import com.cisco.iotsp.sample.SampleSchemasCreate;
import com.cisco.iotsp.sample.SampleThings;
import com.cisco.iotsp.sample.SampleThingsCreate;
import com.cisco.iotsp.sample.SampleUsers;
import com.cisco.iotsp.sample.SampleUsersCreate;
import com.cisco.iotsp.sample.SampleUserPolicies;
import com.cisco.iotsp.sample.workflow.SampleExtendThing;
import com.cisco.iotsp.sample.workflow.SamplePostObservation;

public class TestAll {

	public static boolean testAccounts(String serviceAddr, String token, String accountAlias, String accoutUid) {
		try {
			SampleAccounts account = new SampleAccounts(serviceAddr, token);
			boolean successAccount = account.getAccount(accoutUid);
			boolean successAccounts = account.getAccounts(accountAlias);
			return successAccount && successAccounts;
		} catch (Exception e) {
			System.out.println("\n Test accounts failed!!! ---");
			System.out.println(e);
			e.printStackTrace();
			return false;
		}
	}

	public static boolean testUserPolicies(String serviceAddr, String token) {
		try {
			SampleUserPolicies policyApi = new SampleUserPolicies(serviceAddr, token);
			String policuUid= policyApi.getUserPolicies();
			boolean success = policyApi.getUserPolicy(policuUid);
			return success;
		} catch (Exception e) {
			System.out.println("\n Test accounts failed!!! ---");
			System.out.println(e);
			e.printStackTrace();
			return false;
		}
	}
	
	public static boolean testUsers(String serviceAddr, String token, String accountAlias) {
		try {
			// Test Users service
			SampleUsersCreate userCreateApi = new SampleUsersCreate(serviceAddr, token);
			SampleUsers userApi = new SampleUsers(serviceAddr, token);
			//String policyUid = String.format("%s~~admin-policy", accountAlias);
			String userUid = userCreateApi.createUser();
			System.out.println("Sleep 1 second after create a new user before query");
			Thread.sleep(1000);
			userApi.deleteUser(userUid);

			/*
			 * Comment out things that are not working yet
			 * userApi.getUser(userUid);
			 * userApi.getUsers(String.format("%s@Monsters.com", randomId));
			 */
		} catch (Exception e) {
			System.out.println("\n Test users failed!!! ---");
			System.out.println(e);
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public static boolean testSchemas(String serviceAddr, String token) {
		try {
			// Test Schemas service
			SampleSchemasCreate schemaCreate = new SampleSchemasCreate(serviceAddr, token);
			SampleSchemas schema = new SampleSchemas(serviceAddr, token);
			schema.getSystemSchemas();

			String schemaName1 = "sampleSchemaCustomerAddress";
			String schemaFile1 = String.format("src/main/resources/file/%s.json", schemaName1);

			String schemaUid1 = schemaCreate.createSchema(schemaFile1);
			System.out.println("Sleep 1 second after create the schema before query");
			Thread.sleep(1000);

			schema.getSchema(schemaUid1);
			schema.getSchemas(schemaName1, 20, 0);
			schema.deleteSchema(schemaUid1);

		} catch (Exception e) {
			System.out.println("\n Test schemas failed!!! ---");
			System.out.println(e);
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public static Thing testThings(String serviceAddr, String token, String accountAlias) {
		try {
			// Test Things service
			SampleThingsCreate sampleThingCreate = new SampleThingsCreate(serviceAddr, token);
			SampleThings sampleThing = new SampleThings(serviceAddr, token);
			Thing thing = sampleThingCreate.createThingFromJsonFile(accountAlias,
					"src/main/resources/file/sampleThing.json");
			System.out.println(String.format("The created thing's uid = %s", thing.getUid()));
			System.out.println("Sleep 1 second after create a new thing before query");
			Thread.sleep(1000);

			// String thingUid =
			// "SDK_Test6_Alias||a151c893-c7bc-48d6-8494-7e7775dcf3e5";
			sampleThing.getThingByUid(thing.getUid());
			sampleThing.getThingByKeyValue(accountAlias);
			sampleThing.getThingsByFilter();
			// thing.updateThing(thingUid);
			return thing;

		} catch (Exception e) {
			System.out.println("\n Test things failed!!! ---");
			System.out.println(e);
			e.printStackTrace();
			return null;
		}
	}

	private static boolean testPresence(String serviceAddr, String token, String thingUid) {
		try {
			// Test Presence service
			SamplePresence presence = new SamplePresence(serviceAddr, token);
			presence.updateKeepAliveTimestamp(thingUid, 10);
			presence.getPresence(thingUid);

			SampleLastNObservationsApi observ = new SampleLastNObservationsApi(serviceAddr, token);
			observ.getLastObservations(thingUid, 10, 0);

			presence.deletePresence(thingUid);

		} catch (Exception e) {
			System.out.println("\n Test Presence failed!!! ---");
			System.out.println(e);
			e.printStackTrace();
			return false;
		}
		return true;
	}

	private static boolean testObservation(String serviceAddr, String token) {
		try {

			// Test Observation service
			SampleObservations obApi = new SampleObservations(serviceAddr, token);
			String observationUid = "Where do I get Observation Uid?";
			obApi.getObservation(observationUid);
			String queryString = "how does query string look like?";
			obApi.getObservations(queryString, 20, 0);

		} catch (Exception e) {
			System.out.println("\n Test Observation failed!!! ---");
			System.out.println(e);
			e.printStackTrace();
			return false;
		}
		return true;
	}

	private static boolean testClaims(String serviceAddr, String token) {
		try {
			// Test Claims service
			SampleClaimsCreate claimCreate = new SampleClaimsCreate(serviceAddr, token);
			SampleClaims claim = new SampleClaims(serviceAddr, token);
			String claimUid = claimCreate.createClaimFromJsonFile("src/main/resources/file/sampleClaim.json");
			System.out.println("Sleep 1 second after create a new claim before query");
			Thread.sleep(1000);
			claim.getClaim(claimUid);
			claim.getClaims();
			claim.getClaimsByFilter(claimUid);

			// registration is not called by cloud app
			// SampleRegistration registration = new
			// SampleRegistration(serviceAddr, token);
			// registration.registerThing();

			claim.deleteClaim(claimUid);

		} catch (Exception e) {
			System.out.println("\n Test Claims failed!!! ---");
			System.out.println(e);
			e.printStackTrace();
			return false;
		}
		return true;
	}

	// Test workflows
	private static boolean testMergeThing(String accountAlias, String serviceAddr, String token) {
		try {
			SampleExtendThing extendThing = new SampleExtendThing(serviceAddr, token);
			boolean extendSuccess = extendThing.mergeThing(accountAlias);
			return extendSuccess;
		} catch (Exception e) {
			System.out.println("\n testExtendThing failed!!! ---");
			System.out.println(e);
			e.printStackTrace();
			return false;
		}
	}

	private static boolean testUpdateThing(String accountAlias, String serviceAddr, String token) {
		try {
			SampleExtendThing extendThing = new SampleExtendThing(serviceAddr, token);
			boolean extendSuccess = extendThing.updateThing(accountAlias);
			return extendSuccess;
		} catch (Exception e) {
			System.out.println("\n testUpdateThing failed!!! ---");
			System.out.println(e);
			e.printStackTrace();
			return false;
		}
	}

	private static boolean testPostObservations(String serviceAddr, String token, String accountAlias, String thingUid) {
		try {
			SamplePostObservation postOb = new SamplePostObservation(serviceAddr, token);
			boolean sucessPost = postOb.postMessage(accountAlias);
			return sucessPost;
		} catch (Exception e) {
			System.out.println("\n testPostObservations failed!!! ---");
			System.out.println(e);
			e.printStackTrace();
			return false;
		}
	}

	private static boolean testApi() throws InterruptedException {
		// Because Accounts & Users service still have problem, that an
		// account and user cannot be re-created after deletion.
		// To make test run repeatedly, use random id as account and user
		// identifier.
		String randomId = UUID.randomUUID().toString();
		String accountAlias = randomId;
		String adminPassWd = "incorrect";
		String adminEmail = String.format("%s@cisco.com", accountAlias);

		String serviceAddr = "10.203.31.49"; // change this to your clueter's IP address

		String accoutUid = SampleAccountsCreate.createAccount(serviceAddr, accountAlias, adminEmail, adminPassWd);

		System.out.println("Sleep 1 second after create a new account before query");
		Thread.sleep(1000);

		String token = AuthenticationHelper.getAccessToken(serviceAddr, adminEmail, adminPassWd, "iotspoauth2client",
				"iotspoauth2client");
		
		boolean successAccount = testAccounts(serviceAddr, token, accountAlias, accoutUid);
		boolean successPolicy = testUserPolicies(serviceAddr, token);
		
		
		boolean successUser = TestAll.testUsers(serviceAddr, token, accountAlias);
		boolean successSchema = TestAll.testSchemas(serviceAddr, token);

		Thing thing = TestAll.testThings(serviceAddr, token, accountAlias);
		boolean successThing = (thing != null);
		boolean successPresence = testPresence(serviceAddr, token, thing.getUid());
		boolean successOb = testObservation(serviceAddr, token);

		boolean claimSuccess = testClaims(serviceAddr, token);

		SampleThings thingApi = new SampleThings(serviceAddr, token);
		thingApi.deleteThing(thing.getUid());

		SampleAccounts account = new SampleAccounts(serviceAddr, token);
		account.deleteAccount(accoutUid);

		return successAccount && successPolicy && successUser && successSchema && successThing && successPresence & successOb &  claimSuccess;
	}

	private static boolean testWorkflow() throws InterruptedException {
		// Because Accounts & Users service still have problem, that an
		// account and user cannot be re-created after deletion.
		// To make test run repeatedly, use random id as account and user
		// identifier.
		String randomId = UUID.randomUUID().toString();
		String accountAlias = randomId;
		String adminPassWd = "incorrect";
		String adminEmail = String.format("%s@cisco.com", accountAlias);

		String serviceAddr = "10.203.31.49"; // change this to your clueter's IP address
		String accoutUid = SampleAccountsCreate.createAccount(serviceAddr, accountAlias, adminEmail, adminPassWd);

		System.out.println("Sleep 1 second after create a new account before query");
		Thread.sleep(1000);

		String token = AuthenticationHelper.getAccessToken(serviceAddr, adminEmail, adminPassWd, "iotspoauth2client", "iotspoauth2client");
		boolean mergeSuccess = true;
		boolean updateSuccess = true;
		boolean obSuccess = true;
		
		//Create thing 
		SampleThingsCreate sampleThingCreate = new SampleThingsCreate(serviceAddr, token);
		SampleThings thingApi = new SampleThings(serviceAddr, token);
		Thing thing = sampleThingCreate.createThingFromJsonFile(accountAlias, "src/main/resources/file/sampleThing.json");

		mergeSuccess = testMergeThing(accountAlias, serviceAddr, token);

		//Must delete sampleSchemaLocation before call testUpdateThing
		//because testUpdateThing will create sampleSchemaLocation
		SampleSchemas schemaApi = new SampleSchemas(serviceAddr, token);
		schemaApi.deleteSchemaByName("sampleSchemaLocation");
		System.out.println("Sleep 1 second after delete the schema before test updateThing");
		Thread.sleep(1000);
		
		updateSuccess = testUpdateThing(accountAlias, serviceAddr, token);
		thingApi.deleteThing(thing.getUid());
		
		System.out.println("Sleep 1 second after delete the thing, before testPostObservations");
		Thread.sleep(1000);

		obSuccess = testPostObservations(serviceAddr, token, accountAlias, thing.getUid());

		SampleAccounts account = new SampleAccounts(serviceAddr, token);
		account.deleteAccount(accoutUid);

		return mergeSuccess && updateSuccess && obSuccess;
	}

	public static void main(String[] args) {
		try {
			boolean successApi = true;
			successApi = testApi();
			boolean successWorkflow = true;
			successWorkflow = testWorkflow();

			if (successApi && successWorkflow) {
				System.out.println("\n !!!!! All Test Succeed !!!!!");
				System.exit(0);
			} else {
				System.out.println("\n !!!!! Some Test Failed !!!!!");
				System.exit(1);
			}

		} catch (InterruptedException ie) {
			System.out.println("\n Test failed!!! ---");
			System.out.println(ie);
			ie.printStackTrace();
			System.exit(1);

		} catch (Exception e) {
			System.out.println("\n Test failed!!! ---");
			System.out.println(e);
			e.printStackTrace();
			System.exit(1);
		}

	}

}
