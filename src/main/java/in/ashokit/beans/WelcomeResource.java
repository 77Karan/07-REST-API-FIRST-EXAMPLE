package in.ashokit.beans;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeResource 
{
	
	public WelcomeResource() 
	{
		System.out.println("Creating a object of WelcomeResource");
	}
	
	@GetMapping("/Welcome")
	public ResponseEntity<String> welcomeMsg()
	{
		String responseMsg = "Welcome to Ashok IT";
		return new ResponseEntity<String>(responseMsg,HttpStatus.OK);
	}
}
