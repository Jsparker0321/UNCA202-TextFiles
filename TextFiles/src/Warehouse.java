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
		
		ArrayList<InventoryItem> WarehouseItem = new ArrayList<InventoryItem>();

	
	}

	public void readInventoryFile( ) throws FileNotFoundException {
		
		Scanner input = new Scanner(new File("input.txt"));
		ArrayList<InventoryItem> WarehouseItem = new ArrayList<InventoryItem>();
		while ( input.hasNext()) {
			
			WarehouseItem.add(input.next());
			WarehouseItem.add(input.nextInt());
			WarehouseItem.add(input.nextDouble()); 
			
			
		}
		input.close();

		
	}


	public void writeOutputFile(ArrayList<InventoryItem> WarehouseItem ) throws FileNotFoundException {
		
		
		PrintWriter myOutput = new PrintWriter("output.txt");
		myOutput.println("Today's Stock: ");
		myOutput.close();
		
		for(InventoryItem item : WarehouseItem ) {
			System.out.println(item.getSku());
			System.out.println(item.getDisc());
			System.out.println(item.getPrice());
			System.out.println(item.getAmount());
		}
		
	}

}
