package com.qa.java.string;

public class String_Exercises {

	public static void main(String[] args) {
		
		String[] emails = new String[] {"abc_gmail.com", "abcd*()@gmail.com", 
				"abcd@gmail.com", "test_123@gmail.com", "1234@#$@gmail.com"};
		
		int numberOfAccepted = StringMethod.PatternCheckerIn(emails);
		int numberOfNotAccepted = StringMethod.PatternCheckerOut(emails);
		
		System.out.println("Number of emails under pattern is: "+ numberOfAccepted + "! Number of email not under pattern is "+ numberOfNotAccepted+"!");
	
		String[] inPatternEmails = StringMethod.AcceptedEmails(emails, numberOfAccepted);
		String[] noInPatternEmails = StringMethod.NotAcceptedEmails(emails, numberOfNotAccepted);
		
		
		System.out.println("Accepted emails are:");
		for(String email : inPatternEmails) {
			
			System.out.println(email );
		}
		System.out.println("Not accepted emails are:");
		for(String email : noInPatternEmails) {
			
			System.out.println(email);
		}
		
		
		
	}

}
