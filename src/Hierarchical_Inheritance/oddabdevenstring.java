package Hierarchical_Inheritance;

public class oddabdevenstring {

	
		
		public static void main(String args[]){
			int a[]={0,1,2,3,4,5,6,7,8,9,10};
			System.out.println("Odd Numbers:");
			for(int i=0;i<a.length;i++){
			if(a[i]%2!=0){
			System.out.println(a[i]);
			}
			}
			System.out.println("Even Numbers:");
			for(int j=0;j<a.length;j++){
			if(a[j]%2==0){
			System.out.println(a[j]);
			}
			}

		}
}
