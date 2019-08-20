package stepDefination;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


import Excersie.MassMutual_final.Validations;

@RunWith(Cucumber.class)
public class stepDefination extends Validations  {
	
	Validations va= new Validations();
	
    @Given("^url,browser,values$")
    public void urlbrowservalues() throws Throwable {
        
    	va.initialize();
    	va.PageNavigation();
        
    }

    @When("^values are valid$")
    public void values_are_valid() throws Throwable {
        
    	va.PageNavigation();
    	va.value1Validation();
    	va.value2Validation();
    	va.value3Validation();
    	va.value4Validation();
    	va.value5Validation();
    }

    @Then("^print count of values$")
    public void print_count_of_values() throws Throwable {
    	System.out.println("valid values is/are" +count);
    }

    @Then("^Print value is positive or negative$")
    public void print_value_is_positive_or_negative() throws Throwable {
        
    	if(positive1==1)
    		System.out.println("value1 is positive");
    	
    		else if(positive1==-1)
    		System.out.println("value1 is negative");
    		else
    			System.out.println("value1 is not valid");
    			
    	
    	if(positive2==1)
    		System.out.println("value2 is positive");
    	else if(positive2==-1)System.out.println("value2 is negative");
    	else
			System.out.println("value2 is not valid");
    	
    	if(positive3==1)
    		System.out.println("value3 is positive");
    	else if(positive3==-1)System.out.println("value3 is negative");
    	else
			System.out.println("value3 is not valid");
    	
    	if(positive4==1)
    		System.out.println("value4 is positive");
    	else if(positive4==-1) System.out.println("value4 is negative");
    	else
			System.out.println("value4 is not valid");
    	
    	if(positive5==1)
    		System.out.println("value5 is positive");
    	else if(positive5==-1) System.out.println("value5 is negative");
    	else
			System.out.println("value5 is not valid");
    	
    }

    @Then("^Print Sum of valid values matches total balance$")
    public void print_sum_of_valid_values_matches_total_balance() throws Throwable {
        
    	va.valuettlValidation();
		if(dvaluettl.isNaN())
			System.out.println("total value is not matching with sum of values");
    	if (!dvalue1.isNaN())
			  Total = dvalue1;

			if (!dvalue2.isNaN())
				  Total = Total+dvalue2;
			
			if (!dvalue3.isNaN())
				  Total = Total+dvalue3;
			
			if (!dvalue4.isNaN())
				  Total = Total+dvalue4;
			
			if (!dvalue5.isNaN())
				  Total = Total+dvalue5;
			
			if(Total==dvaluettl)
				System.out.println("total value is matching with sum of values");
			
			else
	  		System.out.println("total value is not matching with sum of values");
    }

    @Then("^Print value is currency or not$")
    public void print_value_is_currency_or_not() throws Throwable {
     
    	if(dvalue1!=0.0)
    		System.out.println("value1 is a valid currency");
    	else
    		System.out.println("value1 is not a valid currency");
    	
    	if(dvalue2!=0.0)
    		System.out.println("value2 is a valid currency");
    	else
    		System.out.println("value2 is not a valid currency");
    	
    	if(dvalue3!=0.0)
    		System.out.println("value3 is a valid currency");
    	else
    		System.out.println("value3 is not a valid currency");
    	
    	if(dvalue4!=0.0)
    		System.out.println("value4 is a valid currency");
    	else
    		System.out.println("value4 is not a valid currency");
    	
    	if(dvalue5!=0.0)
    		System.out.println("value5 is a valid currency");
    	else
    		System.out.println("value5 is not a valid currency");
    }

    @Then("^Print total balnce matches with sum of all values$")
    public void print_total_balnce_matches_with_sum_of_all_values() throws Throwable {
       
    	
    	Total =dvalue1+dvalue2+dvalue3+dvalue4+dvalue5;
		if(Total==dvaluettl)
			System.out.println("total value is matching with sum of values");
		
		else
  		System.out.println("total value is not matching with sum of values");
    }

    @And("^close browser$")
    public void close_browser() throws Throwable {
       
   	 va.teardown();
    }

}