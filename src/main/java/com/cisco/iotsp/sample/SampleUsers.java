//Copyright (c) 2016 by Cisco Systems, Inc. All rights reserved.
package com.cisco.iotsp.sample;

import java.util.UUID;

import com.cisco.iotsp.client.users.ApiException;
import com.cisco.iotsp.client.users.UserPoliciesApi;
import com.cisco.iotsp.client.users.UsersApi;
import com.cisco.iotsp.client.users.model.*;
import com.cisco.iotsp.helper.ClientHelper;
import com.cisco.iotsp.helper.ServiceApiHelper;

public class SampleUsers {
	private UsersApi api;
	private UserPoliciesApi apiPolicy;

	public SampleUsers(String serviceAddr, String accessToken) {
		System.out.println(String.format("Sample client for users at %s", serviceAddr));
		api = ServiceApiHelper.getUsersApi(serviceAddr, accessToken);
		apiPolicy = ServiceApiHelper.getUserPoliciesApi(serviceAddr, accessToken);

	}

	public String createUser() {
		try {
			//for now, there is only one user policy under each account. It's the admin policy, that can be used to create a user 
			PageUserPolicy policies = apiPolicy.getUserPolicies(null, "name", "Ascending", 10, 0);
			String policyUid = policies.getItems().get(0).getUid();
			
			String randomId = UUID.randomUUID().toString().replaceAll("-", "");
			UserCreateObject request = new UserCreateObject();
			request.setFirstName("MIKE");
			request.setLastName("WAZOWSKI");
			request.setEmailAddress(String.format("%s@Monsters.com", randomId));
			request.setPassword("Celia");
			Address address = new Address();
			address.setAddressLine1("One Eye Apt.");
			address.setAddressLine2("Top Scarer Street");
			address.setCity("Monster City");
			address.setState("CA");
			address.setCountry("USA");
			address.setZip4(1234);
			address.setZip5(12345);
			request.setAddress(address);
			request.setUserPolicyUid(policyUid);
			User user = api.createUser(request);
			System.out.printf("\n--- createUser success ---, user = \n%s", user);

			return user.getUid();
		} catch (ApiException apiE) {
			System.out.printf("\n--- deleteUser failed !!! ---");
			System.out.printf("\ncode=%d\n msg=%s\n header=%s\n body=%s\n", apiE.getCode(), apiE.getMessage(),
					apiE.getResponseHeaders(), apiE.getResponseBody());
			System.out.println(apiE);
			apiE.printStackTrace();
			return "";

		} catch (Exception e) {
			System.out.println("\n--- createUser failed !!! ---");
			System.out.println(e);
			e.printStackTrace();
			return "";
		}
	}

	public String getUser(String userUid) {
		try {
			User user = api.getUser(userUid);
			System.out.printf("\n--- getUser getUser ---, user = \n%s", user);

			return user.getUid();
		} catch (ApiException apiE) {
			System.out.printf("\n--- getUser failed !!! ---");
			System.out.printf("\ncode=%d\n msg=%s\n header=%s\n body=%s\n", apiE.getCode(), apiE.getMessage(),
					apiE.getResponseHeaders(), apiE.getResponseBody());
			System.out.println(apiE);
			apiE.printStackTrace();
			return "";
		} catch (Exception e) {
			System.out.println("\n--- getUser failed !!! ---");
			System.out.println(e);
			e.printStackTrace();
			return "";
		}
	}

	public boolean getUsers(String email) {
		try {
			PageUser user = api.getUsers(email, "lastName", "Ascending", 20, 0);
			System.out.printf("\n--- getUsers by email succeed ---, user = \n%s", user);

			return true;
		} catch (ApiException apiE) {
			System.out.printf("\n--- getUsers failed !!! ---");
			System.out.printf("\ncode=%d\n msg=%s\n header=%s\n body=%s\n", apiE.getCode(), apiE.getMessage(),
					apiE.getResponseHeaders(), apiE.getResponseBody());
			System.out.println(apiE);
			apiE.printStackTrace();
			return false;
		} catch (Exception e) {
			System.out.println("\n--- getUsers by email failed !!! ---");
			System.out.println(e);
			e.printStackTrace();
			return false;
		}
	}

	public boolean deleteUser(String userUid) {
		try {
			User user = api.deleteUser(userUid);
			System.out.println("--- deleteUser succeed --- ");
			System.out.println(user);
			return true;
		} catch (ApiException apiE) {
			System.out.printf("\n--- deleteUser failed !!! ---");
			System.out.printf("\ncode=%d\n msg=%s\n header=%s\n body=%s\n", apiE.getCode(), apiE.getMessage(),
					apiE.getResponseHeaders(), apiE.getResponseBody());
			System.out.println(apiE);
			apiE.printStackTrace();
			return false;
		} catch (Exception e) {
			System.out.println("\n--- deleteUser failed !!! ---");
			System.out.println(e);
			e.printStackTrace();
			return false;
		}
	}
}
