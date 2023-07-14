package views;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class panel_pick extends JPanel{

	private Image i1=new ImageIcon("pick7.png").getImage();
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawImage(i1,0,0,null);	
	}
	
}
