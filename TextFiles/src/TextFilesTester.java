import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class TextFilesTester {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in); 
		
		System.out.print("Name of your input file: ");
		String name = scan.nextLine();
		
		System.out.print("Name your output file: ");
		String file = scan.nextLine();

		
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter myOutput = new PrintWriter(bw);
		
		Scanner input = new Scanner(new FileReader("input.txt"));
		String stock = input.nextLine();
		
		myOutput.println();
		myOutput.close();
		
	}

}
