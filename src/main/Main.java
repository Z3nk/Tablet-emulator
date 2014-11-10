package main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import widget.*;
import tuio.*;

public class Main {

	public static void main(String args[]) {
		
		
		SwingUtilities.invokeLater(new Runnable() {
		    public void run() {
		        createAndShowGUI();
		    }
		});
		System.out.println("ok");
	}	
	
	public static void createAndShowGUI()
	{

	JFrame f = new JFrame("Ma Fenetre");
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setLayout(new FlowLayout());
	f.setPreferredSize(new Dimension(500,500));
	JButton b=new JButton("Activer");
	f.add(b);
	
	b.addActionListener(new ActionListener() {
		  public void actionPerformed(ActionEvent evt) {
		    	
		  }
		});
	
	f.add(new MTSurface());
	f.pack();
	f.setVisible(true);
	}
}
