package ConverterModule;

import ConverterModule.Сonverter;

public class FahrenheitConverter implements Сonverter {
    private static final double addedNumber = 32;
    private static  final double fahrenheitMultiplayer = 1.8;

    @Override
    public double convert(double celsius) {
        return celsius * fahrenheitMultiplayer + addedNumber;
    }
}
