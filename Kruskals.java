import java.util.Scanner;
public class Kruskals {
	
   static int parent[],cost[][],mincost,n,i,j,e,a,b,min,u,v;
	
	public void kruskal(int n,int[][] cost)
	{   mincost =0;
		e=1;
		
		while(e<n)
		{
			min = 999;
			for(i=0;i<n;i++)
				for(j=0;j<n;j++)
					if(cost[i][j]<min)
					{
						min=cost[i][j];
						a = u = i;
						b = v = j;
					}
			while(parent[u] > 0)
				u = parent[u];
			while(parent[v] > 0)
				v=parent[v];
			if (u!=v)
			{   
				parent[b]=a;
				System.out.println("edge "+e+") "+a+" -> "+b+" Cost "+min);
				mincost= mincost + min;
				e=e+1;	
			}
			cost[a][b]= cost[b][a] = 999;
			
		}System.out.println("Total Cost : "+mincost);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("No. of vertices : ");
		n= sc.nextInt();
		
		int cost[][]= new int[n][n];
		
		parent = new int[n];
		
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
		
		Kruskals k= new Kruskals();
		k.kruskal(n, cost);
		
	

	}

}
