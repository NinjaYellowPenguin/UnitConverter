package unitconverter.models.converters.lenght.toMeters;

import unitconverter.models.converters.MeasureConverter;

public class MeterToMileConverter implements MeasureConverter{
	
	@Override
	public float convert(float value) {
		return value/1609;
	}

}
