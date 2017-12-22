package com.app.client.view;

import java.awt.BorderLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class Accueil extends JFrame implements ActionListener {

	private Box verticalBox = Box.createVerticalBox();
	JMenuBar menu = new JMenuBar();
	JMenu m1= new JMenu("hhh");
	JMenu m2= new JMenu("xx");
	JMenu m3= new JMenu("sss");
	Panel p= new Panel();
	
	public Accueil() {
		menu.add(m1);
		menu.add(m2);
		menu.add(m3);
		p.add(menu, BorderLayout.CENTER);
		p.setVisible(true);
		this.add(p);
		this.setVisible(true);

	}

	
	public void actionPerformed(ActionEvent e) {

	}

}
