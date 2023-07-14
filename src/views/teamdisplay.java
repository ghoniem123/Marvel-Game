package views;

import java.util.ArrayList;

import javax.swing.*;

import engine.Player;

import java.awt.*;

import model.abilities.Ability;
import model.effects.Effect;
import model.effects.Embrace;
import model.effects.Root;
import model.effects.SpeedUp;
import model.effects.Stun;
import model.world.AntiHero;
import model.world.Champion;
import model.world.Hero;
import model.world.Villain;

public class teamdisplay extends JFrame{
	private Image i2=new ImageIcon("logo icon.png").getImage();
	
	private Icon i=new ImageIcon("rip3.png");
    
	private JPanel p1=new JPanel();
	private JPanel p2=new JPanel();
	private JPanel p3=new JPanel();
	
	private JLabel l1;
	private JLabel l2;
	private JLabel l3;
	private JLabel l11;
	private JLabel l21;
	private JLabel l31;
	
	private Player player;
	private ArrayList<Champion> c;
	public teamdisplay(Player pa) {
		
	this.player = pa;	
	this.c=pa.getTeam();
	
	this.setSize(900,500);
	this.setTitle("Marvel Ultimate War");
	this.setFont(new Font("TIMES ROMAN",Font.BOLD,30));
	this.setIconImage(i2);
	this.setResizable(false);	
    this.setLayout(null);
    
    p1.setLayout(null);
    p2.setLayout(null);
    p3.setLayout(null);
    
    
    
    if (c.size()==3) {
    
   
    	l1=new JLabel (c.get(0).getName());
    	l11=new JLabel (this.info(c.get(0)));
  
    	l2=new JLabel (c.get(1).getName());
    	l21=new JLabel (this.info(c.get(1)));
  
    	l3=new JLabel (c.get(2).getName());
    	l31=new JLabel (this.info(c.get(2)));
    	
    	  l1.setFont(new Font("TIMES ROMAN",Font.ITALIC,20));
    	    l2.setFont(new Font("TIMES ROMAN",Font.ITALIC,20));
    	    l3.setFont(new Font("TIMES ROMAN",Font.ITALIC,20));
    	    
    	    l11.setFont(new Font("TIMES ROMAN",Font.BOLD,15));
    	    l21.setFont(new Font("TIMES ROMAN",Font.BOLD,15));
    	    l31.setFont(new Font("TIMES ROMAN",Font.BOLD,15));
    	    
    	    l11.setForeground(Color.black);
    	    l21.setForeground(Color.black);
    	    l31.setForeground(Color.black);
    }
    
    else    if (c.size()==2) {
    
   
    	l1=new JLabel (c.get(0).getName());
    	l11=new JLabel (this.info(c.get(0)));
  
    	l2=new JLabel (c.get(1).getName());
    	l21=new JLabel (this.info(c.get(1)));
  
    	l3=new JLabel ("DEAD");
    	l31=new JLabel ("RIP");
    	
    	    l1.setFont(new Font("TIMES ROMAN",Font.ITALIC,20));
    	    l2.setFont(new Font("TIMES ROMAN",Font.ITALIC,20));
    	    l3.setFont(new Font("TIMES ROMAN",Font.BOLD,20));
    	    
    	    l11.setFont(new Font("TIMES ROMAN",Font.BOLD,15));
    	    l21.setFont(new Font("TIMES ROMAN",Font.BOLD,15));
    	    l31.setFont(new Font("TIMES ROMAN",Font.BOLD,40));
    	    
    	    l11.setForeground(Color.black);
    	    l21.setForeground(Color.black);
    	    l31.setForeground(Color.red);
    	    
    	    l31.setIcon(i);
    	    l31.setHorizontalTextPosition(JLabel.CENTER);
    	    l31.setVerticalTextPosition(JLabel.TOP);
    }
    else if (c.size()==1) {
        
    	   
    	l1=new JLabel (c.get(0).getName());
    	l11=new JLabel (this.info(c.get(0)));
  
    	l2=new JLabel ("DEAD");
    	l21=new JLabel ("RIP");
  
    	l3=new JLabel ("DEAD");
    	l31=new JLabel ("RIP");
    	
    	 l1.setFont(new Font("TIMES ROMAN",Font.ITALIC,20));
 	    l2.setFont(new Font("TIMES ROMAN",Font.ITALIC,20));
 	    l3.setFont(new Font("TIMES ROMAN",Font.BOLD,20));
 	    
 	    l11.setFont(new Font("TIMES ROMAN",Font.BOLD,15));
 	    l21.setFont(new Font("TIMES ROMAN",Font.BOLD,40));
 	    l31.setFont(new Font("TIMES ROMAN",Font.BOLD,40));
 	    
 	   l11.setForeground(Color.black);
 	    l21.setForeground(Color.red);
 	    l31.setForeground(Color.red);
 	    
 	   l21.setIcon(i); 
 	   l31.setIcon(i);
 	   
	    l21.setVerticalTextPosition(JLabel.TOP);
	    l31.setVerticalTextPosition(JLabel.TOP);
	    l21.setHorizontalTextPosition(JLabel.CENTER);
	    l31.setHorizontalTextPosition(JLabel.CENTER);

    }
  
    
    l1.setBounds(0,0,300,100);
    l2.setBounds(0,0,300,100);
    l3.setBounds(0,0,300,100);
    
    l11.setBounds(0,100,300,500);
    l21.setBounds(0,100,300,500);
    l31.setBounds(0,100,300,500);
    
    
    l1.setHorizontalAlignment(JLabel.CENTER);
    l2.setHorizontalAlignment(JLabel.CENTER);
    l3.setHorizontalAlignment(JLabel.CENTER);
    
    l11.setHorizontalAlignment(JLabel.CENTER);
    l21.setHorizontalAlignment(JLabel.CENTER);
    l31.setHorizontalAlignment(JLabel.CENTER);
    l11.setVerticalAlignment(JLabel.TOP);
    l21.setVerticalAlignment(JLabel.TOP);
    l31.setVerticalAlignment(JLabel.TOP);
    
    l1.setOpaque(true);
    l2.setOpaque(true);  
    l3.setOpaque(true);
    
    l11.setOpaque(true);
    l21.setOpaque(true);  
    l31.setOpaque(true);
    
    l1.setBackground(Color.black);
    l2.setBackground(Color.black);
    l3.setBackground(Color.black);
    
    l11.setBackground(Color.white);
    l21.setBackground(Color.white);
    l31.setBackground(Color.white);
    
    l1.setForeground(Color.green);
    l2.setForeground(Color.green);
    l3.setForeground(Color.green);
    
    
    p1.setBounds(0,0,300,600);
    p2.setBounds(300,0,300,600);
    p3.setBounds(600,0,300,600);
    
    p1.setBorder(BorderFactory.createLineBorder(Color.black));
    p2.setBorder(BorderFactory.createLineBorder(Color.black));
    p3.setBorder(BorderFactory.createLineBorder(Color.black));
    
    p1.add(l1);
    p2.add(l2);
    p3.add(l3);
    p1.add(l11);
    p2.add(l21);
    p3.add(l31);
    
   this.add(p1);
   this.add(p2);
   this.add(p3);
   this.setVisible(true);
   
	}
	
public String info(Champion c) {
	int per=(int)(((double)(c.getCurrentHP()))/((double)(c.getMaxHP()))*100);
	
	String percentage=per+" %";
	
	
	String type="";	
	String leader="";
	String info="";
	String effects = "";
	if (c instanceof Villain)
		type="Villain";
	else if (c instanceof Hero) {
		type="Hero";
	}
	else if ( c instanceof AntiHero) {
		type="AntiHero";
	}
	
	if (c.equals(player.getLeader())){
		leader="Yes";
	}
	else {
		leader="No";
	}
		
		for (int i=0;i<c.getAppliedEffects().size();i++) {
			effects+= "<br>"+" - "+ c.getAppliedEffects().get(i).getName()+ " , duration : "+ c.getAppliedEffects().get(i).getDuration();
		}
		
			if (effects.length()==0) {
					effects ="no effect is applied";
				}
				
				info = "<html>Heath Points : "+c.getCurrentHP() +"<br> current HP percentage : "+percentage +"\n" +"<br>Attack Damage : "+ c.getAttackDamage() +"\n" + "<br>Attack Range : " + c.getAttackRange() +"\n" +
			                   "<br>Mana Points : "+c.getMana()  + "\n" + "<br>Max Actions Points per turn : "+c.getMaxActionPointsPerTurn()+"\n" +
			                   "<br>Champion type : " +type + "<br>Leader : " +leader +
                               "<br>Applied Effects :- " + effects +"</html>";	
						
		return info;
	}
}
