package String;

public class FirstWordString {

	public static void main(String[] args) {

		String str1 = "hello world good morning";
		String str2 = "world";

		int indexOfSubStr = str1.indexOf(str2);
		
		System.out.println("str2 first appeared in str1 at index "+ indexOfSubStr);
	}

}
