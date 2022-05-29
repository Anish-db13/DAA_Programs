

class Staff{
	int staffid;
	String name;
	long phoneno;
	int salary;
	
	Staff( int sid, String n,long p, int s)
	{
		staffid = sid;
		name = n;
		phoneno = p;
		salary = s;
	}
	void display() {
		System.out.print(staffid+"\t"+name+"\t"+phoneno+"\t"+salary);
	}
	
}
class Teaching extends Staff{
	String domain;
	int publications;
	Teaching( int sid, String n,long p, int s,String d, int pu){
		super(sid, n, p, s);
		domain = d;
		publications = pu;
	}
	void display() {
		super.display();
		System.out.println("\t"+ domain +"\t"+ publications +"\t\t-\t-");
	}
}
class Technical extends Staff{
	String skills;
	Technical( int sid, String n,long p, int s,String sk){
		super(sid, n, p, s);
		skills = sk;
		
	}
	void display() {
		super.display();
		System.out.println("\t-\t-\t\t"+ skills +"\t-");
	}
}
class Contract extends Staff{
	int period;
	Contract( int sid, String n,long p, int s, int pe){
		super(sid, n, p, s);
		period = pe;
		
	}
	void display() {
		super.display();
		System.out.println("\t-\t-\t\t-\t"+ period +"\t");
	}
}

public class Prgm_2A {

	public static void main(String[] args) {
		Staff s[]=new Staff[3];
		s[0]= new Teaching(001,"Anish",6360308190L,50000,"AI",4);
		s[1]= new Technical(002,"Mithil",9140410748L,10000,"Admin");
		s[2]= new Contract(003,"Ramu",8976534535L,2000,2);
		System.out.println("StaffID\tName\tPhone\t\tSalary\tDomain\tPublications\tSkills\tPeriod");
		System.out.println();
		for(int i=0;i<3;i++) {
			s[i].display();
		}
	}

}
