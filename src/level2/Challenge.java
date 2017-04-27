package level2;

import level1.Sonar;
import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level2.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
		Sonar sonar = new Sonar(roomba);
	}

	public void initialize() {
		driveDirect(1000, 1000);
		sleep(1700);
		driveDirect(0, 900);
		sleep(300);
		driveDirect(1000, 1000);
		sleep(2500);
		driveDirect(1000,0);
		sleep(300);
		driveDirect(1000,1000);
	}

	public void loop() {

	}
}
