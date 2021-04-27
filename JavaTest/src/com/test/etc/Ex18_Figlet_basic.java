package com.test.etc;

import java.io.File;
import com.github.lalyos.jfiglet.FigletFont;

public class Ex18_Figlet_basic {
	public static void main(String[] args) throws Exception {
		// 콘솔 라이브러리
		// - https://github.com/lalyos/jfiglet
		// - https://search.maven.org
		
		// using default font standard.flf, obtained from maven artifact
	    String asciiArt1 = FigletFont.convertOneLine("Hello ~ Hello");
	    System.out.println(asciiArt1);
	    
//	    // using font font2.flf, located somewhere in classpath under path /flf/font2.flf
	    String asciiArt2 = FigletFont.convertOneLine(FigletFont.class.getResourceAsStream("/flf/alligator2.flf"), "momo");
	    System.out.println(asciiArt2);
	    
	    asciiArt2 = FigletFont.convertOneLine("classpath:/flf/alligator2.flf", "hello");     
	    System.out.println(asciiArt2);                
//	    
//	    // using font font3.flf, located in file system under path /opt/font3.flf
//	    String asciiArt3 = FigletFont.convertOneLine(new File("/opt/font3.flf"), "hello");     
//	    System.out.println(asciiArt3);
//
//	    asciiArt3 = FigletFont.convertOneLine("/opt/font3.flf", "hello");     
//	    System.out.println(asciiArt3);
//
//	    // using font font4.flf, from www 
//	    String asciiArt4 = FigletFont.convertOneLine("http://myhost.com/font4.flf", "hello");     
//	    System.out.println(asciiArt4);             
	}

}
