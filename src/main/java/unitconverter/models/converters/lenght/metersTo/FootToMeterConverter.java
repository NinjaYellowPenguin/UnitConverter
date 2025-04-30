package unitconverter.models.converters.lenght.metersTo;

import unitconverter.models.converters.MeasureConverter;

public class FootToMeterConverter implements MeasureConverter{

	@Override
	public float convert(float value) {
		return value/3.281f;
	}

}
