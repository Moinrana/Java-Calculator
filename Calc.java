import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Calc extends JFrame{
	JButton bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13,bt14,bt15,bt16;
	JPanel p;
	JTextField tf1;
	int calculation,n1,n2,n3;
	
	Calc(){
		this.setTitle("Main Calculator");
		this.setSize(450,450);
		//this.setLocationRelativeTo(null);
		//this.setResizable(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setComponent();
		this.setVisible(true);
	}
	
	
	void setComponent(){
		this.p   = new JPanel();
		p.setLayout(null);
		p.setBackground(Color.BLACK);
		
		this.bt1 = new JButton("+");
		this.bt2 = new JButton("-");
		this.bt3 = new JButton("/");
		this.bt4 = new JButton("*");
		this.bt5 = new JButton("0");
		this.bt6 = new JButton("1");
		this.bt7 = new JButton("2");
		this.bt8 = new JButton("3");
		this.bt9 = new JButton("4");
		this.bt10 = new JButton("5");
		this.bt11 = new JButton("6");
		this.bt12 = new JButton("7");
		this.bt13 = new JButton("8");
		this.bt14 = new JButton("9");
		this.bt15 = new JButton("=");
		this.bt16 = new JButton("C");
		
		
		
		
		this.tf1 = new JTextField();
		
		
		tf1.setBounds(1,1,498,30);
		tf1.setColumns(10);
		tf1.addKeyListener(new KeyAdapter(){
			public void keyTyped(KeyEvent e){
				char s = e.getKeyChar();
				if(((s <'0' )||( s >'9')) && (s!= '\b')){
					e.consume();
				}
			}
		});
		tf1.setBackground(Color.GRAY);
		
		
		bt1.setBounds(340,100,60,30);
		bt2.setBounds(340,150,60,30);
		bt3.setBounds(340,250,60,30);
		bt4.setBounds(340,200,60,30);
		bt5.setBounds(230,250,50,30);
		bt6.setBounds(230,200,50,30);
		bt7.setBounds(120,200,50,30);
		bt8.setBounds(10,200,50,30);
		bt9.setBounds(230,150,50,30);
		bt10.setBounds(120,150,50,30);
		bt11.setBounds(10,150,50,30);
		bt12.setBounds(230,100,50,30);
		bt13.setBounds(120,100,50,30);
		bt14.setBounds(10,100,50,30);
		bt15.setBounds(340,300,80,30);
		bt16.setBounds(230,300,80,30);
		
		
//......add into panel....
	    p.add(tf1);
	
		p.add(bt1);
		p.add(bt2);
		p.add(bt3);
		p.add(bt4);
	    p.add(bt5);
		p.add(bt6);
		p.add(bt7);
		p.add(bt8);
	    p.add(bt9);
		p.add(bt10);
		p.add(bt11);
		p.add(bt12);
		p.add(bt13);
		p.add(bt14);
		p.add(bt15);
		p.add(bt16);
		this.add(p);
//......adding action listener....		
		bt5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			    tf1.setText(tf1.getText()+"0");
			}
		});
		bt6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tf1.setText(tf1.getText()+"1");
			}
		});
		bt7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tf1.setText(tf1.getText()+"2");
			}
		});
		bt8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tf1.setText(tf1.getText()+"3");
			}
		});
		bt9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tf1.setText(tf1.getText()+"4");
			}
		});
		bt10.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tf1.setText(tf1.getText()+"5");
			}
		});
		bt11.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tf1.setText(tf1.getText()+"6");
			}
		});
		bt12.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tf1.setText(tf1.getText()+"7");
			}
		});
		bt13.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tf1.setText(tf1.getText()+"8");
			}
		});
		bt14.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tf1.setText(tf1.getText()+"9");
			}
		});
		bt1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				n1 =Integer.valueOf(tf1.getText());
				calculation = 1;
				tf1.setText("");
			
				
			}
		});
		bt2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				n1 =Integer.valueOf(tf1.getText());
				calculation = 2;
				tf1.setText("");
				
				
			}
		});
		bt3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				n1 =Integer.valueOf(tf1.getText());
				calculation = 3;
				tf1.setText("");
				
				
			}
		});
		bt4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				n1 =Integer.valueOf(tf1.getText());
				calculation = 4;
				tf1.setText("");
			
				
			}
		});
		bt15.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				operation();
				
			}
		});
		bt16.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tf1.setText("");
				
			}
		});
		
		
		

    }
	public void operation(){
		switch(calculation){
			case 1:
			
			    n3 = n1+Integer.valueOf(tf1.getText());
				tf1.setText(Integer.toString(n3));
			    break;
			case 2:
			    n3 = n1-Integer.valueOf(tf1.getText());
				tf1.setText(Integer.toString(n3));
			    break;
			
			case 3:
			    n3 = n1/Integer.valueOf(tf1.getText());
				tf1.setText(Integer.toString(n3));
			    break;
			case 4:
			    n3 = n1*Integer.valueOf(tf1.getText());
				tf1.setText(Integer.toString(n3));
			    break;
			}
		
		
	}
}
