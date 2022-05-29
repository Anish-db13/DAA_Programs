import java.util.Scanner;
public class Prgm_3a {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two Integers : ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		try {
			int res=x/y;
			System.out.println(res);
			}
	catch(ArithmeticException e) {
			System.out.println("y value you have taken is 0 ... So,  " +e);
	}
	}

}
