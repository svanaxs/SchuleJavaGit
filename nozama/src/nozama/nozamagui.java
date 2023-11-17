package nozama;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import nozama.nozamaController.Abschicken;
import nozama.nozamaController.Entfernen;
import nozama.nozamaController.Kaufen;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JTextField;

public class nozamagui extends JFrame
{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JList listVerfugbar;
	private JList listWarenkorb;
	private JTextField textField;
	private JButton btnSend;
	private JButton btnAdd;
	private JButton btnRemove;

	
	
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
		
		JLabel lblWarenkorn = new JLabel("Warenkorb");
		lblWarenkorn.setBounds(303, 64, 77, 14);
		contentPane.add(lblWarenkorn);
		
		JLabel lblNewLabel_1 = new JLabel("Kundennamen");
		lblNewLabel_1.setBounds(10, 258, 77, 14);
		contentPane.add(lblNewLabel_1);
		contentPane.add(getListVerfugbar());
		contentPane.add(getListWarenkorb());
		contentPane.add(getTextField());
		contentPane.add(getBtnSend());
		contentPane.add(getBtnAdd());
		contentPane.add(getBtnRemove());
		this.setVisible(true);
	}
	protected JList getListVerfugbar() {
		if (listVerfugbar == null) {
			listVerfugbar = new JList();
			listVerfugbar.setBounds(10, 89, 190, 148);
		}
		return listVerfugbar;
	}
	protected JList getListWarenkorb() {
		if (listWarenkorb == null) {
			listWarenkorb = new JList();
			listWarenkorb.setBounds(313, 89, 190, 148);
		}
		return listWarenkorb;
	}
	protected JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(97, 255, 201, 20);
		}
		return textField;
	}
	protected JButton getBtnSend() {
		if (btnSend == null) {
			btnSend = new JButton("Abschicken");
			btnSend.setBounds(323, 254, 89, 23);
		}
		return btnSend;
	}
	protected JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("->");
			btnAdd.setBounds(227, 89, 55, 45);
		}
		return btnAdd;
	}
	protected JButton getBtnRemove() {
		if (btnRemove == null) {
			btnRemove = new JButton("<-");
			btnRemove.setBounds(227, 177, 55, 45);
		}
		return btnRemove;
	}


	public void setListener(Kaufen kaufen)
	{
		// TODO Auto-generated method stub
		getBtnAdd().addActionListener(kaufen);
	}
	
	public void setListener(Entfernen Entfernen)
	{
		// TODO Auto-generated method stub
		getBtnRemove().addActionListener(Entfernen);
	}
	
	public void setListener(Abschicken Abschicken)
	{
		// TODO Auto-generated method stub
		getBtnSend().addActionListener(Abschicken);
	}
	
	
	
}
