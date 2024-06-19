Feature: Amazon Search Functionality

Scenario: Successful Search Apple Products
   
Given Open "https://www.amazon.in/" in Chrome Browser

When Click on Electronics from dropdown menu and type "IPhone 13"

And Get All the dropdown suggestions and validate all are related to searched product

And then Type again "IPhone 13 128GB" variant and Click iPhone 13 128GB variant from dropdown Result

And From Results, click on the searched product and validate new tab is opened

And Navigate to next tab and click on Visit the Apple Store link appears below Apple iPhone 13 (128 GB) variant

And Click on Apple Watch dropdown and select "Apple Watch SE (GPS + Cellular)"

And Hover on watch image and verify Quick Look is displayed for the watch

Then Verify newly opened modal is related to Same product for which Quick look is performed