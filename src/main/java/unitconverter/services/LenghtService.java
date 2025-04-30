package unitconverter.services;

import unitconverter.models.Lenght;
import unitconverter.models.LenghtMeasurementUnits;
import unitconverter.models.converters.MeasureConverter;
import unitconverter.models.converters.lenght.metersTo.CentimiterToMeterConverter;
import unitconverter.models.converters.lenght.metersTo.FootToMeterConverter;
import unitconverter.models.converters.lenght.metersTo.InchToMeterConverter;
import unitconverter.models.converters.lenght.metersTo.KilometerToMeterConverter;
import unitconverter.models.converters.lenght.metersTo.MeterToMeterConverter;
import unitconverter.models.converters.lenght.metersTo.MileToMeterConverter;
import unitconverter.models.converters.lenght.metersTo.MillimiterToMeterConverter;
import unitconverter.models.converters.lenght.metersTo.YardToMeterConverter;
import unitconverter.models.converters.lenght.toMeters.MeterToCentimeterConverter;
import unitconverter.models.converters.lenght.toMeters.MeterToFootConverter;
import unitconverter.models.converters.lenght.toMeters.MeterToInchConverter;
import unitconverter.models.converters.lenght.toMeters.MeterToKilometerConverter;
import unitconverter.models.converters.lenght.toMeters.MeterToMileConverter;
import unitconverter.models.converters.lenght.toMeters.MeterToMillimiterConverter;
import unitconverter.models.converters.lenght.toMeters.MeterToYardConverter;

public class LenghtService {
	
	public Lenght convert(float value, String measure, String newMeasure) {
		checkValue(value);
		LenghtMeasurementUnits lenghtMeasure = convertToMeasure(measure);
		LenghtMeasurementUnits newLenghtMeasure = convertToMeasure(newMeasure);
		
		MeasureConverter conversionA = getToMeter(lenghtMeasure);
		MeasureConverter conversionB = getMeterTo(newLenghtMeasure);
		
		Float newValue = conversionB.convert(conversionA.convert(value));
		
		Lenght newLenght = new Lenght(newValue, newLenghtMeasure);
		
		return newLenght;
	}

	private MeasureConverter getMeterTo(LenghtMeasurementUnits newLenghtMeasure) {
		if(newLenghtMeasure.equals(LenghtMeasurementUnits.MILLIMITER)) {
			return new MeterToMillimiterConverter();
		}else if(newLenghtMeasure.equals(LenghtMeasurementUnits.CENTIMITER)) {
			return new MeterToCentimeterConverter();
		}else if(newLenghtMeasure.equals(LenghtMeasurementUnits.METER)) {
			return new MeterToMeterConverter();
		}else if(newLenghtMeasure.equals(LenghtMeasurementUnits.KILOMETER)) {
			return new MeterToKilometerConverter();
		}else if(newLenghtMeasure.equals(LenghtMeasurementUnits.INCH)) {
			return new MeterToInchConverter();
		}else if(newLenghtMeasure.equals(LenghtMeasurementUnits.FOOT)) {
			return new MeterToFootConverter();
		}else if(newLenghtMeasure.equals(LenghtMeasurementUnits.YARD)) {
			return new MeterToYardConverter();
		}else if(newLenghtMeasure.equals(LenghtMeasurementUnits.MILE)) {
			return new MeterToMileConverter();
		}
		return null;
	}

	private MeasureConverter getToMeter(LenghtMeasurementUnits lenghtMeasure) {
		if(lenghtMeasure.equals(LenghtMeasurementUnits.MILLIMITER)) {
			return new MillimiterToMeterConverter();
		}else if(lenghtMeasure.equals(LenghtMeasurementUnits.CENTIMITER)) {
			return new CentimiterToMeterConverter();
		}else if(lenghtMeasure.equals(LenghtMeasurementUnits.METER)) {
			return new MeterToMeterConverter();
		}else if(lenghtMeasure.equals(LenghtMeasurementUnits.KILOMETER)) {
			return new KilometerToMeterConverter();
		}else if(lenghtMeasure.equals(LenghtMeasurementUnits.INCH)) {
			return new InchToMeterConverter();
		}else if(lenghtMeasure.equals(LenghtMeasurementUnits.FOOT)) {
			return new FootToMeterConverter();
		}else if(lenghtMeasure.equals(LenghtMeasurementUnits.YARD)) {
			return new YardToMeterConverter();
		}else if(lenghtMeasure.equals(LenghtMeasurementUnits.MILE)) {
			return new MileToMeterConverter();
		}
		throw new RuntimeException("Measure not found. " + lenghtMeasure.toString());
	}

	private LenghtMeasurementUnits convertToMeasure(String measure) {
		return LenghtMeasurementUnits.valueOf(measure.toUpperCase());
	}

	private void checkValue(float value) {
		return;
	}
}
