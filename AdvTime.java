public class AdvTime extends Time {
	 int miliseconds;
	 int seconds;
	public AdvTime(int hr,int min,int sec,int ms) {
		super(hr,min);
		this.hrs=hr;
		this.mins=min;
		this.seconds=sec;
		this.miliseconds=ms;
	}

}
