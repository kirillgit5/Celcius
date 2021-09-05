package ConverterModule;

import ConverterModule.Сonverter;

import java.util.Locale;

public class LocaleConverterBuilder implements ConverterBuilder {
    @Override
    public Сonverter buildConverter() {
        switch (Locale.getDefault().getLanguage()) {
            case ("ru"): return new CelsiusConverter();
            case ("en"): return new FahrenheitConverter();
            default: return new KelvinConverter();
        }
    }
}
