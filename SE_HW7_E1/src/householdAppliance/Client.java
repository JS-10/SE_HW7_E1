package householdAppliance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		//Initialise some household
		List<HouseholdItem> householdItmes= new ArrayList<>();
		
		PriceCalculator pr = new PriceCalculator();
		PackageInstructor pa = new PackageInstructor();
		
		Electronic microwaveOven= new Electronic("Microwave Oven",37, 48, 27, 13, false, pr, pa);
		Electronic tv= new Electronic("TV",122, 73, 15, 18, true, pr, pa);
				
		Glass wineGlass= new Glass("Wine glasses",33,28,23,1, pr, pa);
		Glass coffeeTable= new Glass("Glass Coffee Table",80,80,45,3, pr, pa);

		Furniture bed= new Furniture("Bed", "Metal", 205, 91, 94, 26, pr, pa);
		Furniture cupboard= new Furniture("Bookshelf", "Wood", 60, 31, 190, 25, pr, pa);
				
		List<HouseholdItem> namesList = Arrays.asList(microwaveOven,tv,wineGlass,coffeeTable,bed,cupboard);
		householdItmes.addAll(namesList);

	}

}
