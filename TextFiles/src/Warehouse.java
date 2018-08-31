import java.lang.*;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Warehouse {

	public Warehouse() {
		ArrayList<InventoryItem> wh = new ArrayList<InventoryItem>();
		
	}

	public void readInventoryFile( ArrayList<InventoryItem>() ) {
		
		
		
		
		File inputFileName = new File("input.txt");
		Scanner input = new Scanner(inputFileName);
		
		ArrayList<InventoryItem> wh = new ArrayList<InventoryItem>();
		while ( input.hasNextLine()) {
			wh.add(input.nextLine());
			wh.add(input.nextInt());
			wh.add(input.nextDouble());
			
		}
		input.close();

		
	}

	public void writeOutputFile(ArrayList<InventoryItem> wh ) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Name your output file: ");
		String file = scan.nextLine();
		
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter myOutput = new PrintWriter(bw);
		
		for(InventoryItem item : wh ) {
			System.out.println(item.getSku());
			System.out.println(item.getDisc());
			System.out.println(item.getPrice());
			System.out.println(item.getAmount());
		}
		
	}

}
