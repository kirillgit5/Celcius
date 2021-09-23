package ConverterModule;

public class Locale {
    private final String m_local;
    
    Locale(){
        m_local = java.util.Locale.getDefault().getCountry();
    }

    String getLocal(){
        return m_local;
    }
}
