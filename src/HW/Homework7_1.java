//package HW;

public class Homework7_1 {
	
	public static int fib(int n) {
		if(n == 0 || n == 1) {
			return n;
		}
		else {
		return	 fib(n-1) + fib(n - 2);
		}
	}
	
	public static int getPowerOfXtoN(int xBase, int nExp) {
		if(nExp == 0) {
			return 1;
		}
			
		else {
			return xBase * getPowerOfXtoN(xBase, nExp -1);
		}
	}
	
	public static int organizeParade(int paradeLength) {
		if(paradeLength == 0 || paradeLength == 1 || paradeLength == 2) {
			return paradeLength + 1;
		}
		else {
		return	 organizeParade(paradeLength-1) + organizeParade(paradeLength - 2);
		}
	}
	
	public static int numJarsNeeded(int candyCount, int jarCapacity) {
		if (candyCount <= 0 || jarCapacity <= 0) {
			return 0;
		}
		else if (candyCount <= jarCapacity) {return 1;}
		else {
			int candy = candyCount/2;
			return numJarsNeeded(candy, jarCapacity) + numJarsNeeded( candyCount - candy,  jarCapacity);
		}


	}

	
	//public static void main(String[] args) {
		//System.out.print(numJarsNeeded(7,6));
	//System.out.print(getPowerOfXtoN(-2,3));
	//}
}
