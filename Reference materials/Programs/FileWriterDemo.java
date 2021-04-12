/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Admin
 */
public class FileWriterDemo {
    public static void main(String args[]) throws IOException {
		String source = "Now is the time for all good men\n"
			+ " to come to the aid of their country\n"
			+ " and pay their due taxes.";
		char buffer[] = new char[source.length()];
		source.getChars(0, source.length(), buffer, 0);
		FileWriter f0 = new FileWriter("D:/fff.txt");
		for (int i=0; i < buffer.length; i+=2) {
			f0.write(buffer[i]);
		}
		f0.close();
		FileWriter f1 = new FileWriter("D:/fff1.txt");
		f1.write(buffer);
		f1.close();
		FileWriter f2 = new FileWriter("D:/fff2.txt");
                //System.out.println("buffer.length"+(buffer.length-buffer.length)/4);
		f2.write(buffer,0,buffer.length/2);
		f2.close();
	}

}
