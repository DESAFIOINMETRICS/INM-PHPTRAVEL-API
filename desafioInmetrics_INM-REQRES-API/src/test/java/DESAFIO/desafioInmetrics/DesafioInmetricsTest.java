package DESAFIO.desafioInmetrics;


import DESAFIO.httpRequest.HttpRequest;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class DesafioInmetricsTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public DesafioInmetricsTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( DesafioInmetricsTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	//String resp;
    	int status = 0;
    		
        try {
			HttpRequest req = new HttpRequest("https://reqres.in/api/users?page=2");
			
			// get the request html content 
			//resp = req.getResult();
			//System.out.println(resp);
			
			// get the status code of the connection
			status = req.getStatusCode();
			
			// checking if the status code is 200
			if(status == 200) 
			{
				System.out.println("Connection Ok: "+String.valueOf(status));
				assertTrue(true);
			}
			else 
			{	
				System.out.println("Connection failed with the Status Code: "+String.valueOf(status));
				assertTrue(false);
			}
		} catch (Exception e) {
			
			// if there's any other exception it'll be displayed in the console and the test will not pass
			System.out.println("Connection failed with the following exception: "+e.toString());
			System.out.println("Status Code: "+String.valueOf(status));
			assertTrue(false);
		}
    }
}
