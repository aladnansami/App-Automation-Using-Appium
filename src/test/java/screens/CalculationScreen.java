package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static base.Setup.PACKAGE_ID;

public class CalculationScreen {
    @FindBy(id=PACKAGE_ID+":id/digit_5")
    AndroidElement digit_5;
    @FindBy(id=PACKAGE_ID+":id/digit_7")
    AndroidElement digit_7;
    @FindBy(id=PACKAGE_ID+":id/op_add")
    AndroidElement btnPlus;
    @FindBy(id=PACKAGE_ID+":id/eq")
    AndroidElement btnEqual;
    @FindBy(id=PACKAGE_ID+":id/result_final")
    AndroidElement lblResult;

    public CalculationScreen(AndroidDriver driver) throws IOException, InterruptedException
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    public String doSum() throws InterruptedException {
        Thread.sleep(1000);
        digit_5.click();
        Thread.sleep(1000);
        btnPlus.click();
        Thread.sleep(1000);
        digit_7.click();
        Thread.sleep(1000);
        btnEqual.click();
        return lblResult.getText();
    }
}
