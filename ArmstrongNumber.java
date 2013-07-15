import java.io.*;
class ArmstrongNumber
{ 
	public static void main(String args[]) throws IOException
	{
	    int number, temp, rem, result = 0;
	    System.out.print("Enter a number: ");
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    number = Integer.parseInt(br.readLine());
	    temp = number;
	    while(temp > 0)
	    {
	      rem = temp % 10;			
	      result+= (rem * rem * rem);
	      temp = temp / 10;  	
	    }
	    System.out.println("Number = " + number + "\nSum of the cube of its digits = " + result);
	    if(number == result)
		      System.out.println(number + " is an Armstrong number.");
	   else
	      System.out.println(number + " is not an Armstrong number.");
	}
}
