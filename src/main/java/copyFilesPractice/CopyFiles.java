package copyFilesPractice;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFiles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			File[] fileDir =  new File("D:/pic").listFiles();
			File f2 = new File("D:/pic/S");
			f2.mkdir();
			Path destination =  Paths.get(f2.getAbsolutePath());
			List<File> files = new ArrayList<File>();
		for(File f : fileDir){
			if (f.isDirectory()){
				for(File pic :f.listFiles()){
					if(!pic.isDirectory())
					files.add(pic);
				}				
				
			}
			
		}
		System.out.println(files.size());
		 int count=0;
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(f2);
			BufferedOutputStream bos = new BufferedOutputStream(fileOutputStream);

	
		for(File file:files){
			FileInputStream fileInputStream;
			
			
				fileInputStream = new FileInputStream(file);
				bos.write(fileInputStream.read());
				count++;
		}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(count);
		
		
		/*
		String[] directories = file.list(new FilenameFilter() {
		  @Override
		  public boolean accept(File current, String name) {
		    return new File(current, name).isDirectory();
		  }
		});
		System.out.println(Arrays.toString(directories));
		for(String s:directories){
			File f1 = new File("D:/pic/"+s);
			File f2 = new File("D:/pic");
			 FileInputStream fileInputStream;
			try {
				fileInputStream = new FileInputStream(f1);
			
			 FileOutputStream fileOutputStream = new FileOutputStream(f2);
			 int n;
			 while ((n = fileInputStream.read()) != -1) {
				 fileOutputStream.write(n);
				  }
			 fileInputStream.close();
		        fileOutputStream.close();
			} 

			
			String[] files = f1.list();
			System.out.println(files);
		}*/

	}

}
