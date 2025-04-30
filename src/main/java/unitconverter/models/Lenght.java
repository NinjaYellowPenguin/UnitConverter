package unitconverter.models;

public class Lenght extends Category{
	
	private float value;
	private LenghtMeasurementUnits standardMeasure;
	private LenghtMeasurementUnits measure;
	
	public Lenght(float value, LenghtMeasurementUnits measure) {
		standardMeasure = LenghtMeasurementUnits.METER;
		this.value = value;
		this.measure = measure;
	}

	public float getValue() {
		return value;
	}

	public LenghtMeasurementUnits getMeasure() {
		return measure;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public void setMeasure(LenghtMeasurementUnits measure) {
		this.measure = measure;
	}
	
	
}
