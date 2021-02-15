package Aufgabe3;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Var {

	static Label lbl1;
	static JFrame jf1;
	static int screenwidth = 1400, screenheight = 1025;
	static boolean moveup = false, movedown = false, moveleft = false, moveright = false;
	static int x = 473, y = 512;
	static BufferedImage ipunkt, ikoordinatensystem;
	static int speed = 1;
	static double xx = 0, yy = 0;
	static JTextField xeingabe, yeingabe;
	static JButton perform;
	static int tempx, tempy=0;
	static boolean Fehler = false;

	public Var() {
		try {
			ipunkt = ImageIO.read(new File("rsc/punkt.png"));
			ikoordinatensystem = ImageIO.read(new File("rsc/koordinaten.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Bilder konnten nicht geladen werden");
		}
	}

}