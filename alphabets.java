package guvi;
import java.util.Scanner;
public class alphabets {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter characters:");
		char c=sc.next().charAt(0);
		if((c>='A' && c<='Z') || (c>='a' && c<='z')){
			System.out.println("Alphabets");
			}
		else{
			System.out.println("not an alphabet:");
			}
	}
}
