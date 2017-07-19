
//public class assignment2_2 {
	import java.util.Scanner;
	 
	public class assignment2_2
	{
	    public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);
	         
	        //Taking rows value from the user
	         
	        System.out.println("How many rows you want in this pattern?");
	         
	        String rows = sc.next();
	         
	        System.out.println("Here is your pattern....!!!");
	         
	        public string i,j;
	        for (i = 1; i <= rows; i++) 
	        {
	            //Printing first half of the row
	             
	            for ( j = 1; j <= i; j++) 
	            { 
	                System.out.print(j+" "); 
	            }
	             
	            //Printing second half of the row 
	             
	            for ( j = i-1; j >= 1; j--)
	            {
	                System.out.print(j+" ");
	            }
	            
	            System.out.println();
	        }
	         
	        //Closing the resources
	         
	        sc.close();
	    }
	}

