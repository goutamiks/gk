import java.util.Scanner;
public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=input.nextInt();
		if(n%2==0) {
			System.out.println("It is even");
		}
		else {
			System.out.println("It is odd");
		}
	}
}
