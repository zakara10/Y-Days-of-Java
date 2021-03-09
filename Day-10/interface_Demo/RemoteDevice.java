package interface_Demo;

public interface RemoteDevice {
	public void switchOn();
	public void switchOff();
}

class Tv implements RemoteDevice{
	public void switchOn() {
		System.out.println("--TV ON--");
	}
	public void switchOff() {
		System.out.println("--TV OFF--");
	}
}

class Dvdplayer implements RemoteDevice{
	public void switchOn() {
		System.out.println("--DVD Player ON--");
	}
	public void switchOff() {
		System.out.println("--DVD Player OFF--");
	}
}
