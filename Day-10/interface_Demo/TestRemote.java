package interface_Demo;

public class TestRemote {
	public static void main(String[] args) {
		RemoteDevice r1  = new Tv();
		r1.switchOn();
		r1.switchOff();
		
		RemoteDevice r2  = new Dvdplayer();
		r2.switchOn();
		r2.switchOff();
	}
}
