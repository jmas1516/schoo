package player;

public class Sample14_3DVDPlayer implements Sample14_3ExPlayer{
	public void play() {
		System.out.println("■DVD再生");
	}
	public void stop() {
		System.out.println("■DVD再生終了");
	}
	public void slow() {
		System.out.println("■DVDスロー再生開始");
	}
}