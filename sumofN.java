package guvi;
import java.util.Scanner;
public class sumofN {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range:");
		int x=sc.nextInt();
		int sum=0;
		for(int i=1;i<=x;i++){
			sum=sum+i;
		}
	System.out.println("sum is:"+sum);
	}
	

}
