package com.ecommerce.controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class MainController {

	@RequestMapping(value="/")
	public String index()
	{
		return "index.html";
	}
	
	
	@RequestMapping(value = "/upload", method=RequestMethod.POST,consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public String fileUpload(@RequestParam("file") MultipartFile file)
	{
		String result="File was uploaded successfully";
		
		try
		{ // /usr/share/ -> Unix
			String path ="D:\\Personal\\Data\\";
			path = path.replace("\\", "/");
			File convertFile = new File(path+file.getOriginalFilename());
			convertFile.createNewFile();
			FileOutputStream fout = new FileOutputStream(convertFile);
			fout.write(file.getBytes());
			fout.close();
		}catch(IOException iex)
		{
			iex.printStackTrace();
			result = "Error" + iex.getMessage();
		}
		return result;
	}
	
	@RequestMapping(value="/download",method=RequestMethod.GET)
	public ResponseEntity<InputStreamResource> downloadFile() throws IOException 
	{
		String fileName = "static/dumpinfo.txt";
		
		ClassLoader classLoader = new MainController().getClass().getClassLoader();
		
		File file = new File(classLoader.getResource(fileName).getFile());
		
		InputStreamResource resource = new InputStreamResource(new FileInputStream(file));
		HttpHeaders headers = new HttpHeaders();
		headers.add("context-Disposition", String.format("attachment;filename=\"%s\"", file.getName()));
		headers.add("cache-Control", "no-cache, no-store, must-revalidate");
		headers.add("Pragma", "no-cache");
		headers.add("Expires", "0");
		
		ResponseEntity<InputStreamResource> responseEntity = ResponseEntity.ok().headers(headers).contentLength(file.length()).
				contentType(MediaType.parseMediaType("application/txt")).body(resource);
						
		return responseEntity;
	}
	
}
