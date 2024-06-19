package stepDef;

import pages.HomePage;
import utils.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class StepDefinitions {
    private WebDriver driver = DriverManager.getDriver();
    private HomePage homePage = new HomePage(driver);
    
    	
    			@Given("Open {string} in Chrome Browser")
    			public void open_in_chrome_browser(String url) {
    				driver.get(url);
    			}

    			@When("Click on Electronics from dropdown menu and type {string}")
    			public void click_on_electronics_from_dropdown_menu_and_type(String iphone) {
    			  homePage.clickElectronicsDropdown(iphone);
    			  
    			}

    			@When("Get All the dropdown suggestions and validate all are related to searched product")
    			public void get_all_the_dropdown_suggestions_and_validate_all_are_related_to_searched_product() {
    			    homePage.searchValidation();
    			}
    			@When("then Type again {string} variant and Click iPhone {int} 128GB variant from dropdown Result")
    			public void then_type_again_variant_and_click_i_phone_128gb_variant_from_dropdown_result(String iphone,int i) {
    				homePage.typeAgain(iphone);
    			}
    			@When("From Results, click on the searched product and validate new tab is opened")
    			public void from_results_click_on_the_searched_product_and_validate_new_tab_is_opened() {
    			homePage.newTabOpen();
    			}
    			@When("Navigate to next tab and click on Visit the Apple Store link appears below Apple iPhone {int} \\({int} GB) variant")
    			public void navigate_to_next_tab_and_click_on_visit_the_apple_store_link_appears_below_apple_i_phone_gb_variant(Integer int1, Integer int2) {
    			    homePage.visitAppleStore();
    			}
    			@When("Click on Apple Watch dropdown and select {string}")
    			public void click_on_apple_watch_dropdown_and_select(String string) {
    			    homePage.searchWatch();
    			}
    			@When("Hover on watch image and verify Quick Look is displayed for the watch")
    			public void hover_on_watch_image_and_verify_quick_look_is_displayed_for_the_watch() {
    			   homePage.mouseOver();
    			}
    			@Then("Verify newly opened modal is related to Same product for which Quick look is performed")
    			public void verify_newly_opened_modal_is_related_to_same_product_for_which_quick_look_is_performed() {
    			 homePage.closeWin();
    			}

}
