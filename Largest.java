import java.util.Scanner;
public class Largest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a=input.nextInt();
		
		System.out.println("Enter the value of b: ");
		int b=input.nextInt();
		
		if(a>b) {
			System.out.println(a+ " is the largest number");
		}
		else {
			System.out.println(b+ " is the largest number");
		}
	}
}
