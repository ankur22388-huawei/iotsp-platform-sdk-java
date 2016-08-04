package com.cisco.iotsp.helper;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.HttpUrlConnectorProvider;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.media.multipart.MultiPartFeature;

import com.cisco.iotsp.client.things.JSON;

public class ClientHelper {

	public static Client createClient() { 
		try { 
			TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager(){ 
				public void checkClientTrusted(X509Certificate[] arg0, String arg1) 
						throws CertificateException {	
				} 

				public void checkServerTrusted(X509Certificate[] arg0, String arg1) 
						throws CertificateException { 
				} 

				public X509Certificate[] getAcceptedIssuers() { 
					return new X509Certificate[0]; 
				} 

			}}; 
			final SSLContext sslContext = SSLContext.getInstance("TLS"); 
			sslContext.init(null, trustAllCerts, new java.security.SecureRandom()); 

			final HostnameVerifier allHostsValid = new HostnameVerifier() { 
				public boolean verify(String hostname, SSLSession session) { 
					return true; 
				}	
			};	
			ClientBuilder clientBuilder = ClientBuilder.newBuilder(); 
			ClientConfig config = new ClientConfig();
			config.register(JacksonFeature.class);
			config.register(MultiPartFeature.class);


			JSON json = new JSON();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
			// Use UTC as the default time zone.
			dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
			json.setDateFormat((DateFormat) dateFormat.clone());
			config.register(json);
			
			return clientBuilder.sslContext(sslContext).hostnameVerifier(allHostsValid).withConfig(config).build()
					.property(HttpUrlConnectorProvider.SET_METHOD_WORKAROUND, true);

		} catch (NoSuchAlgorithmException e) { 
			// TODO Auto-generated catch block 
			e.printStackTrace(); 
		} catch (KeyManagementException e) { 
			// TODO Auto-generated catch block 
			e.printStackTrace(); 
		} 
		return null; 
	} 

}