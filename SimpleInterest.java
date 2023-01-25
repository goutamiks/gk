import java.util.Scanner;
public class SimpleInterest {
	public static void main(String[] args) {
		float s;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the principal: ");
		int p=input.nextInt();
		
		System.out.println("Enter the rate: ");
		int r=input.nextInt();
		
		System.out.println("Enter the time: ");
		float t=input.nextFloat();
		
		s=p*r*t/100;
		System.out.println("The simple interest is: "+s);
	}
	
	

}
