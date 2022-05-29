import java.util.Scanner;
public class Subset {
	int c =0;
	public void subset(int cs, int k, int r, int x[],int w[],int d)
	{   
		x[k]=1;
		if(cs+w[k] == d)
		{
			c = c+1;
			System.out.printf("\nThe Solution "+c+" ---> { " );
			for(int i=0;i<=k;i++)
			{
				if(x[i]==1)
				{
					System.out.print(w[i]+" ");
				}
			}
			System.out.print("}");
		}
		else if ((cs+ w[k] +w[k+1])<=d)
			subset(cs+w[k],k+1,r-w[k],x,w,d);
		if(((cs+r-w[k])>=d) && ((cs+w[k+1])<=d))
		{
			x[k]=0;
			subset(cs,k+1,r-w[k],x,w,d);
		}
	}

	public static void main(String[] args) {
		int n,d,w[],x[],total=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Elements :");
		n = sc.nextInt();
		w = new int[n];
		x = new int[n];
		System.out.println("Enter the elements in the set :");
		
		for(int i=0;i<n;i++)
		{
			w[i]=sc.nextInt();
			total=total+w[i];
		}
		System.out.println("Enter the Sum : ");
		d = sc.nextInt();
		if (total<d)
		{
			System.out.println("Subset is not Possible..");
			System.exit(0);
		}
		Subset sb = new Subset();
		sb.subset(0,0,total, x, w, d);
		

	}

}
