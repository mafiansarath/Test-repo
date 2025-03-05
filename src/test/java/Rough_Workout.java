import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rough_Workout {
	public static void main(String[] args) {

//	removing the . before @ in mail id
		String name = "Sarathkumar.raja@thebisteam.com";
		String[] split = name.split("@");
		String replace = split[0].replace(".", "");
		System.out.println(replace+"@"+split[1]);
		
//		Count the Alphabets in the given string
		String name1 = "Sarathkumarraja";
		int count=0;
		for (int i = 0; i < name1.length(); i++) {
			count++;
			
		}
		System.out.println(count);

	}
}
