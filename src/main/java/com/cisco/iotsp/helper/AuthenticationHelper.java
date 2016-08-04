package com.cisco.iotsp.helper;

import java.util.Map;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.cisco.iotsp.helper.ClientHelper;

public class AuthenticationHelper {

	public static String getAccessToken(String serviceAddress, String username, String password, String clientID,
			String clientSecret) {
		// Get access token from OAuth2 server
		// Input params:
		// serviceAddress: cluster's ip address such as 10.192.15.32
		// adminEmail: admin email, such as 'mexiaode@cisco.com'
		// password: password, such as 'secret'
		// client_id: user application registration id, for now, hard coded to
		// 'iotspoauth2client'
		// client_secret: user app secret, for now, hard coded to
		// 'iotspoauth2client'
		// :return: access token

		String url = String.format("https://%s/v1/user-services/oauth2/token", serviceAddress);

		Client client = ClientHelper.createClient();
		WebTarget webTarget = client.target(url);

		String input = String.format(
				"{\"grant_type\":\"password\",\"username\":\"%s\",  \"password\":\"%s\",\"client_id\":\"%s\",\"client_secret\":\"%s\"}",
				username, password, clientID, clientSecret);

		Invocation.Builder invocationBuilder = webTarget.queryParam("grant_type", "password")
				.queryParam("username", username).queryParam("password", password).queryParam("client_id", clientID)
				.queryParam("client_secret", clientSecret).request(MediaType.APPLICATION_JSON);
		Response response = invocationBuilder.post(Entity.entity(input, MediaType.APPLICATION_JSON), Response.class);

		System.out.printf("--- Get Access Token --- Status: %d --- ", response.getStatus());

		System.out.println("Headers:");
		System.out.println(response.getHeaders());

		System.out.println(response);
		System.out.println("Output from Server .... ");
		String output = response.readEntity(String.class);
		System.out.println(output);

		Map<String, Object> map = JsonHelper.convertJsonStringToMap(output);
		String token = map.get("access_token").toString();
		System.out.printf("getAccessToken succeed, token=%s\n", token);
		return token;

	}
}
