import java.util.Scanner;
//COUNT CHARACTERS IN A STRING
public class Char_Count_in_String
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter text");
        String s = sc.nextLine();
		//if we use sc.next() it counts upto first whitespace only
        int c =0;
        for(int i=0;i<s.length();i++){
                  c++;
        }
        System.out.println("No of Chars in Text is "+c);
	}
}