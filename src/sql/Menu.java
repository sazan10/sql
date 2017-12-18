package sql;

import java.util.Scanner;

public class Menu {

	private Scanner scan = new Scanner(System.in);

	public String menu() {
		System.out.println("Press 1 or 2");
		System.out.println("1. Search without index");
		System.out.println("2. Search with index\n");
		return scan.nextLine();
	}

	public String menu2() {
		System.out.println("Enter id to search(some are Lisa,Ben,Matt,Ed) ");
		String s = scan.nextLine().toLowerCase();
		return s;
	}
}
