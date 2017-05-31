package iterator;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import iterator.rangeobject.VanRange;
import iterator.vehicle.Vehicle;

public class TestVanRange {
	
	private VanRange vr;

	@Before
	public void initialise(){
		vr = new VanRange();
	}

	@Test
	public void testVanRange() {
		assertNotNull("Should not be null", vr);
	}

	@Test
	public void testGetRange() {
		assertEquals("should have size 3.", vr.getRange().length, 3);
	}

	@Test
	public void testIterator() {
		Iterator<Vehicle> iterator = vr.iterator();
		assertEquals("Should contain a item to move to", true, iterator.hasNext());
		
		assertEquals("should contain the first item in iterator", "Boxvan", iterator.next().toString());
	}

}
