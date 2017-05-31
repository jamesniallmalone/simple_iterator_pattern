import java.util.Iterator;

import iterator.rangeobject.CarRange;
import iterator.rangeobject.VanRange;
import iterator.vehicle.Vehicle;

public class runner {
	/*
	 * To access CarRange or VanRange's structures from outside we would need to know their structures.
	 * CarRange implements Arraylist, VanRange implements array.
	 * 
	 * We extend functionality to force classes to return iterable objects on request.
	 */

	public static void main(String[] args) {
		System.out.println("=== Our Cars ===");
		CarRange carrange = new CarRange();
		printIterator(carrange.iterator());
		
		System.out.println("=== Our Vans ===");
		VanRange vanrange = new VanRange();
		printIterator(vanrange.iterator());
	}

	private static void printIterator(Iterator<Vehicle> iterator) {
		while(iterator.hasNext())
			System.out.println(iterator.next().toString());
	}

}
