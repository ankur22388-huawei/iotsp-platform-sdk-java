package com.cisco.iotsp.sample;

import com.cisco.iotsp.client.accounts.AccountsApi;
import com.cisco.iotsp.client.accounts.ApiException;
import com.cisco.iotsp.client.accounts.model.Account;
import com.cisco.iotsp.client.accounts.model.PageAccount;
import com.cisco.iotsp.helper.ServiceApiHelper;

public class SampleAccounts {
	private AccountsApi api;
	private String apiBasePath;
	private String serviceAddress;
	
	private String accessToken;
	private String accountUid;
	
	public SampleAccounts(String serviceAddr, String accessToken) {
		System.out.println(String.format("Sample Account with account service at %s", serviceAddr));
		
		serviceAddress = serviceAddr;
		apiBasePath = "https://" + serviceAddr;
		
		api = ServiceApiHelper.getAccountsApi(serviceAddr, accessToken);
	 }
	  
	
	public boolean getAccount(String accountUid){
	        //get account by account uid.  For now, account service only supports get your own account
	        //In the future, a global admin account can get all accounts.
	        //:param account_uid: the account uid returned by create_account
	        //:return: true for success, false for failure
	        try {	        	
	        	Account myAccount = api.getAccount(accountUid); 
	        	
	        	accountUid = myAccount.getUid();
	        	System.out.printf("\n --- getAccount for uid %s is successful. --- \n Account is: %s ", accountUid, myAccount);
	        	
	            return true;
	        } catch (ApiException apiE) {
				System.out.printf("\n--- getAccount failed !!! ---");
				System.out.printf("\ncode=%d\n msg=%s\n header=%s\n body=%s\n", apiE.getCode(), apiE.getMessage(),
						apiE.getResponseHeaders(), apiE.getResponseBody());
				System.out.println(apiE);
				apiE.printStackTrace();
				return false;
	        } catch (Exception e) {
	            System.out.println("\n--- getAccount failed!!! ---");
	            System.out.println(e);
				e.printStackTrace();
				return false;
	        }
	 }
	
	
	public boolean getAccounts(String accountAlias){
        //get accounts.  For now, account service only supports get your own account
        //In the future, a global admin account can get all accounts.
        //:param alias: the aliase that was used to create_account
        //:return: true for success, false otherwise.
        try {	  
        	PageAccount pageAct = api.getAccounts(accountAlias, "name", "Ascending", 10, 0);
        	System.out.printf("\n --- getAccounts is successful.\n  Accounts are : %s ", pageAct);
            return true;
        } catch (ApiException apiE) {
			System.out.printf("\n--- getAccounts failed!!! ---\naccountAlias=%s", accountAlias);
			System.out.printf("\ncode=%d\n msg=%s\n header=%s\n body=%s\n", apiE.getCode(), apiE.getMessage(),
					apiE.getResponseHeaders(), apiE.getResponseBody());
			System.out.println(apiE);
			apiE.printStackTrace();
			return false;
		} catch (Exception e) {
            System.out.println("\n--- getAccounts failed!!! ---");
            System.out.println(e);
			e.printStackTrace();
			return false;
        }
 }

	public boolean  deleteAccount(String accoutUid) {
	        try {
	        	
	        	Account deletedAccount = api.deleteAccount(accoutUid);
		        System.out.println("\nDelete account is successful. Account is deleted: ");
		     	accountUid = deletedAccount.getUid();
	        	System.out.printf("\nTest, deleteAccount for uid %s is successful. Account is: %s ", accountUid, deletedAccount);
	     
	            return true;
	        } catch (ApiException apiE) {
				System.out.printf("\n--- deletedAccount failed!!! ---");
				System.out.printf("\ncode=%d\n msg=%s\n header=%s\n body=%s\n", apiE.getCode(), apiE.getMessage(),
						apiE.getResponseHeaders(), apiE.getResponseBody());
				System.out.println(apiE);
				apiE.printStackTrace();
				return false;
			} catch (Exception e) {
	            System.out.println("\n--- deleteAccount failed!!! ---");
	            System.out.println(e);
				e.printStackTrace();
				return false;
	        }
	    }
}
