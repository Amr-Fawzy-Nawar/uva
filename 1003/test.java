package firstApp;
import java.util.Scanner;
public class hello {
	
	static Scanner reader=new Scanner (System.in);

	
    
	public static void main(String[] args) {	
		
		
		int [] arr=new int[] {5,3,6,1,4,2};
		
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
			}
		System.out.println(max);
		
	}
}
