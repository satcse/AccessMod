package com.company.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileModifyProgram {
	
	static void modifyFile(String filePath,String oldStr,String newStr)
	{
		
		File fileName = new File(filePath);
		String oldContent="";
		BufferedReader reader = null;
		FileWriter writer = null;
		try
		{
			reader = new BufferedReader(new FileReader(fileName)); // Getting Read Handle for the file
			String line = reader.readLine();// BufferedReader -> FileReader -> File)
			while(line!=null)
			{
				oldContent = oldContent + line + System.lineSeparator(); // Reading the contents of the file
				line = reader.readLine();
			}
			
			String newContent = oldContent.replaceAll(oldStr, newStr); // Modifying the oldContents
			writer = new FileWriter(fileName); // Getting Write Handle for the file
			writer.write(newContent);// Writing All changes back to the file.
		}		
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				// Closing the Read and Write handles to avoid Resource Leakage.
				reader.close();
				writer.close();
			}catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		modifyFile("/home/sathishtipofeve/testFile4.txt", "data", "modified"); // Calling Modify Function
		System.out.println("Modify Done");
		
	}

}
