package investmentt1234;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.PrintWriter;
public class F {
	static File f = new File("File3.txt");
	public static void writeData(ArrayList<Company>company){
	try {
		
		//company
PrintWriter w = new PrintWriter(f);
		for (Company e :company){
	w.print("\n"+e.getNumberofshares()+" "+e.getPriceofeachshare()+" "+e.getName() );
	w.print("\n"+e.country);
	w.print("\n"+e.city);
	w.print("\n"+e.maxSell);
	w.print("\n"+e.getPassword());
	
	
	
		}	w.close();
	}
	catch (Exception e1){
	System.out.println("file not found");
	}
}
	public static ArrayList<Company> ReadData() {
		// TODO Auto-generated method stub
		ArrayList<Company>list2 = new ArrayList<>();
		try {
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine()) {
				int shares=sc.nextInt();
				System.out.println(shares);
				double priceofeachshare=sc.nextDouble();
				String name=(sc.nextLine()).trim();
				String country = (sc.nextLine()).trim();
				String city = (sc.nextLine()).trim();
				int maxSell = sc.nextInt();
				sc.nextLine();
				String password = (sc.nextLine()).trim();
				Company c = new Company(name, country,city, password,shares,priceofeachshare, maxSell);
				list2.add(c);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list2;
	}}
