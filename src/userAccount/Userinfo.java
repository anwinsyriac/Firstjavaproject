package userAccount;

import java.util.Scanner;

public class Userinfo {
	String userid = "pivotadmin" ;
    String entereduserid;
	String password = "Admin123";
	String enteredpassword;
	int attempts = 3;
	int failedattempts = 0;
	
	Scanner sc = new Scanner(System.in);

	void checkaccountdetailsIsCorrect() {
		for (
				int counter = 1; 
				counter <= 3;
				
				counter++) 
		{
			System.out.println("Enter the userid");
			entereduserid= sc.next();
			if (userid .equals(entereduserid)) {
				System.out.println("Entered userid is correct");
				System.out.println("Enter the password:");
				
				enteredpassword  = sc.next();
				 if (password .equals(enteredpassword)) {
	                    System.out.println("password is correct ");
	                    while (userid .equals(entereduserid)&& password .equals(enteredpassword) ) {
		                    System.out.println("You are logged in to the application");
		                   
	                    break;
      } 
				
      } 
			else {
	                System.out.println("Entered userid or password is incorrect");
	                failedattempts++;
	  }
				 if (failedattempts>=3){
				 System.out.println("account is blocked");
				 break;
	            }
}}}}
