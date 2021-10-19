package b2;

import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ManagerDocument managerDocument = new ManagerDocument();
		while (true) {
			System.out.println("Application Manager Document");
			System.out.println("Enter 1: To insert document");
			System.out.println("Enter 2: To search document by category");
			System.out.println("Enter 3: To show information documents ");
			System.out.println("Enter 4: To remove document by id ");
			System.out.println("Enter 5: To Exit:");
			String line = scanner.nextLine();
			switch (line) {
			case "1": {
				System.out.println("Enter a: to insert Book");
				System.out.println("Enter b: to insert Newspaper");
				System.out.println("Enter c: to insert Journal");
				String type = scanner.nextLine();
				switch (type) {
				case "a" : {
					System.out.println("Enter id");
					String id = scanner.nextLine();
					System.out.println("Enter nxb");
					String nxb = scanner.nextLine();
					System.out.println("Enter number");
					int number = scanner.nextInt();
					System.out.println("Enter author");
					String author = scanner.nextLine();
					System.out.println("Enter page number:");
					int pageNumber = scanner.nextInt();
					Document book= new Book(id, nxb, number, author, number);
					managerDocument.addDocument(book);
					System.out.println(book.toString());
					scanner.nextLine();
					break;
				}
				case "b" : {
					System.out.println("Enter id");
					String id = scanner.nextLine();
					System.out.println("Enter nxb");
					String nxb = scanner.nextLine();
					System.out.println("Enter number");
					int number = scanner.nextInt();
					System.out.println("Enter Day issue:");
					int dayIssue = scanner.nextInt();
					Document newspaper= new NewsPaper(id, nxb, number, dayIssue);
					managerDocument.addDocument(newspaper);
					System.out.println(newspaper.toString());
					scanner.nextLine();
					break;
				}
				case "c" : {
					System.out.println("Enter id");
					String id = scanner.nextLine();
					System.out.println("Enter nxb");
					String nxb = scanner.nextLine();
					System.out.println("Enter number");
					int number = scanner.nextInt();
					System.out.println("Enter issue number");
					int issueNumber = scanner.nextInt();
					System.out.println("Enter issue month:");
					int issueMonth = scanner.nextInt();
					Document journal= new Journal(id, nxb,number, issueNumber,issueMonth);
					managerDocument.addDocument(journal);
					System.out.println(journal.toString());
					scanner.nextLine();
					break;
				}
				default:
					break;
				}
				break;
			}
			case"2":{
				System.out.println("Enter a to search book");
				System.out.println("Enter b to search newspaper");
				System.out.println("Enter c to search journal");
				String choise = scanner.nextLine();
				switch (choise) {
				case "a" : {
					managerDocument.searchByBook();
				}
				case "b" : {
					managerDocument.searchByNewspaper();
				}
				case "c" : {
					managerDocument.searchByJournal();
					break;
			
				}
				default:
					System.out.println("Invalid");
					break;
				}
				break;
			}
			case "3" : {
				managerDocument.showInfor();
				break;
			}
			case "4" :
				System.out.println("Enter id to remove");
				String id = scanner.nextLine();
				System.out.println(managerDocument.deleteDocument(id)? "Success":"Fail");
		break;
		
		case"5" : {
			return;
		}
		default:
			System.out.println("Ivalid");
			continue;
		
			}
			
		}
	}
		
	}

