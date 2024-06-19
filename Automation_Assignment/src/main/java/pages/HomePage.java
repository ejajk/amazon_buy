package pages;

import java.awt.RenderingHints.Key;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;

    @FindBy(xpath = "//a[contains(text(),'Electronics')]")
    private WebElement electronicsDropdown;
    
    @FindBy(xpath = "//*[@id='4k2av5ugzs']/div/div/div/a")
    private WebElement watchSE;
    @FindBy(xpath = "//ul/li[5]/div/ul/li[6]")
    private WebElement watchdopdown;

    @FindBy(xpath = "//nav[@class='Navigation__navBar__tdJ0T']/ul/li[5]")
    private WebElement clickwatchdropdown;

    @FindBy(xpath = "//*[@id='landingImage']")
    private WebElement mouseOver;
    
    @FindBy(xpath = "//div/a[contains(text(),'Visit the Apple Store')]")
    private WebElement visit;
    
    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    private WebElement searchbox;

    @FindBy(xpath = "//*[@id='search']/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")
    private WebElement clickIphone;

    
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickElectronicsDropdown(String search) {
       
    	electronicsDropdown.click();
    	searchbox.sendKeys(search);
    }
    public boolean searchValidation() {
        String iphone="iphone 13";
    	searchbox.clear();
    	searchbox.sendKeys(iphone);
    	List<WebElement> list=driver.findElements(By.xpath("//div[@id='nav-flyout-iss-anchor']/div/div[2]/div/div/div"));
    	for(int i=0;i<list.size();i++)
    	{
    		String str=list.get(i).getText();
    		if(str.contains(iphone))
    		{
    			return true;
    		}
    	}
    	return false;
    }
    public void typeAgain(String str)
    {
    	searchbox.clear();
    	searchbox.sendKeys(str);
    	searchbox.sendKeys(Keys.ENTER);
    	clickIphone.click();
    }
    
    public boolean newTabOpen()
    {

		String mainWin=driver.getWindowHandle();
		Set<String> set=driver.getWindowHandles();
		
		Iterator<String> itr=set.iterator();
		
		while(itr.hasNext())
		{
			String childWin=itr.next();
			if(!mainWin.equalsIgnoreCase(childWin))
			{
				driver.switchTo().window(childWin);
				return true;
			}
		}
		return false;
    }
    public void visitAppleStore()
    {
    	visit.click();
    }
    public void searchWatch()
    {
    	clickwatchdropdown.click();
    	watchdopdown.click();
    	watchSE.click();
    }
    public void mouseOver()
    {
    	Actions actions=new Actions(driver);
    	actions.moveToElement(mouseOver).build().perform();;
    }
    public void closeWin()
    {
    	driver.quit();
    }
}
