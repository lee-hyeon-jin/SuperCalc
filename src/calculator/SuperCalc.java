package calculator;

 

import java.awt.BorderLayout;

import java.awt.Font;

import java.awt.GridLayout;

import java.awt.Image;

import java.awt.Toolkit;

 

import javax.swing.AbstractButton;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;

import javax.swing.JTextField;

 

public class SuperCalc extends JFrame {

	private double op1 = 0;

	private double op2 = 0;

	private String operator = "+";

	private JLabel status;

 

	

	SuperCalc() {

		

		this.setTitle("계산기");

 

		Image icon = Toolkit.getDefaultToolkit().getImage("supercalc.gif");

 

		this.setIconImage( icon );

		this.setTitle("계산기");

		this.setBounds(100,100,400,500);

		this.setLayout(new BorderLayout());

		

		JTextField display = new JTextField("0");

		display.setFont( new Font( "" , 0 , 45 ) );

		display.setHorizontalAlignment(JTextField.RIGHT );

		this.add(BorderLayout.NORTH, display);

		

		JLabel status = new JLabel("버튼을 클릭하세요");

		this.add(BorderLayout.SOUTH, status);

 

		

		JPanel panel = new JPanel();

		panel.setLayout(new GridLayout(5,4));

		

		

		

		JButton btn0 = new JButton( "0" );

		btn0.addActionListener( e -> {

			if( display.getText().equals( "0" ) ) {

				display.setText( btn0.getText()  );

			} else {

				display.setText( display.getText() + btn0.getText()  );

			}

		});

		

		

		JButton btn1 = new JButton( "1" );

		btn1.addActionListener( e -> {

			if( display.getText().equals( "0" ) ) {

				display.setText( btn1.getText()  );

			} else {

				display.setText( display.getText() + btn1.getText()  );

			}

		});

		

		

		JButton btn2 = new JButton( "2" );

		btn2.addActionListener( e -> {

			if( display.getText().equals( "0" ) ) {

				display.setText( btn2.getText()  );

			} else {

				display.setText( display.getText() + btn2.getText()  );

			}

		});

		

		

		JButton btn3 = new JButton( "3" );

		btn3.addActionListener( e -> {

			if( display.getText().equals( "0" ) ) {

				display.setText( btn3.getText()  );

			} else {

				display.setText( display.getText() + btn3.getText()  );

			}

		});

		

		

		JButton btn4 = new JButton( "4" );

		btn4.addActionListener( e -> {

			if( display.getText().equals( "0" ) ) {

				display.setText( btn4.getText()  );

			} else {

				display.setText( display.getText() + btn4.getText()  );

			}

		});

		

		

		JButton btn5 = new JButton( "5" );

		btn5.addActionListener( e -> {

			if( display.getText().equals( "0" ) ) {

				display.setText( btn5.getText()  );

			} else {

				display.setText( display.getText() + btn5.getText()  );

			}

		});

		

		

		JButton btn6 = new JButton( "6" );

		btn6.addActionListener( e -> {

			if( display.getText().equals( "0" ) ) {

				display.setText( btn6.getText()  );

			} else {

				display.setText( display.getText() + btn6.getText()  );

			}

		});

		

		

		JButton btn7 = new JButton( "7" );

		btn7.addActionListener( e -> {

			if( display.getText().equals( "0" ) ) {

				display.setText( btn7.getText()  );

			} else {

				display.setText( display.getText() + btn7.getText()  );

			}

		});

		

		

		JButton btn8 = new JButton( "8" );

		btn8.addActionListener( e -> {

			if( display.getText().equals( "0" ) ) {

				display.setText( btn8.getText()  );

			} else {

				display.setText( display.getText() + btn8.getText()  );

			}

		});

		

		

		JButton btn9 = new JButton( "9" );

		btn9.addActionListener( e -> {

			if( display.getText().equals( "0" ) ) {

				display.setText( btn9.getText()  );

			} else {

				display.setText( display.getText() + btn9.getText()  );

			}

		});

		

		

		JButton btnDivide = new JButton("/");

		btnDivide.addActionListener( e -> {

			op1 = Double.parseDouble( display.getText() );

			display.setText("0");

			operator = "/";

			status.setText(op1 + " / " );

		});

		

		JButton btnMultiply = new JButton("*");

		btnMultiply.addActionListener( e -> {

			op1 = Double.parseDouble( display.getText() );

			display.setText("0");

			operator = "*";

			status.setText(op1 + " * " );

		});

		

		

		JButton btnMinus = new JButton("-");

		btnMinus.addActionListener( e -> {

			op1 = Double.parseDouble( display.getText() );

			display.setText("0");

			operator = "-";

			status.setText(op1 + " - " );

		});

		

		

		JButton btnPlus = new JButton("+");

		btnPlus.addActionListener( e -> {

			op1 = Double.parseDouble( display.getText() );

			display.setText("0");

			operator = "+";

			status.setText(op1 + " + " );

		});

		

		

		JButton btnDot = new JButton(".");

		btnDot.addActionListener( e -> {

			if( !display.getText().contains(".") ) {

				display.setText( display.getText() + btnDot.getText() );

			}

		});

		

		

		JButton btnEqual = new JButton("=");

		btnEqual.addActionListener( e -> {

			op2 = Double.parseDouble( display.getText() );

			double result = calc(op1, op2, operator );

			display.setText( "" + result );

			status.setText( status.getText() + op2 + " = " );

		});

		

		

		JButton btnClr = new JButton("C");

		btnClr.addActionListener( e -> {

			op1 = 0;

			op2 = 0;

			operator = "+";

			display.setText("0");

			status.setText("버튼을 클릭하세요");

		});

		

		

		JButton btnEraser = new JButton("<=");

		btnEraser.addActionListener( e -> {

			op1 = 0;

			op2 = 0;

			operator = "+";

			display.setText("0");

		});

		

		JButton btnCE = new JButton("CE");

		btnCE.addActionListener( e -> {

			op1 = 0;

			op2 = 0;

			operator = "+";

			display.setText("0");

		});

		

		JButton btnFront = new JButton("+/-");

		btnClr.addActionListener( e -> {

			op1 = 0;

			op2 = 0;

			operator = "+";

			display.setText("0");

		});

		

		panel.add(btnCE); panel.add(btnClr); panel.add(btnEraser); panel.add(btnDivide);

		panel.add(btn7); panel.add(btn8); panel.add(btn9); panel.add(btnMultiply);

		panel.add(btn4); panel.add(btn5); panel.add(btn6); panel.add(btnMinus);

		panel.add(btn1); panel.add(btn2); panel.add(btn3); panel.add(btnPlus);

		panel.add(btnFront); panel.add(btn0); panel.add(btnDot); panel.add(btnEqual);

		

		this.add(panel);

		

		

		

		

	}

	

	private double calc(double op1, double op2, String operator) {

		double result=0;

		switch( operator ) {

		case "+":

			result = op1 + op2;

			break;

		case "-":

			result = op1 - op2;

			break;

		case "*":

			result = op1 * op2;

			break;

		case "/":

			result = op1 / op2;

			break;

		}

		return result;

	}

 

	public static void main(String[] args) {

		new SuperCalc().setVisible(true);

	}
	
}