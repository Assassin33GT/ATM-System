package investmentt1234;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
//investor
public class F2 {
	static File f2 = new File("File4.txt");
	public static void writeData(ArrayList<investor>investor){
		try {
			
	PrintWriter w = new PrintWriter(f2);
			for (investor e :investor){
		w.print( e.balance+" "+e.name+"\n");
		w.print(e.country+"\n");
		w.print(e.city+"\n");
		w.print(e.getPassword()+"\n");
		
		
		
			}	w.close();
		}
		catch (Exception e1){
		System.out.println("file not found");
		}
	}
		public static ArrayList<investor> ReadData() {
			// TODO Auto-generated method stub
			ArrayList<investor>list2 = new ArrayList<>();
			try {
				Scanner sc = new Scanner(f2);
				while(sc.hasNextLine()) {
					double balance=sc.nextDouble(); 
				    String name=sc.nextLine();
					String country = sc.nextLine();
					String city = sc.nextLine();
				   String password = sc.nextLine();
					
					investor a = new investor(name, country,city,balance, password);
					list2.add(a); 
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return list2;
		}
		}


