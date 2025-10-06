package pages.contactlist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ContactListPage {

    public ContactListPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "add-contact")
    public WebElement addContact;

    @FindBy(id = "logout")
    public WebElement logout;

    @FindBy(xpath = "//td[2]")
    public List<WebElement> dataCount;

    public boolean isAddContactDisplayed(){
        return addContact.isDisplayed();
    }
}