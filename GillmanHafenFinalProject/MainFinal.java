//File Prologue
//Name: Nicole Gillman and Garret Hafen
//Assignment: Final Project
//Date: 4/5/19
//CIT 260
import accounting.*;
import java.io.PrintWriter;
public class MainFinal {

	public static void main(String[] args) throws java.io.IOException {
		//testing printing to a file
		String name = "Garrett Hafen is awesome...but bad at school";
		int accountNumber = 12345;
		String accountType = "checking";
		
		
		Account a1 = new Account(name, accountNumber, accountType);
		System.out.println(a1.getName());
		PrintWriter myFile = new PrintWriter("Recipt.txt");
		myFile.println(a1.getName());
		myFile.println(a1.getAccountNumber());
		myFile.println(a1.getAccountType());
		myFile.close();
		

	}

}


