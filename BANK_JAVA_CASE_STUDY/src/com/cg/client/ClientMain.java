package com.cg.client;

import java.util.*;

import com.cg.framework.*;
import com.cg.application.*;

public class ClientMain {
	static Scanner sc = new Scanner(System.in);

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// Variable Creation:
		int accNo = 98654;
		String accNm = "default";
		float accBal = 10000;
		boolean isSalaried = false;
		float creditLimit = 5000;
		float amt = 0;
//		ArrayList<BankAcc> bankAcc = new ArrayList<BankAcc>();

//		Previous Objects
		MMCurrentAcc cAcc = new MMCurrentAcc(1306, "Sohan", accBal, creditLimit);
		MMSavingAcc sAcc = new MMSavingAcc(2706, "Pranav", accBal, true);

		System.out.println("************ WELCOME  TO ************");
		welcome();
		System.out.println("PRESS 1/2 :");
		System.out.println("1. CREATE NEW ACCOUNT\n2. LOGIN");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:// Create new Acc
//			username
			System.out.println("Enter Your Name:");
			accNm = sc.next();
//			Account Type:
			System.out.println("Which Account you want to Create ?");
			System.out.println("1. Saving 2.Current\nEnter your option:");
			choice = sc.nextInt();
			switch (choice) {
			case 1:// Saving
				accBal = 0;
				System.out.println("You want continue this account as your Salary Account ?");
				System.out.println("1. Yes 2.No\nEnter your option:");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					isSalaried = true;
					break;
				case 2:
					isSalaried = false;
					break;

				default:
					System.out.println("Invalid Output");
					break;
				}

				System.out.println("Your Account Opening Balance must be minimum 1000Rs.");
				System.out.println("Enter Amount:");
				accBal = sc.nextFloat();
				while (accBal < sAcc.getMinbal()) {
					if (accBal < sAcc.getMinbal()) {
						System.out.println("***Please pay Remaining Amount " + (sAcc.getMinbal() - accBal) + " ***");
						System.out.println("Enter Amount:");
						accBal = accBal + sc.nextFloat();
					}
				}
//				SAVING ACCOUNT Object Creation
				SavingAcc sAccNew = new MMSavingAcc(++accNo, accNm, accBal, isSalaried);
				System.out.println(sAccNew.toString());
				welcome();
				System.out.println("1. Deposit 2. Withdraw 3. Exit");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter Ammount:");
					amt = sc.nextFloat();
					sAccNew.deposite(amt);
					break;
				case 2:
					System.out.println("Enter Ammount:");
					amt = sc.nextFloat();
					sAccNew.withdraw(amt);
					break;
				case 3:
					System.out.println("Logout Successfully ");
					break;

				default:
					System.out.println("Invalid Option");
					break;
				}
				break;
			case 2:// Current
				accBal = 0;

				System.out.println("Your Account Opening Balance must be minimum 5000Rs.");
				System.out.println("Enter Amount:");
				accBal = sc.nextFloat();
				while (accBal < 5000) {
					if (accBal < 5000) {
						System.out.println("***Please pay Remaining Amount " + (5000 - accBal) + " ***");
						System.out.println("Enter Amount:");
						accBal = accBal + sc.nextFloat();
					}
				}

//				CURRENT ACCOUNT Object Creation
				MMCurrentAcc cAccNew = new MMCurrentAcc(accNo++, accNm, accBal, creditLimit);
				cAccNew.toString();

				welcome();
				System.out.println("1. Deposit 2. Withdraw 3. Exit");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter Ammount:");
					amt = sc.nextFloat();
					cAccNew.deposite(amt);
					System.out.println("CREDIT LIMIT: " + "Pranav");
					break;
				case 2:
					System.out.println("Enter Ammount:");
					amt = sc.nextFloat();
					cAccNew.withdraw(amt);
					break;
				case 3:
					break;

				default:
					System.out.println("Invalid Option");
					break;
				}
				break;

			default:
				System.out.println("Invalid Option");
				break;
			}

			break;

		case 2:// Login
			System.out.println("Enter Account Number:");
			int accNochoice = sc.nextInt();
			if (accNochoice == 2706) {
//				Previous Code of Saving Account implementation
				System.out.println("Welcome ".toUpperCase() + sAcc.getAccNm());
				welcome();
				System.out.println("1. Deposit 2. Withdraw 3. Exit");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter Ammount:");
					amt = sc.nextFloat();
					sAcc.deposite(amt);
					break;
				case 2:
					System.out.println("Enter Ammount:");
					amt = sc.nextFloat();
					sAcc.withdraw(amt);
					break;
				case 3:
					System.out.println("Logout Successfully ");
					break;

				default:
					System.out.println("Invalid Option");
					break;
				}
				break;
			} else if (accNochoice == 1306) {
//				Previous Code of Current Account implementation
				System.out.println("Welcome ".toUpperCase() + cAcc.getAccNm());
				welcome();
				System.out.println("1. Deposit 2. Withdraw 3. Exit");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter Ammount:");
					amt = sc.nextFloat();
					cAcc.deposite(amt);
					System.out.println("CREDIT LIMIT: " + cAcc.getCreditLimit());
					break;
				case 2:
					System.out.println("Enter Ammount:");
					amt = sc.nextFloat();
					cAcc.withdraw(amt);
					break;
				case 3:
					break;

				default:
					System.out.println("Invalid Option");
					break;
				}
				break;

			} else
				System.out.println("Wrong Account Number, Please check again...");

			break;

		default:
			System.out.println("Invalid Option");
			break;
		}

	}

	static public void welcome() {
		System.out.println("####################################");
		System.out.println("********** PPZ BANK **********");
		System.out.println("####################################");
//		System.out.println("***********************************");
	}

}
