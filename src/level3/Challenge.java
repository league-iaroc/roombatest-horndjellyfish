package level3;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {
	driveDirect(500,500);
	sleep(2300);
	driveDirect(0,500);
	sleep(500);
	driveDirect(500,500);
	sleep(1800);
	driveDirect(500,0);
	sleep(500);
	driveDirect(500,500);
	sleep(2300);
	driveDirect(0,500);
	sleep(500);
	driveDirect(500,500);
	sleep(2000);
	driveDirect(500,0);
	sleep(500);
	driveDirect(500,500);
	
	}

	public void loop() {
	
	}
}
