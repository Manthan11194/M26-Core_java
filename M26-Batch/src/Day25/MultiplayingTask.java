package Day25;

import java.util.concurrent.Callable;

//callable interface
public class MultiplayingTask implements Callable{
	int x,y;
	long sleeptime;
	

	//constructor
	public MultiplayingTask(int x, int y, long sleeptime) {
		super();
		this.x = x;
		this.y = y;
		this.sleeptime = sleeptime;
	}


	@Override
	public Object call() throws Exception {
		Thread.sleep(sleeptime);
		return x*y;
	}

}
