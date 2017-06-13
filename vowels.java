package guvi;
import java.util.Scanner;
public class vowels {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur choice:");
		char choice=sc.next().charAt(0);
		switch(choice){
		case 'a':
			System.out.println("entered char is vowel:"+choice);
		break;
		case 'e':
			System.out.println("entered char is vowel:"+choice);
			break;
		case 'i':
			System.out.println("entered char is vowel:"+choice);
			break;
		case 'o':
			System.out.println("entered char is vowel:"+choice);
			break;
		case 'u':
			System.out.println("entered char is vowel:"+choice);
			break;
		default:
			System.out.println("entered char is consonant:"+choice);
			break;		
			
		}
	}

}
