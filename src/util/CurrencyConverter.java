package util;
public class CurrencyConverter {

	
	public static double iof (double quotePrice, double amount){
		
		quotePrice = (quotePrice += quotePrice * 6.0 / 100);
		return amount * quotePrice;

		
	}
	
	
}
