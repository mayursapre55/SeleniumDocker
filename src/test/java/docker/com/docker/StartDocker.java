/**
 * 
 */
package docker.com.docker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

/**
 * @author gslab
 *
 */
public class StartDocker {
		
	static int iExitValue;
    static String sCommandString;
	
    
	public static void startDockerFromLinux(String command) {
	        sCommandString = command;
	        CommandLine oCmdLine = CommandLine.parse(sCommandString);
	        DefaultExecutor oDefaultExecutor = new DefaultExecutor();
	        oDefaultExecutor.setExitValue(0);
	        try {
	            iExitValue = oDefaultExecutor.execute(oCmdLine);
	        } catch (ExecuteException e) {
	            System.err.println("Execution failed.");
	            e.printStackTrace();
	        } catch (IOException e) {
	            System.err.println("permission denied.");
	            e.printStackTrace();
	        }
	    }	
}