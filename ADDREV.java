
import java.util.Scanner;

public class ADDREV{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int rnum1;
		int rnum2;
		int count = sc.nextInt();
		while(count!=0){
			 num1 = sc.nextInt();
			 num2 = sc.nextInt();
			 rnum1 = reverseNumber(num1);
			 rnum2 = reverseNumber(num2);
			 System.out.println(reverseNumber(rnum1+rnum2));
			 count--;
		}
	}

	static int reverseNumber(int number){
		int num = number;
		int sum = 0;
		while(num != 0){
			sum = sum * 10 + num%10;
			num = num/10;
		}
		return sum;
	}
}