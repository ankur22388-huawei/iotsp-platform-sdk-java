package com.cisco.iotsp.sample;

import com.cisco.iotsp.helper.AccountHelper;

public class SampleAccountsCreate {

	public static String createAccount(String serverAddress, String accountAlias, String adminEmail, String adminPassWd) {

		String accountName = "SDK Test Account";
		String accoutType = "TRIAL";
		String adminFirstName = "admin";
		String adminLastName = "MyLastName";
		
		String accoutUid = AccountHelper.createAccount(serverAddress, accountAlias, accountName, accoutType,
				adminFirstName, adminLastName, adminPassWd, adminEmail);
		return accoutUid;
	}

}
