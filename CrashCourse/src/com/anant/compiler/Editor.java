package com.anant.compiler;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Editor {

	String result = "";
	JFrame frame;
	JTextField textField;
	JTextArea textArea;
	JTextArea textArea_1;
	Runtime r;
	JButton btnCompile;
	JButton btnRun;
	JScrollPane jsp;
	JScrollPane jsp1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Editor window = new Editor();
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
	public Editor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEnterYourClass = new JLabel("Enter Class Name");
		lblEnterYourClass.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEnterYourClass.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterYourClass.setBounds(20, 20, 130, 25);
		frame.getContentPane().add(lblEnterYourClass);
		
		textField = new JTextField();
		textField.setBounds(180, 20, 230, 25);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		 textArea = new JTextArea(50,50);
		frame.getContentPane().add(textArea);
		textArea.addFocusListener(new MyFocusListener(this));
		
		textArea_1 = new JTextArea(50,50);
		frame.getContentPane().add(textArea_1);
		
		 btnCompile = new JButton("Compile");
		 btnCompile.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		if(!textField.getText().equals(""))
		 		{
		 			try {
						String fname = textField.getText().trim()+".java";
						FileWriter fw = new FileWriter(fname);
						String s1 = textArea.getText();
						PrintWriter pw = new PrintWriter(fw);
						pw.println(s1);
						pw.flush();
						
						Process error = r.exec("C:\\Program Files\\Java\\jdk-11.0.7\\bin\\javac.exe -d .    "+fname);
						BufferedReader err = new BufferedReader(new InputStreamReader(error.getErrorStream()));
						
						while(true)
						{
							
							String temp = err.readLine();
							if(temp!=null)
							{
								result+=temp;
								result+="\n";
							}
							else break;
							}
						if(result.equals(""))
						{
							textArea_1.setText("compilation successfull! "+fname);
							err.close();
						}
						else {
							textArea_1.setText(result);
						}
						
					} catch (Exception e1) {
						// TODO: handle exception
						System.out.println(e1);
					}
		 		}
		 		else
		 		{
		 			textArea_1.setText("please enter the java program name");
		 		}
		 	}
		 });
		btnCompile.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCompile.setBounds(59, 227, 85, 21);
		frame.getContentPane().add(btnCompile);
		
		 btnRun = new JButton("Run");
		 btnRun.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		
		 		int start = 0;
		 		try {
					String fn = textField.getText().trim();
					Process p = r.exec("C:\\Program Files\\Java\\jdk-11.0.7\\bin\\java     "+fn);
					BufferedReader output = new BufferedReader(new InputStreamReader(p.getInputStream()));
					BufferedReader output1 = new BufferedReader(new InputStreamReader(p.getErrorStream()));
					
					while(true)
					{
						String temp = output.readLine();
						if(temp!=null)
						{
							result+=temp;
							result+="\n";
						}
						else {
							break;
						}
						
					}
					while(true)
					{
						String temp = output1.readLine();
						if(temp!=null)
						{
							result+=temp;
							result+="\n";
						}
						else 
						{
							break;
						}
					}
					output.close();
					output1.close();
					
					textArea_1.setText(result);
				} catch (Exception e2) {
					// TODO: handle exception
					System.out.println(e2);
				}
		 	}
		 });
		btnRun.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRun.setBounds(273, 227, 85, 21);
		frame.getContentPane().add(btnRun);
		
		
		 jsp = new JScrollPane(textArea);
		 jsp1 = new JScrollPane(textArea_1);
		jsp.setBounds(50,60,320,150);
		jsp1.setBounds(50, 270, 320, 150);
		frame.getContentPane().add(jsp);
		frame.getContentPane().add(jsp1);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(550,550);
		frame.setVisible(true);
		
		r =  Runtime.getRuntime();
	}
	
}
class MyFocusListener extends FocusAdapter
{
	Editor e;
	MyFocusListener(Editor e)
	{
		this.e = e;
	}
	@Override
	public void focusGained(FocusEvent fe) {
		// TODO Auto-generated method stub
		String str = e.textField.getText().trim();
		e.textArea.setText("public class "+str+"\n"
		+"{"+"\n"
		+"public static void main(String [] args)"+"\n"
		+"{"+"\n"
		+""                                      +"\n"
		+"}"+"\n"
		+"}"+"\n");
	}
}

