
import javax.management.timer.Timer;


import java.util.Calendar;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;




public class MyCalFrame extends JFrame{
	JButton btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnP,btnM,btnI,btnD,btnDot,btnE,btnC,btnMr,btnMs,btnsqrt,btnsqr,btnCube,btnTime,btnSin,btnCos,btnTan;
	JTextArea txt;
	JTextArea  txt2;
	JTextArea  txt3;
	
	
	
	
	
	
	public MyCalFrame(){
		
		this.setSize(290, 420);
		
		//this.setLocation(280, 160);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.initComponenet();
		this.setColor();
		this.setLayout();
		this.addComponentsToNoFrame();
		
		this. addButtonLis();
		this.f2();
		this.Listener();

		
		
	}
	
	
	


	





	public void initComponenet(){
		
		this.txt=new JTextArea();
		this.txt2=new JTextArea();
		this.txt3=new JTextArea();
		
		
		
		
		
		this.btn0=new JButton("0");
		
		this.btn1=new JButton("1");
		this.btn2=new JButton("2");
		this.btn3=new JButton("3");
		this.btn4=new JButton("4");
		this.btn5=new JButton("5");
		this.btn6=new JButton("6");
		this.btn7=new JButton("7");
		this.btn8=new JButton("8");
		this.btn9=new JButton("9");
		this.btnP=new JButton("+");
		this.btnM=new JButton("-");
		this.btnI=new JButton("*");
		this.btnD=new JButton("/");
		this.btnDot=new JButton(".");
		this.btnE=new JButton("=");
		this.btnC=new JButton("C");
		this.btnMr=new JButton("MR");
		this.btnMs=new JButton("MS");
		this.btnsqrt=new JButton("√");
		this.btnsqr=new JButton("^2");
		this.btnCube=new JButton("^3");
		this.btnTime=new JButton("T");
		this.btnSin=new JButton("sin");
		this.btnCos=new JButton("cos");
		this.btnTan=new JButton("tan");
		
		txt2.setEditable(false);
	
		
		
		
		

		
		
		
		}
	
	
	public void setColor(){
		
		btnC.setBackground(Color.RED);
		btn0.setBackground(Color.GREEN);
		btn1.setBackground(Color.GREEN);
		btn2.setBackground(Color.GREEN);
		btn3.setBackground(Color.GREEN);
		btn4.setBackground(Color.GREEN);
		
		btn5.setBackground(Color.GREEN);
		btn6.setBackground(Color.GREEN);
		btn7.setBackground(Color.GREEN);
		btn8.setBackground(Color.GREEN);
		btn9.setBackground(Color.GREEN);
		btn0.setBackground(Color.GREEN);
		btnDot.setBackground(Color.GREEN);
		btnP.setBackground(Color.ORANGE);
		btnM.setBackground(Color.ORANGE);
		btnD.setBackground(Color.ORANGE);
		btnE.setBackground(Color.ORANGE);
	    btnI.setBackground(Color.ORANGE);
	    btnMr.setBackground(Color.MAGENTA);
	    btnMs.setBackground(Color.MAGENTA);
	    btnsqrt.setBackground(Color.PINK);
	    btnsqr.setBackground(Color.PINK);
	    btnCube.setBackground(Color.PINK);
	    btnTime.setBackground(Color.blue);
	    btnSin.setBackground(Color.LIGHT_GRAY);
	    btnCos.setBackground(Color.LIGHT_GRAY);
	    btnTan.setBackground(Color.LIGHT_GRAY);
	    
		
		
		
		
		
		
	}
	
	public void addComponentsToNoFrame(){
		
		this.txt.setBounds(20, 10, 220, 40);
		this.txt.setEditable(false);
		this.txt.setFont(new Font("Arial",Font.PLAIN,16));
		this.txt2.setBounds(20,10,45,40);
		this.txt2.setFont(new Font("Arial",Font.PLAIN,18));
		this.txt3.setBounds(25, 10, 220, 40);
		this.txt3.setEditable(false);
		this.txt3.setFont(new Font("Arial",Font.PLAIN,16));
		
		this.btnTime.setBounds(190,60,41,20);
		this.btnC.setBounds(35,90,55, 25);
		this.btnMs.setBounds(105, 90, 55, 25);
		
		
		this.btnMr.setBounds(175, 90, 55, 25);
	
		this.btnsqrt.setBounds(35, 130, 55, 30);
		this.btnsqr.setBounds(105, 130, 55, 30);
		this.btnCube.setBounds(175, 130, 55, 30);
		this.btnSin.setBounds(35, 170, 55, 28);
		this.btnCos.setBounds(105, 170, 55, 28);
		this.btnTan.setBounds(175, 170, 55, 28);
		
		
		
	
		
		this.btn7.setBounds(20, 210, 45, 25);
		this.btn8.setBounds(80, 210, 45, 25);
		this.btn9.setBounds(140, 210, 45, 25);
		this.btnD.setBounds(200, 210, 45, 25);
		this.btn4.setBounds(20, 250, 45, 25);
		this.btn5.setBounds(80, 250, 45, 25);
		this.btn6.setBounds(140, 250, 45, 25);
		this.btnI.setBounds(200, 250, 45, 25);
		this.btn1.setBounds(20, 290, 45, 25);
		this.btn2.setBounds(80, 290, 45, 25);
		this.btn3.setBounds(140, 290, 45, 25);
		this.btnM.setBounds(200, 290, 45, 25);
		this.btn0.setBounds(20, 330, 45, 25);
		this.btnDot.setBounds(80, 330, 45, 25);
		this.btnE.setBounds(140, 330, 45, 25);
		this.btnP.setBounds(200, 330, 45, 25);
		//this.txt2.setBounds(20, 320, 95, 35);
		
		
		
		
		this.add(txt);
		this.add(btnC);
		this.add(btnMs);
		this.add(btnMr);
		
		this.add(btn7);
		this.add(btn8);
		this.add(btn9);
		this.add(btnD);
		this.add(btn4);
		this.add(btn5);
		this.add(btn6);
		this.add(btnI);
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(btnM);
		this.add(btn0);
		this.add(btnDot);
		this.add(btnE);
		this.add(btnP);
		this.add(btnsqrt);
		this.add(btnsqr);
		this.add(btnCube);
		this.add(btnTime);
		this.add(btnSin);
		this.add(btnCos);
		this.add(btnTan);
		this.add(txt2);
		this.add(txt3);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	public void setLayout(){
		
		this.setLayout(null);
		
		
	}
	
	
	void f2(){
		
		f2 lis = new f2(this);
		
		
		
		
		
		
	}
	
	void Listener(){
		
		Listener lis=new Listener(this);
		this.btnTime.addActionListener(lis);
		
		
		
	}
	
	public void addButtonLis(){
		
		
		
		
		
		
		MyActionLis lis = new MyActionLis(this);

		
		
		this.btn0.addActionListener(lis);	
		this.btn1.addActionListener(lis);
		this.btn2.addActionListener(lis);
		this.btn3.addActionListener(lis);
		this.btn4.addActionListener(lis);
		this.btn5.addActionListener(lis);
		this.btn6.addActionListener(lis);
		this.btn7.addActionListener(lis);
		this.btn8.addActionListener(lis);
		this.btn9.addActionListener(lis);
		this.btnP.addActionListener(lis);
		this.btnM.addActionListener(lis);
		this.btnD.addActionListener(lis);
		this.btnDot.addActionListener(lis);
		this.btnI.addActionListener(lis);
		this.btnE.addActionListener(lis);
		this.btnC.addActionListener(lis);
		
		this.btnMs.addActionListener(lis);
		this.btnMr.addActionListener(lis);
		this.btnsqrt.addActionListener(lis);
		this.btnsqr.addActionListener(lis);
		this.btnCube.addActionListener(lis);
		this.btnSin.addActionListener(lis);
		this.btnCos.addActionListener(lis);
		this.btnTan.addActionListener(lis);
		
		
		
		
		

		
		
		
		
		

}
}

