package Mapp.exam_io;

import java.io.BufferedOutputStream;

/**
 * Hello world!
 *
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


/**
 *
 */
public class App 
{
    public static void main( String[] args ){
    	
    
    	URL url=null;
    	try {
			url=new URL("http://www.madore.org/~david/math/padics.pdf");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
					
		}
        try {
			URLConnection conn = url.openConnection();
			InputStream in= conn.getInputStream();
			FileOutputStream fs =new FileOutputStream("padics_new.pdf");
			
			BufferedOutputStream bf= new BufferedOutputStream(fs);	
			
			byte put[] =new byte[1024];
			int len;
			while((len=in.read(put) ) !=-1){				
							
				bf.write(put,0,len);
			}
			bf.close();
			fs.close();
			in.close();
			
			System.out.println("done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        
    	
    }  	
}

