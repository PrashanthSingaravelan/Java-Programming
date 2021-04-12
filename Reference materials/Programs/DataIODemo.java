/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Admin
 */
public class DataIODemo {
    public static void main(String args[]) throws IOException {
		FileOutputStream fout = new FileOutputStream("D:/fff.txt");
		DataOutputStream out = new DataOutputStream(fout);
		out.writeDouble(98.6);
		out.writeInt(1000);
		out.writeBoolean(true);
		out.close();
		FileInputStream fin = new FileInputStream("D:/fff.txt");
		DataInputStream in = new DataInputStream(fin);
		double d = in.readDouble();
		int i = in.readInt();
		boolean b = in.readBoolean();
		System.out.println("Here are the values: " +
		d + " " + i + " " + b);
		in.close();
	}

}
