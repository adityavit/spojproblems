import java.util.Scanner;

public class FCTRL{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int number;
		while(count!=0){
			number = sc.nextInt();
			System.out.println(numOfZerosInFact(number));
			 count--;
		}
	}

	static int numOfZerosInFact(int number){
		int zerosNum = 0;
		int divisor = 5;
		while(number/divisor >= 1){
			zerosNum = zerosNum + number/divisor;
			divisor = divisor * 5;
		}

		return zerosNum;
	}

	static int numOfZerosInFact2(int number){
		int zerosNum = (number/100)*24+(number/100-1)+numOfZerosInFact(number%100);
		return zerosNum;
	}

}