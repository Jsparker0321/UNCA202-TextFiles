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

	private ArrayList<InventoryItem> WarehouseItem;
	
	public Warehouse(InventoryItem item) {
		
		WarehouseItem = new ArrayList<InventoryItem>();
		
		
		
	
	}

	public void readInventoryFile(InventoryItem item ) throws FileNotFoundException {
		
		Scanner scan = new Scanner("input.txt");
		while(scan.hasNextLine()) {
			WarehouseItem.add(item);

		}
	}


	public void writeOutputFile(ArrayList<InventoryItem> WarehouseItem ) throws FileNotFoundException {
		
		
		PrintWriter myOutput = new PrintWriter("output.txt");
		myOutput.println("Today's Stock: ");
		
		
		for(InventoryItem item : WarehouseItem ) {
			System.out.println(item.getSku());
			System.out.println(item.getDisc());
			System.out.println(item.getPrice());
			System.out.println(item.getAmount());
		}
		
		myOutput.close();
	}

}
