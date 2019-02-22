package afterUnits;

import java.util.ArrayList;

public class HardDrive {
//There might be an error with the add file method, ask someone
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
			throw new ArithmeticException("Error, can't exceed space");
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
		if(freespace == 0) {
			System.out.println("The Hard Drive is Full");
			return true;
		}
		else
		return false;
	}
	public boolean isEmpty() {
		if(freespace == capacity) {
			System.out.println("The Hard Drive is Empty");
			return true;
		}
		else
		return false;
	}
}
