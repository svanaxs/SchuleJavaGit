package nozama;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import nozama.nozamaController;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JTextField;

public class nozamagui extends JFrame
{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textKunde;
	private nozamaController nozamaController;

	/**
	 * Launch the application.
	 *

	/**
	 * Create the frame.
	 */
	
	public nozamagui(nozamaController nozamaController)
	{
		
		this.nozamaController = nozamaController;
			
	}
	
	
	public nozamagui()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 568, 348);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NOZAMA");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel.setBounds(10, 11, 156, 67);
		contentPane.add(lblNewLabel);
		
		JList listVerfugbar = new JList();
		listVerfugbar.setBounds(20, 89, 190, 148);
		contentPane.add(listVerfugbar);
		
		JList listWarenkorb = new JList();
		listWarenkorb.setBounds(313, 89, 190, 148);
		contentPane.add(listWarenkorb);
		
		JLabel lblWarenkorn = new JLabel("Warenkorb");
		lblWarenkorn.setBounds(303, 64, 77, 14);
		contentPane.add(lblWarenkorn);
		
		JButton btnAdd = new JButton("->");
		btnAdd.setBounds(227, 97, 55, 45);
		contentPane.add(btnAdd);
		
		JButton btnRemove = new JButton("<-");
		btnRemove.setBounds(227, 167, 55, 45);
		contentPane.add(btnRemove);
		
		JLabel lblNewLabel_1 = new JLabel("Kundennamen");
		lblNewLabel_1.setBounds(10, 258, 77, 14);
		contentPane.add(lblNewLabel_1);
		
		textKunde = new JTextField();
		textKunde.setBounds(110, 255, 201, 20);
		contentPane.add(textKunde);
		textKunde.setColumns(10);
		
		JButton btnSend = new JButton("Abschicken");
		btnSend.setBounds(339, 254, 89, 23);
		contentPane.add(btnSend);
	}
}
