package householdAppliance;

public class PriceCalculator implements Visitor {

	double price;
	
	@Override
	public void visitElectronic(Electronic e) {
		if(e.fragile) {
			price = e.weight * 0.5; // 5 Euros per 10 kg -> 0.5 Euros per 1 kg
		}else if(!e.fragile){
			price = e.weight * 0.33; // 5 Euros per 15 kg -> 0.33 Euros per 1 kg
		}
		System.out.println("Total cost for " + e.name + " is: " + price + " Euros.");
	}

	@Override
	public void visitFurniture(Furniture f) {
		price = f.weight * 0.25; // 5 Euros per 20 kg -> 0.25 Euros per 1 kg
		System.out.println("Total cost for " + f.name + " is: " + price + " Euros.");
	}

	@Override
	public void visitGlass(Glass g) {
		// length in cm
		if(g.thickness == 1) {
			price = g.lenght * 0.02; // e.g.: 2 Euros per 1 meter (100 cm) -> 0.02 Euros per 1 cm
		}else if(g.thickness == 2) {
			price = g.lenght * 0.012; // analog
		}else if(g.thickness == 3) {
			price = g.lenght * 0.007; // analog
		}
		System.out.println("Total cost for " + g.name + " is: " + price + " Euros.");
	}
}
