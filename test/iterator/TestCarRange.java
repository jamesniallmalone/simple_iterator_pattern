package iterator;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import iterator.rangeobject.CarRange;
import iterator.vehicle.Vehicle;

public class TestCarRange {
	
	private CarRange cr;

	@Before
	public void initialise(){
		cr = new CarRange();
	}

	@Test
	public void testCarRange() {
		assertNotNull("Should not be null", cr);
	}

	@Test
	public void testGetRange() {
		assertEquals("should have size 3.", cr.getRange().size(), 3);
	}

	@Test
	public void testIterator() {
		Iterator<Vehicle> iterator = cr.iterator();
		assertEquals("Should contain a item to move to", true, iterator.hasNext());
		
		assertEquals("should contain the first item in iterator", "Saloon", iterator.next().toString());
	}

}
