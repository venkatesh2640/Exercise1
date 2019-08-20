Feature: Exercise1

Scenario: Count of Values

Given url,browser,values
When values are valid
Then print count of values
And close browser

Scenario: Values are positive

Given url,browser,values
When values are valid
Then Print value is positive or negative
And close browser

Scenario: Total balance is correct based on values listed

Given url,browser,values
When values are valid
Then Print Sum of valid values matches total balance
And close browser

Scenario: Currency format validation

Given url,browser,values
When values are valid
Then Print value is currency or not
And close browser


Scenario: Total balance matches sum

Given url,browser,values
When values are valid
Then Print total balnce matches with sum of all values
And close browser

 






