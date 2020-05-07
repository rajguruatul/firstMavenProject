package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GitHub_HomePageForUser
{
   public static  WebDriver d=null;

 By Repository_tab=By.xpath("//a[contains(text(),'Repositories')]");
 By Atul_100daysCodeRepo=By.xpath("//div[@id='user-repositories-list']//a[contains(text(),'100dayOfCode')]");

public  void click_on_Repositories_tab()
{
    d.findElement(Repository_tab).click();
}

public void VerifyRepo(String RepoName)
{

}

public void assertElementPresenByXpath(String xpath)
{

}
}
