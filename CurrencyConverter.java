import java.util.Scanner;
public class CurrencyConverter {
	public static void main(String[] args) {
		float dollar;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the rupees: ");
		int r=input.nextInt();
		dollar=r*0.012f;
		System.out.println("USD: " + dollar);
	}

}
