package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class FileManager {
	Properties pro;
	
	public FileManager(){
		try {
			FileInputStream fin = new FileInputStream("./Configuration.Properties");
		    pro = new Properties();
			pro.load(fin);
		} catch (Exception e) {
			System.out.println("invlaid path");
		}
	}
	
	public String getappurl(){
		String url = pro.getProperty("qa_url");
		if(url==null){
			throw new RuntimeException("invlaid url");
		}
		return url;
		
	}
	
	public String getuaturl(){
		String url = pro.getProperty("uat_url");
		if(url==null){
			throw new RuntimeException("invlaid url");
		}
		return url;
		
	}
	
	public String getprodurl(){
		String prod_url = pro.getProperty("prod_url");
		if(prod_url==null){
			throw new RuntimeException("invlaid url");
		}
		return prod_url;
		
	}
	
	public long getImplicitlywait(){
		String iw = pro.getProperty("iw");
		if(iw==null){
			throw new RuntimeException(iw);
		}
		return Long.parseLong(iw);
		
		
	}

}


/*public static String getappurl(){
	String url= null;
	try {
		FileInputStream fin = new FileInputStream("./Configuration.Properties");
		Properties pro = new Properties();
		pro.load(fin);
	    url = pro.getProperty("uat");
	} catch (Exception e) {
		
	}
	return url;
	
}*/