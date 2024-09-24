package com.dam.nc;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Logger;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.parsers.ParserConfigurationException;

import org.json.JSONObject;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.xml.sax.SAXException;


@Controller
public class S100ECController {

    Logger logger = Logger.getLogger(getClass().getName());
    static final String UPLOAD_FOLDER_NAME = "\\Uploads";

    @GetMapping("/")
    public String getHomePage()
    {
        return "index.html";
    }

    @PostMapping("/add")
    public String addData(@RequestBody String data) throws DatatypeConfigurationException, JAXBException
    {
        logger.info(data);
        JSONObject jobj = new JSONObject(data);
        // S100ECU utils = new FCUtilities();
        // utils.getData(jobj);
        // utils.createS124GML();
        return "added =" + data ;
    }

    @PostMapping("/upload")
    public String uploadFile(@RequestParam("file") MultipartFile file) throws IOException 
    {
        String fileUploadStatus;
        String filePath = System.getProperty("user.dir") + UPLOAD_FOLDER_NAME + File.separator + file.getOriginalFilename();

        FileOutputStream fileOutputStream = new FileOutputStream(filePath);
        fileOutputStream.write(file.getBytes());
        fileOutputStream.close();
        fileUploadStatus = "File Uploaded Successfully";
        return fileUploadStatus;
    }

    @GetMapping("/types")
    public ResponseEntity<?> getInfoType(@RequestParam String fileName) throws ParserConfigurationException, SAXException, IOException 
    {
        FileSystemResource filePath = new FileSystemResource(System.getProperty("user.dir") + "\\Uploads\\" + fileName);
        S100ECReader fcRead = new S100ECReader();		
		org.w3c.dom.Document doc = fcRead.readFeatureCatalog(filePath.getPath());
		JSONObject json = fcRead.createS124Json(doc);
        return new ResponseEntity<String>(json.toString(), HttpStatus.CREATED);
    } 

    // @PostMapping("/gml")
    // public ResponseEntity<?> createGML(@RequestBody String jString) throws IOException, DatatypeConfigurationException, JAXBException 
    // {
    //     JSONObject jobj = new JSONObject(jString);
    //     FCUtilities utils = new FCUtilities();
    //     // utils.getData(jobj);
    //     // String str = utils.createS124GML();
    //     // return new ResponseEntity<String>(str, HttpStatus.CREATED);
    // }

}

