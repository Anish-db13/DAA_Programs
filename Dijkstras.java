import java.util.Scanner;

public class Dijkstras {
	
	static int n,cost[][],i,j,k,e,d[],s,p[]; 
	
	public void dijkstras(int n, int cost[][])
	{ 
		int v[],min;
		v = new int[n];
		d = new int[n];
		p = new int[n];
		
		Scanner pm = new Scanner(System.in);
		System.out.println("Enter the source vertices : ");
		s =pm.nextInt();
		
		for(i=0;i<n;i++)
		{
			v[i]=0;
			d[i]=999;
			p[i]=-1;
		}
		
		v[s]=1;
		d[s]=0;
		
		for(i=0;i<n;i++)
		{
			if(cost[s][i] != 999 && v[i] != 1)
				d[i] = cost[s][i];
					
		}
		while(e<n)
		{
			min=999;
			for(i=0;i<n;i++)
			{
				if(d[i]<min && v[i]==0)
				{
					min=d[i];
					k=i;			
				}
			}
			v[k]=1;
			e=e+1;
			
			
			for(i=0;i<n;i++)
			{
				if(d[k]+cost[k][i]<d[i])
				{
					d[i]=d[k]+cost[k][i];
					p[i]=k;
				}
			}
			
			
			
			
		}
		
		
	}
	

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("No. of vertices : ");
		n= sc.nextInt();
		
		int cost[][]= new int[n][n];
		
		System.out.println("Enter the cost of matrix : ");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				cost[i][j] = sc.nextInt();
				if(cost[i][j] == 0)
					cost[i][j] = 999;
			}
		}
	
		Dijkstras dj= new Dijkstras();
		dj.dijkstras(n, cost);
		System.out.println("The shortest path from  ");
		for(i=0;i<n;i++)
		{
			System.out.println(s+" To "+i+" is "+d[i]);
			
		}
		

	}

}
