import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
public class ValidateCheck implements Validate{
   private static final Scanner sc = MyScanner.getScannerInstance();
  public  boolean ValidatePassword(String password) {
        String regex = "^[A-Za-z][A-Za-z0-9!@#$%^&*]{9}$";
        Pattern pattern = Pattern.compile(regex);
        if (password == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
  }
    
   public  boolean validateNumber(long number) { 
        String numberStr = Long.toString(number);
        String regex = "^[6-9]\\d{9}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(numberStr);
        return matcher.matches();
  }
   
   
   public String getValidatedPassword(String prompt){
      		System.out.println(prompt);
      		String password = sc.nextLine();
      			while(!ValidatePassword(password)){
          			System.out.println("Invalid Syntax for password......." + prompt);
          			password = sc.nextLine();
     			}
     		return password;
   }         
  public long getValidatedMobileNumber(String prompt){
     		System.out.println(prompt);
       		long mobileNumber = sc.nextLong();
    			while(!validateNumber(mobileNumber)){
         				System.out.println("Invalid syntax for mobile number......." + prompt);
         				mobileNumber=sc.nextLong();
       			}
       		return mobileNumber;
  }
}
