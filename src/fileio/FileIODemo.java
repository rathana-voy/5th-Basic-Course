package fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIODemo {

	public static void main(String[] args) {
		/*
		//Path class
		Path path=Paths.get("E:\\path\\history\\");
		System.out.println("file name => "+path.getFileName());
		System.out.println("file Count => "+path.getNameCount());
		System.out.println(path.getParent());
		System.out.println(path.getRoot());*/
		
		
		//File class
		File f=new File("E:\\path\\history\\write_test.txt");
		/*
		//create dir
		if(!f.exists()){
			f.mkdirs();
		}
		*/
		
		//create file
		if(!f.exists()){
			try {
				f.createNewFile();
				System.out.println("create file success");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else System.out.println("file is exist");
		
		//rename file
		File ff= new File("E:\\path\\history\\write_test_2.txt");
		//f.renameTo(ff);
		f.delete();
		f.deleteOnExit();//delete file before program destroy
		
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getPath());
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		try {
			System.out.println(f.getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(f.getFreeSpace());
		System.out.println(f.getTotalSpace());
		
		
		/*// test write text to file
		try(OutputStream ous=new FileOutputStream(f)){
			long started=System.currentTimeMillis();
			long endLine=0;
			for(long i=0 ;i<1_000_000;i++){
				ous.write("-".getBytes());
				if(i<100) endLine=100;
				if(i==endLine){
					ous.write("\n".getBytes());
					endLine=i;
					continue;
				}
			}
			
			long ended=System.currentTimeMillis();
			System.out.println("start -> "+started);
			System.out.println("end -> "+ended);
			System.out.println(ended-started);
		}catch(IOException io){
			io.printStackTrace();
		}*/
		
		
		/*File threadFile=new File("E:\\path\\history\\tread.txt");
		FileWrite fileWrite =new FileWrite(threadFile, "Thread-0",1_000_000);
		FileWrite fileWrite1 =new FileWrite(threadFile, "Thread-1",1_000_000);
		
		fileWrite.start();
		fileWrite.yield();
		fileWrite1.start();
		fileWrite.yield();
		
		System.out.println();*/
		
		
		
	}
}
