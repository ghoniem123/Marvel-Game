package views;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import engine.Controller;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class starter_frame extends JFrame implements ActionListener {
private Image i=new ImageIcon("back2.png").getImage();
private Image i2=new ImageIcon("logo icon.png").getImage();
private JButton start;

	public starter_frame( ) {
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setExtendedState(JFrame.MAXIMIZED_BOTH);
			this.setTitle("Marvel Ultimate War");
			this.setFont(new Font("TIMES ROMAN",Font.BOLD,30));
			this.setIconImage(i2);
				
	   this.setLayout(null);
				
	   start=new JButton("Start");
	   
	   start.setBounds(725,700,100,40);
	   start.setFocusPainted(false);
	   start.setFont(new Font("Arial",Font.ITALIC,20));
	   
	   start.setOpaque(true);
	   start.setBackground(Color.black);
	   start.setForeground(Color.white);
	   
	   start.addActionListener(this);
	   start.setActionCommand("start");
	   
		this.add(start);
		this.setVisible(true);
	}
	

	public void paint(Graphics g) {
		Graphics2D g2=(Graphics2D)g;	
		g2.drawImage(i,0,0,null);	
	}

	
	public void actionPerformed(ActionEvent e) {
        if (e.getSource()==start) {
        	new name_frame();
        	this.dispose();
        }
	}
	
}
