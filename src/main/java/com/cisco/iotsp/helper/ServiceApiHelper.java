//Copyright (c) 2016 by Cisco Systems, Inc. All rights reserved.
package com.cisco.iotsp.helper;

import com.cisco.iotsp.client.accounts.AccountsApi;
import com.cisco.iotsp.client.claims.ClaimsApi;
import com.cisco.iotsp.client.http_device_connector.HttpDeviceConnectorApi;
import com.cisco.iotsp.client.observations.ObservationsApi;
import com.cisco.iotsp.client.presence.LastNObservationsApi;
import com.cisco.iotsp.client.presence.PresenceApi;
import com.cisco.iotsp.client.registration.RegistrationApi;
import com.cisco.iotsp.client.schemas.SchemasApi;
import com.cisco.iotsp.client.thing_credentials.ThingCredentialsApi;
import com.cisco.iotsp.client.things.ThingsApi;
import com.cisco.iotsp.client.users.UserPoliciesApi;
import com.cisco.iotsp.client.users.UsersApi;

public class ServiceApiHelper {

	public static AccountsApi getAccountsApi(String serviceAddress, String accessToken) {
		String apiBasePath = "https://" + serviceAddress;

		AccountsApi api = new AccountsApi();
		api.getApiClient().setBasePath(apiBasePath);
		api.getApiClient().setAccessToken(accessToken);

		// Skip SSL verification
		api.getApiClient().setHttpClient(ClientHelper.createClient());

		return api;
	}

	public static UsersApi getUsersApi(String serviceAddress, String accessToken) {
		String apiBasePath = "https://" + serviceAddress;
		UsersApi api = new UsersApi();
		api.getApiClient().setBasePath(apiBasePath);
		api.getApiClient().setAccessToken(accessToken);

		// Skip SSL verification
		api.getApiClient().setHttpClient(ClientHelper.createClient());

		return api;
	}

	public static SchemasApi getSchemasApi(String serviceAddress, String accessToken) {
		String apiBasePath = "https://" + serviceAddress;
		SchemasApi api = new SchemasApi();
		api.getApiClient().setBasePath(apiBasePath);
		api.getApiClient().setAccessToken(accessToken);

		// Skip SSL certificate
		api.getApiClient().setHttpClient(ClientHelper.createClient());
		return api;
	}

	public static ThingsApi getThingsApi(String serviceAddress, String accessToken) {
		String apiBasePath = "https://" + serviceAddress;

		ThingsApi api = new ThingsApi();
		api.getApiClient().setBasePath(apiBasePath);
		api.getApiClient().setAccessToken(accessToken);

		// Skip SSL certificate
		api.getApiClient().setHttpClient(ClientHelper.createClient());

		return api;
	}

	public static ClaimsApi getClaimsApi(String serviceAddress, String accessToken) {
		String apiBasePath = "https://" + serviceAddress;

		ClaimsApi api = new ClaimsApi();
		api.getApiClient().setBasePath(apiBasePath);
		api.getApiClient().setAccessToken(accessToken);
		api.getApiClient().setHttpClient(ClientHelper.createClient());
		return api;
	}
	
	
	public static LastNObservationsApi getLastNObservationsApi(String serviceAddress, String accessToken) {

		String apiBasePath = "https://" + serviceAddress;

		LastNObservationsApi api = new LastNObservationsApi();
		api.getApiClient().setBasePath(apiBasePath);
		api.getApiClient().setAccessToken(accessToken);
		
		// Skip SSL certificate
		api.getApiClient().setHttpClient(ClientHelper.createClient());

		return api;
	}

	public static ObservationsApi getObservationsApi(String serviceAddress, String accessToken) {

		String apiBasePath = "https://" + serviceAddress;

		ObservationsApi api = new ObservationsApi();
		api.getApiClient().setBasePath(apiBasePath);
		api.getApiClient().setAccessToken(accessToken);

		// Skip SSL certificate
		api.getApiClient().setHttpClient(ClientHelper.createClient());

		return api;
	}

	public static UserPoliciesApi getUserPoliciesApi(String serviceAddress, String accessToken) {
		String apiBasePath = "https://" + serviceAddress;
		UserPoliciesApi api = new UserPoliciesApi();
		api.getApiClient().setBasePath(apiBasePath);
		api.getApiClient().setAccessToken(accessToken);

		// Skip SSL certificate
		api.getApiClient().setHttpClient(ClientHelper.createClient());

		return api;
	}

	public static PresenceApi getPresenceApi(String serviceAddress, String accessToken) {

		String apiBasePath = "https://" + serviceAddress;
		PresenceApi api = new PresenceApi();
		api.getApiClient().setBasePath(apiBasePath);
		api.getApiClient().setAccessToken(accessToken);

		// Skip SSL certificate
		api.getApiClient().setHttpClient(ClientHelper.createClient());

		return api;
	}

	public static RegistrationApi getRegistrationApi(String serviceAddress, String accessToken) {
		String apiBasePath = "https://" + serviceAddress;

		RegistrationApi api = new RegistrationApi();
		api.getApiClient().setBasePath(apiBasePath);
		api.getApiClient().setAccessToken(accessToken);

		// Skip SSL certificate
		api.getApiClient().setHttpClient(ClientHelper.createClient());

		return api;
	}
	
	public static HttpDeviceConnectorApi getHttpDeviceConnectorApi(String serviceAddress, String accessToken) {
		String apiBasePath = "https://" + serviceAddress;

		HttpDeviceConnectorApi api = new HttpDeviceConnectorApi();
		api.getApiClient().setBasePath(apiBasePath);
		api.getApiClient().setAccessToken(accessToken);
		api.getApiClient().setHttpClient(ClientHelper.createClient());
		return api;
	}
	
	
	public static ThingCredentialsApi getThingCredentialsApi(String serviceAddress, String accessToken) {
		String apiBasePath = "https://" + serviceAddress;

		ThingCredentialsApi api = new ThingCredentialsApi();
		api.getApiClient().setBasePath(apiBasePath);
		api.getApiClient().setAccessToken(accessToken);
		api.getApiClient().setHttpClient(ClientHelper.createClient());
		return api;
	}
}
