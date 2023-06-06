public class PatternPrintingA {

	public static void main(String[] args) {
		int n=10;
		for(int i=0;i<n;i++) 
		{
			
		  for (int j=0;j<n;j++) 
		    {
			if(j==(n-1)/2 || i==0 ||i==n-1)
			   {
			   System.out.print("*");
			   }
			else 
			   {
			   System.out.print(" ");
			   }
		    }
		  for (int j=0;j<n;j++) 
		    {
			if(j==0 || j==n-1 ||i==j)
			   {
			   System.out.print("*");
			   }
			else 
			   {
			   System.out.print(" ");
			   }
		    }
		  for (int j=0;j<n;j++) 
		    {
			if(i==0 && j>(n-1)/2 ||i==(n-1)/2 && j>(n-1)/2 ||i==n-1 && j>(n-1)/2 ||j==(n-1)/2)
			   {
			   System.out.print("*");
			   }
			else 
			   {
			   System.out.print(" ");
			   }
		    }
		  for (int j=0;j<n;j++) 
		    {
			if(j==(n-1)/2 || i==n-1 && j>(n-1)/2 || j==n-1)
			   {
			   System.out.print("*");
			   }
			else 
			   {
			   System.out.print(" ");
			   }
		    }
		  for (int j=0;j<n;j++) 
		    {
			if(j==(n-1)/2 || i==0 && j>=(n-1)/2 || j==(n-1)/2 ||j==n-1 &&i<(n-1)/2 ||i==(n-1)/2 &&j>(n-1)/2 || i==j && j>(n-1)/2)
			   {
			   System.out.print("*");
			   }
			else 
			   {
			   System.out.print(" ");
			   }
		    }
		  for (int j=0;j<n;j++) 
		    {
			if(i==0 &&j>(n-1)/2||j==(n-1)/2||i==n-1 &&j>(n-1)/2 ||j==n-1)
			   {
			   System.out.print("*");
			   }
			else 
			   {
			   System.out.print(" ");
			   }
		    }
		 
		  for (int j=0;j<n;j++) 
		    {
			if(j==1 || j==n-1 ||i+1==j )
			   {
			   System.out.print("*");
			   }
			else 
			   {
			   System.out.print(" ");
			   }
		    }
		  System.out.println();
		  
		
		}
		
	}

}
