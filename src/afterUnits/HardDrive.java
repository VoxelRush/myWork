package afterUnits;

import java.util.ArrayList;

public class HardDrive {
	
	private String name;
	private double capacity;
	private double freespace;
	private ArrayList <Double> file;
	
	public HardDrive(String xname, double xcapacity, double xfreespace) {
		name = xname;
		capacity = xcapacity;
		freespace = xfreespace;
	}
	public void addfile(double filesize) throws ArithmeticException { 
		if(filesize>freespace) {
			throw new ArithmeticException("Error");
		}
		else{ 
			file.add(filesize);
			freespace -= filesize;
		}
	}
	public void deletefile(int x) {
		file.remove(x);
	}
	public boolean isFull() {
		if(freespace = 0) 
		}
		
	}
}
