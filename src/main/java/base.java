import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Sakib on 11/5/2018.
 */
public class base {

    public static AndroidDriver capabilities () throws MalformedURLException {

        File f= new File("aut");
        File fs=new File(f,"ApiDemos-debug.apk");
        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Appium");
        cap.setCapability(MobileCapabilityType.APP,fs.getAbsoluteFile());
        AndroidDriver<AndroidElement> driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        return driver;

    }
}
