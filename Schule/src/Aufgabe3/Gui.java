package Aufgabe3;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Gui {

	public Gui() {

		Var.jf1 = new JFrame();
		Var.jf1.setSize(Var.screenwidth, Var.screenheight);
		Var.jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Var.jf1.setLocationRelativeTo(null);
		Var.jf1.setLayout(null);
		Var.jf1.setTitle("Koordinatensystem");
		Var.jf1.setBackground(new Color(0,20,30));
		Var.jf1.setResizable(true);
		Var.jf1.addKeyListener(new KeyHandler());
		Var.jf1.requestFocus();
		Var.jf1.setVisible(true);

		Var.lbl1 = new Label();		
		Var.lbl1.setBounds(0, 0, Var.screenwidth, Var.screenheight);
		Var.lbl1.setVisible(true);
		Var.jf1.add(Var.lbl1);

		Var.xeingabe = new JTextField("X Coords");		
		Var.xeingabe.setBounds(1000, 300, 100, 30);
		Var.jf1.add(Var.xeingabe);
		
		
		Var.yeingabe = new JTextField("Y Coords");		
		Var.yeingabe.setBounds(1000,350,100,30);
		Var.jf1.add(Var.yeingabe);
	
		Var.jf1.requestFocus();
		
		Var.perform = new JButton("OK");		
		Var.perform.setBounds(1150,322,70,30);
		Var.perform.addActionListener(new Listener());
		Var.jf1.add(Var.perform);
		

	}
}