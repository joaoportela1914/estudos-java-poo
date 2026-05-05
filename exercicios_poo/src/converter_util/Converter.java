package converter_util;

public class Converter {
	 public static double IOF= 0.06;
	
	public static double currencyConverter(double quantity , double dolar_price) {
		return + (quantity * dolar_price) * (1 + IOF);
	}
}
