import java.util.Scanner;
	
public class PalindromMain {
	
	    public static boolean isPal(String s) {
	    	// if length is 0 or 1 then String is palindrome
	        if(s.length() == 0 || s.length() == 1)
	            return true; 
	        if(s.charAt(0) == s.charAt(s.length()-1))

	        return isPal(s.substring(1, s.length()-1));

	        return false;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a String for check:");
	        String string = sc.nextLine();
	        string = string.toLowerCase();
	        sc.close();

	        if(isPal(string))
	            System.out.println(string + " is a palindrome");
	        else
	            System.out.println(string + " is not a palindrome");
	    }
}

