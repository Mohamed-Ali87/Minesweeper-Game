//package HW;

public class Array {
	public static void main(String[] args) {
    int list[] = {1, 2, 1, 50, 60};
    int max = indexOfFirstMaxValue(list, -1, 4 );
    System.out.print(max);
	}

public static int sum(int[] arr) {
	int sum = 0;
	for(int i=0; i <= arr.length-1; i++ ) {
		sum = sum + arr[i];
	}
	return sum;
}

public static int sum(int[] arr, int firstIndex, int lastIndex) {
	
	int sum = 0;
	if(lastIndex >= arr.length) {
		return -666;
	}
	else if(firstIndex <= lastIndex  && firstIndex > 0) {
		for(int i=firstIndex; i <= lastIndex; i++ ) {
			sum = sum + arr[i];
		}
		return sum;
	}
	else {
		return -666;
	}
}
public static double average(int[] arr) {
	double sum = 0.0;
	double average;
	for(int i=0; i <= arr.length-1; i++ ) {
		sum = sum + arr[i];
	}
	average = sum/arr.length;
	return average;
	
}
public static double average(int[] arr, int firstIndex, int lastIndex) {
	
	double sum = 0.0;
	double average;
	if(lastIndex >= arr.length) {
		return -666;
	}
	else if(firstIndex <= lastIndex && firstIndex > 0) {
		for(int i=firstIndex; i <= lastIndex; i++ ) {
			sum = sum + arr[i];
		}
		average = sum/(lastIndex - firstIndex +1);
		return average;
	}
	else {
		return -666.0;
	}
}

public static int maxValue(int[] arr) {
	int max = arr[0];
	for(int i=1; i <= arr.length-1; i++) {
		
		if(max < arr[i]) {
			max = arr[i];
		}
	}
	return max;
}

public static int maxValue(int[] arr, int firstIndex, int lastIndex) {
	if(lastIndex >= arr.length) {
		return -666;
	}
	else if(firstIndex <= lastIndex && firstIndex > 0) {
	int max = arr[firstIndex];
	
		for(int i=firstIndex; i <= lastIndex; i++) {
			
			if(max <= arr[i]) {
				max = arr[i];
			}
		}
		return max;
		}
	else {
		return -666;
	}
		
}
public static int indexOfFirstMaxValue(int[] arr) {
	
	int max = arr[0];
	int count = 0;
	for(int i=1; i <= arr.length-1; i++) {
		
		if(max < arr[i]) {
			max = arr[i];
	}
		
	}
	for(int j = 0; j <= arr.length-1; j++) {
		if (arr[j]== max) {
			break;
		}
		else {
			count = count +1; 
			}	
	}
	return count;
}
public static int indexOfFirstMaxValue(int[] arr, int firstIndex, int lastIndex) {
	if(lastIndex >= arr.length) {
		return -1;
	}
	else if(firstIndex <= lastIndex  && firstIndex >= 0) {
	
		int max = arr[firstIndex];
	int count = 0;
	
	for(int i=firstIndex+1 ; i <= lastIndex; i++) {
		
		if(max < arr[i]) {
			max = arr[i];
	}
		
	}
	for(int j = 0; j <= arr.length-1; j++) {
		if (arr[j]== max) {
			break;
		}
		else {
			count = count +1; 
			}
	}
	return count;
	}
	else {return -1;}
}
public static int numberOfBelowAverageElements(int[] arr) {
	double sum = 0.0;
	double average;
	int count =0;
	for(int i=0; i <= arr.length-1; i++ ) {
		sum = sum + arr[i];
	}
	average = sum/arr.length;
	for(int j = 0; j<= arr.length-1; j++) {
		if(arr[j] < average) {
			count =count+1;
		}
	}
	return count;
}
public static int numberOfBelowAverageElements(int[] arr, int firstIndex, int lastIndex) {
	double sum = 0.0;
	double average;
	int count =0;
	if(lastIndex >= arr.length) {
		return -666;
	}
	else if(firstIndex <= lastIndex && firstIndex > 0) {
	for(int i=firstIndex; i <= lastIndex; i++ ) {
		sum = sum + arr[i];
	}
	average = sum/lastIndex - firstIndex +1;
	for(int j = 0; j<= lastIndex; j++) {
		if(arr[j] < average) {
			count =count+1;
		}
	}
	return count;
	}
	
	else {
		return -666;
	}
}
public static void rotateElements(int[] arr) {
	int temp = arr[arr.length-1];
	for(int i = arr.length-2; i > -1; i--) {
		arr[i +1] = arr[i];
	}
     arr[0] = temp;
     for(int j = 0; j < arr.length; j++)
    	 System.out.print(arr[j] + " ");
}
public static void rotateElements(int[] arr, int rotationCount) {
	int temp = arr[arr.length-1];
	for(int i = arr.length-2; i > -1; i--) {
		arr[i +rotationCount] = arr[i];
	}
     arr[0] = temp;
     for(int j = 0; j < arr.length; j++)
    	 System.out.print(arr[j] + " ");
}
public static void reverseArray(int[] arr) {
	for(int i = 0; i < arr.length/2; i++) {
		int temp = arr[i];
		arr[i] = arr[arr.length-i-1];
		arr[arr.length-i-1] = temp;
		}
	for(int j = 0; j < arr.length; j++)
    	 System.out.print(arr[j] + " ");

}

}
