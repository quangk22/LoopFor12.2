package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập số tự nhiên n");
		int n = sc.nextInt();
		System.out.println("các số chia hết cho 3 bé hơn n là :");
		for(int i =0; i < n ; i++ ) {
			if(i%3 !=0 ) {
				continue;
			}
			System.out.println(i);
		}
	}

}
