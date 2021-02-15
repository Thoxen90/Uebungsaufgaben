package Aufgabe3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent f) {
		

		if (Integer.parseInt(Var.yeingabe.getText()) > 100 || Integer.parseInt(Var.yeingabe.getText()) < -100
				|| Integer.parseInt(Var.xeingabe.getText()) > 100 || Integer.parseInt(Var.xeingabe.getText()) < -100) {
			Var.tempy = 0;
			Var.tempx = 0;
			Var.Fehler = true;

		} else {
			Var.tempy = Integer.parseInt(Var.yeingabe.getText());
			Var.tempx = Integer.parseInt(Var.xeingabe.getText());
			Var.Fehler = false;
		}

		Var.yy = Var.tempy * 4;
		Var.xx = Var.tempx * 4;
		Var.x = Var.tempx * 4 + 473;
		Var.y = (Var.tempy * 4) * -1 + 512;

		Var.jf1.requestFocus();

	}

}
