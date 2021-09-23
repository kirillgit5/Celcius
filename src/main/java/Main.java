import ConverterModule.Сonverter;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Scanner in = new Scanner(System.in);
        int temp = in.nextInt();
        Сonverter converter = context.getBean("convertor", Сonverter.class);
        System.out.println(converter.convert(temp));
        context.close();
    }
}
