public class NumberPowerReverse 
{
    public static void main(String[] args) 
	{
        int num = 12;   
        int temp = num;       
        int rev = 0;          
		
        while (temp > 0) 
		{
            int digit = temp % 10;       
            rev = rev * 10 + digit;      
            temp = temp / 10;           
        }

        double result = Math.pow(num, rev);

        System.out.println("Number: " + num);
        System.out.println("Reverse: " + rev);
        System.out.println(num + "^" + rev + " = " + result);
    }
}