import java.awt.AWTException;
import java.awt.Robot;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.mysql.cj.x.protobuf.MysqlxConnection.Capabilities;

public class Learning {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Connection connection = 
					DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306", "root", "Welcome@1");
			System.out.println("Connected Successful");
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		 WebElement element = driver.findElement(By.className("gLFyf"));
		 try {
			Robot robo=new Robot();
			
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}
}
