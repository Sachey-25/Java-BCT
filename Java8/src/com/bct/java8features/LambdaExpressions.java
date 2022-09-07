package com.bct.java8features;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LambdaExpressions {

	public static void main(String[] args) {
		
		
		Frame frame=new Frame("ActionListerner Before Java8");
		
		Button b=new Button("click Here");
		b.setBounds(50,100,80,50);
		
		// Method implemetation -- Regular method implementation.
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hello World..!");
			}
		});
		frame.add(b);
		frame.setSize(200,200);
		frame.setLayout(null);
		frame.setVisible(true);
		
		// Lambda Representation
		
		b.addActionListener(expression -> System.out.println("Hi My name is Lambda"));
		frame.add(b);
		frame.setSize(200,200);
		frame.setLayout(null);
		frame.setVisible(true);		

	}
}