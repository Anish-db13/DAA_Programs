import java.util.Scanner;
import java.util.StringTokenizer;
public class Customer {

	
	String dd,mm,yyyy;
	
	public void read(String n, String d) {
	StringTokenizer st=new StringTokenizer(d,"/");
	dd=st.nextToken();
	mm=st.nextToken();
	yyyy=st.nextToken();
	System.out.println("The details (name,dd,mm,yyyy) of Customer are :");
	System.out.println(n+","+dd+","+mm+","+yyyy);
	}
	public static void main(String[] args) {
	
	Customer c= new Customer();
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the name of Customer: ");
	String name=sc.nextLine();
	System.out.println("Enter the DOB of Customer in dd/mm/yyyy format: ");
	String dob=sc.next();
	c.read(name,dob);
	

	}

}
