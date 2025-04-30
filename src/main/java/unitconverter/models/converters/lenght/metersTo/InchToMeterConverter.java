package unitconverter.models.converters.lenght.metersTo;

import unitconverter.models.converters.MeasureConverter;

public class InchToMeterConverter implements MeasureConverter{

	@Override
	public float convert(float value) {
		return value/39.37f;
	}

}
