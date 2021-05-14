package cal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class cal {

	private JFrame frame;
	private JTextField txt;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cal window = new cal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public cal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 424, 407);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txt = new JTextField();
		txt.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txt.setHorizontalAlignment(SwingConstants.RIGHT);
		txt.setBounds(10, 11, 290, 43);
		frame.getContentPane().add(txt);
		txt.setColumns(10);
		
		//--------Row 1 ---------------
		JButton btnclear = new JButton("C");
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt.setText (null );
			}
		});
		btnclear.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnclear.setBounds(10, 65, 65, 50);
		frame.getContentPane().add(btnclear);
		
		JButton btnplusmin = new JButton("+/-");
		btnplusmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txt.getText()));
				ops = ops * (-1);
				txt.setText(String.valueOf(ops));
			}
		});
		btnplusmin.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnplusmin.setBounds(85, 65, 65, 50);
		frame.getContentPane().add(btnplusmin);
		
		JButton btnpre = new JButton("%");
		btnpre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txt.getText());
				txt.setText("");
				operations = "%";
			}
		});
		btnpre.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnpre.setBounds(160, 65, 65, 50);
		frame.getContentPane().add(btnpre);
		
		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txt.getText());
				txt.setText("");
				operations = "+";
			}
		});
		btnplus.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnplus.setBounds(235, 65, 65, 50);
		frame.getContentPane().add(btnplus);
		
		//--------Row 2 ---------------
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txt.getText () + btn7.getText();
				txt.setText (EnterNumber );
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn7.setBounds(10, 123, 65, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txt.getText () + btn8.getText();
				txt.setText (EnterNumber );
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn8.setBounds(85, 123, 65, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txt.getText () + btn9.getText();
				txt.setText (EnterNumber );
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn9.setBounds(160, 123, 65, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txt.getText());
				txt.setText("");
				operations = "-";
			}
		});
		btnsub.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnsub.setBounds(235, 123, 65, 50);
		frame.getContentPane().add(btnsub);
		
		//--------Row 3 ---------------
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txt.getText () + btn4.getText();
				txt.setText (EnterNumber );
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn4.setBounds(10, 185, 65, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txt.getText () + btn5.getText();
				txt.setText (EnterNumber );
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn5.setBounds(85, 185, 65, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txt.getText () + btn6.getText();
				txt.setText (EnterNumber );
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn6.setBounds(160, 185, 65, 50);
		frame.getContentPane().add(btn6);
		
		JButton btnmult = new JButton("*");
		btnmult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txt.getText());
				txt.setText("");
				operations = "*";
			}
		});
		btnmult.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnmult.setBounds(235, 185, 65, 50);
		frame.getContentPane().add(btnmult);
		
		//--------Row 4 ---------------
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txt.getText () + btn1.getText();
				txt.setText (EnterNumber );
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn1.setBounds(10, 246, 65, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txt.getText () + btn2.getText();
				txt.setText (EnterNumber );
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn2.setBounds(85, 246, 65, 50);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txt.getText () + btn3.getText();
				txt.setText (EnterNumber );
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn3.setBounds(160, 246, 65, 50);
		frame.getContentPane().add(btn3);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txt.getText());
				txt.setText("");
				operations = "/";
			}
		});
		btndiv.setFont(new Font("Tahoma", Font.BOLD, 22));
		btndiv.setBounds(235, 246, 65, 50);
		frame.getContentPane().add(btndiv);
		
		//--------Row 5 ---------------
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txt.getText () + btn0.getText();
				txt.setText (EnterNumber );
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn0.setBounds(10, 307, 140, 50);
		frame.getContentPane().add(btn0);
		
		JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txt.getText () + btndot.getText();
				txt.setText (EnterNumber );
			}
		});
		btndot.setFont(new Font("Tahoma", Font.BOLD, 22));
		btndot.setBounds(160, 307, 65, 50);
		frame.getContentPane().add(btndot);
		
		JButton btnequ = new JButton("=");
		btnequ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				
				
				
				
				if (operations == "ln")
				{
					double a;
					a = Math.log(firstnum); 
					answer = String.format("%.6f", a);
					txt.setText(answer);
					
					//double a = firstnum;
					//double c = 0;
					//double d = 0;
					//double temp;
					//double sr = firstnum / 2;
					
					//for (int i=0; i<=14;)
					//{
						//do {
							//temp = sr;
							//sr = (temp +(firstnum/temp))/2;
						//}
						//while ((temp-sr)!=0);
						//firstnum = sr;
						//i++;
					//}
					
					//c = a/sr;
					//d = c/0.000070271;				
					
					//answer = String.format("%.4f", d);
					//txt.setText(answer);
				}
				
				else if (operations == "sin")
				{
					double a;
					a = Math.sin(firstnum); 
					answer = String.format("%.6f", a);
					txt.setText(answer);					
				}
				
				else if (operations == "cos")
				{
					double a;
					a = Math.cos(firstnum); 
					answer = String.format("%.6f", a);
					txt.setText(answer);
				}
				
				else if (operations == "tan")
				{
					double a;
					a = Math.tan(firstnum); 
					answer = String.format("%.6f", a);
					txt.setText(answer);
				}
				
				else if (operations == "*/")
				{
					//double temp;
					//double sr = firstnum / 2;
					//do {
						//temp = sr;
						//sr = (temp +(firstnum/temp))/2;
					//}while ((temp-sr)!=0);
					//answer = String.format("%.2f", sr);
					//txt.setText(answer);
					
					double a;
					a = Math.sqrt(firstnum); 
					answer = String.format("%.2f", a);
					txt.setText(answer);
				}
				
				secondnum = Double.parseDouble(txt.getText());
				if (operations == "+")
				{
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					txt.setText(answer);
				}
				else if (operations == "-")
				{
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					txt.setText(answer);
				}
				else if (operations == "*")
				{
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					txt.setText(answer);
				}
				else if (operations == "/")
				{
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					txt.setText(answer);
				}
				else if (operations == "%")
				{
					result = (firstnum / secondnum) * 100 ;
					answer = String.format("%.2f", result);
					txt.setText(answer);
				}
				else if (operations == "**")
				{
					//result = firstnum * firstnum ;
					//answer = String.format("%.2f", result);
					//txt.setText(answer);
					
					double a;
					a = Math.pow(firstnum, secondnum); 
					answer = String.format("%.2f", a);
					txt.setText(answer);
				}
				
				
				
			}
		});
		btnequ.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnequ.setBounds(235, 307, 65, 50);
		frame.getContentPane().add(btnequ);
		
		JButton btnsqu = new JButton("Pow");
		btnsqu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txt.getText());
				txt.setText("");
				operations = "**";
			}
		});
		btnsqu.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnsqu.setBounds(310, 11, 88, 50);
		frame.getContentPane().add(btnsqu);
		
		JButton btnroot = new JButton("SR");
		btnroot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txt.getText());
				txt.setText("");
				operations = "*/";
			}
		});
		btnroot.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnroot.setBounds(310, 65, 88, 50);
		frame.getContentPane().add(btnroot);
		
		JButton btnlog = new JButton("ln");
		btnlog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txt.getText());
				txt.setText("");
				operations = "ln";
			}
		});
		btnlog.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnlog.setBounds(310, 123, 88, 50);
		frame.getContentPane().add(btnlog);
		
		JButton btnsin = new JButton("sin");
		btnsin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txt.getText());
				txt.setText("");
				operations = "sin";
			}
		});
		btnsin.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnsin.setBounds(310, 185, 88, 50);
		frame.getContentPane().add(btnsin);
		
		JButton btncos = new JButton("cos");
		btncos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txt.getText());
				txt.setText("");
				operations = "cos";
			}
		});
		btncos.setFont(new Font("Tahoma", Font.BOLD, 12));
		btncos.setBounds(310, 246, 88, 50);
		frame.getContentPane().add(btncos);
		
		JButton btntan = new JButton("tan");
		btntan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txt.getText());
				txt.setText("");
				operations = "tan";
			}
		});
		btntan.setFont(new Font("Tahoma", Font.BOLD, 12));
		btntan.setBounds(310, 307, 88, 50);
		frame.getContentPane().add(btntan);
		
		
	}
}
