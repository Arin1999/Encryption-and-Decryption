import java.util.*;
public class EncryptionDecryption
{
	public static void Encryption(String massage, String key)
	{
		int i,j,l;
		String s="";
		for(i=0,j=0,l=0;l<(massage.length()>key.length()?massage.length():key.length());l++,i++,j++)
		{
			if(i== massage.length() && j!= key.length())
			{
				i=0;
			}
			else if ( j == key.length() && i != massage.length())
			{
				j=0;
			}
			s=s+(char)(massage.codePointAt(i)+key.codePointAt(j));
		}
		System.out.println(s);
		
	}
	public static void Decryption(String massage, String key)
	{
		int i,j,l;
		String s="";
		for(i=0,j=0,l=0;l<(massage.length()>key.length()?massage.length():key.length());l++,i++,j++)
		{
			if(i== massage.length() && j!= key.length())
			{
				i=0;
			}
			else if ( j == key.length() && i != massage.length())
			{
				j=0;
			}
			s=s+(char)(massage.codePointAt(i)-key.codePointAt(j));
		}
		System.out.println(s);
	
	}
	public static void main(String args[])
	{
		int k;
		String key,massage;
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 0 for Encryption OR Press 1 for Decryption");
		k=sc.nextInt();
		if(k==0)
		{
			System.out.println("Enter the massage for Encryption");
			massage=sc.nextLine();
			massage=sc.nextLine();
			System.out.println("Enter the key");
			key=sc.nextLine();
			Encryption(massage,key);
		}
		else if(k==1)
		{
			System.out.println("Enter the massage for Decryption");
			massage=sc.nextLine();
			massage=sc.nextLine();
			System.out.println("Enter the key");
			key=sc.nextLine();
			Decryption(massage,key);
		}
		else
		{
			System.out.println("Error key selected");
		}
		
		
	}
}