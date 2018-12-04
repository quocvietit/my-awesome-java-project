package io;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import org.apache.commons.io.FileUtils;

public class DownloadFileFromUrl {
	public static void main(String[] args){
		String fileUrl = "https://www.w3schools.com/css/img_forest.jpg";
		String filePath = "./file/file.jpg";

		try {
			//Handle file url
			fileUrl = fileUrl.replaceAll(" ", "%20");
			URL url = new URL(fileUrl);

			//Create file object
			File file = new File(filePath);
			//file.deleteOnExit();

			//Write file
			FileUtils.copyURLToFile(url, file);
		}catch (IOException ex){
			ex.printStackTrace();
		}
	}
}
