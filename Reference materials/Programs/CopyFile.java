/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Admin
 */
class CopyFile {
public static void main(String args[]) throws IOException
{
int i;
FileInputStream fin;
FileOutputStream fout;
try {
	try {
	fin = new FileInputStream("D:/fff.txt");
	} catch(FileNotFoundException e) {
	System.out.println("Input File Not Found");
	return;
}
try {
	fout = new FileOutputStream("D:/fff1.txt");
} catch(FileNotFoundException e) {
	System.out.println("Error Opening Output 	File");
	return;
}

} catch(ArrayIndexOutOfBoundsException e) {
              System.out.println("Usage: CopyFile From To");
	return;
      }
try {
	do {
	i = fin.read();
	if(i != -1) fout.write(i);
	} while(i != -1);
} catch(IOException e) {
	System.out.println("File Error");
	}
	fin.close();
	fout.close();
}
}
