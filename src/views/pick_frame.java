package views;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.MouseListener;
import javax.swing.*;

import engine.Controller;
import engine.Player;
import model.abilities.Ability;
import model.abilities.AreaOfEffect;
import model.abilities.CrowdControlAbility;
import model.abilities.DamagingAbility;
import model.abilities.HealingAbility;
import model.effects.Disarm;
import model.effects.Dodge;
import model.effects.Effect;
import model.effects.Embrace;
import model.effects.PowerUp;
import model.effects.Root;
import model.effects.Shield;
import model.effects.Shock;
import model.effects.Silence;
import model.effects.SpeedUp;
import model.effects.Stun;
import model.world.AntiHero;
import model.world.Champion;
import model.world.Hero;
import model.world.Villain;

public class pick_frame extends JFrame implements MouseListener, ActionListener{
	
	private int i=0;
	private boolean firstturn=true;
	private Image i0=new ImageIcon("logo icon.png").getImage();
	
	
	private	 panel_pick p1=new panel_pick();
	private JPanel p2=new JPanel();
	private JPanel p3= new JPanel();
   	private JPanel p4= new JPanel();

	 private	 JLabel l1=new JLabel("       FIRST PLAYER TEAM (the first champion chosen is the leader)");
	 private JLabel l2=new JLabel("   SECOND PLAYER TEAM (the first champion chosen is the leader)");
	 private	 JLabel l3=new JLabel("                                                                                      Champion's attributes and abilities");
     private JLabel l31=new JLabel();
	 
	 private	 JButton b1=new JButton("Captain America");
	 private     JButton b2=new JButton("Electro");
	 private     JButton b3=new JButton("Hulk");
	 private     JButton b4=new JButton("Loki");
	 private     JButton b5=new JButton("Thor"); 
	 private	 JButton b6=new JButton("Deadpool");
	 private	 JButton b7=new JButton("Ghost Rider");
	 private	 JButton b8=new JButton("Iceman");
	 private	 JButton b9=new JButton("Quicksilver");
	 private	 JButton b10=new JButton("Venom");
	 private	 JButton b11=new JButton("Dr Strange");
	 private	 JButton b12=new JButton("Hela");
	 private	 JButton b13=new JButton("Ironman");
	 private	 JButton b14=new JButton("Spiderman");
	 private	 JButton b15=new JButton("Yellow Jacket");
	 private	 JButton b16=new JButton("Leader");
	 private	 JButton b17=new JButton();
	 private	 JButton b18=new JButton();
	 private	 JButton b19=new JButton("Leader");
	 private	 JButton b20=new JButton();
	 private	 JButton b21=new JButton();
	 
	 private static ArrayList<Champion> availableChampions = new ArrayList<Champion>();
	 private static ArrayList<Ability> availableAbilities = new ArrayList<Ability>();
	 
	
	 private  Player player1;
	 private  Player player2;
	 	 
	public pick_frame( String name1,String name2) {
				
	
		this.player1 = new Player(name1);
		this.player2=new Player(name2);
		
		try {
			this.availableAbilities=loadAbilities("Abilities.csv");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		try {
			this.availableChampions=loadChampions("Champions.csv");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		JOptionPane.showMessageDialog(null, "The first player picks first then the second player , the picking turns alternate till both of you have 3 Champions ,a champion can be only picked once !  ", 
				"Picking teams rules", JOptionPane.INFORMATION_MESSAGE, null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setTitle("Marvel Ultimate War");
		this.setFont(new Font("TIMES ROMAN",Font.BOLD,30));
		this.setIconImage(i0);
		
		 b1.setFocusPainted(false);
		 b2.setFocusPainted(false);
		 b3.setFocusPainted(false);
		 b4.setFocusPainted(false); 
		 b5.setFocusPainted(false);
		 b6.setFocusPainted(false);
		 b7.setFocusPainted(false);
		 b8.setFocusPainted(false); 
		 b9.setFocusPainted(false);
		 b10.setFocusPainted(false);
		 b11.setFocusPainted(false);
		 b12.setFocusPainted(false);
		 b13.setFocusPainted(false);
		 b14.setFocusPainted(false);
		 b15.setFocusPainted(false);
		 b16.setFocusPainted(false);
		 b17.setFocusPainted(false);
		 b18.setFocusPainted(false);
		 b19.setFocusPainted(false);
		 b20.setFocusPainted(false);
		 b21.setFocusPainted(false);
       
		 
		b1.setOpaque(false);
		b1.setContentAreaFilled(false);
		b1.setBorderPainted(true);
		 
		b2.setOpaque(false);
		b2.setContentAreaFilled(false);
		b2.setBorderPainted(true);
		
		b3.setOpaque(false);
		b3.setContentAreaFilled(false);
		b3.setBorderPainted(true);
		
		b4.setOpaque(false);
		b4.setContentAreaFilled(false);
		b4.setBorderPainted(true);
		
		b5.setOpaque(false);
		b5.setContentAreaFilled(false);
		b5.setBorderPainted(true);
		
		b6.setOpaque(false);
		b6.setContentAreaFilled(false);
		b6.setBorderPainted(true);
		
		b7.setOpaque(false);
		b7.setContentAreaFilled(false);
		b7.setBorderPainted(true);
		
		b8.setOpaque(false);
		b8.setContentAreaFilled(false);
		b8.setBorderPainted(true);
		
		b9.setOpaque(false);
		b9.setContentAreaFilled(false);
		b9.setBorderPainted(true);
		
		b10.setOpaque(false);
		b10.setContentAreaFilled(false);
		b10.setBorderPainted(true);
		
		b11.setOpaque(false);
		b11.setContentAreaFilled(false);
		b11.setBorderPainted(true);
		
		b12.setOpaque(false);
		b12.setContentAreaFilled(false);
		b12.setBorderPainted(true);
		
		b13.setOpaque(false);
		b13.setContentAreaFilled(false);
		b13.setBorderPainted(true);
		
		b14.setOpaque(false);
		b14.setContentAreaFilled(false);
		b14.setBorderPainted(true);
		
		b15.setOpaque(false);
		b15.setContentAreaFilled(false);
		b15.setBorderPainted(true);
		
		b16.setBackground(Color.black);
		b17.setBackground(Color.black);
		b18.setBackground(Color.black);
		b19.setBackground(Color.black);
		b20.setBackground(Color.black);
		b21.setBackground(Color.black);

		b1.setForeground(Color.white);
		b2.setForeground(Color.white);
		b3.setForeground(Color.white);	 
		b4.setForeground(Color.white);
		b5.setForeground(Color.white);	 
		b6.setForeground(Color.white);
		b7.setForeground(Color.white);
		b8.setForeground(Color.white);
		b9.setForeground(Color.white);
		b10.setForeground(Color.white);
		b11.setForeground(Color.white);
		b12.setForeground(Color.white);
		b13.setForeground(Color.white);
		b14.setForeground(Color.white);
		b15.setForeground(Color.white);
		
		b16.setForeground(Color.white);
		b17.setForeground(Color.white);
		b18.setForeground(Color.white);
		b19.setForeground(Color.white);
		b20.setForeground(Color.white);
		b21.setForeground(Color.white);
		  
		 
		this.setLayout(null);
		p1.setLayout(new GridLayout(3,5));
		p2.setLayout(null);
		p4.setLayout(null);
		p3.setLayout(null);
		
		p1.setBounds(0,0,1600,400);
		
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p1.add(b5);
		p1.add(b6);
		p1.add(b7);	
		p1.add(b8);
		p1.add(b9);
		p1.add(b10);
		p1.add(b11);
		p1.add(b12);
		p1.add(b13);
		p1.add(b14);
		p1.add(b15);
	                                   
		
		l1.setBounds(0,0,400,50);
		l2.setBounds(0,0,420,50);
		l3.setBounds(0,0,750,50);
	    l31.setBounds(0,50,750,400);	
	
		l1.setOpaque(true);
		l2.setOpaque(true);
		l3.setOpaque(true);
		l31.setOpaque(true);
		
		l1.setBackground(Color.black);
		l2.setBackground(Color.black);
		l3.setBackground(Color.black);
		l31.setBackground(Color.white);

		l1.setForeground(Color.red);
		l2.setForeground(Color.red);
		l3.setForeground(Color.white);
		l31.setForeground(Color.gray);
				
		l31.setFont(new Font("Times Roman",Font.BOLD,25));

		p2.add(l1);
		p4.add(l2);
		p3.add(l3);
		p3.add(l31);
		
		p2.setBackground(Color.red);
		p4.setBackground(Color.red);
		
		p2.setBounds(0,400,400,500);
		p4.setBounds(1150,400,400,500);
		p3.setBounds(400,400,750,500);

		p2.setBorder(BorderFactory.createLineBorder(Color.black));
		p4.setBorder(BorderFactory.createLineBorder(Color.black));
		p3.setBorder(BorderFactory.createLineBorder(Color.black));
		
		b16.setBounds(110,60,200,100);
		b17.setBounds(110,170,200,100);
		b18.setBounds(110,280,200,100);
		
		b19.setBounds(110,60,200,100);
		b20.setBounds(110,170,200,100);
		b21.setBounds(110,280,200,100);
		
		p2.add(b16);
		p2.add(b17);
		p2.add(b18);
		
		p4.add(b19);
		p4.add(b20);
		p4.add(b21);
		
	    b1.addActionListener(this);
	    b2.addActionListener(this);
	    b3.addActionListener(this);
	    b4.addActionListener(this);
	    b5.addActionListener(this);
	    b6.addActionListener(this);
	    b7.addActionListener(this);
	    b8.addActionListener(this);
	    b9.addActionListener(this);
	    b10.addActionListener(this);
	    b11.addActionListener(this);
	    b12.addActionListener(this);
	    b13.addActionListener(this);
	    b14.addActionListener(this);
	    b15.addActionListener(this);
	    
	    b1.addMouseListener(this);
	    b2.addMouseListener(this);
	    b3.addMouseListener(this);
	    b4.addMouseListener(this);
	    b5.addMouseListener(this);
	    b6.addMouseListener(this);
	    b7.addMouseListener(this);
	    b8.addMouseListener(this);
	    b9.addMouseListener(this);
	    b10.addMouseListener(this);
	    b11.addMouseListener(this);
	    b12.addMouseListener(this);
	    b13.addMouseListener(this);
	    b14.addMouseListener(this);
	    b15.addMouseListener(this);
	    
		
		
		this.add(p1);
		this.add(p2);
		this.add(p4);
		this.add(p3);
		
		this.setVisible(true);
	}
	

	public Player getPlayer1() {
			return player1;
		}


		public void setPlayer1(Player player1) {
			this.player1 = player1;
		}


		public Player getPlayer2() {
			return player2;
		}


		public void setPlayer2(Player player2) {
			this.player2 = player2;
		}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (firstturn) {
			if (e.getSource()==b1) {
				
				
				this.info(b1);
				
				if (b16.getText().equals("Leader")) {
					b16.setText(b1.getText());
					                                   
				}
				else if (b17.getText().isEmpty()) {
					b17.setText(b1.getText());
				}
				else if (b18.getText().isEmpty()) {
					b18.setText(b1.getText());
				}
				b1.setEnabled(false);
				firstturn=!firstturn;
				i=i+1;
			}
			else if (e.getSource()==b2) {
				if (b16.getText().equals("Leader")) {
					b16.setText(b2.getText());
				}
				else if (b17.getText().isEmpty()) {
					b17.setText(b2.getText());
				}
				else if (b18.getText().isEmpty()) {
					b18.setText(b2.getText());
				}
				b2.setEnabled(false);
				firstturn=!firstturn;
				i=i+1;
			}
			else if (e.getSource()==b3) {
				if (b16.getText().equals("Leader")) {
					b16.setText(b3.getText());
				}
				else if (b17.getText().isEmpty()) {
					b17.setText(b3.getText());
				}
				else if (b18.getText().isEmpty()) {
					b18.setText(b3.getText());
				}
				b3.setEnabled(false);
				firstturn=!firstturn;
				i=i+1;
			}
			else if (e.getSource()==b4) {
				if (b16.getText().equals("Leader")) {
					b16.setText(b4.getText());
				}
				else if (b17.getText().isEmpty()) {
					b17.setText(b4.getText());
				}
				else if (b18.getText().isEmpty()) {
					b18.setText(b4.getText());
				}
				b4.setEnabled(false);
				firstturn=!firstturn;
				i=i+1;
			}
			else 	if (e.getSource()==b5) {
				if (b16.getText().equals("Leader")) {
					b16.setText(b5.getText());
				}
				else if (b17.getText().isEmpty()) {
					b17.setText(b5.getText());
				}
				else if (b18.getText().isEmpty()) {
					b18.setText(b5.getText());
				}
				b5.setEnabled(false);
				firstturn=!firstturn;
				i=i+1;
			}
			else 	if (e.getSource()==b6) {
				if (b16.getText().equals("Leader")) {
					b16.setText(b6.getText());
				}
				else if (b17.getText().isEmpty()) {
					b17.setText(b6.getText());
				}
				else if (b18.getText().isEmpty()) {
					b18.setText(b6.getText());
				}
				b6.setEnabled(false);
				firstturn=!firstturn;
				i=i+1;
			}
			else 	if (e.getSource()==b7) {
				if (b16.getText().equals("Leader")) {
					b16.setText(b7.getText());
				}
				else if (b17.getText().isEmpty()) {
					b17.setText(b7.getText());
				}
				else if (b18.getText().isEmpty()) {
					b18.setText(b7.getText());
				}
				b7.setEnabled(false);
				firstturn=!firstturn;
				i=i+1;
			}
			else 	if (e.getSource()==b8) {
				if (b16.getText().equals("Leader")) {
					b16.setText(b8.getText());
				}
				else if (b17.getText().isEmpty()) {
					b17.setText(b8.getText());
				}
				else if (b18.getText().isEmpty()) {
					b18.setText(b8.getText());
				}
				b8.setEnabled(false);
				firstturn=!firstturn;
				i=i+1;
			}
			else 	if (e.getSource()==b9) {
				if (b16.getText().equals("Leader")) {
					b16.setText(b9.getText());
				}
				else if (b17.getText().isEmpty()) {
					b17.setText(b9.getText());
				}
				else if (b18.getText().isEmpty()) {
					b18.setText(b9.getText());
				}
				b9.setEnabled(false);
				firstturn=!firstturn;
				i=i+1;
			}
			else 	if (e.getSource()==b10) {
				if (b16.getText().equals("Leader")) {
					b16.setText(b10.getText());
				}
				else if (b17.getText().isEmpty()) {
					b17.setText(b10.getText());
				}
				else if (b18.getText().isEmpty()) {
					b18.setText(b10.getText());
				}
				b10.setEnabled(false);
				firstturn=!firstturn;
				i=i+1;
			}
			else 	if (e.getSource()==b11) {
				if (b16.getText().equals("Leader")) {
					b16.setText(b11.getText());
				}
				else if (b17.getText().isEmpty()) {
					b17.setText(b11.getText());
				}
				else if (b18.getText().isEmpty()) {
					b18.setText(b11.getText());
				}
				b11.setEnabled(false);
				firstturn=!firstturn;
				i=i+1;
			}
			else if (e.getSource()==b12) {
				if (b16.getText().equals("Leader")) {
					b16.setText(b12.getText());
				}
				else if (b17.getText().isEmpty()) {
					b17.setText(b12.getText());
				}
				else if (b18.getText().isEmpty()) {
					b18.setText(b12.getText());
				}
				b12.setEnabled(false);
				firstturn=!firstturn;
				i=i+1;
			}
			else 	if (e.getSource()==b13) {
				if (b16.getText().equals("Leader")) {
					b16.setText(b13.getText());
				}
				else if (b17.getText().isEmpty()) {
					b17.setText(b13.getText());
				}
				else if (b18.getText().isEmpty()) {
					b18.setText(b13.getText());
				}
				b13.setEnabled(false);
				firstturn=!firstturn;
				i=i+1;
			}
			else 	if (e.getSource()==b14) {
				if (b16.getText().equals("Leader")) {
					b16.setText(b14.getText());
				}
				else if (b17.getText().isEmpty()) {
					b17.setText(b14.getText());
				}
				else if (b18.getText().isEmpty()) {
					b18.setText(b14.getText());
				}
				b14.setEnabled(false);
				firstturn=!firstturn;
				i=i+1;
			}
			else 	if (e.getSource()==b15) {
				if (b16.getText().equals("Leader")) {
					b16.setText(b15.getText());
				}
				else if (b17.getText().isEmpty()) {
					b17.setText(b15.getText());
				}
				else if (b18.getText().isEmpty()) {
					b18.setText(b15.getText());
				}
				b15.setEnabled(false);
				firstturn=!firstturn;
				i=i+1;
			}
			if (i==6) {
				this.createfirstplayer();
				this.createsecondplayer();
				
					new arena_frame(this.player1,this.player2);
					this.dispose();
				}
		}
		else {
			if (e.getSource()==b1) {
				if (b19.getText().equals("Leader")) {
					b19.setText(b1.getText());
				}
				else if (b20.getText().isEmpty()) {
					b20.setText(b1.getText());
				}
				else if (b21.getText().isEmpty()) {
					b21.setText(b1.getText());
				}
				b1.setEnabled(false);
				firstturn=!firstturn;
				i=i+1;
			}
			else if (e.getSource()==b2) {
				if (b19.getText().equals("Leader")) {
					b19.setText(b2.getText());
				}
				else if (b20.getText().isEmpty()) {
					b20.setText(b2.getText());
				}
				else if (b21.getText().isEmpty()) {
					b21.setText(b2.getText());
				}
				b2.setEnabled(false);
				firstturn=!firstturn;
				i=i+1;
			}
			else if (e.getSource()==b3) {
				if (b19.getText().equals("Leader")) {
					b19.setText(b3.getText());
				}
				else if (b20.getText().isEmpty()) {
					b20.setText(b3.getText());
				}
				else if (b21.getText().isEmpty()) {
					b21.setText(b3.getText());
				}
				b3.setEnabled(false);
				firstturn=!firstturn;
				i=i+1;
			}
			else if (e.getSource()==b4) {
				if (b19.getText().equals("Leader")) {
					b19.setText(b4.getText());
				}
				else if (b20.getText().isEmpty()) {
					b20.setText(b4.getText());
				}
				else if (b21.getText().isEmpty()) {
					b21.setText(b4.getText());
				}
				b4.setEnabled(false);
				firstturn=!firstturn;
				i=i+1;
			}
			else 	if (e.getSource()==b5) {
				if (b19.getText().equals("Leader")) {
					b19.setText(b5.getText());
				}
				else if (b20.getText().isEmpty()) {
					b20.setText(b5.getText());
				}
				else if (b21.getText().isEmpty()) {
					b21.setText(b5.getText());
				}
				b5.setEnabled(false);
				firstturn=!firstturn;
				i=i+1;
			}
			else 	if (e.getSource()==b6) {
				if (b19.getText().equals("Leader")) {
					b19.setText(b6.getText());
				}
				else if (b20.getText().isEmpty()) {
					b20.setText(b6.getText());
				}
				else if (b21.getText().isEmpty()) {
					b21.setText(b6.getText());
				}
				b6.setEnabled(false);
				firstturn=!firstturn;
				i=i+1;
			}
			else 	if (e.getSource()==b7) {
				if (b19.getText().equals("Leader")) {
					b19.setText(b7.getText());
				}
				else if (b20.getText().isEmpty()) {
					b20.setText(b7.getText());
				}
				else if (b21.getText().isEmpty()) {
					b21.setText(b7.getText());
				}
				b7.setEnabled(false);
				firstturn=!firstturn;
				i=i+1;
			}
			else 	if (e.getSource()==b8) {
				if (b19.getText().equals("Leader")) {
					b19.setText(b8.getText());
				}
				else if (b20.getText().isEmpty()) {
					b20.setText(b8.getText());
				}
				else if (b21.getText().isEmpty()) {
					b21.setText(b8.getText());
				}
				b8.setEnabled(false);
				firstturn=!firstturn;
				i=i+1;
			}
			else 	if (e.getSource()==b9) {
				if (b19.getText().equals("Leader")) {
					b19.setText(b9.getText());
				}
				else if (b20.getText().isEmpty()) {
					b20.setText(b9.getText());
				}
				else if (b21.getText().isEmpty()) {
					b21.setText(b9.getText());
				}
				b9.setEnabled(false);
				firstturn=!firstturn;
				i=i+1;
			}
			else 	if (e.getSource()==b10) {
				if (b19.getText().equals("Leader")) {
					b19.setText(b10.getText());
				}
				else if (b20.getText().isEmpty()) {
					b20.setText(b10.getText());
				}
				else if (b21.getText().isEmpty()) {
					b21.setText(b10.getText());
				}
				b10.setEnabled(false);
				firstturn=!firstturn;
				i=i+1;
			}
			else 	if (e.getSource()==b11) {
				if (b19.getText().equals("Leader")) {
					b19.setText(b11.getText());
				}
				else if (b20.getText().isEmpty()) {
					b20.setText(b11.getText());
				}
				else if (b21.getText().isEmpty()) {
					b21.setText(b11.getText());
				}
				b11.setEnabled(false);
				firstturn=!firstturn;
				i=i+1;
			}
			else if (e.getSource()==b12) {
				if (b19.getText().equals("Leader")) {
					b19.setText(b12.getText());
				}
				else if (b20.getText().isEmpty()) {
					b20.setText(b12.getText());
				}
				else if (b21.getText().isEmpty()) {
					b21.setText(b12.getText());
				}
				b12.setEnabled(false);
				firstturn=!firstturn;
				i=i+1;
			}
			else 	if (e.getSource()==b13) {
				if (b19.getText().equals("Leader")) {
					b19.setText(b13.getText());
				}
				else if (b20.getText().isEmpty()) {
					b20.setText(b13.getText());
				}
				else if (b21.getText().isEmpty()) {
					b21.setText(b13.getText());
				}
				b13.setEnabled(false);
				firstturn=!firstturn;
				i=i+1;
			}
			else 	if (e.getSource()==b14) {
				if (b19.getText().equals("Leader")) {
					b19.setText(b14.getText());
				}
				else if (b20.getText().isEmpty()) {
					b20.setText(b14.getText());
				}
				else if (b21.getText().isEmpty()) {
					b21.setText(b14.getText());
				}
				b14.setEnabled(false);
				firstturn=!firstturn;
				i=i+1;
			}
			else 	if (e.getSource()==b15) {
				if (b19.getText().equals("Leader")) {
					b19.setText(b15.getText());
				}
				else if (b20.getText().isEmpty()) {
					b20.setText(b15.getText());
				}
				else if (b21.getText().isEmpty()) {
					b21.setText(b15.getText());
				}
				b15.setEnabled(false);
				firstturn=!firstturn;
				i=i+1;
			}
			if (i==6) {
				this.createfirstplayer();
				this.createsecondplayer();
				
				new arena_frame(this.player1,this.player2);
				
					this.dispose();
				}
		}
		
	}
	
	
	public void createfirstplayer( ) {
		String leader=b16.getText();
		String champ1 =b17.getText();
		String champ2= b18.getText();
		
		for (int i=0;i<this.availableChampions.size();i++) {
			Champion c=this.availableChampions.get(i);
			if (c.getName().equals(leader)) {
				this.player1.getTeam().add(c);
				this.player1.setLeader(c);	
			}
			else if (c.getName().equals(champ1)) {
				this.player1.getTeam().add(c);		
			}
			else if (c.getName().equals(champ2)) {
				this.player1.getTeam().add(c);		
			}
		}
		
	}
	public void createsecondplayer() {
	
		String leader=b19.getText();
		String champ1 =b20.getText();
		String champ2= b21.getText();
		
		for (int i=0;i<this.availableChampions.size();i++) {
			Champion c=this.availableChampions.get(i);
			if (c.getName().equals(leader)) {
				this.player2.getTeam().add(c);
				this.player2.setLeader(c);	
			}
			else if (c.getName().equals(champ1)) {
				this.player2.getTeam().add(c);		
			}
			else if (c.getName().equals(champ2)) {
				this.player2.getTeam().add(c);		
			}
		}
	}
	
	public static ArrayList<Champion> loadChampions(String filepath) throws IOException {
		ArrayList<Champion> availableChampions = new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader(filepath));
		String line = br.readLine();
		while (line != null) {
			String[] content = line.split(",");
			if (content[0].equals("H")) {
				Hero h = new Hero(content[1], Integer.parseInt(content[2]), Integer.parseInt(content[3]),
						Integer.parseInt(content[4]), Integer.parseInt(content[5]), Integer.parseInt(content[6]),
						Integer.parseInt(content[7]));
				h.getAbilities().add(getAbilityFromAvailable(content[8]));
				h.getAbilities().add(getAbilityFromAvailable(content[9]));
				h.getAbilities().add(getAbilityFromAvailable(content[10]));
				availableChampions.add(h);
			} else if (content[0].equals("V")) {
				Villain h = new Villain(content[1], Integer.parseInt(content[2]), Integer.parseInt(content[3]),
						Integer.parseInt(content[4]), Integer.parseInt(content[5]), Integer.parseInt(content[6]),
						Integer.parseInt(content[7]));
				h.getAbilities().add(getAbilityFromAvailable(content[8]));
				h.getAbilities().add(getAbilityFromAvailable(content[9]));
				h.getAbilities().add(getAbilityFromAvailable(content[10]));
				availableChampions.add(h);
			} else if (content[0].equals("A")) {
				AntiHero h = new AntiHero(content[1], Integer.parseInt(content[2]), Integer.parseInt(content[3]),
						Integer.parseInt(content[4]), Integer.parseInt(content[5]), Integer.parseInt(content[6]),
						Integer.parseInt(content[7]));
				h.getAbilities().add(getAbilityFromAvailable(content[8]));
				h.getAbilities().add(getAbilityFromAvailable(content[9]));
				h.getAbilities().add(getAbilityFromAvailable(content[10]));
				availableChampions.add(h);
			}
			line = br.readLine();
		}
		return availableChampions;
		//br.close();
	}

	private static  Ability getAbilityFromAvailable(String string) {
		for ( int i=0;i<availableAbilities.size();i++) {
		Ability	ability=availableAbilities.get(i);
		
			if (ability.getName().equals(string))
				return ability;
		}
		return null;
	}

	public static ArrayList<Ability> loadAbilities(String filepath) throws IOException {
		ArrayList<Ability> availableAbilities = new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader(filepath));
		String line = br.readLine();
		while (line != null) {
			String[] content = line.split(",");
			if (content[0].equals("CC")) {
				availableAbilities.add(new CrowdControlAbility(content[1], Integer.parseInt(content[2]),
						Integer.parseInt(content[4]), Integer.parseInt(content[3]), AreaOfEffect.valueOf(content[5]),
						Integer.parseInt(content[6]), getEffect(content[7], Integer.parseInt(content[8]))));
			} else if (content[0].equals("DMG")) {
				availableAbilities.add(new DamagingAbility(content[1], Integer.parseInt(content[2]),
						Integer.parseInt(content[4]), Integer.parseInt(content[3]), AreaOfEffect.valueOf(content[5]),
						Integer.parseInt(content[6]), Integer.parseInt(content[7])));
			} else if (content[0].equals("HEL")) {
				availableAbilities.add(new HealingAbility(content[1], Integer.parseInt(content[2]),
						Integer.parseInt(content[4]), Integer.parseInt(content[3]), AreaOfEffect.valueOf(content[5]),
						Integer.parseInt(content[6]), Integer.parseInt(content[7])));
			}
			line = br.readLine();
		}
		return availableAbilities;
	}

	private static Effect getEffect(String name, int duration) {
		if (name.equals("Dodge"))
			return new Dodge(duration);
		if (name.equals("Disarm"))
			return new Disarm(duration);
		if (name.equals("Embrace"))
			return new Embrace(duration);
		if (name.equals("Stun"))
			return new Stun(duration);
		if (name.equals("Shield"))
			return new Shield(duration);
		if (name.equals("Shock"))
			return new Shock(duration);
		if (name.equals("PowerUp"))
			return new PowerUp(duration);
		if (name.equals("SpeedUp"))
			return new SpeedUp(duration);
		if (name.equals("Silence"))
			return new Silence(duration);
		if (name.equals("Root"))
			return new Root(duration);
		return null;
	}



	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseEntered(MouseEvent e) {
		if (e.getSource().equals(b1)) {
			l31.setText(this.info(b1));
		}
		else if (e.getSource().equals(b2)) {			
			l31.setText(this.info(b2));
		}
		else if (e.getSource().equals(b3)) {
			l31.setText(this.info(b3));
		}
		else if (e.getSource().equals(b4)) {
			l31.setText(this.info(b4));
		}
		else if (e.getSource().equals(b5)) {
			l31.setText(this.info(b5));
		}
		else if (e.getSource().equals(b6)) {
			l31.setText(this.info(b6));
		}
		else if (e.getSource().equals(b7)) {
			l31.setText(this.info(b7));
		}
		else if (e.getSource().equals(b8)) {
			l31.setText(this.info(b8));
		}
		else if (e.getSource().equals(b9)) {
			l31.setText(this.info(b9));
		}
		else if (e.getSource().equals(b10)) {
			l31.setText(this.info(b10));
		}
		else if (e.getSource().equals(b11)) {
			l31.setText(this.info(b11));
		}
		else if (e.getSource().equals(b12)) {
			l31.setText(this.info(b12));
		}
		else if (e.getSource().equals(b13)) {
			l31.setText(this.info(b13));
		}
		else if (e.getSource().equals(b14)) {
			l31.setText(this.info(b14));
		}
		else if (e.getSource().equals(b15)) {
			l31.setText(this.info(b15));
		}
		
	}



	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public String info(Object b) {
		String t="";
		String s=((JButton)b).getText();
		String info="";
		for (int i=0;i<this.availableChampions.size();i++) {
			Champion c=this.availableChampions.get(i);
			ArrayList<Ability> a =c.getAbilities();
			if (c.getName().equals(s)) {
				if (c instanceof Hero) {
					t="Hero";
				}else if (c instanceof Villain) {
					t="Villain";
				}else if (c instanceof AntiHero) {
					t="AntiHero";
				}
				
				
				info = "<html>Heath Points : "+c.getMaxHP()  +"\n" +"<br>Attack Damage : "+ c.getAttackDamage() +"\n" + "<br>Attack Range : " + c.getAttackRange() +"\n" +
			                   "<br>Mana Points : "+c.getMana()  +"\n" +"<br>Speed : "+ c.getSpeed()+ "\n" + "<br>Max Actions Points per turn : "  +c.getMaxActionPointsPerTurn()+ "\n"+"<br>Type : "+ t
						+"\n" + "<br>Abilities : " +a.get(0).getName() + " , " +
						a.get(1).getName()+ " , "  + a.get(2).getName() +"</html>";
				break;
			}			

		}	
		return info;
	}
	
	
}
