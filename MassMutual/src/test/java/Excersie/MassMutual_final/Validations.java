package Excersie.MassMutual_final;

import java.io.IOException;
import java.text.ParseException;
import java.util.Locale;
import org.openqa.selenium.WebDriver;

import pageObjects.ValuesPage;
import resources.base;

public class Validations extends base{
	
	public WebDriver driver;
	 ValuesPage vp =new ValuesPage(driver);
	 
	 CurrencyValidation cv =new CurrencyValidation();
	 public static String value1,value2,value3,value4,value5,valuettl;
		public static Double dvalue1,dvalue2,dvalue3,dvalue4,dvalue5;
		public static Double dvaluettl;
		protected static int count=0;
		protected static int positive1=0
		,positive2=0,positive3=0,positive4=0,positive5=0,positivettl=0;
		protected static double Total=0;
		
	 
	 
	public void initialize() throws IOException
	{
	
		 this.driver =initializeDriver();

	}
	
	public void PageNavigation() throws IOException
	{

		// creating object to that class and invoke methods of it
		driver.get(prop.getProperty("url"));
		
		}

	
	
	public void value1Validation() throws ParseException
	
	{
	 ValuesPage vp =new ValuesPage(driver);
	  if(vp.getlabel1() !="a")
	  {
		  
		  value1= vp.getvalue1();
		  dvalue1=cv.parse(value1, Locale.US);
		  if(value1.startsWith("$") && dvalue1 != 0.0)
		  {
			   count=count+1;
			   positive1=1;
		  }
		  else if (value1.startsWith("-") && dvalue1 != 0.0)
		  {
			  count=count+1;
			  positive1 = -1;
		  }
		 
	  }
	 
	  
	}
	
	public void value2Validation()  throws ParseException
	
	{
		ValuesPage vp =new ValuesPage(driver);
		  if(vp.getlabel2() !="a")
		  {
			 
			  value2= vp.getvalue2();
			  dvalue2=cv.parse(value2, Locale.US);
			  if(value2.startsWith("$") && dvalue2 != 0.0)
			  {
				   count=count+1;
				   positive2=1;
			  }
			  
			  else if (value2.startsWith("-") && dvalue2 != 0.0)
			  {
				   count=count+1;
				   positive2=-1;
			  }
			 
		  }
		  
		}
		
	public void value3Validation() throws ParseException
	{
		ValuesPage vp =new ValuesPage(driver);
		  if(vp.getlabel3() !="a")
		  {
			 
			  value3= vp.getvalue3();
			  dvalue3=cv.parse(value3, Locale.US);
			  if(value3.startsWith("$") && dvalue3 != 0.0)
			  {
				   count=count+1;
				   positive3=1;
			  }
			  
			  else if (value3.startsWith("-") && dvalue3 != 0.0)
			  {
				   count=count+1;
				   positive3=-1;
			  }
			 
		  }
		  
		}
		
	public void value4Validation() throws ParseException
	{
		ValuesPage vp =new ValuesPage(driver);

		  if(vp.getlabel4() !="a")
		  {
			 
			  value4= vp.getvalue4();
			  dvalue4=cv.parse(value4, Locale.US);
			  if(value4.startsWith("$") && dvalue4 != 0.0)
			  {
				   count=count+1;
				   positive4=1;
			  }
			  
			  else if (value4.startsWith("-") && dvalue4 != 0.0)
			  {
				   count=count+1;
				   positive4=-1;
			  }
			 
		  }
		  
		}
		
	public void value5Validation() throws ParseException
	
	{
		ValuesPage vp =new ValuesPage(driver);
		  if(vp.getlabel5() !="a")
		  {
			 
			  value5= vp.getvalue5();
			  dvalue5=cv.parse(value5, Locale.US);
			  if(value5.startsWith("$") && dvalue5 != 0.0)
			  {
				   count=count+1;
				   positive5=1;
			  }
			  
			  else if (value5.startsWith("-") && dvalue5 != 0.0)
			  {
				   count=count+1;
				   positive5=-1;
			  }
			 
		  }
		  
		}
		
public void valuettlValidation()  throws ParseException
	
	{
	ValuesPage vp =new ValuesPage(driver);
		  if(vp.getlabelttl() !="a")
		  {
			 
			  valuettl= vp.getvaluettl();
			  dvaluettl=cv.parse(valuettl, Locale.US);
			  if(valuettl.startsWith("$") && dvaluettl != 0.0)
			  {
				   count=count+1;
				   positivettl=1;
			  }
			  
			  else if (valuettl.startsWith("-") && dvaluettl != 0.0)
			  {
				   count=count+1;
				   positivettl=-1;
			  }
			 
		  }
		  
		}

	
	public void teardown()
	{
		
		driver.close();
		driver=null;
		
	}

	
	
}
