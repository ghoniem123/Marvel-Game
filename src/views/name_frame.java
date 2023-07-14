package views;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.text.Position;

import engine.Controller;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class name_frame extends JFrame implements ActionListener {
private	 Image i2=new ImageIcon("logo icon.png").getImage();
private Color color=new Color(0xe68a00);
private	 JTextField name1_field;
private	 JTextField name2_field;
private	 JButton name1_sumbit;
private	 JButton name2_sumbit;
private	 mypanel panel;
private String s1;
private String s2;
	
	public name_frame() {
		
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setExtendedState(JFrame.MAXIMIZED_BOTH);
			this.setTitle("Marvel Ultimate War");
			this.setFont(new Font("TIMES ROMAN",Font.BOLD,30));
			this.setIconImage(i2);
			
		
	   panel = new mypanel();
	   
	   panel.setLayout(null);
	   
	   name1_field=new JTextField("Enter first player name");
	   name2_field=new JTextField("Enter second player name");

	   name1_sumbit=new JButton ("Enter");
	   name2_sumbit=new JButton ("Enter");
	 
			
	   name1_field.setBounds(200,700,200,50);
	   name2_field.setBounds(1200,700,200,50);
       name1_sumbit.setBounds(400,700,70,50);
       name2_sumbit.setBounds(1400,700,70,50);

       name1_sumbit.setBackground(Color.black);
       name2_sumbit.setBackground(Color.black);

       name1_sumbit.setForeground(Color.blue);
       name2_sumbit.setForeground(color);

       name1_sumbit.setFocusPainted(false);
       name2_sumbit.setFocusPainted(false);
       
	   name1_field.setCaretColor(Color.white);
	   name2_field.setCaretColor(Color.white);

	   name1_field.setBackground(Color.black);
	   name2_field.setBackground(Color.black);

	   name1_field.setFont(new Font("TIMES ROMAN",Font.PLAIN,15));
	   name2_field.setFont(new Font("TIMES ROMAN",Font.PLAIN,15));

	   name1_field.setForeground(Color.blue);
	   name2_field.setForeground(color);
         
	   name1_sumbit.addActionListener(this);
	   name2_sumbit.addActionListener(this);
	   
	   name1_sumbit.setActionCommand("name1:"+name1_field.getText());
	   name2_sumbit.setActionCommand("name2:"+name2_field.getText());

	   name1_field.setVisible(true);
	   name2_field.setVisible(true);
	   
	    panel.add(name1_sumbit);
	    panel.add(name2_sumbit);
		panel.add(name1_field);
		panel.add(name2_field);
		this.add(panel);
		this.setVisible(true);
		
	}
	

	public String getS1() {
		return s1;
	}



	public void setS1(String s1) {
		this.s1 = s1;
	}



	public String getS2() {
		return s2;
	}



	public void setS2(String s2) {
		this.s2 = s2;
	}


	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==name1_sumbit) {
			if (name1_field.getText().isBlank()) {
				   JOptionPane.showMessageDialog(null, "please enter the first player name", "player name", JOptionPane.INFORMATION_MESSAGE);
			}else {
			s1=name1_field.getText();
			
			name1_sumbit.setEnabled(false);
		}
		}
		else if (e.getSource()==name2_sumbit) {
			if (name2_field.getText().isBlank()) {
				   JOptionPane.showMessageDialog(null, "please enter the second player name", "player name", JOptionPane.INFORMATION_MESSAGE);
			}else {
			s2=name2_field.getText();

			name2_sumbit.setEnabled(false);
			}
           }		
		if (!(name1_sumbit.isEnabled()) && !(name2_sumbit.isEnabled()) ) {
		    new pick_frame(this.getS1(),this.getS2());
	
	     	this.dispose();
		}
	}

}
