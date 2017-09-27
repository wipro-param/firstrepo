
public class Part13 {

	public static void main(String[] args) {

		//declaring and intilizing the array
		int[] arList = {4,566,76,32,12,8,6};
		

		//finding the min element in the array
		int min = arList[0];
		for (int s = 1; s < arList.length; s++) {
			if (arList[s] < min){
				min = arList[s];
			}
		}
	
			
	//finding the maximum element in the array
	int max = arList[0];
	for (int i = 1; i < arList.length; i++) {
		if (arList[i] > max) max = arList[i];

		
	}
	System.out.println("The min is " + min);
	System.out.println("The max is " + max);

}

		
	}

	
