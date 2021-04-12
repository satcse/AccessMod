package com.company.files;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReadFileIntoList {

	public static List<String> readFile(String fileName)
	{
		List<String> lines = Collections.emptyList();
		try
		{
			lines = Files.readAllLines(Paths.get(fileName),StandardCharsets.UTF_8);
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
		return lines;
	}
	
	public static void main(String[] args) {
			
		List l = readFile("/home/sathishtipofeve/testFile4.txt");
		
		Iterator<String> ite = l.iterator();
		while(ite.hasNext())
			System.out.println(ite.next());
				
		try {
			Files.deleteIfExists(Paths.get("/home/sathishtipofeve/testFile2.txt"));
		}
		catch (NoSuchFileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (DirectoryNotEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		}

}
