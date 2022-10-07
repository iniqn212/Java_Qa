package com.qa.java.string;

public class StringMethod {

	public static int PatternCheckerIn(String[] emails) {
		int inPattern = 0;
		for(int i = 0; i < emails.length; i++) {
			
			if ( emails[i].matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$")) {
				
				inPattern++;
			
			}			
		};
		return inPattern;
	}
	
	public static int PatternCheckerOut(String[] emails) {
		int noInPattern =0;
		for(int i = 0; i < emails.length; i++) {
			
			if ( !emails[i].matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$")) {
				
				noInPattern++;
			
			}
					
		};
		return noInPattern;
	}
	
	public static String[] AcceptedEmails(String[] emails, int num) {
		
		String accepted[] = new String[num];
		int count = 0;
		
		for(int i = 0; i < emails.length; i++) {
			
			if (emails[i].matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$")) {
				
				accepted[count]=emails[i];
				count++;
			};
		}
		return accepted;
	}
	
	public static String[] NotAcceptedEmails(String[] emails, int num) {
		
		String notAccepted[] = new String[num];
		int count = 0;
		
		for(int i = 0; i < emails.length; i++) {
			
			if (!emails[i].matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$")) {
				
				notAccepted[count]=emails[i];
				count++;
			};
		}
		return notAccepted;
	}
}
