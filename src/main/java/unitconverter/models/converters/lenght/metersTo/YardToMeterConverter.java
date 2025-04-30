package unitconverter.models.converters.lenght.metersTo;

import unitconverter.models.converters.MeasureConverter;

public class YardToMeterConverter implements MeasureConverter{

	@Override
	public float convert(float value) {		
		return value/1.094f;
	}
	
}
