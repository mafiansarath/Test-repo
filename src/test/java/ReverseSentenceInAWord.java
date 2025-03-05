import java.util.Iterator;

public class ReverseSentenceInAWord {

	public static void main(String[] args) {
		String input = "CapGemini Azeez Karthick are friends";
		
		String[] split = input.split(" ");
		StringBuffer result=new StringBuffer();
		for (String word : split) {
			result.append(new StringBuffer(word).reverse().append(" "));
		}
		System.out.println(result.toString().trim());

	}

}
