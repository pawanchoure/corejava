package com.pawan.choure.basic;/*import java.io.LineNumberReader;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;


public class MyLocale {
	final double d = 18.09;
	Locale locale;
	public MyLocale() {
		// TODO Auto-generated constructor stub
		locale = new Locale("de","DE");
		System.out.println(locale.getDisplayLanguage());
	}
    public void testGetNumberFormatForCurrencyCode()
    {
        NumberFormat format = NumberFormat.getInstance();
        format.setMaximumFractionDigits(2);
    	locale = Currency.getInstance("USD");
        format.setCurrency(currency);

       System.out.println(format.format(1234.23434));
    }   
	
	
	public static void main(String[] args) {
		new MyLocale();
	}
}


public class MyLocale {
	Locale locale;
	public MyLocale() {
		// TODO Auto-generated constructor stub
		locale = new Locale("de","DE");
		System.out.println(locale.getDisplayLanguage());
	}
	private static Locale getLocalesFromIso4217(String iso4217code) {
    Locale returnValue = new LinkedList<Locale>();
    for (Locale locale : NumberFormat.getAvailableLocales()) {
        String code = NumberFormat.getCurrencyInstance(locale).
        getCurrency().getCurrencyCode();
        if (iso4217code.equals(code)) {
            returnValue.add(locale);
        }
    }  
    return returnValue;
	}

public static void main(String... args) {
	new MyLocale();
	LineNumberReader ln=new LineNumberReader(in)
	NumberFormat.getCurrencyInstance(locale).getCurrency().getCurrencyCode();
}
}*/