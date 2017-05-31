package iterator.rangeobject;

import java.util.Arrays;
import java.util.Iterator;

import iterator.engine.StandardEngine;
import iterator.engine.TurboEngine;
import iterator.vehicle.BoxVan;
import iterator.vehicle.Pickup;
import iterator.vehicle.Vehicle;

public class VanRange implements Iterable<Vehicle> {
	
	private Vehicle[] vans;
	
	public VanRange(){
		vans = new Vehicle[3];
		
		vans[0] = new BoxVan(new StandardEngine(1600));
		vans[1] = new BoxVan(new StandardEngine(1600));
		vans[2] = new Pickup(new TurboEngine(1600));
	}
	
	public Vehicle[] getRange(){
		return vans;
	}

	@Override
	public Iterator<Vehicle> iterator() {
		return Arrays.asList(vans).listIterator();
	}

}
