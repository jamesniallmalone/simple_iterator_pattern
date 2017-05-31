package iterator.rangeobject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import iterator.engine.StandardEngine;
import iterator.engine.TurboEngine;
import iterator.vehicle.Coupe;
import iterator.vehicle.Saloon;
import iterator.vehicle.Vehicle;

public class CarRange implements Iterable<Vehicle> {

	private List<Vehicle> cars;
	
	public CarRange(){
		cars = new ArrayList<Vehicle>();
		
		cars.add(new Saloon(new StandardEngine(1300)));
		cars.add(new Saloon(new StandardEngine(1300)));
		cars.add(new Coupe(new TurboEngine(1300)));
	}
	
	public List<Vehicle> getRange(){
		return cars;
	}

	@Override
	public Iterator<Vehicle> iterator() {
		return cars.listIterator();
	}
}
