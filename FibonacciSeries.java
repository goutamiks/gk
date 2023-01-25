import java.util.Scanner;
public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int i, t1=0, t2=1, t3;
		t3=t1+t2;
		System.out.println("Enter the number of terms: ");
		int n=input.nextInt();
		
		System.out.println("The Fibonnaci series: "+"\n" + t1+"\n" + t2);
		for(i=3;i<=n;++i) {
			System.out.println(t3);
			t1=t2;
			t2=t3;
			t3=t1+t2;
		}
	}
}
