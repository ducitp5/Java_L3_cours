package xv.EntreSorties;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
	
	static void run1() {
		
		FileInputStream fis;
		FileOutputStream fos;
		
		try {
			fis = new FileInputStream(new File("test.txt"));
			fos = new FileOutputStream(new File("test2.txt"));
			
			byte[] buf = new byte[8];
			int n;
			
			while ((n = fis.read(buf)) >= 0) {
				
				System.out.println("");

				fos.write(buf);
				for (byte bit : buf)
					System.out.print("\t" + bit + "(" + (char) bit + ")");
				System.out.println("");
			}
			fis.close();
			fos.close();
			System.out.println("Copie finis !");
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static void run2() {

		DataInputStream dis;
		DataOutputStream dos;
		
		try {
			dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File("sdz.txt"))));

			dos.writeBoolean(true);
			dos.writeByte(100);
			dos.writeChar('C');
			dos.writeDouble(12.05);
			dos.writeFloat(100.52f);
			dos.writeInt(1024);
			dos.writeLong(123456789654321L);
			dos.writeShort(2);
			dos.close();
			
			dis = new DataInputStream(new BufferedInputStream(new FileInputStream(new File("sdz.txt"))));
		
			System.out.println(dis.readBoolean());
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readDouble());
			System.out.println(dis.readFloat());
			System.out.println(dis.readInt());
			System.out.println(dis.readLong());
			System.out.println(dis.readShort());
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

//		run1();
		run2();

	}
}