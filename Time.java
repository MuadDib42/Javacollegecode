package a9b348;

public class Time {
	int hrs;
	int mins;
	public Time(int hr,int d){
		this.hrs=hr;
		this.mins=d;
	}
	public void addTime(int hr2,int min2) {
		this.hrs+=hr2;
		this.mins+=min2;
		while(this.mins>60) {
			this.mins=this.mins-60;
			this.hrs++;
		}
		System.out.println("Sum:"+this.hrs+":"+this.mins);
		
	}
	public void subTime(int hr2,int min2) {
		this.hrs-=hr2;
		this.mins-=min2;
		if(this.mins<0) {
			this.hrs--;
		}
		System.out.println("Difference:"+this.hrs+":"+this.mins);
		
	}
}
