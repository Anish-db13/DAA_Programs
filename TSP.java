import java.util.Scanner;

public class TSP {

	static int cost[][];
	
	public int tsp(int[] p,int start,int n)
	{
		
		int i,j,k,tcost;
		int[] mintour=new int[n+1];
		int[] temp=new int[n+1];
		if(start==n-1)
			return cost[p[n-1]][p[n]]+cost[p[n]][1];
		int mincost=999;
		for(i=start+1;i<=n;i++)
		{	
				for(j=1;j<=n;j++)
					temp[j]=p[j];
					
				temp[start+1]=p[i];
				temp[i]=p[start+1];
				if(cost[p[start]][p[i]]+(tcost=tsp(temp,start+1,n))<mincost)
					{
						mincost=cost[p[start]][p[i]]+tcost;
						for(k=1;k<=n;k++)
							mintour[k]=temp[k];
					}
		}
		for(i=1;i<=n;i++)
			p[i]=mintour[i];
		return mincost;
	}
	public static void main(String[] args)
	{
		int mincost,n,i,j;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the no of cities");
		n=s.nextInt();
		int p[] =new int[n+1];
		cost = new int[n+1][n+1];
		System.out.println("Enter the cost matrix");
		
		for(i=1;i<=n;i++)
			for(j=1;j<=n;j++)
				cost[i][j]=s.nextInt();
		
		for(i=1;i<=n;i++)
			p[i]=i;
		TSP t = new TSP();
		mincost=t.tsp(p,1,n);
		System.out.println("tsp tour");
		for(i=1;i<=n;i++)
			System.out.print(p[i] + "--->");
		System.out.println("1");
		System.out.println("Travelling cost =" + mincost);
	}
	
		
		
		

	

}
