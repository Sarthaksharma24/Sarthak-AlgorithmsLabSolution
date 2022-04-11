package glTransactions;
import java.util.Scanner;

public class Transactions {
	public static void main (String []args) {
		System.out.println("Enter number of transactions");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int txs[] = new int [num];
		System.out.println("Enter the values of array ");
		int i=0;
		for(i=0;i<num;i++) {
			
			txs[i]= sc.nextInt();
			
		}
		System.out.println("Enter the number of Targets");
		
		int targets = sc.nextInt();
		for(int j=0;j<targets;j++) {
			System.out.println("enter the target value  "+ (j+1));
				
		    int targetValue= sc.nextInt();
		    int sum=0;
		    for(int k=0;k<num;k++) {
		    	sum+=txs[k];
		    	if(sum>=targetValue) {
		    		System.out.println("target is acheived after "+(k+1)+" transactions");
		    		break;
		    	}
		    }
		    if (sum<targetValue)
		    	System.out.println("target is not achieved");
		}
	}

}
