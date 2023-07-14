package views;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ground6 extends JPanel{
private Image i=new ImageIcon("prison.jpg").getImage();
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawImage(i,0,0,null);	
	}
	
	public Image GetImage() {
		return this.i;
	}
}
