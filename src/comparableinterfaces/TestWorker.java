package comparableinterfaces;
import java.util.Random;
public class TestWorker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		WorkerStart[]test = new WorkerStart[100];
		int min = 0;
		int max = 100;
		
		for(int z = 0; z < test.length; z++) {
			int random1 =  min + generator.nextInt(max-min+1);
			int random2 =  min + generator.nextInt(max-min+1);
			test[z] = new WorkerStart(random1, random2);
		}
		WorkerStart smallest = test[0];
		WorkerStart largest = test[0];
		
		for (int x = 0; x < test.length; x++) {
			if(smallest.compareTo(test[x])<0) {
				smallest = test[x];
			}
		}
		
		for(int y = 0; y < test.length; y++) {
			if(largest.compareTo(test[y])>0) {
				largest = test[y];
			}
		}
		
		System.out.println(smallest.toString());
		System.out.println(largest.toString());
		}
	}


