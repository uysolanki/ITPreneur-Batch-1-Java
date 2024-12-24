package day4;

public enum Planet {

		MERCURY(500.0,1234567),
		VENUS(450.0,123487),
		EARTH(700.0,12345679),
		MARS(600.0,123456789),
		JUPITER(1500.0,1234567999),
		SATURN(1100.0,123456997),
		URANUS(900.0,123984567),
		NEPTUNE(350.0,123567);
	
	
	private double radius;
	private double mass;
	
	private Planet(double radius, double mass) {
		this.radius = radius;
		this.mass = mass;
	}

	public double getDiameter() {
		return radius;
	}

	public void setDiameter(double radius) {
		this.radius = radius;
	}

	public double getMass() {
		return mass;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}
	
	
	public double calculateGravity()
	{
		return this.mass/(this.radius*this.radius);
	}

}
