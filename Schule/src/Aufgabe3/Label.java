package Aufgabe3;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class Label extends JLabel {

	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g) {

		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		g.drawImage(Var.ikoordinatensystem, 0, 0, 1000, 1000, null);
		g.drawImage(Var.ipunkt, Var.x, Var.y, 15, 15, null);

		g.setColor(new Color(0, 230, 155));
		g.setFont(new Font("Arial", Font.BOLD, 36));
		g.drawString("X: " + (Var.xx / 4), 30, 30);
		g.drawString("Y: " + (Var.yy / 4), 190, 30);
		
		g.setColor(new Color(0,0,0));
		g.setFont(new Font("Arial",Font.BOLD,12));
		g.drawString("Bitte geben Sie Zahlen im Bereich von -100 bis 100 an",1030,250);

		if (Var.Fehler == true) {
			g.setColor(new Color(255,0,0));
			g.setFont(new Font("Arial",Font.BOLD,12));
			g.drawString("Fehler! Die Eingabe übersteigt den Anwendungsbereich",1030,450);
		}

			repaint();

	}

}
