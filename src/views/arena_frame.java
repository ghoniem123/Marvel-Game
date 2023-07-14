package views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import engine.Player;

public class arena_frame extends JFrame implements ActionListener{
	private	 Image i2=new ImageIcon("logo icon.png").getImage();
    private Player p1;
    private Player p2;
	
    private JPanel panel1= new JPanel();
    private JPanel backpanel=new JPanel();
    private ground1 back1=new ground1();
    private ground2 back2=new ground2();
    private ground3 back3=new ground3();
    private ground4 back4=new ground4();
    private ground5 back5=new ground5();
    private ground6 back6=new ground6();
    
    private JLabel title=new JLabel("Choose the battle arena");
    
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JButton b5; 
    private JButton b6;
    
    
	public arena_frame(Player player1,Player player2) {
  
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	this.setTitle("Marvel Ultimate War");
	this.setFont(new Font("TIMES ROMAN",Font.BOLD,30));
	this.setIconImage(i2);	
	
	panel1.setLayout(null);
	this.p1=player1;
	this.p2=player2;
	
	title.setOpaque(true);
	title.setBackground(Color.black);
	title.setForeground(Color.white);
	title.setFont(new Font("Times Roman",Font.ITALIC,40));
	title.setHorizontalAlignment(JLabel.CENTER);
	
	title.setBounds(0,0,1600,60);
	
	backpanel.setBounds(0,60,1600,790);
	
    backpanel.setLayout(new GridLayout(2,3));
    
    back1.setLayout(null);
    back2.setLayout(null);
    back3.setLayout(null);
    back4.setLayout(null);
    back5.setLayout(null);
    back6.setLayout(null);

    
    b1=new JButton("City");
    b1.setBounds(150,345,230,40);
    b1.setFocusPainted(false);
    b1.setOpaque(false);
	b1.setContentAreaFilled(false);
	b1.setBorderPainted(true);
	b1.setFont(new Font("Times Roman",Font.BOLD,20));
	b1.setForeground(Color.white);
	
	    b2=new JButton("Final Battle");
	    b2.setBounds(170,345,230,40);
        b2.setFocusPainted(false);
	    b2.setOpaque(false);
		b2.setContentAreaFilled(false);
		b2.setBorderPainted(true);
		b2.setFont(new Font("Times Roman",Font.BOLD,20));
		b2.setForeground(Color.white);
		
		b3=new JButton("Mirror Dimension");
	    b3.setBounds(130,345,230,40);
        b3.setFocusPainted(false);
	    b3.setOpaque(false);
		b3.setContentAreaFilled(false);
		b3.setBorderPainted(true);
		b3.setFont(new Font("Times Roman",Font.BOLD,20));
		b3.setForeground(Color.white);	
		
		b4=new JButton("Asgard Bridge");
	    b4.setBounds(150,280,230,40);
        b4.setFocusPainted(false);
	    b4.setOpaque(false);
		b4.setContentAreaFilled(false);
		b4.setBorderPainted(true);
		b4.setFont(new Font("Times Roman",Font.BOLD,20));
		b4.setForeground(Color.white);	
		
		b5=new JButton("Quantum Realm");
	    b5.setBounds(170,280,230,40);
        b5.setFocusPainted(false);
	    b5.setOpaque(false);
		b5.setContentAreaFilled(false);
		b5.setBorderPainted(true);
		b5.setFont(new Font("Times Roman",Font.BOLD,20));
		b5.setForeground(Color.white);	
		
		b6=new JButton("The Kyln");
	    b6.setBounds(130,280,230,40);
        b6.setFocusPainted(false);
	    b6.setOpaque(false);
		b6.setContentAreaFilled(false);
		b6.setBorderPainted(true);
		b6.setFont(new Font("Times Roman",Font.BOLD,20));
		b6.setForeground(Color.white);	
    
    back1.add(b1);
    back2.add(b2);
    back3.add(b3);
    back4.add(b4);
    back5.add(b5);
    back6.add(b6);
    
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);

    
    
    backpanel.add(back1);
    backpanel.add(back2);
    backpanel.add(back3);
    backpanel.add(back4);
    backpanel.add(back5);
    backpanel.add(back6);
	
	panel1.add(backpanel);
    panel1.add(title);
	this.add(panel1);
	this.setVisible(true);
	
}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==b1) {
			new game_board(this.p1,this.p2,back1.GetImage());
			this.dispose();
		}
		else if (e.getSource()==b2) {
			new game_board(this.p1,this.p2,back2.GetImage());
			this.dispose();
		}
		else if(e.getSource()==b3) {
			new game_board(this.p1,this.p2,back3.GetImage());
			this.dispose();
		}
		else if(e.getSource()==b4) {
			new game_board(this.p1,this.p2,back4.GetImage());
			this.dispose();
		}
		else if (e.getSource()==b5) {
			new game_board(this.p1,this.p2,back5.GetImage());
			this.dispose();
		}
		else if (e.getSource()==b6) {
			new game_board(this.p1,this.p2,back6.GetImage());
			this.dispose();
		}
	}
}