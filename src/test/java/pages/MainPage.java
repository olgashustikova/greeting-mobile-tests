package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class MainPage {

    private AndroidDriver driver;

    public MainPage(AndroidDriver driver) {
        this.driver = driver;
    }

    private By nameInput = By.id("com.example.greatingmobileapp:id/etName");
    private By saveButton = By.id("com.example.greatingmobileapp:id/btnSave");
    private By greetingText = By.id("com.example.greatingmobileapp:id/tvGreeting");

    public void enterName(String name) {
        driver.findElement(nameInput).sendKeys(name);
    }

    public void clickSave() {
        driver.findElement(saveButton).click();
    }

    public String getGreetingText() {
        return driver.findElement(greetingText).getText();
    }

    public boolean isSaveButtonDisplayed() {
        return driver.findElement(saveButton).isDisplayed();
    }
}
