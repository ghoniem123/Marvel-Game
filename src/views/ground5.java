package views;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ground5 extends JPanel{
private Image i=new ImageIcon("quantum.jpg").getImage();
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawImage(i,0,0,null);	
	}
	
	public Image GetImage() {
		return this.i;
	}
}
