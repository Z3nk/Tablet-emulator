package widget;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

import tuio.*;
import mygeom.*;

public class MTSurface extends JPanel {
	
	
	public MTedt M;
	//public Path path;
	public MTSurface() {
		super();
		M=new MTedt(this);
		//path=new Path();
		setPreferredSize(new Dimension(490,460));
		setBackground(Color.blue);
		setBorder(BorderFactory.createLineBorder(Color.RED));
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		System.out.println("DRAW");
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.red);
		/*if(path.pointList.size()!=0) 
			path.draw(g2);*/
	
		// drawing instructions with g2.
	}
	
	public synchronized void addCursor(int id, Point2 p)
	{
		System.out.println("ADD => id "+id+ " Position : {" + p.getX() + ","+p.getY()+"}");
		/*if(id==0)
			path.addPoint(p);*/
		this.repaint();
		
	}
	
	public synchronized void updateCursor(int id, Point2 p)
	{
		if(id==0){
			
		System.out.println("UPDATE => id "+id+ " Position : {" + p.getX() + ","+p.getY()+"}");
		
			//path.addPoint(p);
			this.repaint();
		}
	}
	
	public synchronized void removeCursor(int id, Point2 p)
	{
		System.out.println("REMOVE => id "+id+ " Position : {" + p.getX() + ","+p.getY()+"}");
		//if(id==0)
			//path.addPoint(p);
		this.repaint();
	}

}
