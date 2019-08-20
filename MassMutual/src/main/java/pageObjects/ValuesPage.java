package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ValuesPage {
	
	
public WebDriver driver;
	
	By label1	=By.id("lbl_val_1");
	By label2	=By.id("lbl_val_2");
	By label3	=By.id("lbl_val_3");
	By label4	=By.id("lbl_val_4");
	By label5	=By.id("lbl_val_5");
	By labelttl	=By.id("lbl_ttl_val");
	
	By value1	=By.id("txt_val_1");
	By value2	=By.id("txt_val_2");
	By value3	=By.id("txt_val_3");
	By value4	=By.id("txt_val_4");
	By value5	=By.id("txt_val_5");
	By valuettl	=By.id("txt_ttl_val");
	
	
	
	
	
	public ValuesPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}

	public String getlabel1()
	{
		if (driver.findElement(label1).getText().isEmpty())
		return "a";
		
		else	
		return driver.findElement(label1).getText();
		
	}
	public String getlabel2()
	{
		if (driver.findElement(label2).getText().isEmpty())
			return "a";
			
			else
		return driver.findElement(label2).getText();
		
	}
	public String getlabel3()
	{
		if (driver.findElement(label3).getText().isEmpty())
			return "a";
			
			else
		return driver.findElement(label3).getText();
		
	}
	public String getlabel4()
	{
		if (driver.findElement(label4).getText().isEmpty())
			return "a";
			
			else
		return driver.findElement(label4).getText();
		
	}
	public String getlabel5()
	{
		if (driver.findElement(label5).getText().isEmpty())
			return "a";
			
			else
		return driver.findElement(label5).getText();
		
	}
	public String getlabelttl()
	{
		if (driver.findElement(labelttl).getText().isEmpty())
			return "a";
			
			else
		return driver.findElement(labelttl).getText();
		
	}

	
	public String getvalue1()
	{
		if (driver.findElement(value1).getText().isEmpty())
			return "a";
		
		return driver.findElement(value1).getText();
		
	}
	public String getvalue2()
	{
		if (driver.findElement(value2).getText().isEmpty())
			return "a";
		
		return driver.findElement(value2).getText();
		
	}
	public String getvalue3()
	{
		if (driver.findElement(value3).getText().isEmpty())
			return "a";
		
		return driver.findElement(value3).getText();
		
	}
	public String getvalue4()
	{
		if (driver.findElement(value4).getText().isEmpty())
			return "a";
		
		return driver.findElement(value4).getText();
		
	}
	public String getvalue5()
	{
		if (driver.findElement(value5).getText().isEmpty())
			return "a";
		return driver.findElement(value5).getText();
		
	}
	public String getvaluettl()
	{
		if (driver.findElement(valuettl).getText().isEmpty())
			return "a";
		return driver.findElement(valuettl).getText();
		
	}
	
	
}
