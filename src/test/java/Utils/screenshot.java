package Utils;


import java.io.File;

import java.text.SimpleDateFormat;

import java.util.Date;


import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;


public class screenshot {


    public static void capture(WebDriver driver) {

        try {

            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS")

                    .format(new Date());


            String path = System.getProperty("user.dir")

                    + "\\Screenshots\\"

                    + timestamp + "_"  + ".png";


            File src = ((TakesScreenshot) driver)

                    .getScreenshotAs(OutputType.FILE);


            FileUtils.copyFile(src, new File(path));


            System.out.println("Screenshot saved: " + path);


        } catch (Exception e) {

            e.printStackTrace();

        }

        return;

    }

}