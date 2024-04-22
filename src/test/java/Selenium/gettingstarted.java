package Selenium;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.openqa.selenium.*;

import org.openqa.selenium.chrome.*;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

@RunWith(Enclosed.class)
public class gettingstarted {

    public static class GettingStarted {
        private String randomEmail(){
            char[] characters = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
            StringBuilder email = new StringBuilder("");
            Random random = new Random();

            for (int i = 0; i < 10; i++) {
                var index = random.nextInt(characters.length);
                email.append(characters[index]);
            }

            email.append("@hotmail.com");
            return email.toString();
        }
        String randomizedEmail = randomEmail();
        @Test

        public void testcreateaccount() throws InterruptedException {
            // Optional. If not specified, WebDriver searches the PATH for chromedriver.       System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
            WebDriver driver = new ChromeDriver();

            driver.get("https://membership.basketballengland.co.uk/NewSupporterAccount");

            Thread.sleep(5000);  // Let the user actually see something!

            WebElement first = driver.findElement(By.name("DateOfBirth"));

            first.sendKeys("15/02/2000");

            WebElement second = driver.findElement(By.name("Forename"));

            second.sendKeys("David");

            WebElement third = driver.findElement(By.name("Surname"));

            third.sendKeys("Karlsson");

            WebElement fourth = driver.findElement(By.name("EmailAddress"));

            fourth.sendKeys(randomizedEmail);

            WebElement fith = driver.findElement(By.name("ConfirmEmailAddress"));

            fith.sendKeys(randomizedEmail);

            WebElement sixth = driver.findElement(By.name("Password"));

            sixth.sendKeys("Testlösen123");

            WebElement seventh = driver.findElement(By.name("ConfirmPassword"));

            seventh.sendKeys("Testlösen123");

            WebElement terms = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/form/div[11]/div/div[2]/div[1]/label"));

            terms.click();

            WebElement over18 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/form/div[11]/div/div[2]/div[2]/label"));

            over18.click();

            WebElement ethics = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/form/div[11]/div/div[7]/label"));

            ethics.click();

            WebElement confirm = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/form/div[12]/input"));

            confirm.click();

            WebElement answer = driver.findElement(By.xpath("/html/body/div/div[2]/div/h2"));

            String actual = answer.getText();
            String expected = "THANK YOU FOR CREATING AN ACCOUNT WITH BASKETBALL ENGLAND";

            assertEquals(expected, actual);


            Thread.sleep(5000);  // Let the user actually see something!

            driver.quit();

        }


        @Test

        public void account_no_surrname() throws InterruptedException {

            // Optional. If not specified, WebDriver searches the PATH for chromedriver.       System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
            WebDriver driver = new ChromeDriver();

            driver.get("https://membership.basketballengland.co.uk/NewSupporterAccount");

            Thread.sleep(5000);  // Let the user actually see something!

            WebElement first = driver.findElement(By.name("DateOfBirth"));

            first.sendKeys("15/02/2000");

            WebElement second = driver.findElement(By.name("Forename"));

            second.sendKeys("David");

            WebElement fourth = driver.findElement(By.name("EmailAddress"));

            fourth.sendKeys("Karlssond4vid123321@hotmail.com");

            WebElement fith = driver.findElement(By.name("ConfirmEmailAddress"));

            fith.sendKeys("Karlssond4vid123321@hotmail.com");

            WebElement sixth = driver.findElement(By.name("Password"));

            sixth.sendKeys("Testlösen123");

            WebElement seventh = driver.findElement(By.name("ConfirmPassword"));

            seventh.sendKeys("Testlösen123");

            WebElement terms = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/form/div[11]/div/div[2]/div[1]/label"));

            terms.click();

            WebElement over18 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/form/div[11]/div/div[2]/div[2]/label"));

            over18.click();

            WebElement ethics = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/form/div[11]/div/div[7]/label"));

            ethics.click();

            WebElement confirm = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/form/div[12]/input"));

            confirm.click();

            WebElement answer = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/form/div[5]/div[2]/div/span/span"));


            String actual = answer.getText();
            String expected = "Last Name is required";

            assertEquals(expected, actual);


            Thread.sleep(5000);  // Let the user actually see something!

            driver.quit();


        }

        @Test

        public void account_different_password() throws InterruptedException {

            // Optional. If not specified, WebDriver searches the PATH for chromedriver.       System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
            WebDriver driver = new ChromeDriver();

            driver.get("https://membership.basketballengland.co.uk/NewSupporterAccount");

            Thread.sleep(5000);  // Let the user actually see something!

            WebElement first = driver.findElement(By.name("DateOfBirth"));

            first.sendKeys("15/02/2000");

            WebElement second = driver.findElement(By.name("Forename"));

            second.sendKeys("David");

            WebElement third = driver.findElement(By.name("Surname"));

            third.sendKeys("Karlsson");

            WebElement fourth = driver.findElement(By.name("EmailAddress"));

            fourth.sendKeys("Karlssond4vid123321@hotmail.com");

            WebElement fith = driver.findElement(By.name("ConfirmEmailAddress"));

            fith.sendKeys("Karlssond4vid123321@hotmail.com");


            WebElement terms = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/form/div[11]/div/div[2]/div[1]/label"));

            terms.click();

            WebElement over18 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/form/div[11]/div/div[2]/div[2]/label"));

            over18.click();

            WebElement ethics = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/form/div[11]/div/div[7]/label"));

            ethics.click();

            WebElement sixth = driver.findElement(By.name("Password"));

            sixth.sendKeys("Testlösen123");

            WebElement seventh = driver.findElement(By.name("ConfirmPassword"));

            seventh.sendKeys("Testlösen123123");

            WebElement confirm = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/form/div[12]/input"));

            confirm.click();

            WebElement answer = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/form/div[8]/div/div[2]/div[2]/div/span/span"));


            String actual = answer.getText();
            String expected = "Password did not match";

                    assertEquals(expected, actual);


            Thread.sleep(5000);  // Let the user actually see something!

            driver.quit();

        }



        @Test

        public void account_no_terms_and_conditions() throws InterruptedException {

            // Optional. If not specified, WebDriver searches the PATH for chromedriver.       System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
            WebDriver driver = new ChromeDriver();

            driver.get("https://membership.basketballengland.co.uk/NewSupporterAccount");

            Thread.sleep(5000);  // Let the user actually see something!

            WebElement first = driver.findElement(By.name("DateOfBirth"));

            first.sendKeys("15/02/2000");

            WebElement second = driver.findElement(By.name("Forename"));

            second.sendKeys("David");

            WebElement third = driver.findElement(By.name("Surname"));

            third.sendKeys("Karlsson");

            WebElement fourth = driver.findElement(By.name("EmailAddress"));

            fourth.sendKeys("Karlssond4vid123321@hotmail.com");

            WebElement fith = driver.findElement(By.name("ConfirmEmailAddress"));

            fith.sendKeys("Karlssond4vid123321@hotmail.com");

            WebElement sixth = driver.findElement(By.name("Password"));

            sixth.sendKeys("Testlösen123");

            WebElement seventh = driver.findElement(By.name("ConfirmPassword"));

            seventh.sendKeys("Testlösen123");


            WebElement over18 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/form/div[11]/div/div[2]/div[2]/label"));

            over18.click();

            WebElement ethics = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/form/div[11]/div/div[7]/label"));

            ethics.click();


            WebElement confirm = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/form/div[12]/input"));

            confirm.click();

            WebElement answer = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/form/div[11]/div/div[2]/div[1]/span/span"));

            String actual = answer.getText();
            String expected = "You must confirm that you have read and accepted our Terms and Conditions";

            assertEquals(expected, actual);


            Thread.sleep(5000);  // Let the user actually see something!

            driver.quit();
        }
    }
}

