//type cast string to int
public class StrToInt{
	public static void main(String[] args){
			String s ="20";
			String t="40";

			System.out.println(s+t);

			int i = Integer.parseInt(s);
			Integer k = Integer.valueOf(t);

			System.out.println(i);
			System.out.println(k);
			
			System.out.println(i+k);
	}
}