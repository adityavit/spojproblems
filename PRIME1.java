import java.util.Scanner;
import java.math.BigInteger;
import java.util.*;
public class PRIME1{

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int startNumber;
        int endNumber;
        long start;
        while(count!=0){
            startNumber = sc.nextInt();
            endNumber = sc.nextInt();
            start = System.currentTimeMillis();
            List<Integer> primes = prime(startNumber,endNumber);
            for(int j : primes){
            	System.out.println(j);
            }
            System.out.println("Total time = "+count+" --- "+ (double)(System.currentTimeMillis() - start) / 1000);
             count--;
        }
    }

    public static List prime(int startNumber,int endNumber){
        int prime;
        if(startNumber == 2){
        	List<Integer> primes = new ArrayList<Integer>();
        	primes.add(2);
        	return primes;
        }else{
        List<Integer> primes = prime(2,startNumber);
        if(startNumber%2 == 0){
            startNumber++;
        }
        for(int i = startNumber;i<= endNumber;i=i+2){
            prime = 0;
            if(i == 1){
                continue;
            }
            for(int j : primes){
                if(i%j==0){
                    prime = -1;
                    break;
                }
            }
            if(prime != -1){
                primes.add(i);
            }
        }
     return primes;
    }
    }

}