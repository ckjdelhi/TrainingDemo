package test;

public class EmailValidation {
	
	public static boolean validate(String email) {
		if(email ==null) {
			return false;
		}else if(email.equals("")) {
			return false;
		}else {
			return true;
		}
	}
}
