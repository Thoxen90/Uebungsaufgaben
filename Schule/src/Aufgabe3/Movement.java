package Aufgabe3;

import java.util.Timer;
import java.util.TimerTask;

public class Movement {
	Timer movement;

	public Movement() {
		// TODO Auto-generated constructor stub
		movement = new Timer();
		movement.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {

				if (Var.moveup == true) {
					if (Var.y > 112) {
						Var.y -= Var.speed;
						Var.yy += Var.speed;
					}
				} else if (Var.movedown == true) {
					if (Var.y <= 911) {
						Var.y += Var.speed;
						Var.yy -= Var.speed;
					}
				}

				if (Var.moveleft == true) {
					if (Var.x > 73) {
						Var.x -= Var.speed;
						Var.xx -= Var.speed;
					}
				} else if (Var.moveright == true) {
					if (Var.x <= 872) {
						Var.x += Var.speed;
						Var.xx += Var.speed;
					}
				}

			}

		}, 0, 9);
	}
}
