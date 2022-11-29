package Project;

import java.util.Scanner;

public class Orogenic_Store

{
	static int a = 0;
	static int totalBill = 0;
	Scanner sc = new Scanner(System.in);

	static void meth1() {
		System.out.println("---- Available product in the store---- ");
		String arr[] = new String[] { " Friuits", " Vegetables", " Cosmetics", " Masala Powders" };
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println(i + ")" + arr[i]);
		}
	}

	public void display() {
		System.out.println("Please enter your choice ?");
		int choice = sc.nextInt();

		switch (choice) {
		case 0: {
			String arr[] = new String[] { "Mangoes", "Apples", "Grapes", "Papaya", "Bananans", "Oranges" };
			for (int i = 0; i < arr.length - 1; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			for (int code = 125; code <= 130; code++) {
				System.out.print(code + " ");
			}
			System.out.println();
			System.out.println("Please choose your product code : ");
			int code = sc.nextInt();

			if (code == 125) {
				System.out.println(" Oranges is good choice . How much kgs you need ?");
				a = 55;
			} else if (code == 126) {
				System.out.println(" Apples is good choice . How much kgs you need ?");
				a = 100;
			} else if (code == 127) {
				System.out.println(" Grapes is good choice . How much kgs you need ?");
				a = 76;
			} else if (code == 128) {
				System.out.println(" Papaya is good choice . How much kgs you need ?");
				a = 65;
			} else if (code == 129) {
				System.out.println(" Bananans is good choice . How much kgs you need ?");
				a = 76;
			} else if (code == 130) {
				System.out.println(" Mangoes is good choice . How much kgs you need ?");
				a = 76;
			} else {
				System.out.println(" You Enter the WRONG Product Code .");
				System.out.println("----------------------------------");
				meth1();
				new Orogenic_Store().display(); // Return call to case 1

			}
			int kg = sc.nextInt();
			totalBill = kg * a;

			System.out.println(" if want to continue with shopping press 1 ");
			new Orogenic_Store().meth2();
			break;
		}
		case 1: {
			String arr[] = new String[] { "Patato", "Brinjal", "Carrots", "Beetroot", "Drumstick", "Mushroom" };
			for (int i = 0; i < arr.length - 1; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			for (int i = 225; i <= 230; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			System.out.println(" Please choose your product code : ");
			int code = sc.nextInt();

			if (code == 225) {
				System.out.println(" Patato is good choice . How much kgs you need ?");
				a = 55;
			} else if (code == 226) {
				System.out.println(" Brinjal is good choice . How much kgs you need ?");
				a = 50;
			} else if (code == 227) {
				System.out.println(" Carrots is good choice . How much kgs you need ?");
				a = 80;
			} else if (code == 228) {
				System.out.println(" Beetroot is good choice . How much kgs you need ?");
				a = 80;
			} else if (code == 229) {
				System.out.println(" Drumstick is good choice . How much kgs you need ?");
				a = 60;
			} else if (code == 230) {
				System.out.println(" Mashroom is good choice . How much kgs you need ?");
				a = 40;
			} else {
				System.out.println(" You Enter the WRONG Product Code ");
				System.out.println("----------------------------------");
				meth1();
				new Orogenic_Store().display();
			}
			int kg = sc.nextInt();
			totalBill = kg * a;

			System.out.println(" if want to continue with shopping press 1 Otherwise press 2 ");
			new Orogenic_Store().meth2();
			break;
		}
		case 2: {
			String arr[] = new String[] { "skinCare", "perfumes", "hairDyes", "Powders", "shampoo", "faceWash" };
			for (int i = 0; i < arr.length - 1; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			for (int i = 335; i <= 340; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			System.out.println(" Please choose your product code : ");
			int code = sc.nextInt();

			if (code == 335) {
				System.out.println(" skinCare is good choice . How much Qty you need ?");
				a = 55;
			} else if (code == 336) {
				System.out.println(" perfumes is good choice . How much Qty you need ?");
				a = 100;
			} else if (code == 337) {
				System.out.println(" hairDyes is good choice . How much Qty you need ?");
				a = 50;
			} else if (code == 338) {
				System.out.println(" Powders is good choice . How much Qty you need ?");
				a = 40;
			} else if (code == 339) {
				System.out.println(" shampoo is good choice . How much Qty you need ?");
				a = 50;
			} else if (code == 340) {
				System.out.println(" faceWash  is good choice . How much Qty you need ?");
				a = 80;
			} else {
				System.out.println(" You Enter the WRONG Product Code . Please enter Correct Product Key");
				System.out.println("----------------------------------");
				meth1();
				new Orogenic_Store().display();
			}
			int kg = sc.nextInt();
			totalBill = kg * a;

			System.out.println(" if want to continue with shopping press 1 ");
			new Orogenic_Store().meth2();
			break;
		}
		case 3: {
			String arr[] = new String[] { "LalMirch", "KaliMirch", "Ginger", "GaramMasala", "Salt", "PanchMasala " };
			for (int i = 0; i < arr.length - 1; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			for (int i = 445; i <= 450; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			System.out.println("Please choose your product code : ");
			int code = sc.nextInt();
			if (code == 445) {
				System.out.println(" LalMirch is good choice . How much Qty you need ?");
				a = 50;
			} else if (code == 446) {
				System.out.println(" KaliMirch is good choice . How much Qty you need ?");
				a = 40;
			} else if (code == 447) {
				System.out.println(" Ginger is good choice . How much Qty you need ?");
				a = 30;
			} else if (code == 448) {
				System.out.println(" GaramMasala is good choice . How much Qty you need ?");
				a = 60;
			} else if (code == 449) {
				System.out.println(" Salt is good choice . How much Qty you need ?");
				a = 40;
			} else if (code == 450) {
				System.out.println(" PanchMasala  is good choice . How much Qty you need ?");
			} else {
				System.out.println(" You Enter the WRONG Product Code . Please enter Correct Product Key");
				System.out.println("----------------------------------");
				meth1();
				new Orogenic_Store().display();
			}
			int kg = sc.nextInt();
			totalBill = kg * a;
			System.out.println(" if want to continue with shopping press 1 ");
			new Orogenic_Store().meth2();
			break;
		}
		}
	}

	public void meth2() {
		int press = sc.nextInt();
		if (press == 1) {
			meth1();
			new Orogenic_Store().display();
		}
		if (press == 2) {
			System.out.println("---- WELCOME TO SHREE RENUKACHARYA MART ----");

			System.out.println("Enter your name :");
			sc.nextLine();
			String str = sc.nextLine();

			System.out.println("Enter your Mobile Number :");
			long MobNo = sc.nextLong();

			System.out.println("Enter your Address :");
			sc.nextLine();
			String add = sc.nextLine();

			if (totalBill > 500) {
				System.out.println(" ===== WELCOME TO SHREE RENUKACHARYA MART =====");
				System.out.println("-------------------------------------------");
				System.out.println(" Final bill is :" + totalBill);
				int discount = totalBill * 5 / 100;
				System.out.println(" Discount amount " + discount + " rs");
				System.out.println(" Final bill is :" + (totalBill - discount));
				System.out.println("------- Thank You for shopping you saved " + discount + "rs");
				System.out.println("--------- VISIT AGIN ---------");
				System.out.println("--------------------------------------------------");
				System.out.println("Person Name :" + str);
				System.out.println("Person Mobile No :" + MobNo);
				System.out.println("person Address :" + add);

				System.out.println("--------------- JAVA IS AWESOME --------------");
			} else {
				System.out.println(" ===== WELCOME TO SHREE RENUKACHARYA MART =====");
				System.out.println("-------------------------------------------");
				System.out.println("Final bill is :" + totalBill);
				System.out.println("--------- VISIT AGIN ---------");
				System.out.println("--------------------------------------------------");
				System.out.println("Person Name :" + str);
				System.out.println("Person Mobile No :" + MobNo);
				System.out.println("person Address :" + add);

				System.out.println("--------------- JAVA IS AWESOME --------------");

			}

		}
		sc.close();
	}

	public static void main(String args[]) {
		System.out.println(" ===== WELCOME TO SHREE RENUKACHARYA MART =====");
		System.out.println("-------------------------------------------");

		Orogenic_Store aobj = new Orogenic_Store();
		meth1();
		aobj.display();
	}
}
