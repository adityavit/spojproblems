import java.util.Scanner;
public class TOANDFRO{

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        
        int colCount = sc.nextInt();
        long start;
        String encodedString;
        while(colCount!=0){
        	encodedString = sc.next();
            start = System.currentTimeMillis();
            System.out.println(decodeString(colCount,encodedString));
            //System.out.println("Total time = "+colCount+" --- "+ (double)(System.currentTimeMillis() - start) / 1000);
            colCount = sc.nextInt();
        }
    }
    
    
    private static String decodeString(int colCount,String encodedString){
    	String decodedString = "";
    		for(int i=0;i<colCount;i++){
    			for(int j=0;j<encodedString.length()/colCount;j++){
    				if(j%2 == 0){
    					decodedString = decodedString + String.valueOf(encodedString.charAt(j*colCount+i ));
    				}else{
    					decodedString = decodedString + String.valueOf(encodedString.charAt((j+1)*colCount-(i+1) ));
    				}
    			}
    		}
    	
    	return decodedString;
    }
}