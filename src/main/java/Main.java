import ConverterModule.ConverterBuilder;
import ConverterModule.LocaleConverterBuilder;
import ConverterModule.Сonverter;

public class Main {
    public static void main(String[] args) {
        ConverterBuilder builder = new LocaleConverterBuilder();
        Сonverter converter = builder.buildConverter();
        System.out.println(converter.convert(14));
    }
}
