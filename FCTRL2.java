import java.util.Scanner;
import java.math.BigInteger;
public class FCTRL2{
	static BigInteger factorialTemp[];
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int number;
		factorialTemp = new BigInteger[101];
		while(count!=0){
			number = sc.nextInt();
			System.out.println(factorial2(number));
			 count--;
		}
		//printArray();
	}	

	static BigInteger factorial(int number){
		if(number <=1){
			factorialTemp[number] = BigInteger.ONE;
			return (BigInteger.ONE);
		}else{
			if(factorialTemp[number] != null){
				return factorialTemp[number];
			}else{
				factorialTemp[number] = BigInteger.valueOf(number).multiply(factorial(number-1));
			return factorialTemp[number];
			}
		}
	}

	static BigInteger factorial2(int number){
		if(number <=1){
			return (BigInteger.ONE);
		}else{
			return BigInteger.valueOf(number).multiply(factorial(number-1));
		}
	}
	
	static void printArray(){
		for(int i=1;i<100;i++){
			if(factorialTemp[i] == null){
				break;
			}else{
			System.out.println(factorialTemp[i]);
			}
		}
	}

}