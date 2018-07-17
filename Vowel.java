package janani;
import java.util.Scanner;
public class Vowel {

	public static void main(String[] args) {
		char c;
		Scanner ja=new Scanner(System.in);
		System.out.println("enter the alpabets");
		c=ja.next().charAt(0);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='O'||c=='I'||c=='U'){
			System.out.println("vowel");
		}
		else{
			System.out.println("consonant");
		}
	
}
	}

