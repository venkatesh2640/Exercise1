package Excersie.MassMutual_final;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class CurrencyValidation {


	
		public double parse(String amount, Locale locale) throws ParseException {
			
			BigDecimal bd;
			double dCurrency=0.00;
			
			NumberFormat format = NumberFormat.getNumberInstance(locale);
	
			if(amount.matches("^\\$(([1-9]\\d{0,2}(,\\d{3})*)|(([1-9]\\d*)?\\d))(\\.\\d\\d)?$"))
			{
			
				/*DecimalFormatSymbols symbols = new DecimalFormatSymbols();
				 symbols.setGroupingSeparator(',');
				 symbols.setDecimalSeparator('.');
				 String pattern = "#,##0.0#";
				 DecimalFormat decimalFormat = new DecimalFormat(pattern, symbols);
				 BigDecimal bigDecimal = (BigDecimal) decimalFormat.parse(amount);
				 return bigDecimal; */
				
				
				 if (format instanceof DecimalFormat ) {
				        ((DecimalFormat) format).
				        setParseBigDecimal(true);
				        
				        bd= (BigDecimal) format.parse(amount.replaceAll("[^\\d.,]",""));
				       dCurrency= bd.doubleValue();
				       return dCurrency;
				 }
				
			}
			else
			return 0.0;
			return 0.0;
			
		    		 
		    	 }
		     
		   
		}
		
