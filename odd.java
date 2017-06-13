package guvi;
import java.util.Scanner;
class odd {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter the num:");
		int num=sc.nextInt();
		if(num%2==0){
			System.out.println("The given numbe is even:"+num);
			}
		else {
			System.out.println("The given is odd:"+num);
		}
	}
}
