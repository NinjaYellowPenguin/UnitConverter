package unitconverter.models.converters.lenght.toMeters;

import unitconverter.models.converters.MeasureConverter;

public class MeterToInchConverter implements MeasureConverter{

	@Override
	public float convert(float value) {
		return value*39.37f;
	}

}
