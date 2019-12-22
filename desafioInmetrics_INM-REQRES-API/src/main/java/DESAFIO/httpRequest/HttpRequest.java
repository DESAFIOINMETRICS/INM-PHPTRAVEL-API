package DESAFIO.httpRequest;

import java.io.*;
import java.net.*;

public class HttpRequest {
	
	// class properties
	private String txUrl;
	private URL link;
	private HttpURLConnection conn;
	private int status;
	
	// class methods 

	// constructor of the http connection class
	public HttpRequest(String txUrl) throws Exception{
		super();
		this.txUrl = txUrl;
		
		try {
			
			// creation of a link from the passed string
			this.link =  new URL(txUrl);
			
			// instantiation of the object and connection opening 
			HttpURLConnection conn = (HttpURLConnection) this.link.openConnection();
			
			// set of the request method GET
			conn.setRequestMethod("GET");
			
			this.conn = conn;
			
			this.status = this.conn.getResponseCode();
			
		} catch (Exception e) {
			throw e;
		}
			
	}
	
	// method that gets the html result of the request
	public String getResult() throws Exception {
		
		StringBuilder result = new StringBuilder();
		
		try {
			// instantiation of a reader object
			BufferedReader rd = new BufferedReader(new InputStreamReader(this.conn.getInputStream()));
			
			String line;
			
			// loop that read line by line the request result and appends it on the string builder 
			while ((line = rd.readLine()) != null) {
				result.append(line);
			}
			
			rd.close();
			
		} catch (Exception e) {
			throw e;
		}
		
		return result.toString();
	}
	
	// method that returns the Url in use at the request
	public String getTxUrl() {
		return txUrl;
	}
	
	// method that returns the status code of the connection
	public int getStatusCode(){
		return this.status;
	}

	
	
}
