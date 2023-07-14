package views;
import javax.swing.*;
import java.awt.*;

public class mypanel extends JPanel{
	Image i=new ImageIcon("f2.png").getImage();

	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawImage(i,0,0,null);	
	}
	
}
