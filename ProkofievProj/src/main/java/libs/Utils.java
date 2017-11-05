package libs;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.log4j.Logger;
import java.io.File;
import java.io.IOException;
//import java.util.logging.Logger;

public class Utils {
        private org.apache.log4j.Logger log;

        public Utils() {
                log = Logger.getLogger(getClass());
        }

        /**
         * Taking screenshot into .//target// + pathToScreenShot
         *
         * @param pathToScreenShot
         * @param driver
         */
        public void screenShot(String pathToScreenShot, WebDriver driver) {
                File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                try {
                        FileUtils.copyFile(scrFile, new File(pathToScreenShot));
                        log.info("ScreenShot: " + pathToScreenShot);
                } catch (IOException e) {
                        e.printStackTrace();
                }
        }
}