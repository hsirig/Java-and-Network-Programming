import java.io.*;
class Prime
{ 
    public static void main(String args[]) throws IOException
	  {
		    int number, flag = 0;
        System.out.print("Enter a number: ");
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    number = Integer.parseInt(br.readLine());
		    for(int i = 2; i <= (number / 2); i++)
		    {
    			  if((number % i) == 0)
			      {
    				    flag = 1;		
				        break;
			      }
		    }
		    if(flag == 0)
    			  System.out.println(number + " is a prime number.");
		    else
			      System.out.println(number + " is not a prime number.");
	  }
}
