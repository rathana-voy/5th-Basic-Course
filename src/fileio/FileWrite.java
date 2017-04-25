package fileio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileWrite extends Thread {
	File file;
	String content;
	long startDuration;
	long endDuration;
	int loopRound;
	public FileWrite(File file ,String content,int loopRound) {
		// TODO Auto-generated constructor stubt
		this.file= file;
		this.content=content;
		this.loopRound=loopRound;
	}
	@Override
	public void run() {
		this.setStartDuration(System.currentTimeMillis());
		try(OutputStream ous=new FileOutputStream(this.file)){
			if(!file.exists()){
				file.createNewFile();
			}
			
			byte[] contents=new byte[1024];
			contents=this.content.getBytes();
			for(int i=0;i<this.loopRound;i++){ 
				ous.write(contents);
			}
			
		}catch(IOException io){
			io.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			this.setEndDuration(System.currentTimeMillis());
		}
	}
	
	
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public long getStartDuration() {
		return startDuration;
	}
	public void setStartDuration(long startDuration) {
		this.startDuration = startDuration;
	}
	public long getEndDuration() {
		return endDuration;
	}
	public void setEndDuration(long endDuration) {
		this.endDuration = endDuration;
	}
	
	
}
