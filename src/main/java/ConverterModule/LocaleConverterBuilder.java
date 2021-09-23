package ConverterModule;

import ConverterModule.Сonverter;

public class LocaleConverterBuilder {

    public Сonverter create(Locale loc) {
        switch (loc.getLocal()){
            case "EN":
                return new FahrenheitConverter();
            case "RU":
                return new CelsiusConverter();
            default:
                return new KelvinConverter();
        }
    }
}
