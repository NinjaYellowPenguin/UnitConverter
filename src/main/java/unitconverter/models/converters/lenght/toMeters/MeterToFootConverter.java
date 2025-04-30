package unitconverter.models.converters.lenght.toMeters;

import unitconverter.models.converters.MeasureConverter;

public class MeterToFootConverter implements MeasureConverter{

	@Override
	public float convert(float value) {
		return value*3.281f;
	}

}
