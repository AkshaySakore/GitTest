package String;

import java.util.Scanner;

public class CharacterFirstString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String firstCharStr;
		char ch;
		int i = 0, flag = 0;
		System.out.println("Enter String to Find First Char Occur ");
		firstCharStr = sc.nextLine();
		
		System.out.println("Enter the Character to Find ");
		ch = sc.next().charAt(0);
		
		while(i < firstCharStr.length())
		{
			if(firstCharStr.charAt(i) ==  ch) {
				flag++;
				break;
			}
			i++;
		}
		if(flag == 0) {
			System.out.println(" We haven't found the Character ");
		}
		else {
			System.out.println("Found character "+ch);
		}
	}

	}

