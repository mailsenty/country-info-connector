package org.mule.modules.countryinfo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;

import org.mule.modules.countryinfo.config.ConnectorConfig;

@Connector(name="country-info", friendlyName="CountryInfo")
public class CountryInfoConnector {

    @Config
    ConnectorConfig config;

    private final String FINDONLANG = "https://restcountries.eu/rest/v2/lang/";
	private final String FINDBYCAPITAL  = "https://restcountries.eu/rest/v2/capital/";
	private final String FINDBYCURRENCY  = "https://restcountries.eu/rest/v2/currency/";
	
	private  URL url;


	HttpURLConnection con ;
	
	

    

    @Processor
    public String findOnLang(String lang) {
        String response;
    	try {
    		url  = new URL(FINDONLANG+lang);
			response=processConnection(url);
		} catch (MalformedURLException e) {
			response="Error connecting to endpoint Please retry";
			e.printStackTrace();
		}
    	catch (Exception e) {
    		response="Error connecting to endpoint Please retry" ;  				
			e.printStackTrace();
		}
    	return response;
  

    }
    @Processor
    public String findByCapital(String capital) {
    	 String response;
     	try {
     		url  = new URL(FINDBYCAPITAL+capital);
 			response=processConnection(url);
 		} catch (MalformedURLException e) {
 			response="Error connecting to endpoint Please retry";
 			e.printStackTrace();
 		}
     	catch (Exception e) {
     		response="Error connecting to endpoint Please retry" ;  				
 			e.printStackTrace();
 		}
     	return response;
    }
    
    
    
    @Processor
    public String findByCurrency(String currency) {
    	 String response;
     	try {
     		url  = new URL(FINDBYCURRENCY	+currency);
 			response=processConnection(url);
 		} catch (MalformedURLException e) {
 			response="Error connecting to endpoint Please retry";
 			e.printStackTrace();
 		}
     	catch (Exception e) {
     		response="Error connecting to endpoint Please retry" ;  				
 			e.printStackTrace();
 		}
     	return response;
    }

    
    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }
    
    private String processConnection(URL url){
    	
    	StringBuffer response = new StringBuffer();
    	
    	try {
			con = (HttpURLConnection) url.openConnection();
			
			con.setRequestMethod("GET");

			// add request header
			int responseCode = con.getResponseCode();
			System.out.println("\nSending 'GET' request to URL : " + url);
			System.out.println("Response Code : " + responseCode);

			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
		}  catch (Exception e) {
			response=new StringBuffer("Error getting Yoda Speak");
			e.printStackTrace();
		}

		// print result
		return response.toString();
    }

}