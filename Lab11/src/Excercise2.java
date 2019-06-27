import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Excercise2 {

	public static void main(String[] args) {
		ExecutorService es=Executors.newSingleThreadExecutor();
		es.execute(new Runnable() {

			@Override
			public void run() {
				try {
					System.out.println("Timer Started");
					for(int j=0;j<10;j++) {
					for(int i=0;i<10;i++) {
						System.out.println(i);
						Thread.sleep(1000);
					}
					}
					}catch (Exception e) {
					}
			}
			
		});

	}

}
