package springmvc.controller;

import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class fileuploadController {

	@RequestMapping("/FileForm")
	public String showUploadForm(){
		
		return "FileForm";
	}
	
	@RequestMapping(value="/uploadimage", method=RequestMethod.POST)
	public String fileupload(@RequestParam("profile") CommonsMultipartFile file, HttpSession s, Model model){
		System.out.println(file.getContentType());
		System.out.println(file.getSize());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getStorageDescription());
		
		byte[] data=file.getBytes();
		//We have to save file on server
		String path=s.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resources"+File.separator+"images"+File.separator+file.getOriginalFilename();
		System.out.println(path);

		try{
			FileOutputStream fos=new FileOutputStream(path);
			fos.write(data);
			fos.close();
			model.addAttribute("msg","File uploaded");
			model.addAttribute("filename",file.getOriginalFilename());
			System.out.println("File Uploaded");
		}
		catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("msg","File uploading errorr...");
			System.out.println("File Uploading erorr...");
		}
		return "filesuccess";
	}
}
