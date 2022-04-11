package glDenomination;
import java.util.Scanner;

public class Currency {
 public static void merge(int arr[],int left ,int mid , int right) {
	 int n1= mid-left+1;
	 int n2 = right-mid;
	 
	 int leftArray[] = new int[n1];
	 int rightArray[]= new int[n2];
	 
	 for (int i =0; i<n1 ;++i)
		 leftArray[i] = arr[left+i];
	 for(int j= 0;j<n2;++j)
		 rightArray[j] = arr[mid +1 +j];
	 int i = 0;
	 int j=0;
	 int k = left;
	 while(i<n1 && j <n2) {
		 if (leftArray[i]>= rightArray[j]) {
			 arr[k] = leftArray[i];
			 i++;
		 }else {
			 arr[k]= rightArray[j];
			 j++;
		 }
		 k++;
	 }
	 while (i<n1) {
		 arr[k]=leftArray[i];
		 i++;
		 k++;
	 }
	 while (j<n2) {
		 arr[k]=rightArray[j];
		 j++;
		 k++;
	 }
	 
 }
 public static void mergeSort(int[] notes, int left,int right) {
	 if (left<right) {
		 int mid = (left+right)/2;
		 
		 mergeSort(notes,left,mid);
		 mergeSort(notes, mid+1,right);
		 
		 merge(notes,left,mid,right);
	 }
	 
 }
 public static void main(String []args) {
	 System.out.println("Enter the size of Denominations");
	 Scanner sc= new Scanner(System.in);
	 int N=sc.nextInt();
	 int denominations[]=new int[N];
	 for (int i =0; i<N;i++) {
		 System.out.println("Enter Denomination");
		 denominations[i]=sc.nextInt();
		 
	 }
	 mergeSort(denominations,0,denominations.length-1);
	 for(int i=0;i<denominations.length;i++ )
		 System.out.println(denominations[i]);
	 System.out.println("enter the amount you want to pay: ");
	 int amount = sc.nextInt();
	 for(int i =0; i< denominations.length;i++) {
		 if(amount> denominations[i]);
		 int notes= amount/denominations[i];
		 System.out.println(denominations[i]+ " : " + notes);
		 amount=amount%denominations[i];
	 }
	 if (amount>0)
		 System.out.println("remaining amount : "+ amount);
	 
 }
}
