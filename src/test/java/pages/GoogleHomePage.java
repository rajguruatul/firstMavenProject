package pages;
import com.javascriptexecutor.JavaScriptExecutorUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleHomePage
{

    public static WebDriver d=null;
    static By googleSearchBox = By.xpath("//input[@title=\"Search\"]");
    static By googleSubmitButton = By.name("btnK");


    //constructor
    public GoogleHomePage(WebDriver d)
    {this.d=d;}

    // str is string to set on the google text box
    public static void setTextGoogleSearchBox(String str)
    {
        d.findElement(googleSearchBox).clear();
        d.findElement(googleSearchBox).sendKeys(str);
        JavaScriptExecutorUtils.flashByJS(d.findElement(googleSearchBox),d);


    }

    public static void clickSubmitButton()
    {

        d.findElement(googleSubmitButton).sendKeys(Keys.RETURN);
        JavaScriptExecutorUtils.flashByJS(d.findElement(googleSubmitButton),d);
    }

}
