package ConverterModule;

import ConverterModule.Сonverter;

public class KelvinConverter implements Сonverter {
    private static final double addedNumber = 273;

    @Override
    public double convert(double celsius) {
        return celsius + addedNumber;
    }
}
