package views;

import javax.swing.*;
import java.awt.*;
import engine.Player;

public class winner_frame extends JFrame{
	private Image i0=new ImageIcon("logo icon.png").getImage();

	private Player p;
	private panel00 panel=new panel00();
	private JLabel label;
	
	public winner_frame(Player player) {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setTitle("Marvel Ultimate War");
		this.setFont(new Font("TIMES ROMAN",Font.BOLD,30));
		this.setIconImage(i0);
		this.setLayout(null);
		
		this.p=player;
		
		panel.setLayout(null);
		
		label = new JLabel("<html>"+p.getName() + "<b><FONT COLOR=WHITE> IS THE WINNER</FONT></b>" +"</html>");
		
		label.setFont(new Font("TIMES ROMAN",Font.ITALIC,60));
		
		label.setForeground(Color.black);
		
		label.setBounds(250,-50,1000,600);
	
		label.setHorizontalAlignment(JLabel.CENTER);
		
		panel.add(label);
		
		panel.setBounds(0,0,5000,5000);
		
		this.add(panel);
		this.setVisible(true);
	}
	
	
	
}
