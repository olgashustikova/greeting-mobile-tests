package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;

public class MainPageTest extends BaseTest {

    @Test
    public void shouldShowGreetingAfterEnteringName() {

        MainPage page = new MainPage(driver);

        page.enterName("Olga");
        page.clickSave();

        Assert.assertEquals(page.getGreetingText(), "Hello, Olga!");
    }

    @Test
    public void shouldShowValidationMessageWhenNameIsEmpty() {

        MainPage page = new MainPage(driver);

        page.clickSave();

        Assert.assertEquals(page.getGreetingText(), "Please enter name");
    }
    @Test
    public void shouldShowSaveButton() {
        MainPage page = new MainPage(driver);
        Assert.assertTrue(page.isSaveButtonDisplayed());
    }
}
