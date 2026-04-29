import java.util.Scanner;
public class AlternateStringCombiner 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        StringBuilder result = new StringBuilder();

        int len1 = str1.length();
        int len2 = str2.length();
        int minLen = Math.min(len1, len2);

        for (int i = 0; i < minLen; i++) 
		{
            result.append(str1.charAt(i));
            result.append(str2.charAt(i));
        }

        if (len1 > len2) 
		{
            result.append(str1.substring(minLen));
        } 
		else if (len2 > len1) 
		{
            result.append(str2.substring(minLen));
        }
        System.out.println("Combined String: " + result.toString());
    }
}