import java.util.ArrayList;
import java.util.Scanner;

public class ClassSelector {

	public static void main(String[] args) {
		
		// Variables
		int userId = 0;
		boolean meetsReqs;
		int choice = 0;
		
		// Initialize test students
		Students john = new Students("John", "Smith", 1111, true);  //meets pre reqs
		Students jarett = new Students("Jarett", "Wright", 2222, false);  //does not meet pre reqs
		
		// Get student ID
		System.out.println("Please enter your Student ID#: ");
		try {
		Scanner scan = new Scanner(System.in);
		userId = scan.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Determine if student is john
		if(userId == john.getStudentId()) {
			System.out.println("Welcome John Smith!");
			meetsReqs = john.isPreReq();   // Determine if student meets pre reqs
		}
		
		// Determine if student is jarett
		if(userId == jarett.getStudentId()) {
			System.out.println("Welcome Jarett Wright!");
			meetsReqs = jarett.isPreReq();   // Determine if student meets pre reqs
		}
		
		// Class Register Layout
		System.out.println("\n===============================");
		System.out.println("Valencia College Class Register");
		System.out.println("===============================");
		System.out.println("1) Intro to C programming.");
		System.out.println("2) Object Oriented Programming***.");
		System.out.println("3) College Algebra.");
		System.out.println("4) Statistics***.");
		System.out.println("5) Freshman Compostion.");
		System.out.println("6) Freshman Composition 2***.");
		System.out.println("7) Exit.");
		
		// Get user selections
		System.out.println("Please choose a class to register for or enter '7' to exit: ");
		try {
			Scanner scan2 = new Scanner(System.in);
			choice = scan2.nextInt();
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		// ArrayList Declaration
				ArrayList<String> classes = new ArrayList<String>();
		
		// If user is John
		if(userId == john.getStudentId()) {
			// While loop for John's selections
			while (choice != 7) {
				// Switch to handle user choice
				switch (choice) {
					case 1:
						classes.add("Intro to C programming.");
						System.out.println("Class successfully registered, please make another selection or enter '7' to exit:");
						try {
							Scanner scan2 = new Scanner(System.in);
							choice = scan2.nextInt();
							} catch (Exception e) {
								e.printStackTrace();
							}
						break;
					case 2:
						if(john.isPreReq() == true) {
							classes.add("Object Oriented Programming.");
							System.out.println("Class successfully registered, please make another selection or enter '7' to exit:");
							try {
								Scanner scan2 = new Scanner(System.in);
								choice = scan2.nextInt();
								} catch (Exception e) {
									e.printStackTrace();
								}
								
						} else {
							System.out.println("Oops! You do not meet the Pre-Requirements for this class!");
							System.out.println("Please make another selection:");
							try {
								Scanner scan2 = new Scanner(System.in);
								choice = scan2.nextInt();
								} catch (Exception e) {
									e.printStackTrace();
								}
						}
						break;
					case 3:
						classes.add("College Algebra.");
						System.out.println("Class successfully registered, please make another selection or enter '7' to exit:");
						try {
							Scanner scan2 = new Scanner(System.in);
							choice = scan2.nextInt();
							} catch (Exception e) {
								e.printStackTrace();
							}
						break;
					case 4:
						if(john.isPreReq() == true) {
							classes.add("Statistics.");
							System.out.println("Class successfully registered, please make another selection or enter '7' to exit:");
							try {
								Scanner scan2 = new Scanner(System.in);
								choice = scan2.nextInt();
								} catch (Exception e) {
									e.printStackTrace();
								}
						} else {
							System.out.println("Oops! You do not meet the Pre-Requirements for this class!");
							System.out.println("Please make another selection:");
							try {
								Scanner scan2 = new Scanner(System.in);
								choice = scan2.nextInt();
								} catch (Exception e) {
									e.printStackTrace();
								}
						}
						break;
					case 5:
						classes.add("Freshman Compostion.");
						System.out.println("Class successfully registered, please make another selection or enter '7' to exit:");
						try {
							Scanner scan2 = new Scanner(System.in);
							choice = scan2.nextInt();
							} catch (Exception e) {
								e.printStackTrace();
							}
						break;
					case 6:
						if(john.isPreReq() == true) {
							classes.add("Freshman Compostion 2.");
							System.out.println("Class successfully registered, please make another selection or enter '7' to exit:");
							try {
								Scanner scan2 = new Scanner(System.in);
								choice = scan2.nextInt();
								} catch (Exception e) {
									e.printStackTrace();
								}
						} else {
							System.out.println("Oops! You do not meet the Pre-Requirements for this class!");
							System.out.println("Please make another selection:");
							try {
								Scanner scan2 = new Scanner(System.in);
								choice = scan2.nextInt();
								} catch (Exception e) {
									e.printStackTrace();
								}
						}
						break;
				}
			
			}
		}
		
		// If user is Jarett
		if(userId == jarett.getStudentId()) {
			// While loop for John's selections
			while (choice != 7) {
				// Switch to handle user choice
				switch (choice) {
					case 1:
						classes.add("Intro to C programming.");
						System.out.println("Class successfully registered, please make another selection or enter '7' to exit:");
						try {
							Scanner scan2 = new Scanner(System.in);
							choice = scan2.nextInt();
							} catch (Exception e) {
								e.printStackTrace();
							}
						break;
					case 2:
						if(jarett.isPreReq() == true) {
							classes.add("Object Oriented Programming.");
							System.out.println("Class successfully registered, please make another selection or enter '7' to exit:");
							try {
								Scanner scan2 = new Scanner(System.in);
								choice = scan2.nextInt();
								} catch (Exception e) {
									e.printStackTrace();
								}
								
						} else {
							System.out.println("Oops! You do not meet the Pre-Requirements for this class!");
							System.out.println("Please make another selection:");
							try {
								Scanner scan2 = new Scanner(System.in);
								choice = scan2.nextInt();
								} catch (Exception e) {
									e.printStackTrace();
								}
						}
						break;
					case 3:
						classes.add("College Algebra.");
						System.out.println("Class successfully registered, please make another selection or enter '7' to exit:");
						try {
							Scanner scan2 = new Scanner(System.in);
							choice = scan2.nextInt();
							} catch (Exception e) {
								e.printStackTrace();
							}
						break;
					case 4:
						if(jarett.isPreReq() == true) {
							classes.add("Statistics.");
							System.out.println("Class successfully registered, please make another selection or enter '7' to exit:");
							try {
								Scanner scan2 = new Scanner(System.in);
								choice = scan2.nextInt();
								} catch (Exception e) {
									e.printStackTrace();
								}
						} else {
							System.out.println("Oops! You do not meet the Pre-Requirements for this class!");
							System.out.println("Please make another selection:");
							try {
								Scanner scan2 = new Scanner(System.in);
								choice = scan2.nextInt();
								} catch (Exception e) {
									e.printStackTrace();
								}
						}
						break;
					case 5:
						classes.add("Freshman Compostion.");
						System.out.println("Class successfully registered, please make another selection or enter '7' to exit:");
						try {
							Scanner scan2 = new Scanner(System.in);
							choice = scan2.nextInt();
							} catch (Exception e) {
								e.printStackTrace();
							}
						break;
					case 6:
						if(jarett.isPreReq() == true) {
							classes.add("Freshman Compostion 2.");
							System.out.println("Class successfully registered, please make another selection or enter '7' to exit:");
							try {
								Scanner scan2 = new Scanner(System.in);
								choice = scan2.nextInt();
								} catch (Exception e) {
									e.printStackTrace();
								}
						} else {
							System.out.println("Oops! You do not meet the Pre-Requirements for this class!");
							System.out.println("Please make another selection:");
							try {
								Scanner scan2 = new Scanner(System.in);
								choice = scan2.nextInt();
								} catch (Exception e) {
									e.printStackTrace();
								}
						}
						break;
				}
			
			}
		}
		// Diplay selection results
		// Output ArrayList Names
				System.out.println("\nClass Schedule ");
				System.out.println("=================");
				for(int i = 0; i < classes.size(); i++) {
					System.out.println("Class "+ (i + 1)+ ": " + classes.get(i));
				}
	}



	
}
