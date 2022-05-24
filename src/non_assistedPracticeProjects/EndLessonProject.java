package non_assistedPracticeProjects;

import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class EndLessonProject {
	public static void main(String[] args) throws Exception
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("This is a File Handeling Program");
		boolean x = true;
		while(x) {System.out.println("Please select the oppration you want to perform"+"\r\n" 
				+ "1.Read" +"\r\n" 
				+ "2.Write" +"\r\n"
				+ "3.Append" +"\r\n"
				+ "0.Exit" );
			int a = Sc.nextInt();
			if(a==1) {
				 File file = new File("C:\\Users\\Alifa\\OneDrive\\Documents\\Practice projects\\testfile.txt");
				
				 BufferedReader br = new BufferedReader(new FileReader(file));
				 String st;
				 while ((st = br.readLine()) != null)
					 System.out.println(st);
			}
			else if(a==2) {
				String text = "This is the text written by the program.";
				Path fileName = Path.of("C:\\Users\\Alifa\\OneDrive\\Documents\\Practice projects\\testfile.txt");
				Files.writeString(fileName, text);
				String file_content = Files.readString(fileName);
				 System.out.println(file_content+"\r\n"+"This text has been written in the file.");
			}
			else if(a==3) {
				String path = "C:\\Users\\Alifa\\OneDrive\\Documents\\Practice projects\\testfile.txt";
		        String text = "Added text";

		        try {
		            FileWriter fw = new FileWriter(path, true);
		            fw.write(text);
		            fw.close();
		        }
		        catch(IOException e) {
		        }
				
			}
			else if(a==0) {
				System.out.println("The Program is now Closed.");
				break;
			}
			else {
				System.out.println("Please Select A Valid Option!");
			}
		}
		Sc.close();
	}

}
