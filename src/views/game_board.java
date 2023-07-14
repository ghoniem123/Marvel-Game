package views;

import java.awt.Font;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import engine.Controller;
import engine.Game;
import engine.Player;
import exceptions.AbilityUseException;
import exceptions.ChampionDisarmedException;
import exceptions.InvalidTargetException;
import exceptions.LeaderAbilityAlreadyUsedException;
import exceptions.LeaderNotCurrentException;
import exceptions.NotEnoughResourcesException;
import exceptions.UnallowedMovementException;
import model.abilities.Ability;
import model.abilities.AreaOfEffect;
import model.world.AntiHero;
import model.world.Champion;
import model.world.Cover;
import model.world.Damageable;
import model.world.Direction;
import model.world.Hero;
import model.world.Villain;

import javax.swing.*;
import javax.swing.border.Border;

public class game_board extends JFrame implements ActionListener{
	private Image i0=new ImageIcon("logo icon.png").getImage();
	private ImageIcon rock=new ImageIcon("rock4.png");
	
	private ImageIcon uppic=new ImageIcon("up.png");
	private ImageIcon downpic=new ImageIcon("down.png");
	private ImageIcon leftpic=new ImageIcon("left.png");
	private ImageIcon rightpic=new ImageIcon("right.png");

    
	private ImageIcon captian=new ImageIcon("captian.png");
	private ImageIcon dead=new ImageIcon("deadpool.png");
	private ImageIcon strange=new ImageIcon("dr strange.png");
	private ImageIcon electro=new ImageIcon("electro.png");
	private ImageIcon ghost=new ImageIcon("ghost.png");
	private ImageIcon hela=new ImageIcon("hela.png");
	private ImageIcon hulk=new ImageIcon("hulk.png");
	private ImageIcon ice=new ImageIcon("ice.png");
	private ImageIcon iron=new ImageIcon("iron2.png");
	private ImageIcon spider=new ImageIcon("spider.png");
	private ImageIcon loki=new ImageIcon("loki.png");
	private ImageIcon thor=new ImageIcon("thor.png");
	private ImageIcon venom=new ImageIcon("venom.png");
	private ImageIcon yellow=new ImageIcon("yellow.png");
	private ImageIcon quick=new ImageIcon("quick.png");
	
	 private Color color=new Color(0xe68a00);
     private Border border=new JButton().getBorder();
	 
	private JButton b1=new JButton();
	private JButton b2=new JButton();
	private JButton b3=new JButton();
	private JButton b4=new JButton();
	private JButton b5=new JButton();	
	private JButton b6=new JButton();
	private JButton b7=new JButton();	
	private JButton b8=new JButton();
	private JButton b9=new JButton();
	private JButton b10=new JButton();
	private JButton b11=new JButton();
	private JButton b12=new JButton();
	private JButton b13=new JButton();
	private JButton b14=new JButton();
	private JButton b15=new JButton();
	private JButton b16=new JButton();
	private JButton b17=new JButton();
	private JButton b18=new JButton();
	private JButton b19=new JButton();
	private JButton b20=new JButton();
	private JButton b21=new JButton();
	private JButton b22=new JButton();
	private JButton b23=new JButton();
	private JButton b24=new JButton();
	private JButton b25=new JButton();
	
	private JButton attack=new JButton("Attack");
	
	private JButton end=new JButton("End my turn");
	private JButton cast1=new JButton("Use ability");
	private JButton cast2=new JButton("Use ability");
	private JButton cast3=new JButton("Use ability");
    
	private JButton team1=new JButton("Team 1");
	private JButton team2=new JButton("Team 2");	
	private JButton ability1=new JButton("view ability information");	
	private JButton ability2=new JButton("view ability information");	
	private JButton ability3=new JButton("view ability information");	
    private JButton leaderability1=new JButton("<html>Player 1"+"<br> leader ability"+"<br>(not used yet)"+"</html>");
    private JButton leaderability2=new JButton("<html>Player 2"+"<br> leader ability"+"<br>(not used yet)"+"</html>");
    
    private JButton up=new JButton("UP");
    private JButton down=new JButton("DOWN");
    private JButton left=new JButton("LEFT");
    private JButton right=new JButton("RIGHT");
  

	private board_grid_panel panel1;
	
	private JPanel titlepanel = new JPanel();
    private JPanel infopanel = new JPanel();
    private JPanel abilitypanel = new JPanel();
    private JPanel abilitypanel1 = new JPanel();
    private JPanel abilitypanel2 = new JPanel();
    private JPanel abilitypanel3 = new JPanel();
	private JPanel queuepanel=new JPanel();
	
	private Game game;
    
    private JLabel name1;
    private JLabel name2;
    private JLabel currentinfo;
    private JLabel infotitle=new JLabel ("Current champion status");
    private JLabel abilitytitle=new JLabel ("Current champion abilities");
    private JLabel abilityinfo1 ;
    private JLabel abilityinfo2 ; 
    private JLabel abilityinfo3 ;
    private JLabel queue=new JLabel("Turn order");
    private JLabel current;
    private JLabel next;
    private JLabel next1;
    private JLabel next2;
    private JLabel next3;
    private JLabel next4;

    
    
    private  Player player1;
    private  Player player2;
    
   
    private JProgressBar HPbar;
  private Object[][] board;
    
    
  public game_board(Player p1, Player p2,Image image) {
	  panel1=new board_grid_panel(image);
	  
	     this.player1=p1;
	     this.player2=p2;
	  
	    this.game=new Game(p1,p2);
	  
	    this.board=this.game.getBoard();
	    
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setTitle("Marvel Ultimate War");
		this.setFont(new Font("TIMES ROMAN",Font.BOLD,30));
		this.setIconImage(i0);
		
		this.setLayout(null);
		this.getContentPane().setBackground(Color.white);
		
		infopanel.setLayout(null);
		infopanel.setBounds(1355,400,175,275);
		
		abilitypanel.setLayout(null);
		abilitypanel.setBounds(5,170,185,500);
		
		panel1.setLayout(new GridLayout(5,5));
		panel1.setBounds(200,90,1150,600);
		
		titlepanel.setLayout(null);
		titlepanel.setBounds(0,0,2000,90);
		titlepanel.setBackground(Color.black);
		
		name1 =new JLabel("Player 1 name : "+p1.getName());
		name2 =new JLabel("Player 2 name : "+p2.getName());
		
		name1.setForeground(Color.BLUE);
		name2.setForeground(color);	
		
		name1.setBounds(30,0,400,50);
		name2.setBounds(1150,0,400,50);
		
		name1.setFont(new Font ("TIMES ROMAN", Font.BOLD,20));
		name2.setFont(new Font ("TIMES ROMAN", Font.BOLD,20));

		team1.setBounds(130,50,100,30);
		team2.setBounds(1250,50,100,30);

		team1.addActionListener(this);
		team2.addActionListener(this);
		
		team1.setFocusPainted(false);
		team2.setFocusPainted(false);
		
		team1.setForeground(Color.blue);
		team2.setForeground(color);
		
		team1.setOpaque(false);
		team1.setContentAreaFilled(false);
		team1.setBorderPainted(true);
		
		team2.setOpaque(false);
		team2.setContentAreaFilled(false);
		team2.setBorderPainted(true);
		
		titlepanel.add(name1);
		titlepanel.add(name2);
		
		titlepanel.add(team1);
		titlepanel.add(team2);
		
		
		end.setBounds(22,105,150,50);
		end.setFocusPainted(false);
		end.addActionListener(this);
		end.setBackground(new Color(0x660000));
		end.setForeground(Color.white);
		
		panel1.add(b1);
		panel1.add(b2);
		panel1.add(b3);
		panel1.add(b4);
		panel1.add(b5);
		panel1.add(b6);
		panel1.add(b7);
		panel1.add(b8);
		panel1.add(b9);
		panel1.add(b10);	
		panel1.add(b11);
		panel1.add(b12);	
		panel1.add(b13);
		panel1.add(b14);
		panel1.add(b15);
		panel1.add(b16);	
		panel1.add(b17);
		panel1.add(b18);
		panel1.add(b19);
		panel1.add(b20);
		panel1.add(b21);
		panel1.add(b22);
		panel1.add(b23);
		panel1.add(b24);
		panel1.add(b25);

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
		
		b16.setOpaque(false);
		b16.setContentAreaFilled(false);
		b16.setBorderPainted(true);
		
		b17.setOpaque(false);
		b17.setContentAreaFilled(false);
		b17.setBorderPainted(true);
		
		b18.setOpaque(false);
		b18.setContentAreaFilled(false);
		b18.setBorderPainted(true);
		
		b19.setOpaque(false);
		b19.setContentAreaFilled(false);
		b19.setBorderPainted(true);
		
		b20.setOpaque(false);
		b20.setContentAreaFilled(false);
		b20.setBorderPainted(true);
		
		b21.setOpaque(false);
		b21.setContentAreaFilled(false);
		b21.setBorderPainted(true);
		
		b22.setOpaque(false);
		b22.setContentAreaFilled(false);
		b22.setBorderPainted(true);
		
		b23.setOpaque(false);
		b23.setContentAreaFilled(false);
		b23.setBorderPainted(true);
		
		b24.setOpaque(false);
		b24.setContentAreaFilled(false);
		b24.setBorderPainted(true);
		
		b25.setOpaque(false);
		b25.setContentAreaFilled(false);
		b25.setBorderPainted(true);
	
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
		b22.setFocusPainted(false);
		b23.setFocusPainted(false);
		b24.setFocusPainted(false);
		b25.setFocusPainted(false);
		    
        HPbar = new JProgressBar(JProgressBar.VERTICAL);
        HPbar.setStringPainted(true);
        HPbar.setMinimum(0);
        HPbar.setForeground(Color.red);
        HPbar.setBackground(Color.black);
        HPbar.setBounds(1400,95,100,300);
        HPbar.setFont(new Font("TIMES ROMAN",Font.ITALIC,20));
        HPbar.setMaximum(this.game.getCurrentChampion().getMaxHP());
        HPbar.setValue(this.game.getCurrentChampion().getCurrentHP());
        double percent=( (double)((double)(this.game.getCurrentChampion().getCurrentHP())/((double)(this.game.getCurrentChampion().getMaxHP())))*100 );
        HPbar.setString("Current HP " + (int)(percent) + "%");
        HPbar.setToolTipText("Remainig HP");
     
       
        currentinfo = new JLabel();
        currentinfo.setText(info(this.game.getCurrentChampion()));
        currentinfo.setBounds(0,50,175,225);
        currentinfo.setHorizontalAlignment(JLabel.CENTER);  
        currentinfo.setVerticalAlignment(JLabel.TOP);

        
        infotitle.setBounds(0,0,175,50);
        infotitle.setOpaque(true);
        infotitle.setFont(new Font("TIMES ROMAN",Font.BOLD,13));
        infotitle.setForeground(Color.gray);
        infotitle.setBackground(Color.black);
        infotitle.setHorizontalAlignment(JLabel.CENTER);
        
        infopanel.add(infotitle);
        infopanel.add(currentinfo);
        
        abilitytitle.setBounds(0,0,185,50);
        abilitytitle.setOpaque(true);
        abilitytitle.setFont(new Font("TIMES ROMAN",Font.BOLD,13));
        abilitytitle.setForeground(Color.gray);
        abilitytitle.setBackground(Color.black);
        abilitytitle.setHorizontalAlignment(JLabel.CENTER);
        
        abilitypanel1.setLayout(null);
        abilitypanel1.setBounds(0,50,185,150);
        
        abilitypanel2.setLayout(null);
        abilitypanel2.setBounds(0,200,185,150);
        
        abilitypanel3.setLayout(null);
        abilitypanel3.setBounds(0,350,185,150);
        
        abilityinfo1=new JLabel();
        abilityinfo1.setText(this.game.getCurrentChampion().getAbilities().get(0).getName());
        abilityinfo2=new JLabel();
        abilityinfo2.setText(this.game.getCurrentChampion().getAbilities().get(1).getName());
        abilityinfo3=new JLabel();
        abilityinfo3.setText(this.game.getCurrentChampion().getAbilities().get(2).getName());
        
        abilityinfo1.setBounds(0,0,185,50);
        abilityinfo2.setBounds(0,0,185,50);
        abilityinfo3.setBounds(0,0,185,50);
        
        ability1.addActionListener(this);
        ability2.addActionListener(this);
        ability3.addActionListener(this);
        
        cast1.addActionListener(this);
        cast2.addActionListener(this);
        cast3.addActionListener(this);  
        
        cast1.setBounds(0,100,185,40);
        cast2.setBounds(0,100,185,40);
        cast3.setBounds(0,100,185,40);
        
        ability1.setBounds(0,50,185,40);
        ability2.setBounds(0,50,185,40);
        ability3.setBounds(0,50,185,40);

        ability1.setFocusPainted(false);
        ability2.setFocusPainted(false);
        ability3.setFocusPainted(false);
        
        cast1.setFocusPainted(false);
        cast2.setFocusPainted(false);
        cast3.setFocusPainted(false);

        
        ability1.setBackground(new Color(0xA9A9A9));
        ability2.setBackground(new Color(0xA9A9A9));
        ability3.setBackground(new Color(0xA9A9A9));
        
        ability1.setForeground(Color.black);
        ability2.setForeground(Color.black);
        ability3.setForeground(Color.black);
        
        cast1.setBackground(new Color(0x000080));
        cast2.setBackground(new Color(0x000080));
        cast3.setBackground(new Color(0x000080));
        
        cast1.setForeground(Color.black);
        cast2.setForeground(Color.black);
        cast3.setForeground(Color.black);
        
        abilitypanel1.add(abilityinfo1);
        abilitypanel2.add(abilityinfo2);
        abilitypanel3.add(abilityinfo3);
        
        abilitypanel1.add(ability1);
        abilitypanel2.add(ability2);
        abilitypanel3.add(ability3);
        abilitypanel1.add(cast1);
        abilitypanel2.add(cast2);
        abilitypanel3.add(cast3);
        
        
        abilitypanel.add(abilitytitle);
        abilitypanel.add(abilitypanel1);
        abilitypanel.add(abilitypanel2);
        abilitypanel.add(abilitypanel3);
        
        leaderability1.setBounds(10,680,170,100);
        leaderability2.setBounds(1360,680,170,100);
        
        leaderability1.setFocusPainted(false);
        leaderability2.setFocusPainted(false);

        leaderability1.setBackground(Color.black);
        leaderability2.setBackground(Color.black);

        leaderability1.setForeground(Color.magenta);
        leaderability2.setForeground(Color.magenta);
        
        leaderability1.setFont(new Font("ARIEL",Font.BOLD,18));
        leaderability2.setFont(new Font("ARIEL",Font.BOLD,18));
        
        leaderability1.addActionListener(this);
        leaderability2.addActionListener(this);
        
        queuepanel.setLayout(null);
        queuepanel.setBounds(400,15,700,60);
        
        queue.setHorizontalAlignment(JLabel.CENTER);
        queue.setOpaque(true);
        queue.setBackground(Color.red);
        queue.setForeground(Color.white);
        queue.setBounds(0,0,700,20);
        
        current=new JLabel();
        current.setText("<html><strong> CURRENT CHAMPION</strong>" + "<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+this.game.getCurrentChampion().getName()+"</html>");
        current.setBounds(0,20,200,40);
        current.setHorizontalAlignment(JLabel.CENTER);
        current.setOpaque(true);
        current.setBackground(Color.white);
        current.setForeground(Color.black);
        
        next=new JLabel();
        next.setText(((Champion) this.game.getTurnOrder().next()).getName());
        next.setBounds(200,20,100,40);
        next.setHorizontalAlignment(JLabel.CENTER);
        next.setOpaque(true);
        next.setBackground(Color.white);
        next.setForeground(Color.black);
        
        next1=new JLabel();
        next1.setText(((Champion) this.game.getTurnOrder().next1()).getName());
        next1.setBounds(300,20,100,40);
        next1.setHorizontalAlignment(JLabel.CENTER);
        next1.setOpaque(true);
        next1.setBackground(Color.white);
        next1.setForeground(Color.black);

        next2=new JLabel();
        next2.setText(((Champion) this.game.getTurnOrder().next2()).getName());
        next2.setBounds(400,20,100,40);
        next2.setHorizontalAlignment(JLabel.CENTER);
        next2.setOpaque(true);
        next2.setBackground(Color.white);
        next2.setForeground(Color.black);
        
        next3=new JLabel();
        next3.setText(((Champion) this.game.getTurnOrder().next3()).getName());
        next3.setBounds(500,20,100,40);
        next3.setHorizontalAlignment(JLabel.CENTER);
        next3.setOpaque(true);
        next3.setBackground(Color.white);
        next3.setForeground(Color.black);
        
        next4=new JLabel();
        next4.setText(((Champion) this.game.getTurnOrder().next4()).getName());
        next4.setBounds(600,20,100,40);
        next4.setHorizontalAlignment(JLabel.CENTER);
        next4.setOpaque(true);
        next4.setBackground(Color.white);
        next4.setForeground(Color.black);
      
        queuepanel.add(next);
        queuepanel.add(next1);
        queuepanel.add(next2);
        queuepanel.add(next3);
        queuepanel.add(next4);
        queuepanel.add(current);
        queuepanel.add(queue);
        titlepanel.add(queuepanel);
        
        attack.setBounds(430,700,100,80);
        attack.setFont(new Font("TIMES ROMAN",Font.BOLD,20));
        attack.setFocusPainted(false);
        attack.setBackground(Color.black);
        attack.setForeground(new Color(0xcc9050));
        attack.addActionListener(this);
        
        up.setBounds(1010,700,110,40);
        up.setFont(new Font("TIMES ROMAN",Font.BOLD,15));
        up.setFocusPainted(false);
        up.addActionListener(this);
        up.setIcon(uppic);
        up.setText(null);
        
        down.setBounds(1010,745,110,40);
        down.setFont(new Font("TIMES ROMAN",Font.BOLD,15));
        down.setFocusPainted(false);
        down.addActionListener(this);
        down.setIcon(downpic);
        down.setText(null);
        
        left.setBounds(890,745,110,40);
        left.setFont(new Font("TIMES ROMAN",Font.BOLD,15));
        left.setFocusPainted(false);
        left.addActionListener(this);
        left.setIcon(leftpic);
        left.setText(null);
        
        right.setBounds(1130,745,110,40);
        right.setFont(new Font("TIMES ROMAN",Font.BOLD,15));
        right.setFocusPainted(false);
        right.addActionListener(this);
        right.setIcon(rightpic);
        right.setText(null);
        
    	up.setOpaque(false);
		up.setContentAreaFilled(false);
		up.setBorderPainted(true);
		
		down.setOpaque(false);
		down.setContentAreaFilled(false);
		down.setBorderPainted(true);
		
		left.setOpaque(false);
		left.setContentAreaFilled(false);
		left.setBorderPainted(true);
		
		right.setOpaque(false);
		right.setContentAreaFilled(false);
		right.setBorderPainted(true);
        
        this.update(this.board);
        this.add(up);
        this.add(left);
        this.add(down);
        this.add(right);
        this.add(attack);
        this.add(leaderability1);
        this.add(leaderability2);
        this.add(abilitypanel);
        this.add(infopanel);
        this.add(HPbar);
        this.add(titlepanel);
		this.add(end);
		this.add(panel1);
		this.revalidate();
		this.repaint();
		this.setVisible(true);
		

  }
public void bordersetter() {

	b1.setBorder(border);
	b2.setBorder(border);
	b3.setBorder(border);
	b4.setBorder(border);
	b5.setBorder(border);
	b6.setBorder(border);
	b7.setBorder(border);
	b8.setBorder(border);
	b9.setBorder(border);
	b10.setBorder(border);
	b11.setBorder(border);
	b12.setBorder(border);
	b13.setBorder(border);
	b14.setBorder(border);
	b15.setBorder(border);
	b16.setBorder(border);
	b17.setBorder(border);
	b18.setBorder(border);
	b19.setBorder(border);
	b20.setBorder(border);
	b21.setBorder(border);
	b22.setBorder(border);
	b23.setBorder(border);
	b24.setBorder(border);
	b25.setBorder(border);
	
}

public void iconsetter() {
	b1.setIcon(null);
	b2.setIcon(null);
	b3.setIcon(null);
	b4.setIcon(null);
	b5.setIcon(null);
	b6.setIcon(null);
	b7.setIcon(null);
	b8.setIcon(null);
	b9.setIcon(null);
	b10.setIcon(null);
	b11.setIcon(null);
	b12.setIcon(null);
	b13.setIcon(null);
	b14.setIcon(null);
	b15.setIcon(null);
	b16.setIcon(null);
	b17.setIcon(null);
	b18.setIcon(null);
	b19.setIcon(null);
	b20.setIcon(null);
	b21.setIcon(null);
	b22.setIcon(null);
	b23.setIcon(null);
	b24.setIcon(null);
	b25.setIcon(null);
}

public void toolset() {
	b1.setToolTipText(null);
	b2.setToolTipText(null);
	b3.setToolTipText(null);
	b4.setToolTipText(null);
	b5.setToolTipText(null);
	b6.setToolTipText(null);
	b7.setToolTipText(null);
	b8.setToolTipText(null);
	b9.setToolTipText(null);
	b10.setToolTipText(null);
	b11.setToolTipText(null);
	b12.setToolTipText(null);
	b13.setToolTipText(null);
	b14.setToolTipText(null);
	b15.setToolTipText(null);
	b16.setToolTipText(null);
	b17.setToolTipText(null);
	b18.setToolTipText(null);
	b19.setToolTipText(null);
	b20.setToolTipText(null);
	b21.setToolTipText(null);
	b22.setToolTipText(null);
	b23.setToolTipText(null);
	b24.setToolTipText(null);
	b25.setToolTipText(null);
}

public void photo(JButton b) {
	
	
	switch(b.getText()){
		case ("Captain America"): b.setIcon(this.captian);break;
		case ("Electro"): b.setIcon(this.electro);break;
		case ("Hulk"): b.setIcon(this.hulk);break;
		case ("Loki"): b.setIcon(this.loki);break;
		case ("Thor"): b.setIcon(this.thor);break;
		case ("Deadpool"): b.setIcon(this.dead);break;
		case ("Ghost Rider"): b.setIcon(this.ghost);break;
		case ("Iceman"): b.setIcon(this.ice);break;
		case ("Quicksilver"): b.setIcon(this.quick);break;
		case ("Venom"): b.setIcon(this.venom);break;
		case ("Dr Strange"): b.setIcon(this.strange);break;
		case ("Hela"): b.setIcon(this.hela);break;
		case ("Ironman"): b.setIcon(this.iron);break;
		case ("Spiderman"): b.setIcon(this.spider);break;
		case ("Yellow Jacket"): b.setIcon(this.yellow);break;
	}
	b.setText(null);

}

public void photosetter() {
	b1.setIcon(null);
	b2.setIcon(null);
	b3.setIcon(null);
	b4.setIcon(null);
	b5.setIcon(null);
	b6.setIcon(null);
	b7.setIcon(null);
	b8.setIcon(null);
	b9.setIcon(null);
	b10.setIcon(null);
	b11.setIcon(null);
	b12.setIcon(null);
	b13.setIcon(null);
	b14.setIcon(null);
	b15.setIcon(null);
	b16.setIcon(null);
	b17.setIcon(null);
	b18.setIcon(null);
	b19.setIcon(null);
	b20.setIcon(null);
	b21.setIcon(null);
	b22.setIcon(null);
	b23.setIcon(null);
	b24.setIcon(null);
	b25.setIcon(null);	
}

  public void update(Object[][] b) {
	  
	  this.toolset();
	  this.iconsetter();
	  this.photosetter();
	  
	  for (int i=0;i<b.length;i++) {
		  for (int j=0;j<b[i].length;j++) {
			if (i==0 && j==0) {
				
				b1.setText(assign(b[i][j]));
				if (b[i][j] instanceof Champion) {
					b1.setToolTipText("<html> name : "+((Champion)(b[i][j])).getName()+  "<br>Current HP : "+(((Damageable) (b[i][j])).getCurrentHP())+"</html>");
					this.photo(b1);
					if (this.game.getFirstPlayer().getTeam().contains((Champion)(b[i][j])))
						b1.setBorder(BorderFactory.createLineBorder(Color.blue,3,true));
					      
				else if (this.game.getSecondPlayer().getTeam().contains((Champion)(b[i][j])))
					b1.setBorder(BorderFactory.createLineBorder(this.color,3,true));
				}
				else if (b[i][j] instanceof Cover) {
					b1.setToolTipText("Current HP : "+(((Damageable) (b[i][j])).getCurrentHP()));

					b1.setIcon(rock);
				      }
					}
				
			else    if (i==0 && j==1) {
				b6.setText(assign(b[i][j]));
				if (b[i][j] instanceof Champion) {
					b6.setToolTipText("<html> name : "+((Champion)(b[i][j])).getName()+  "<br>Current HP : "+(((Damageable) (b[i][j])).getCurrentHP())+"</html>");
					this.photo(b6);
					
					if (this.game.getFirstPlayer().getTeam().contains((Champion)(b[i][j])))
						b6.setBorder(BorderFactory.createLineBorder(Color.blue,3,true));
					      
				else if (this.game.getSecondPlayer().getTeam().contains((Champion)(b[i][j])))
					b6.setBorder(BorderFactory.createLineBorder(this.color,3,true));
				}
				else if (b[i][j] instanceof Cover) {
					b6.setToolTipText("Current HP : "+(((Damageable) (b[i][j])).getCurrentHP()));

					b6.setIcon(rock);
				} 
					
				
			}
			else    if (i==0 && j==2) {
				b11.setText(assign(b[i][j]));
				if (b[i][j] instanceof Champion) {
					b11.setToolTipText("<html> name : "+((Champion)(b[i][j])).getName()+  "<br>Current HP : "+(((Damageable) (b[i][j])).getCurrentHP())+"</html>");
					this.photo(b11);
					
					if (this.game.getFirstPlayer().getTeam().contains((Champion)(b[i][j])))
						b11.setBorder(BorderFactory.createLineBorder(Color.blue,3,true));
					      
				else if (this.game.getSecondPlayer().getTeam().contains((Champion)(b[i][j])))
					b11.setBorder(BorderFactory.createLineBorder(this.color,3,true));
				}
				else if (b[i][j] instanceof Cover) {
					b11.setToolTipText("Current HP : "+(((Damageable) (b[i][j])).getCurrentHP()));

					b11.setIcon(rock);
				}
			}
			else	if (i==0 && j==3) {
				b16.setText(assign(b[i][j]));
				if (b[i][j] instanceof Champion) {
					b16.setToolTipText("<html> name : "+((Champion)(b[i][j])).getName()+  "<br>Current HP : "+(((Damageable) (b[i][j])).getCurrentHP())+"</html>");
					this.photo(b16);
					
					if (this.game.getFirstPlayer().getTeam().contains((Champion)(b[i][j])))
						b16.setBorder(BorderFactory.createLineBorder(Color.blue,3,true));
					      
				else if (this.game.getSecondPlayer().getTeam().contains((Champion)(b[i][j])))
					b16.setBorder(BorderFactory.createLineBorder(this.color,3,true));
				}
				else if (b[i][j] instanceof Cover) {
					b16.setToolTipText("Current HP : "+(((Damageable) (b[i][j])).getCurrentHP()));

					b16.setIcon(rock);
				}
			}
			else	if (i==0 && j==4) {
				b21.setText(assign(b[i][j]));
				if (b[i][j] instanceof Champion) {
					b21.setToolTipText("<html> name : "+((Champion)(b[i][j])).getName()+  "<br>Current HP : "+(((Damageable) (b[i][j])).getCurrentHP())+"</html>");
					this.photo(b21);
					
					if (this.game.getFirstPlayer().getTeam().contains((Champion)(b[i][j])))
						b21.setBorder(BorderFactory.createLineBorder(Color.blue,3,true));
					      
				else if (this.game.getSecondPlayer().getTeam().contains((Champion)(b[i][j])))
					b21.setBorder(BorderFactory.createLineBorder(this.color,3,true));
				}
				else if (b[i][j] instanceof Cover) {
					b21.setToolTipText("Current HP : "+(((Damageable) (b[i][j])).getCurrentHP()));

					b21.setIcon(rock);
				}
			}
			
			else if (i==1 && j==0) {
				b2.setText(assign(b[i][j]));
				if (b[i][j] instanceof Champion) {
					b2.setToolTipText("<html> name : "+((Champion)(b[i][j])).getName()+  "<br>Current HP : "+(((Damageable) (b[i][j])).getCurrentHP())+"</html>");
					this.photo(b2);

					if (this.game.getFirstPlayer().getTeam().contains((Champion)(b[i][j])))
						b2.setBorder(BorderFactory.createLineBorder(Color.blue,3,true));
					      
				else if (this.game.getSecondPlayer().getTeam().contains((Champion)(b[i][j])))
					b2.setBorder(BorderFactory.createLineBorder(this.color,3,true));
				}
				else if (b[i][j] instanceof Cover) {
					b2.setToolTipText("Current HP : "+(((Damageable) (b[i][j])).getCurrentHP()));

					b2.setIcon(rock);
				}
			}
			else if (i==1 && j==1) {
				b7.setText(assign(b[i][j]));
				if (b[i][j] instanceof Champion) {
					b7.setToolTipText("<html> name : "+((Champion)(b[i][j])).getName()+  "<br>Current HP : "+(((Damageable) (b[i][j])).getCurrentHP())+"</html>");
					this.photo(b7);
					
					if (this.game.getFirstPlayer().getTeam().contains((Champion)(b[i][j])))
						b7.setBorder(BorderFactory.createLineBorder(Color.blue,3,true));
					      
				else if (this.game.getSecondPlayer().getTeam().contains((Champion)(b[i][j])))
					b7.setBorder(BorderFactory.createLineBorder(this.color,3,true));
				}
				else if (b[i][j] instanceof Cover) {
					b7.setToolTipText("Current HP : "+(((Damageable) (b[i][j])).getCurrentHP()));

					b7.setIcon(rock);
				}
			}
			else	if (i==1 && j==2) {
				b12.setText(assign(b[i][j]));
				if (b[i][j] instanceof Champion) {
					
					b12.setToolTipText("<html> name : "+((Champion)(b[i][j])).getName()+  "<br>Current HP : "+(((Damageable) (b[i][j])).getCurrentHP())+"</html>");
					this.photo(b12);
					
					if (this.game.getFirstPlayer().getTeam().contains((Champion)(b[i][j])))
						b12.setBorder(BorderFactory.createLineBorder(Color.blue,3,true));
					      
				else if (this.game.getSecondPlayer().getTeam().contains((Champion)(b[i][j])))
					b12.setBorder(BorderFactory.createLineBorder(this.color,3,true));
				}
				else if (b[i][j] instanceof Cover) {
					b12.setToolTipText("Current HP : "+(((Damageable) (b[i][j])).getCurrentHP()));

					b12.setIcon(rock);
				}
			}
			else	if (i==1 && j==3) {
				b17.setText(assign(b[i][j]));
				if (b[i][j] instanceof Champion) {
					b17.setToolTipText("<html> name : "+((Champion)(b[i][j])).getName()+  "<br>Current HP : "+(((Damageable) (b[i][j])).getCurrentHP())+"</html>");
					this.photo(b17);
					
					if (this.game.getFirstPlayer().getTeam().contains((Champion)(b[i][j])))
						b17.setBorder(BorderFactory.createLineBorder(Color.blue,3,true));
					      
				else if (this.game.getSecondPlayer().getTeam().contains((Champion)(b[i][j])))
					b17.setBorder(BorderFactory.createLineBorder(this.color,3,true));
				}
				else if (b[i][j] instanceof Cover) {	
					b17.setToolTipText("Current HP : "+(((Damageable) (b[i][j])).getCurrentHP()));

					b17.setIcon(rock);
				}
			}
			else		if (i==1 && j==4) {
				b22.setText(assign(b[i][j]));
				if (b[i][j] instanceof Champion) {
					b22.setToolTipText("<html> name : "+((Champion)(b[i][j])).getName()+  "<br>Current HP : "+(((Damageable) (b[i][j])).getCurrentHP())+"</html>");
					this.photo(b22);
					
					if (this.game.getFirstPlayer().getTeam().contains((Champion)(b[i][j])))
						b22.setBorder(BorderFactory.createLineBorder(Color.blue,3,true));
					      
				else if (this.game.getSecondPlayer().getTeam().contains((Champion)(b[i][j])))
					b22.setBorder(BorderFactory.createLineBorder(this.color,3,true));
				}
				else if (b[i][j] instanceof Cover) {
					b22.setToolTipText("Current HP : "+(((Damageable) (b[i][j])).getCurrentHP()));

					b22.setIcon(rock);
				}
			}
			else		if (i==2 && j==0) {			
				b3.setText(assign(b[i][j]));
				if (b[i][j] instanceof Champion) {
					b3.setToolTipText("<html> name : "+((Champion)(b[i][j])).getName()+  "<br>Current HP : "+(((Damageable) (b[i][j])).getCurrentHP())+"</html>");
					this.photo(b3);
					
					if (this.game.getFirstPlayer().getTeam().contains((Champion)(b[i][j])))
						b3.setBorder(BorderFactory.createLineBorder(Color.blue,3,true));
					      
				else if (this.game.getSecondPlayer().getTeam().contains((Champion)(b[i][j])))
					b3.setBorder(BorderFactory.createLineBorder(this.color,3,true));
				}
				else if (b[i][j] instanceof Cover) {
					b3.setToolTipText("Current HP : "+(((Damageable) (b[i][j])).getCurrentHP()));

					b3.setIcon(rock);
				}
			}
			else		if (i==2 && j==1) {
				b8.setText(assign(b[i][j]));
				if (b[i][j] instanceof Champion) {
					b8.setToolTipText("<html> name : "+((Champion)(b[i][j])).getName()+  "<br>Current HP : "+(((Damageable) (b[i][j])).getCurrentHP())+"</html>");
					this.photo(b8);
					
					if (this.game.getFirstPlayer().getTeam().contains((Champion)(b[i][j])))
						b8.setBorder(BorderFactory.createLineBorder(Color.blue,3,true));
					      
				else if (this.game.getSecondPlayer().getTeam().contains((Champion)(b[i][j])))
					b8.setBorder(BorderFactory.createLineBorder(this.color,3,true));
				}
				else if (b[i][j] instanceof Cover) {
					b8.setToolTipText("Current HP : "+(((Damageable) (b[i][j])).getCurrentHP()));

					b8.setIcon(rock);
				}
			}
			else		if (i==2 && j==2) {
				b13.setText(assign(b[i][j]));
				
				if (b[i][j] instanceof Champion) {
					b13.setToolTipText("<html> name : "+((Champion)(b[i][j])).getName()+  "<br>Current HP : "+(((Damageable) (b[i][j])).getCurrentHP())+"</html>");
					this.photo(b13);
					
					if (this.game.getFirstPlayer().getTeam().contains((Champion)(b[i][j])))
						b13.setBorder(BorderFactory.createLineBorder(Color.blue,3,true));
					      
				else if (this.game.getSecondPlayer().getTeam().contains((Champion)(b[i][j])))
					b13.setBorder(BorderFactory.createLineBorder(this.color,3,true));
				}
				else if (b[i][j] instanceof Cover) {
					b13.setToolTipText("Current HP : "+(((Damageable) (b[i][j])).getCurrentHP()));

					b13.setIcon(rock);
				}
			}
			else	if (i==2 && j==3) {
				b18.setText(assign(b[i][j]));
				if (b[i][j] instanceof Champion) {
					b18.setToolTipText("<html> name : "+((Champion)(b[i][j])).getName()+  "<br>Current HP : "+(((Damageable) (b[i][j])).getCurrentHP())+"</html>");
					this.photo(b18);
					
					if (this.game.getFirstPlayer().getTeam().contains((Champion)(b[i][j])))
						b18.setBorder(BorderFactory.createLineBorder(Color.blue,3,true));
					      
				else if (this.game.getSecondPlayer().getTeam().contains((Champion)(b[i][j])))
					b18.setBorder(BorderFactory.createLineBorder(this.color,3,true));
				}
				else if (b[i][j] instanceof Cover) {
					b18.setToolTipText("Current HP : "+(((Damageable) (b[i][j])).getCurrentHP()));

					b18.setIcon(rock);
				}
			}
			else	if (i==2 && j==4) {
				b23.setText(assign(b[i][j]));
				if (b[i][j] instanceof Champion) {
					b23.setToolTipText("<html> name : "+((Champion)(b[i][j])).getName()+  "<br>Current HP : "+(((Damageable) (b[i][j])).getCurrentHP())+"</html>");
					this.photo(b23);
					
					if (this.game.getFirstPlayer().getTeam().contains((Champion)(b[i][j])))
						b23.setBorder(BorderFactory.createLineBorder(Color.blue,3,true));
					      
				else if (this.game.getSecondPlayer().getTeam().contains((Champion)(b[i][j])))
					b23.setBorder(BorderFactory.createLineBorder(this.color,3,true));
				}
				else if (b[i][j] instanceof Cover) {
					b23.setToolTipText("Current HP : "+(((Damageable) (b[i][j])).getCurrentHP()));

					b23.setIcon(rock);
				}
			}
			
			else	if (i==3 && j==0) {
				
				b4.setText(assign(b[i][j]));
				if (b[i][j] instanceof Champion) {
					b4.setToolTipText("<html> name : "+((Champion)(b[i][j])).getName()+  "<br>Current HP : "+(((Damageable) (b[i][j])).getCurrentHP())+"</html>");
					this.photo(b4);
					
					if (this.game.getFirstPlayer().getTeam().contains((Champion)(b[i][j])))
						b4.setBorder(BorderFactory.createLineBorder(Color.blue,3,true));
					      
				else if (this.game.getSecondPlayer().getTeam().contains((Champion)(b[i][j])))
					b4.setBorder(BorderFactory.createLineBorder(this.color,3,true));
				}
				else if (b[i][j] instanceof Cover) {
					b4.setToolTipText("Current HP : "+(((Damageable) (b[i][j])).getCurrentHP()));

					b4.setIcon(rock);
				}
			}
			else			if (i==3 && j==1) {
				b9.setText(assign(b[i][j]));
				if (b[i][j] instanceof Champion) {
					b9.setToolTipText("<html> name : "+((Champion)(b[i][j])).getName()+  "<br>Current HP : "+(((Damageable) (b[i][j])).getCurrentHP())+"</html>");
					this.photo(b9);
					
					if (this.game.getFirstPlayer().getTeam().contains((Champion)(b[i][j])))
						b9.setBorder(BorderFactory.createLineBorder(Color.blue,3,true));
					      
				else if (this.game.getSecondPlayer().getTeam().contains((Champion)(b[i][j])))
					b9.setBorder(BorderFactory.createLineBorder(this.color,3,true));
				}
				else if (b[i][j] instanceof Cover) {
					b9.setToolTipText("Current HP : "+(((Damageable) (b[i][j])).getCurrentHP()));

					b9.setIcon(rock);
				}
			}
			else			if (i==3 && j==2) {
				b14.setText(assign(b[i][j]));
				if (b[i][j] instanceof Champion) {
					b14.setToolTipText("<html> name : "+((Champion)(b[i][j])).getName()+  "<br>Current HP : "+(((Damageable) (b[i][j])).getCurrentHP())+"</html>");
					this.photo(b14);
					
					if (this.game.getFirstPlayer().getTeam().contains((Champion)(b[i][j])))
						b14.setBorder(BorderFactory.createLineBorder(Color.blue,3,true));
					      
				else if (this.game.getSecondPlayer().getTeam().contains((Champion)(b[i][j])))
					b14.setBorder(BorderFactory.createLineBorder(this.color,3,true));
				}
				else if (b[i][j] instanceof Cover) {
					b14.setToolTipText("Current HP : "+(((Damageable) (b[i][j])).getCurrentHP()));

					b14.setIcon(rock);
				}
			}
			else			if (i==3 && j==3) {
				b19.setText(assign(b[i][j]));
				if (b[i][j] instanceof Champion) {
					b19.setToolTipText("<html> name : "+((Champion)(b[i][j])).getName()+  "<br>Current HP : "+(((Damageable) (b[i][j])).getCurrentHP())+"</html>");
					this.photo(b19);
					
					if (this.game.getFirstPlayer().getTeam().contains((Champion)(b[i][j])))
						b19.setBorder(BorderFactory.createLineBorder(Color.blue,3,true));
					      
				else if (this.game.getSecondPlayer().getTeam().contains((Champion)(b[i][j])))
					b19.setBorder(BorderFactory.createLineBorder(this.color,3,true));
				}
				else if (b[i][j] instanceof Cover) {
					b19.setToolTipText("Current HP : "+(((Damageable) (b[i][j])).getCurrentHP()));

					b19.setIcon(rock);
				}
			}
			else		if (i==3 && j==4) {
				
				b24.setText(assign(b[i][j]));
				if (b[i][j] instanceof Champion) {
					b24.setToolTipText("<html> name : "+((Champion)(b[i][j])).getName()+  "<br>Current HP : "+(((Damageable) (b[i][j])).getCurrentHP())+"</html>");
					this.photo(b24);
					
					if (this.game.getFirstPlayer().getTeam().contains((Champion)(b[i][j])))
						b24.setBorder(BorderFactory.createLineBorder(Color.blue,3,true));
					      
				else if (this.game.getSecondPlayer().getTeam().contains((Champion)(b[i][j])))
					b24.setBorder(BorderFactory.createLineBorder(this.color,3,true));
				}
				else if (b[i][j] instanceof Cover) {
					b24.setToolTipText("Current HP : "+(((Damageable) (b[i][j])).getCurrentHP()));

					b24.setIcon(rock);
				}
			}
			else		if (i==4 && j==0) {
				b5.setText(assign(b[i][j]));
				if (b[i][j] instanceof Champion) {
					b5.setToolTipText("<html> name : "+((Champion)(b[i][j])).getName()+  "<br>Current HP : "+(((Damageable) (b[i][j])).getCurrentHP())+"</html>");
					this.photo(b5);
					
					if (this.game.getFirstPlayer().getTeam().contains((Champion)(b[i][j])))
						b5.setBorder(BorderFactory.createLineBorder(Color.blue,3,true));
					      
				else if (this.game.getSecondPlayer().getTeam().contains((Champion)(b[i][j])))
					b5.setBorder(BorderFactory.createLineBorder(this.color,3,true));
				}
				else if (b[i][j] instanceof Cover) {
					b5.setToolTipText("Current HP : "+(((Damageable) (b[i][j])).getCurrentHP()));

					b5.setIcon(rock);
				}
			}
			else		if (i==4 && j==1) {
				
				b10.setText(assign(b[i][j]));
				if (b[i][j] instanceof Champion) {
					b10.setToolTipText("<html> name : "+((Champion)(b[i][j])).getName()+  "<br>Current HP : "+(((Damageable) (b[i][j])).getCurrentHP())+"</html>");
					this.photo(b10);
					
					if (this.game.getFirstPlayer().getTeam().contains((Champion)(b[i][j])))
						b10.setBorder(BorderFactory.createLineBorder(Color.blue,3,true));
					      
				else if (this.game.getSecondPlayer().getTeam().contains((Champion)(b[i][j])))
					b10.setBorder(BorderFactory.createLineBorder(this.color,3,true));
				}
				else if (b[i][j] instanceof Cover) {
					b10.setToolTipText("Current HP : "+(((Damageable) (b[i][j])).getCurrentHP()));

					b10.setIcon(rock);
				}
			}
			else		if (i==4 && j==2) {
				b15.setText(assign(b[i][j]));
				
				if (b[i][j] instanceof Champion) {
					b15.setToolTipText("<html> name : "+((Champion)(b[i][j])).getName()+  "<br>Current HP : "+(((Damageable) (b[i][j])).getCurrentHP())+"</html>");
					this.photo(b15);
					
					if (this.game.getFirstPlayer().getTeam().contains((Champion)(b[i][j])))
						b15.setBorder(BorderFactory.createLineBorder(Color.blue,3,true));
					      
				else if (this.game.getSecondPlayer().getTeam().contains((Champion)(b[i][j])))
					b15.setBorder(BorderFactory.createLineBorder(this.color,3,true));
				}
				else if (b[i][j] instanceof Cover) {
					b15.setToolTipText("Current HP : "+(((Damageable) (b[i][j])).getCurrentHP()));

					b15.setIcon(rock);
				}
			}
			else		if (i==4 && j==3) {
				b20.setText(assign(b[i][j]));
				if (b[i][j] instanceof Champion) {
					b20.setToolTipText("<html> name : "+((Champion)(b[i][j])).getName()+  "<br>Current HP : "+(((Damageable) (b[i][j])).getCurrentHP())+"</html>");
					this.photo(b20);
					
					if (this.game.getFirstPlayer().getTeam().contains((Champion)(b[i][j])))
						b20.setBorder(BorderFactory.createLineBorder(Color.blue,3,true));
					      
				else if (this.game.getSecondPlayer().getTeam().contains((Champion)(b[i][j])))
					b20.setBorder(BorderFactory.createLineBorder(this.color,3,true));
				}
				else if (b[i][j] instanceof Cover) {
					b20.setToolTipText("Current HP : "+(((Damageable) (b[i][j])).getCurrentHP()));

					b20.setIcon(rock);
				}
			}
			else		if (i==4 && j==4) {
				b25.setText(assign(b[i][j]));				
				if (b[i][j] instanceof Champion) {
					b25.setToolTipText("<html> name : "+((Champion)(b[i][j])).getName()+  "<br>Current HP : "+(((Damageable) (b[i][j])).getCurrentHP())+"</html>");
					this.photo(b25);
					
					if (this.game.getFirstPlayer().getTeam().contains((Champion)(b[i][j])))
						b25.setBorder(BorderFactory.createLineBorder(Color.blue,3,true));
					      
				else if (this.game.getSecondPlayer().getTeam().contains((Champion)(b[i][j])))
					b25.setBorder(BorderFactory.createLineBorder(this.color,3,true));
				}
				else if (b[i][j] instanceof Cover) {
					b25.setToolTipText("Current HP : "+(((Damageable) (b[i][j])).getCurrentHP()));

					b25.setIcon(rock);
				}
			}
		  }
	  } 
	  
  }
  
  public String assign(Object o) {
	  String s="";
	  if (o instanceof Champion) {
		  s=((Champion)(o)).getName();
	  }
	
	  return s;
  }
  
  public void turn() {
	  current.setText("<html><strong> CURRENT CHAMPION</strong>" + "<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+this.game.getCurrentChampion().getName()+"</html>");

	  if (this.game.getTurnOrder().getNItems()==1 ) {
	      next.setText("");
	      next1.setText("");
	      next2.setText("");
	      next3.setText("");
	      next4.setText("");
	  }else if (this.game.getTurnOrder().getNItems()==2){
      next.setText(((Champion) this.game.getTurnOrder().next()).getName());
      next1.setText("");
      next2.setText("");
      next3.setText("");
      next4.setText("");
	  }
	  else if (this.game.getTurnOrder().getNItems()==3){
	      next.setText(((Champion) this.game.getTurnOrder().next()).getName());
	      next1.setText(((Champion) this.game.getTurnOrder().next1()).getName());
	      next2.setText("");
	      next3.setText("");
	      next4.setText("");
		  }
	  else if (this.game.getTurnOrder().getNItems()==4){
	      next.setText(((Champion) this.game.getTurnOrder().next()).getName());
	      next1.setText(((Champion) this.game.getTurnOrder().next1()).getName());
	      next2.setText(((Champion) this.game.getTurnOrder().next2()).getName());
	      next3.setText("");
	      next4.setText("");
		  }
	  else if (this.game.getTurnOrder().getNItems()==5){
	      next.setText(((Champion) this.game.getTurnOrder().next()).getName());
	      next1.setText(((Champion) this.game.getTurnOrder().next1()).getName());
	      next2.setText(((Champion) this.game.getTurnOrder().next2()).getName());
	      next3.setText(((Champion) this.game.getTurnOrder().next3()).getName());
	      next4.setText("");
		  }
	  else if (this.game.getTurnOrder().getNItems()==6){
	      next.setText(((Champion) this.game.getTurnOrder().next()).getName());
	      next1.setText(((Champion) this.game.getTurnOrder().next1()).getName());
	      next2.setText(((Champion) this.game.getTurnOrder().next2()).getName());
	      next3.setText(((Champion) this.game.getTurnOrder().next3()).getName());
	      next4.setText(((Champion) this.game.getTurnOrder().next4()).getName());
		  }
  }

  public void updatepackage() {
	 this.bordersetter();
	  
	 this.update(this.game.getBoard());
		
     HPbar.setMaximum(this.game.getCurrentChampion().getMaxHP());
	 HPbar.setValue(this.game.getCurrentChampion().getCurrentHP());
	 double percent=( (double)((double)(this.game.getCurrentChampion().getCurrentHP())/((double)(this.game.getCurrentChampion().getMaxHP())))*100 );
	 HPbar.setString("Current HP " + (int)(percent) + "%");

	 currentinfo.setText(this.info(this.game.getCurrentChampion()));
		
	 abilityinfo1.setText(this.game.getCurrentChampion().getAbilities().get(0).getName());
	 abilityinfo2.setText(this.game.getCurrentChampion().getAbilities().get(1).getName());
	 abilityinfo3.setText(this.game.getCurrentChampion().getAbilities().get(2).getName());
	  
	  this.turn();
	  this.revalidate();
	  this.repaint();
  }
@Override
public void actionPerformed(ActionEvent e) {
	if (e.getSource()==this.end) {
		
		this.game.endTurn();
		
		this.updatepackage();
		
		if (this.game.checkGameOver()==null) {
			
		}else {
			new winner_frame(this.game.checkGameOver());
			this.dispose();
		}
	}
	else if (e.getSource()==team1) {
		this.updatepackage();
		
		new teamdisplay(this.game.getFirstPlayer());
	}
   else if (e.getSource()==team2) {
		this.updatepackage();

	   
	   new teamdisplay(this.game.getSecondPlayer());
	}
   else if (e.getSource()==ability1) {
		this.updatepackage();

	   
	   new abilitydisplay(this.game.getCurrentChampion().getAbilities().get(0));
	   
   }else if (e.getSource()==ability2) {
		this.updatepackage();

	   
	   new abilitydisplay(this.game.getCurrentChampion().getAbilities().get(1));
	   
   }else if (e.getSource()==ability3) {
		this.updatepackage();

	   
	   new abilitydisplay(this.game.getCurrentChampion().getAbilities().get(2));   
   }
	
	
   else if (e.getSource()==leaderability1) {
	   try {
	   this.game.useLeaderAbility();
	   leaderability1.setText("<html>Player 1"+"<br> leader ability"+"<br>(your leader ability is used)"+"</html>");
	   leaderability1.setEnabled(false);
	   }catch(LeaderAbilityAlreadyUsedException e2) {
		   JOptionPane.showMessageDialog(this, e2.getMessage());
	   }catch(LeaderNotCurrentException e2) {
		   JOptionPane.showMessageDialog(this, e2.getMessage());
	   }
		this.updatepackage();

	        if (this.game.checkGameOver()==null) {
			
		}else {
			new winner_frame(this.game.checkGameOver());
			this.dispose();
		}
	      
   }
   
   else if (e.getSource()==leaderability2) {
	   try {
	   this.game.useLeaderAbility();
	   leaderability2.setText("<html>Player 2"+"<br> leader ability"+"<br>(your leader ability is used)"+"</html>");
	   leaderability2.setEnabled(false);
	   }catch(LeaderAbilityAlreadyUsedException e2) {
		   JOptionPane.showMessageDialog(this, e2.getMessage());
	   }catch(LeaderNotCurrentException e2) {
		   JOptionPane.showMessageDialog(this, e2.getMessage());
	   }
		this.updatepackage();

	        if (this.game.checkGameOver()==null) {
			
		}else {
			new winner_frame(this.game.checkGameOver());
			this.dispose();
		}
   
   }
   
   else if (e.getSource()==cast1) {
	  if (this.game.getCurrentChampion().getAbilities().get(0).getCastArea().equals(AreaOfEffect.DIRECTIONAL)) {
		  Direction d = null;
			String [] s= {"DOWN","UP","LEFT","RIGHT"};
			int i= JOptionPane.showOptionDialog(null, "Choose direction", "Casting an ability", 
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, s, 0);
			
			if (i==-1)
				return;
			
				if (i==0) {
				 d=Direction.RIGHT;
				}
				else if (i==1) {
					d=Direction.LEFT;
				}
				else if (i==2) {
					d=Direction.DOWN;
				}
				else if (i==3) {
					d=Direction.UP;
				}
				
				
				try {
				this.game.castAbility(this.game.getCurrentChampion().getAbilities().get(0), d);
			}catch(AbilityUseException e2) {
				  JOptionPane.showMessageDialog(this, e2.getMessage());
			}catch(NotEnoughResourcesException e2){
				  JOptionPane.showMessageDialog(this, e2.getMessage());
			}catch(CloneNotSupportedException e2) {
				  JOptionPane.showMessageDialog(this, e2.getMessage());
			}  
				this.updatepackage();

				
				if (this.game.checkGameOver()==null) {
					
				}else {
					new winner_frame(this.game.checkGameOver());
					this.dispose();
				}
			
	  }  
	  else if (this.game.getCurrentChampion().getAbilities().get(0).getCastArea().equals(AreaOfEffect.SINGLETARGET)) {
		  
		  String [] s= {"0","1","2","3","4"};
		  
			int x= JOptionPane.showOptionDialog(null, "Choose a value for x", "Casting an ability", 
					JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, s, 0);
			
			int y= JOptionPane.showOptionDialog(null, "Choose a value for y", "Casting an ability", 
					JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, s, 0);
			
			if (x==-1  || y==-1)
				return;
			
		  try {
			  this.game.castAbility(this.game.getCurrentChampion().getAbilities().get(0), x, y);
		  }catch(AbilityUseException e2) {
			  JOptionPane.showMessageDialog(this, e2.getMessage());
		  }catch(NotEnoughResourcesException e2) {
			  JOptionPane.showMessageDialog(this, e2.getMessage());
		  }catch(InvalidTargetException e2) {
			  JOptionPane.showMessageDialog(this, e2.getMessage());			  
		  }catch(CloneNotSupportedException e2) {
			  JOptionPane.showMessageDialog(this, e2.getMessage());			  
		  }
			this.updatepackage();

			if (this.game.checkGameOver()==null) {
				
			}else {
				new winner_frame(this.game.checkGameOver());
				this.dispose();
			}
			
	  }
	  else {
		  try {
		  this.game.castAbility(this.game.getCurrentChampion().getAbilities().get(0));
	  }
		  catch(AbilityUseException e2) {
			  JOptionPane.showMessageDialog(this, e2.getMessage());
		  }
		  catch(NotEnoughResourcesException e2) {
			  JOptionPane.showMessageDialog(this, e2.getMessage());
		  }
		  catch(CloneNotSupportedException e2) {
			  JOptionPane.showMessageDialog(this, e2.getMessage());
		  }
	  }
		this.updatepackage();

		if (this.game.checkGameOver()==null) {
			
		}else {
			new winner_frame(this.game.checkGameOver());
			this.dispose();
		}
	

   } 
   else if (e.getSource()==cast2) {
		  if (this.game.getCurrentChampion().getAbilities().get(1).getCastArea().equals(AreaOfEffect.DIRECTIONAL)) {
			  
			    Direction d = null;
				String [] s= {"DOWN","UP","LEFT","RIGHT"};
				int i= JOptionPane.showOptionDialog(null, "Choose direction", "Casting an ability", 
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, s, 0);
				if (i==-1)
					return;
				
					if (i==0) {
					 d=Direction.RIGHT;
					}
					else if (i==1) {
						d=Direction.LEFT;
					}else if (i==2) {
						d=Direction.DOWN;
					}else if (i==3) {
						d=Direction.UP;
					}
					
					try {
					this.game.castAbility(this.game.getCurrentChampion().getAbilities().get(1), d);
				}catch(AbilityUseException e2) {
					  JOptionPane.showMessageDialog(this, e2.getMessage());
				}catch(NotEnoughResourcesException e2){
					  JOptionPane.showMessageDialog(this, e2.getMessage());
				}catch(CloneNotSupportedException e2) {
					  JOptionPane.showMessageDialog(this, e2.getMessage());
				}
					this.updatepackage();

					if (this.game.checkGameOver()==null) {
						
					}else {
						new winner_frame(this.game.checkGameOver());
						this.dispose();
					}
				
		  }
		  else if (this.game.getCurrentChampion().getAbilities().get(1).getCastArea().equals(AreaOfEffect.SINGLETARGET)) {
			  String [] s= {"0","1","2","3","4"};
			  
				int x= JOptionPane.showOptionDialog(null, "Choose a value for x", "Casting an ability", 
						JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, s, 0);
				
				int y= JOptionPane.showOptionDialog(null, "Choose a value for y", "Casting an ability", 
						JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, s, 0);
	      
				if (x==-1  || y==-1)
					return;
		
			  try {
				  this.game.castAbility(this.game.getCurrentChampion().getAbilities().get(1), x, y);
			  }catch(AbilityUseException e2) {
				  JOptionPane.showMessageDialog(this, e2.getMessage());
			  }catch(NotEnoughResourcesException e2) {
				  JOptionPane.showMessageDialog(this, e2.getMessage());
			  }catch(InvalidTargetException e2) {
				  JOptionPane.showMessageDialog(this, e2.getMessage());			  
			  }catch(CloneNotSupportedException e2) {
				  JOptionPane.showMessageDialog(this, e2.getMessage());			  
			  }
				this.updatepackage();

				if (this.game.checkGameOver()==null) {
					
				}else {
					new winner_frame(this.game.checkGameOver());
					this.dispose();
				}
				
  
		  }
		  else {
			  try {
			  this.game.castAbility(this.game.getCurrentChampion().getAbilities().get(1));
		  }
			  catch(AbilityUseException e2) {
				  JOptionPane.showMessageDialog(this, e2.getMessage());
			  }
			  catch(NotEnoughResourcesException e2) {
				  JOptionPane.showMessageDialog(this, e2.getMessage());
			  }
			  catch(CloneNotSupportedException e2) {
				  JOptionPane.showMessageDialog(this, e2.getMessage());
			  }
				this.updatepackage();

				if (this.game.checkGameOver()==null) {
					
				}else {
					new winner_frame(this.game.checkGameOver());
					this.dispose();
				}
				
		  }
}else if (e.getSource()==cast3) {
	  if (this.game.getCurrentChampion().getAbilities().get(2).getCastArea().equals(AreaOfEffect.DIRECTIONAL)) {
		  
		  Direction direction = null;
		  
			String [] s= {"DOWN","UP","LEFT","RIGHT"};
			
			int i= JOptionPane.showOptionDialog(null, "Choose direction", "Casting an ability", 
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, s, 0);
			
			if (i==-1)
				return;
			
		    	if (i==0) {
				    direction=Direction.RIGHT;
				}
				else if (i==1) {
					direction=Direction.LEFT;
				}else if (i==2) {
					direction=Direction.DOWN;
				}else if (i==3) {
					direction=Direction.UP;
				}
			
				try {
				this.game.castAbility(this.game.getCurrentChampion().getAbilities().get(2), direction);
			}catch(AbilityUseException e2) {
				  JOptionPane.showMessageDialog(this, e2.getMessage());
			}catch(NotEnoughResourcesException e2){
				  JOptionPane.showMessageDialog(this, e2.getMessage());
			}catch(CloneNotSupportedException e2) {
				  JOptionPane.showMessageDialog(this, e2.getMessage());
			}	
				this.updatepackage();

				
				if (this.game.checkGameOver()==null) {
					
				}else {
					new winner_frame(this.game.checkGameOver());
					this.dispose();
				}
			
  
	  }
 else if (this.game.getCurrentChampion().getAbilities().get(2).getCastArea().equals(AreaOfEffect.SINGLETARGET)) {
	 
	  String [] s= {"0","1","2","3","4"};
	  
		int x= JOptionPane.showOptionDialog(null, "Choose a value for x", "Casting an ability", 
				JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, s, 0);
		
		int y= JOptionPane.showOptionDialog(null, "Choose a value for y", "Casting an ability", 
				JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, s, 0);
	  
		if (x==-1  || y==-1)
			return;
		
		
	  try {
		  this.game.castAbility(this.game.getCurrentChampion().getAbilities().get(2), x, y);
	  }catch(AbilityUseException e2) {
		  JOptionPane.showMessageDialog(this, e2.getMessage());
	  }catch(NotEnoughResourcesException e2) {
		  JOptionPane.showMessageDialog(this, e2.getMessage());
	  }catch(InvalidTargetException e2) {
		  JOptionPane.showMessageDialog(this, e2.getMessage());			  
	  }catch(CloneNotSupportedException e2) {
		  JOptionPane.showMessageDialog(this, e2.getMessage());			  
	  }
		this.updatepackage();

	
		if (this.game.checkGameOver()==null) {
			
		}else {
			new winner_frame(this.game.checkGameOver());
			this.dispose();
		}
	
	  }
	  else {
		  
		  try {
		  this.game.castAbility(this.game.getCurrentChampion().getAbilities().get(2));
	  }
		  catch(AbilityUseException e2) {
			  JOptionPane.showMessageDialog(this, e2.getMessage());
		  }
		  catch(NotEnoughResourcesException e2) {
			  JOptionPane.showMessageDialog(this, e2.getMessage());
		  }
		  catch(CloneNotSupportedException e2) {
			  JOptionPane.showMessageDialog(this, e2.getMessage());
		  }
			this.updatepackage();

		        
			if (this.game.checkGameOver()==null) {
				
			}else {
				new winner_frame(this.game.checkGameOver());
				this.dispose();
			}
			

	  }
}
else if (e.getSource()==attack) {
	  Direction d = null;
	  
		String [] s= {"DOWN","UP","LEFT","RIGHT"};
		
		int i= JOptionPane.showOptionDialog(null, "Choose direction", "Attacking", 
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, s, 0);
		
		if (i==-1)
			return;
		
			if(i==0) {
				d=Direction.RIGHT;
			}
			else if (i==1) {
				d=Direction.LEFT;
			}
			else if(i==2) {
				d=Direction.DOWN;
			}
			else if(i==3) {
				d=Direction.UP;
			}
		
		try {
		
			this.game.attack(d);
			
		}catch(ChampionDisarmedException e2) {
			  JOptionPane.showMessageDialog(this, e2.getMessage());

		}catch(NotEnoughResourcesException e2){
			  JOptionPane.showMessageDialog(this, e2.getMessage());
			  
		}catch(InvalidTargetException e2) {
			  JOptionPane.showMessageDialog(this, e2.getMessage());
		}
		
		this.updatepackage();		
	  
		if (this.game.checkGameOver()==null) {
			
		}else {
			new winner_frame(this.game.checkGameOver());
			this.dispose();
		}
		
}
else if (e.getSource()==right) {
	try {
	this.game.move(Direction.UP);
	}catch(UnallowedMovementException e2) {
		  JOptionPane.showMessageDialog(this, e2.getMessage());
	}catch(NotEnoughResourcesException e2) {
		  JOptionPane.showMessageDialog(this, e2.getMessage());
	}
	this.updatepackage();

   
}
else if (e.getSource()==left) {
	try {
		this.game.move(Direction.DOWN);
		}catch(UnallowedMovementException e2) {
			  JOptionPane.showMessageDialog(this, e2.getMessage());
		}catch(NotEnoughResourcesException e2) {
			  JOptionPane.showMessageDialog(this, e2.getMessage());
		}
	this.updatepackage();

}
else if (e.getSource()==up) {
	try {
		this.game.move(Direction.LEFT);
		}catch(UnallowedMovementException e2) {
			  JOptionPane.showMessageDialog(this, e2.getMessage());
		}catch(NotEnoughResourcesException e2) {
			  JOptionPane.showMessageDialog(this, e2.getMessage());
		}
	this.updatepackage();

}
else if (e.getSource()==down) {
	try {
		this.game.move(Direction.RIGHT);
		}catch(UnallowedMovementException e2) {
			  JOptionPane.showMessageDialog(this, e2.getMessage());
		}catch(NotEnoughResourcesException e2) {
			  JOptionPane.showMessageDialog(this, e2.getMessage());
		}
	this.updatepackage();

}
	
}

public String info(Champion c) {
	
	String type="";	
	
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
			
		for (int i=0;i<c.getAppliedEffects().size();i++) {
			effects+= "<br>"+" - "+ c.getAppliedEffects().get(i).getName()+ " , duration : "+ c.getAppliedEffects().get(i).getDuration();
		}
		
			if (effects.length()==0) {
					effects ="no effect is applied";
				}
				
				info = "<html>Name : " +c.getName()+"\n"+ "<br>Current HP : "+c.getCurrentHP()  +"<br>Attack Damage : "+ c.getAttackDamage() +"\n" + "<br>Attack Range : " + c.getAttackRange() +"\n" +
			                   "<br>Remaining Mana Points : "+c.getMana() + "\n" + "<br>Remaining Actions Points : "+c.getCurrentActionPoints()+"\n" +
			                   "<br>Champion type : " +type + "<br>Applied Effects :- " + effects +"</html>";	
						
		return info;
	}

}
  

