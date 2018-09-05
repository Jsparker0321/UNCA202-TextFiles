import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class TextFilesTester {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.print("Name of your input file: ");
		String name = scan.nextLine();
		
		System.out.print("Name your output file: ");
		String file = scan.nextLine();

		
		ArrayList<InventoryItem> FinalWarehouse = new ArrayList<InventoryItem>();
				
		FinalWarehouse.readInventoryFile();
		FinalWarehouse.writeOutputFile();
		
		
	}

}
