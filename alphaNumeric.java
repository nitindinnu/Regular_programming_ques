// import java.util.Scanner;
//finding any special chars present in string
public class alphaNumeric {
    public static Boolean isAlphaNumeric(String s)
    {
        boolean flag=true;
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (!(c >= 'A' && c <= 'Z') &&
                    !(c >= 'a' && c <= 'z') &&
                    !(c >= '0' && c <= '9')) {
                flag=false;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        
        /*Scanner sc = new Scanner(System.in);
        String sx = sc.next();
        // myString.matches("[A-Za-z0-9]+")*/
        System.out.println("IsAlphaNumeric: " + isAlphaNumeric("nitin"));        
        System.out.println("IsAlphaNumeric: " + isAlphaNumeric("nitin12?"));        

    }
    
}