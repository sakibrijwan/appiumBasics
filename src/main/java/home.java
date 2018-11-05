import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Sakib on 11/5/2018.
 */
public class home extends base {
    public static void main(String ags[]) throws MalformedURLException, InterruptedException {
        AndroidDriver<AndroidElement>driver=capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        //Thread.sleep(1000);
        driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
        //Thread.sleep(2000);

        driver.findElementById("android:id/checkbox").click();

        driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
        driver.findElementByXPath("//android.widget.EditText").sendKeys("1234");

        driver.findElementsByClassName("android.widget.Button").get(1).click();

        driver.pressKeyCode(AndroidKeyCode.BACK);
        Thread.sleep(2000);
        driver.pressKeyCode(AndroidKeyCode.BACK);

        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

        System.out.print(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());

        driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")").click();
        driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")").click();
        TouchAction t= new TouchAction(driver);
        t.longPress(driver.findElementByAndroidUIAutomator("text(\"People Names\")"),3000);
        t.perform();

    }
}
