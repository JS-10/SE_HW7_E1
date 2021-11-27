package householdAppliance;

public class PackageInstructor implements Visitor {

	@Override
	public void visitElectronic(Electronic e) {
		System.out.println(e.name + " should be covered with Polyethylene foam film and packed in "
				+ "a box with dimension: " + (e.height + 1) + "x" + (e.lenght + 1) + "x" + (e.width + 1) + ".");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

	@Override
	public void visitFurniture(Furniture f) {
		System.out.println(f.name + " should be covered with waterproof covers with an area of the furniture: "
				+ f.height + "x" + f.lenght + "x" + f.width + ".");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

	@Override
	public void visitGlass(Glass g) {
		System.out.println(g.name + " should be covered with Bubble wraps packed in a box with dimension: " 
				+ (g.height + 1) + "x" + (g.lenght + 1) + "x" + (g.width + 1) + ".");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

}
