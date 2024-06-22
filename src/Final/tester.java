package Final;

public class tester {

	public static void main(String[] args) {
		String mo ="mo";
		int[] arr = {4,4};
		Person p = new Person(mo,true,32,6);
		Vehicle v = new Vehicle(p,arr);
		
		System.out.print(v.getNumberOfAvailableSeats());

	}

}
