import java.util.Arrays;
import java.util.Random;
public class program {
	//implement integer array
	static int[] list = new int[1000];
	
	public static void main(String[] args) {
		//implement algorithm timer
		long start = System.currentTimeMillis();
		long end = 0;
		long total = 0;
		
		setArray();
		bubbleSort(list);
		
		//sort list by language supplied sort method
		//Arrays.sort(list);
		
		//test bubble sort
		for(int i =0; i<list.length; i++){
			System.out.println(list[i]);
		}
		//finish algorithm timer
		end = System.currentTimeMillis();
		
		total = end - start;
		
		System.out.println("Sort Method Duration = " + total + " ms");
	}
	
	public static void setArray(){
		//initialize the random number generator.
		Random rand = new Random(0);  
		for(int i = 0; i<list.length; i++){
			//n is between 1 and 100
			int n = rand.nextInt(101) + 1;
		    list[i] = n;
		}
		
	}
	
	public static int[] bubbleSort (int[] list){
		//initialize variables for sorting algorithm
		int num = 0;
		//sorting algorithm
		for(int i=0; i < list.length - 1; i++){
			for(int j=0; j < list.length - 1 - i; j++){
				if(list[j] > list[j+1]){
					num = list[j];
					list[j] = list[j+1];
					list[j+1] = num;
				}
			}
		}
		return list;
	}
}
