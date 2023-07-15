package test;

/**
 * Encapsulation and Access Modifiers
 */
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

class Book {
	int UNIQUE_ID = 1;
	private int accountNumber;
	private double balance;
	private String customerName;
	Scanner sc = new Scanner(System.in);
	static ArrayList<String> list = new ArrayList<String>();

	public Book(int UNIQUE_ID, int accountNumber, double balance, String customerName) {
		this.UNIQUE_ID = UNIQUE_ID;
		this.setAccountNumber(accountNumber);
		this.setBalance(balance);
		this.setCustomerName(customerName);
	}

	public void setter(LinkedHashSet<Book> hs, Book b) {
		hs.add(b);
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
}

class Get {
	Scanner sc = new Scanner(System.in);

	public void getter(LinkedHashSet<Book> hs) {
//			list.forEach((action) -> System.out.println(action));
		int id;
		String input;
		System.out.println();
		for (Book b : hs) {
			System.out.println("ID: " + b.UNIQUE_ID + " Balance: " + b.getBalance() + " Name: " + b.getCustomerName());
		}
		while (true) {
			System.out.println("\nNeed any update with your information..");
			System.out.println("Choose it..");
			System.out.println("\nYes");
			System.out.println("No");
			input = sc.next();
			System.out.println();
			switch (input) {
			case "Yes":
				System.out.println("Enter ID: ");
				id = sc.nextInt();
				edit(id, hs);
			case "No":
				System.out.println("Exiting...");
				System.exit(0);
			}
		}
	}

	void edit(int id, LinkedHashSet<Book> hs) {
		Scanner sc = new Scanner(System.in);
		String the_edit, edit_name;
		double edit_balance;
		int edit_account;
		for (Book b : hs) {
			if (id == b.UNIQUE_ID) {
				System.out.println("\nEnter the field to be edited: ");
				System.out.println("Name");
				System.out.println("Balance");
				System.out.println("Exit\n");
				the_edit = sc.next();
				switch (the_edit) {
				case "Name":
					System.out.println("Enter Replaced Account Name: ");
					edit_name = sc.next();
					b.setCustomerName(edit_name);
					System.out.println("Updated..\n");
					break;
				case "Balance":
					System.out.println("Enter Replaced Account Balance: ");
					edit_balance = sc.nextDouble();
					b.setBalance(edit_balance);
					System.out.println("Updated..\n");
					break;
				case "Exit":
					System.out.println("No change... Exiting...");
					System.exit(0);
				default:
					System.out.println("Invalid Match..\n");
				}
			}
		}
		getter(hs);
	}
}

public class Lab5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String customerName;
		int accountNumber;
		double balance;
		int i = 1, n;
		Scanner sc = new Scanner(System.in);
		LinkedHashSet<Book> hs = new LinkedHashSet<Book>();
		System.out.println("Enter how many Bank Users: ");
		n = sc.nextInt();
		while (i <= n) {
			System.out.println("Enter Account User's Number: ");
			accountNumber = sc.nextInt();
			System.out.println("Enter Account User's Balance: ");
			balance = sc.nextDouble();
			System.out.println("Enter Account User's Name: ");
			customerName = sc.next();
			int UNIQUE_ID = 0;
			Book b = new Book(i + UNIQUE_ID, accountNumber, balance, customerName);
			b.setter(hs, b);
			i++;
		}
		Get g = new Get();
		g.getter(hs);
	}
}