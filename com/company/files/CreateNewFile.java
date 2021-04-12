package com.company.files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class CreateNewFile {

	public static void main(String[] args) {
		
		try {
			createFileUsingFileClass();
			createFileUsingFileOutputStreamsClass();
			createFileInNIO();
		} catch (IOException e) {			
			e.printStackTrace();
		}

	}
	
	private static void createFileUsingFileClass() throws IOException
	{
		File file  = new File("/home/sathishtipofeve/testFile1.txt");
		
		//Create a File
		if(file.createNewFile())
		{
			System.out.println("File is created");
		}
		else
		{
			System.out.println("File already exists.");
		}
		
		FileWriter writer = new FileWriter(file);
		writer.write("Test Data from FileWriter");
		writer.close();
	}
	
	private static void createFileUsingFileOutputStreamsClass() throws IOException
	{
		String data = "test data";
		FileOutputStream out = new FileOutputStream("/home/sathishtipofeve/testFile2.txt");
		out.write(data.getBytes());
		out.close();
	}
	
	private static void createFileInNIO() throws IOException
	{
		String data ="NIO Data";
		Files.write(Paths.get("/home/sathishtipofeve/testFile3.txt"), data.getBytes());
		
		List<String> lines = Arrays.asList("custome data 1","random data 2");
		Files.write(Paths.get("/home/sathishtipofeve/testFile4.txt"), lines, StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
	}

}
