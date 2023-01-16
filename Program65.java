import java.util.HashMap;

public class Program65 {
/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = new int [] {2, 2, 3, 4, 5, 5, 5, 3, 2, 4};
	    //This array will store the frequency of each element
	    int [] frequency = new int [numbers.length];
	    int counted = -1;
	    for(int i = 0; i < numbers.length; i++){
	      int count = 1;
	      for(int j = i+1; j < numbers.length; j++){
	        if(numbers[i] == numbers[j]){
	          count++;
	          //To avoid counting the frequency of same element again
	          frequency[j] = counted;
	        }
	      }
	      if(frequency[i] != counted)
	        frequency[i] = count;
	    }

	    //Printing the frequency of each element
	    for(int i = 0; i < frequency.length; i++){
	      if(frequency[i] != counted)
	        System.out.println("Element: "+numbers[i] + " Frequency: " + frequency[i]);
	    }

	}
*/
	
	public static void main(String[] args) {
		int [] numbers = new int [] {2, 2, 3, 4, 5, 5, 5, 3, 2, 4};
		HashMap<Integer, Integer> hm = new HashMap<>();
		int len = numbers.length;
		for(int i=0;i<len;i++){
			if(hm.containsKey(numbers[i])) {
				hm.put(numbers[i], hm.get(numbers[i])+1);
				
			}
			else {
				hm.put(numbers[i],1);

			}
		}
		System.out.println(hm);

	}
}
