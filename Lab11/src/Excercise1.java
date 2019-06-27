import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Excercise1 {

	public static void main(String[] args) {
			ExecutorService es = Executors.newFixedThreadPool(10);
			es.execute(new Runnable() {
				public void run() {
					try{BufferedReader bf=new BufferedReader(new FileReader("D:\\Users\\sbigasia\\Desktop\\source.txt"));
					BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\Users\\sbigasia\\Desktop\\target.txt"));
					int c=bf.read();
					int count=0;
					while(c!=-1) {
						if(count==10) {
							System.out.println("10 characters are copied");
							Thread.sleep(5000);
							count=0;
						}
						Character c1=(char) c;
						bw.write(c1);
						c=bf.read();
						count++;
					}
					bw.flush();
					bw.close();
					System.out.println("File Copied");
					}
					catch (Exception e) {
						e.printStackTrace();
					}
				}
			});

	}

}
