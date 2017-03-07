package Mapp.exam_io;

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
    	
    	int bytesum=0;
    	int byteread=0;
    	URL url=null;
    	try {
			url=new URL("http://www.madore.org/~david/math/padics.pdf");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
					
		}
        try {
			URLConnection conn = url.openConnection();
			InputStream instream= conn.getInputStream();
			FileOutputStream fs =new FileOutputStream("padics_new.pdf");
			byte put[] =new byte[1024];
			while((byteread=instream.read(put) ) !=-1){
				bytesum=bytesum+byteread;
				fs.write(put,0,byteread);
						
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        
    	
    }  	
}

