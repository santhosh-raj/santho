import java.util.Scanner;
class palindrome
{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int palindrome=s.nextInt();
                int num= checkmethod(palindrome);
		if (num==palindrome)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
}
		public static int checkmethod(int number){
			int palindrome=number;
			int reverse=0;
			while(palindrome!=0)
			{
				int remainder=palindrome%10;
				reverse=reverse*10+remainder;
				palindrome=palindrome/10;
			}
			if (number==reverse){
				return reverse;
		}
		return 0;
		}
	}