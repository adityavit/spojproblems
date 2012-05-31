import java.util.*;
public class ONP{

	static int stringCharCounter;
	
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        long start;
        String exp;
        while(count!=0){
        	stringCharCounter = 0;
        	exp = sc.next();
            //start = System.currentTimeMillis();
            ExpressionTree tree = createToTree(exp);
            //System.out.println(tree.toString());
            printPostFix(tree);
            System.out.println();
            //System.out.println("Total time = "+count+" --- "+ (double)(System.currentTimeMillis() - start) / 1000);
             count--;
        }
    }
    
    private static ExpressionTree createToTree(String exp){
    	ExpressionTree tree = null;
    	if(exp.charAt(stringCharCounter) == '('){
    		stringCharCounter++;
    		tree = new ExpressionTree();
    		if(exp.charAt(stringCharCounter) == '('){
    			tree.leftChild = createToTree(exp);
    		}else{
    			tree.leftChild = new ExpressionTree();
    			tree.leftChild.nodeValue = String.valueOf(exp.charAt(stringCharCounter));
    			tree.leftChild.leftChild = null;
    			tree.leftChild.rightChild = null;
    			stringCharCounter++;
    		}
    		tree.nodeValue =  String.valueOf(exp.charAt(stringCharCounter));
    		stringCharCounter++;
    		
    		if(exp.charAt(stringCharCounter) == '('){
    			tree.rightChild = createToTree(exp);
    		}else{
    			tree.rightChild = new ExpressionTree();
    			tree.rightChild.nodeValue = String.valueOf(exp.charAt(stringCharCounter));
    			tree.rightChild.leftChild = null;
    			tree.rightChild.rightChild = null;
    			stringCharCounter++;
    		}
    		
    	}
    	
    	if(exp.charAt(stringCharCounter) == ')' ){
    		stringCharCounter++;
    	}
    	return tree;
    }
    
    
    private static void printPostFix(ExpressionTree tree){
    	if(tree ==  null){
    		return;
    	}else{
    		printPostFix(tree.leftChild);
    		printPostFix(tree.rightChild);
    		System.out.print(tree.nodeValue);
    	}
    }
    
    
    public static class ExpressionTree{
    	String nodeValue;
    	ExpressionTree leftChild;
    	ExpressionTree rightChild;
    	
    	public  String toString(){
    		String leftString = (leftChild != null?leftChild.toString():"?");
    		String rightString = (rightChild != null)?rightChild.toString():"?";
    		return  leftString + "--" + nodeValue + "--" + rightString;
    	}
    }
}