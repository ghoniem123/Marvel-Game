package views;

import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.text.AttributeSet.FontAttribute;
import javax.swing.*;
import java.awt.*;
import model.abilities.Ability;
import model.abilities.CrowdControlAbility;
import model.abilities.DamagingAbility;
import model.abilities.HealingAbility;
import model.world.AntiHero;
import model.world.Champion;
import model.world.Hero;
import model.world.Villain;

public class abilitydisplay extends JFrame {
	private Image i2=new ImageIcon("logo icon.png").getImage();
    
	private JPanel panel=new JPanel();
	
	private JLabel l1=new JLabel("Ability information");
	private JLabel l2;
	private Ability ability;
	
	public abilitydisplay(Ability a) {
		this.ability=a;
		this.setSize(300,250);
		this.setTitle("Marvel Ultimate War");
		this.setFont(new Font("TIMES ROMAN",Font.BOLD,30));
		this.setIconImage(i2);
		this.setResizable(false);	
	    this.setLayout(null);
	    
	    panel.setLayout(null);
	    panel.setBounds(0,0,300,250);
	    
	    l1.setBounds(0,0,300,50);
	    l1.setOpaque(true);
	    l1.setBackground(Color.black);
	    l1.setForeground(Color.green);
	    l1.setHorizontalAlignment(JLabel.CENTER);
	    l1.setFont(new Font("TIMES ROMAN",Font.ITALIC,20));
	    
	    l2=new JLabel(abilityinfo(ability));
	    l2.setBounds(0,55,300,200);
	    
	    l2.setVerticalAlignment(JLabel.TOP);
	    l2.setHorizontalAlignment(JLabel.CENTER);
	    
	    panel.add(l1);
	    panel.add(l2);
	    
	    this.add(panel);
	    this.setVisible(true);
	}
	
	
	public String abilityinfo(Ability x) {
		
		String type="";	
		String info="";
		String effects = "";
		String typeinfo="";
		
		if (x instanceof DamagingAbility) {
			type="DamagingAbility";
			effects=""+((DamagingAbility) x).getDamageAmount();
			typeinfo= "Damaging amount : ";
		}
		else if (x instanceof HealingAbility) {
			type="HealingAbility";
			effects=""+((HealingAbility) x).getHealAmount();
			typeinfo= "Healing amount : ";
		}
		else if ( x instanceof CrowdControlAbility) {
			type="CrowdControlAbility";
			effects=((CrowdControlAbility) x).getEffect().getName() +" , duration : "+((CrowdControlAbility) x).getEffect().getDuration();
			typeinfo= "Effect info : ";
		}
				
				info = "<html>Ability type : "+type  +"<br>Ability area of effect : "+ x.getCastArea() + "<br>Ability cast range : " + x.getCastRange()  +
			                   "<br>Mana cost : "+x.getManaCost()  +"<br>Action points cost : "+ x.getRequiredActionPoints()+ 
			                   "<br>Current cooldown : "  +x.getCurrentCooldown()+  "<br>Base cooldown : "  +x.getBaseCooldown()+ "<br>"+typeinfo +effects + "</html>";
	return info;
	}
}
