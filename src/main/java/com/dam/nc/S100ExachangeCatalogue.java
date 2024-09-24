package com.dam.nc;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.xml.sax.SAXException;

@SpringBootApplication
public class S100ExachangeCatalogue {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException 
	{
		SpringApplication.run(S100ExachangeCatalogue.class, args);
	}
}
