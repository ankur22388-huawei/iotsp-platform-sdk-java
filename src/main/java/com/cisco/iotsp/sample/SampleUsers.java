package com.cisco.iotsp.sample;

import com.cisco.iotsp.client.users.ApiException;
import com.cisco.iotsp.client.users.UsersApi;
import com.cisco.iotsp.client.users.model.*;
import com.cisco.iotsp.helper.ClientHelper;
import com.cisco.iotsp.helper.ServiceApiHelper;

public class SampleUsers {
	private UsersApi api;

	public SampleUsers(String serviceAddr, String accessToken) {
		System.out.println(String.format("Sample client for users at %s", serviceAddr));
		api = ServiceApiHelper.getUsersApi(serviceAddr, accessToken);
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
