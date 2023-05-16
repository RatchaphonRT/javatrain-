package moblie;

public class Iphone extends SmartPhone implements Gps,MediaPlayer{

	@Override
	public String playSong(String songName) {
		// TODO Auto-generated method stub
		return "play music : " + songName;
	}

	@Override
	public String playVideo(String videoName) {
		// TODO Auto-generated method stub
		return "play music : " + videoName;
	}

	@Override
	public String getLocation() {
		// TODO Auto-generated method stub
		return "Location : Longtitude 13.925403 , Latitude  101.564284 ";
	}
	public void  installAppication(String appName) { 
		System.out.println("You install APP :"+ appName);
	}
}
