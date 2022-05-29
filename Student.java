import java.util.Scanner;

public class Student {
	String USN, Name, Branch;
	Long phone;
	
	Student(String u,String n,String b,Long p)
	{
		USN=u;
		Name=n;
		Branch=b;
		phone=p;
	}
	
	 void display()
	 {
		 System.out.println("USN:"+USN);
		 System.out.println("Name:"+Name);
		 System.out.println("Branch:"+Branch);
		 System.out.println("Phone_No:"+phone);
	 }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of students");
		int n=sc.nextInt();
		Student s[]= new Student[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Student"+(i+1)+" USN,Name,Branch and Phone_no:");
			String usn=sc.next();
			String name=sc.next();
			String branch=sc.next();
			Long phoneno=sc.nextLong();
			s[i]= new Student(usn,name,branch,phoneno);
		}
		for(int i=0;i<n;i++)
		{
		System.out.println("Student "+(i+1)+" details are:");	
		s[i].display();
		}
		
		

	}

}
