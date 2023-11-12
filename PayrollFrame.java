package net.javacode;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class PayrollFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PayrollFrame frame = new PayrollFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public PayrollFrame() {
		setTitle("payroll");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 778, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee Name:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setBounds(47, 82, 103, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Rate Per Hour:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1.setBounds(58, 124, 91, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Hours Per Day:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_2.setBounds(54, 166, 96, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Number of days worked:");
		lblNewLabel_3.setBounds(14, 198, 140, 14);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(160, 79, 117, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(160, 121, 117, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(160, 163, 117, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(160, 195, 117, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("GROSS SALARY:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(33, 235, 110, 14);
		contentPane.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setBounds(143, 232, 110, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("TOTAL DEDUCTION:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(308, 235, 115, 14);
		contentPane.add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setBounds(433, 232, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("NET SALARY:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setBounds(541, 235, 86, 14);
		contentPane.add(lblNewLabel_6);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setBounds(641, 232, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("DEDUCTION OF SALARY:");
		lblNewLabel_7.setForeground(new Color(165, 42, 42));
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_7.setBounds(292, 82, 133, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("TAX 15% of Mothly Wage:");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_8.setBounds(263, 124, 162, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("PhilHealth 5%:");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_9.setBounds(307, 166, 118, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel(" SSS 2%:");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_10.setBounds(332, 198, 91, 14);
		contentPane.add(lblNewLabel_10);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setBounds(433, 121, 86, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setBounds(433, 163, 86, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setBounds(433, 195, 86, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Gross Salary:");
		lblNewLabel_11.setBounds(541, 124, 86, 14);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Deduction:");
		lblNewLabel_12.setBounds(551, 166, 76, 14);
		contentPane.add(lblNewLabel_12);
		
		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setBounds(637, 121, 86, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setBounds(637, 163, 86, 20);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		JButton btnNewButton = new JButton("Compute");
		btnNewButton.setForeground(new Color(245, 255, 250));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBackground(new Color(46, 139, 87));
		btnNewButton.setBounds(307, 277, 103, 33);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                String name = textField.getText();
                int rate = Integer.parseInt(textField_1.getText());
                int hours = Integer.parseInt(textField_2.getText());
                int days = Integer.parseInt(textField_3.getText());

                
                int grossSalary = rate * hours * days;
                textField_4.setText(Integer.toString(grossSalary));

                
                int tax = (int) (0.15 * grossSalary);
                int philhealth = (int) (0.05 * grossSalary);
                int sss = (int) (0.02 * grossSalary);
                int totalDeduction = tax + philhealth + sss;
                int netSalary = grossSalary - totalDeduction;

                textField_5.setText(Integer.toString(totalDeduction));
                textField_6.setText(Integer.toString(netSalary));

                
                textField_7.setText(Integer.toString(tax));
                textField_8.setText(Integer.toString(philhealth));
                textField_9.setText(Integer.toString(sss));
                textField_10.setText(Integer.toString(grossSalary));
                textField_11.setText(Integer.toString(totalDeduction));
            }
        });
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("Simple Payroll System");
		lblNewJgoodiesTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewJgoodiesTitle.setFont(new Font("Calibri", Font.BOLD, 21));
		lblNewJgoodiesTitle.setBounds(250, 37, 252, 20);
		contentPane.add(lblNewJgoodiesTitle);
	}
}

