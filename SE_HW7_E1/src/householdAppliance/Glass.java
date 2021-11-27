package householdAppliance;

public class Glass implements HouseholdItem {

	String name;
	int lenght;
	int width;
	int height;

	int thickness;
	
	PriceCalculator pr;
	PackageInstructor pa;
	
	public Glass(String name, int lenght, int width, int height, int thickness, PriceCalculator pr, PackageInstructor pa) {
		this.name = name;
		this.lenght = lenght;
		this.width = width;
		this.height = height;
		this.thickness = thickness;
		this.pr = pr;
		this.pa = pa;
		accept(pr);
		accept(pa);
	}

	//Getters and Setters
	public int getHeight() {
		return height;}

	public void setHeight(int height) {
		this.height = height;}

	public int getLenght() {
		return lenght;}

	public void setLenght(int lenght) {
		this.lenght = lenght;}

	public int getWidth() {
		return width;}

	public void setWidth(int width) {
		this.width = width;}

	public Integer getTickness() {
		return thickness;}

	public void setTickness(int thickness) {
		this.thickness = thickness;}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void accept(Visitor v) {
		v.visitGlass(this);
	}
}
