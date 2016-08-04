package com.cisco.iotsp.sample;

import java.util.ArrayList;
import java.util.List;

import com.cisco.iotsp.client.users.ApiException;
import com.cisco.iotsp.client.users.UserPoliciesApi;
import com.cisco.iotsp.client.users.model.*;
import com.cisco.iotsp.helper.ServiceApiHelper;

public class SampleUserPolicies {
	private UserPoliciesApi api;

	public SampleUserPolicies(String serviceAddr, String accessToken) {
		System.out.println(String.format("Sample client for users at %s", serviceAddr));
		api = ServiceApiHelper.getUserPoliciesApi(serviceAddr, accessToken);
	}

	/* not supported yet
	public String createUserPolicy(String accountAlias) {
		try {
			List<String> permList = new ArrayList<String>() {
				{
					add("MANAGE_THINGS");
					add("READ_THINGS");
					add("MANAGE_SCHEMAS");
					add("READ_SCHEMAS");
					add("MANAGE_USERS");
					add("CREATE_THING_CREDENTIAL");
					add("RESET_THING_CREDENTIAL");
					add("DELETE_THING_CREDENTIAL");
					add("CREATE_USER_CREDENTIAL");
					add("RESET_USER_CREDENTIAL");
					add("DELETE_USER_CREDENTIAL");
					add("MANAGE_CLAIMS");
					add("READ_CLAIMS");
					add("MANAGE_PRESENCE");
					add("READ_PRESENCE");
					add("READ_OBSERVATIONS");
					add("MANAGE_ACCOUNTS");
					add("MANAGE_MOCKS");
					add("READ_MOCKS");
					add("MANAGE_THING_DEFINITIONS");
					add("READ_THING_DEFINITIONS");
					add("READ_DATA_PATH_PROFILES");
					add("MANAGE_DATA_PATH_PROFILES");
				}
			};

			UserPolicyUnit polUnit = new UserPolicyUnit();
			polUnit.setAllowedPermissions(permList);

			List<FilterCriteria> conditions = new ArrayList<FilterCriteria>();
			polUnit.setConditions(conditions);

			List<String> resourceCrns = new ArrayList<String>();
			resourceCrns.add(String.format("crn|iot|||%s||", accountAlias));
			polUnit.setResourceCrns(resourceCrns);

			List<UserPolicyUnit> polUnitList = new ArrayList<UserPolicyUnit>();
			polUnitList.add(polUnit);

			UserPolicyCreateObject PolCreateObj = new UserPolicyCreateObject();
			PolCreateObj.setName("SDKTestPolicy");
			PolCreateObj.setPolicyUnits(polUnitList);

			UserPolicy newPolicy = api.createUserPolicy(PolCreateObj);

			System.out.printf("\n--- createUserPolicy success ---, policy = \n%s", newPolicy);

			return newPolicy.getUid();
		} catch (ApiException apiE) {
			System.out.printf("\n--- createUserPolicy failed !!! ---");
			System.out.printf("\ncode=%d\n msg=%s\n header=%s\n body=%s\n", apiE.getCode(), apiE.getMessage(),
					apiE.getResponseHeaders(), apiE.getResponseBody());
			System.out.println(apiE);
			apiE.printStackTrace();
			return "";
		} catch (Exception e) {
			System.out.println("\n--- createUserPolicy failed !!! ---");
			System.out.println(e);
			e.printStackTrace();
			return "";
		}
	}
	*/
	public boolean getUserPolicy(String userPolicyUid) {
		try {
			UserPolicy policy = api.getUserPolicy(userPolicyUid);
			System.out.printf("\n--- getUserPolicy ---, policy = \n%s", policy);

			return true;
		} catch (ApiException apiE) {
			System.out.printf("\n--- getUserPolicy failed !!! ---");
			System.out.printf("\ncode=%d\n msg=%s\n header=%s\n body=%s\n", apiE.getCode(), apiE.getMessage(),
					apiE.getResponseHeaders(), apiE.getResponseBody());
			System.out.println(apiE);
			apiE.printStackTrace();
			return false;
		} catch (Exception e) {
			System.out.println("\n--- getUserPolicy failed !!! ---");
			System.out.println(e);
			e.printStackTrace();
			return false;
		}
	}

	public String getUserPolicies() {
		try {
			PageUserPolicy pagePolicy = api.getUserPolicies(null, "name", "Ascending", 10, 0);
			System.out.printf("\n--- getUserPolicies succeed ---, pagePolicy = \n%s", pagePolicy);
			//For now, there is only one user policy for each account. that is the admin policy
			//Return user policy uid upon success
			String policyUid = pagePolicy.getItems().get(0).getUid();
			return policyUid;
		} catch (ApiException apiE) {
			System.out.printf("\n--- getUserPolicies failed !!! ---");
			System.out.printf("\ncode=%d\n msg=%s\n header=%s\n body=%s\n", apiE.getCode(), apiE.getMessage(),
					apiE.getResponseHeaders(), apiE.getResponseBody());
			System.out.println(apiE);
			apiE.printStackTrace();
			return "";
		} catch (Exception e) {
			System.out.println("\n--- getUserPolicies by crn failed !!! ---");
			System.out.println(e);
			e.printStackTrace();
			return "";
		}
	}

	/* not supported yet
	public boolean deleteUserPolicy(String userPolicyUid) {
		try {
			UserPolicy policy = api.deleteUserPolicy(userPolicyUid);
			System.out.println("--- deleteUserPolicy succeed --- ");
			System.out.println(policy);
			return true;
		} catch (ApiException apiE) {
			System.out.printf("\n--- deleteUserPolicy failed !!! ---");
			System.out.printf("\ncode=%d\n msg=%s\n header=%s\n body=%s\n", apiE.getCode(), apiE.getMessage(),
					apiE.getResponseHeaders(), apiE.getResponseBody());
			System.out.println(apiE);
			apiE.printStackTrace();
			return false;
		} catch (Exception e) {
			System.out.println("\n--- deleteUserPolicy failed !!! ---");
			System.out.println(e);
			e.printStackTrace();
			return false;
		}
	}
	*/
}
