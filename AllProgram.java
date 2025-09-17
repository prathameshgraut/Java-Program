package Java_Program;

import java.util.Arrays;
import java.util.Scanner;

public class AllProgram {

	// 1.Reverse String
	public void Reverse() {
		String str = "Raut Prathamesh";
		String str2[] = str.split(" ");
		StringBuffer SB = new StringBuffer();
		for (int i = str2.length - 1; i >= 0; i--) {
			SB = SB.append(str2[i]);
			SB.append(" ");
		}
		System.out.print(SB);
	}

	// 2.ArmStrong
	public void Armstrong() {
		int num = 153, res = 0, add = 0;
		int sum = num;

		while (num > 0) {
			add = num % 10;
			res = add * add * add + res;
			num = num / 10;
		}
		if (sum == res) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not Armstrong Number");
		}
	}

	// 3.Palindrome Number
	public void palindrome() {
		int num = 121, add = num, res = 0, cal = 0;
		while (num > 0) {
			cal = num % 10;
			res = res * 10 + cal;
			num = num / 10;
		}
		if (add == res) {
			System.out.println("Palindrome Number");
		} else {
			System.out.println("Not Palindrome Number");
		}
	}

	// 4.Palindrome String
	public void StringPalindrome() {
		String str = "CTC";
		String add = str;
		String res = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			res = res + str.charAt(i);
		}
		if (add.equals(res)) {
			System.out.println("String Palindrome");
		} else {
			System.out.println("String Not Palindrom");
		}
	}

	// 5.check Leap Year
	public void LeapYear() {
		int year = 2024;

		if (year % 4 == 0 || year % 400 == 0) {
			System.out.println("Leap Year");
		} else {
			System.out.println("Not Leap Year");
		}
	}

	// 6.check Factorial
	public void factorial() {
		int num = 5;
		int res = 1;
		for (int i = 1; i <= num; i++) {
			res = res * i;
		}
		System.out.println("Factorial Number " + res);
	}

	// 7.Even Odd Number
	public void EvenOdd() {
		int num = 12;

		if (num % 2 == 0) {
			System.out.println("Even Number");
		} else {
			System.out.println("Odd Number");
		}
	}

	// 8.Prime Number
	public void PrimeNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = sc.nextInt();
		int flag = 0;

		if (num <= 1) {
			System.out.println("Not Prime Number");
			return;
		}

		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				flag = 1;
			}
		}
		if (flag == 0) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not Prime Number");
		}
	}

	// 9.Count Prime Number In Array
	public void CalPrimeNumArray() {
		int arr[]= {10,11,22,33,45,66};
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			int flag=0;
			if(num>1) {
				for(int j=2;j<num;j++) {
					if(num%j==0) {
						flag=1;
					}
				}
				if(flag==0) {
					System.out.println("Prime Number"+arr[i]);
					count++;
				}
			}
			
		}
		System.out.println("Total Counting PrimeNumber In Array :"+count);
	}
	
	//10.Reverse Array
	public void ResArray() {
		int arr[]= {10,11,22,34,45,78};
		//using Arrays.toString() Function
		System.out.println("Using Arrays.toString : "+Arrays.toString(arr));
		
		//using for loop:-
		System.out.print("Using For Loop But Resvrese  : ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		AllProgram al = new AllProgram();
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print(
					" 1.Text Reverse.\n 2.Print Armstrong Number.\n 3.Check Palindrome Number. \n 4.Check Palindrome String. \n 5.Check Leap Year \n 6.Check Factorial Number. \n 7.Even Odd Number. \n 8.Check Prime Number. \n 9.Count Prime Number In Array. \n 10.Reverse Array");

			System.out.print("\n\nEnter A Choice :");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				al.Reverse();
				break;

			case 2:
				al.Armstrong();
				break;

			case 3:
				al.palindrome();
				break;

			case 4:
				al.StringPalindrome();
				break;

			case 5:
				al.LeapYear();
				break;

			case 6:
				al.factorial();
				break;

			case 7:
				al.EvenOdd();
				break;

			case 8:
				al.PrimeNumber();
				break;

			case 9:
				al.CalPrimeNumArray();
				break;
				
			case 10:
				al.ResArray();
				break;

			}
			sc.close();
			return;

		}
	}
}