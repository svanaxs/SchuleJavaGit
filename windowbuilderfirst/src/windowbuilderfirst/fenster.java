package windowbuilderfirst;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class fenster
{

	private JFrame frmRatespiel;
	private JLabel lblInstruction;
	private JTextField textEingabe;
	private JButton btnRaten;
	private JLabel lblState;
	private JLabel lblAufloesung;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					fenster window = new fenster();
					window.frmRatespiel.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public fenster()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frmRatespiel = new JFrame();
		frmRatespiel.setTitle("Ratespiel!");
		frmRatespiel.setBounds(100, 100, 336, 173);
		frmRatespiel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRatespiel.getContentPane().setLayout(null);
		frmRatespiel.getContentPane().add(getLblInstruction());
		frmRatespiel.getContentPane().add(getTextEingabe());
		frmRatespiel.getContentPane().add(getBtnRaten());
		frmRatespiel.getContentPane().add(getLblState());
		frmRatespiel.getContentPane().add(getLblAufloesung());
	}
	private JLabel getLblInstruction() {
		if (lblInstruction == null) {
			lblInstruction = new JLabel("Ratespiel zwischen 1 und 10:");
			lblInstruction.setBounds(10, 11, 185, 14);
		}
		return lblInstruction;
	}
	private JTextField getTextEingabe() {
		if (textEingabe == null) {
			textEingabe = new JTextField();
			textEingabe.setBounds(10, 33, 86, 20);
			textEingabe.setColumns(10);
		}
		return textEingabe;
	}
	private JButton getBtnRaten() {
		if (btnRaten == null) {
			btnRaten = new JButton("Raten");
			btnRaten.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					buttonaction();
				}
			});
			btnRaten.setBounds(106, 32, 89, 23);
		}
		return btnRaten;
	}
	private JLabel getLblState() {
		if (lblState == null) {
			lblState = new JLabel("");
			lblState.setBounds(205, 36, 107, 14);
		}
		return lblState;
	}
	private JLabel getLblAufloesung() {
		if (lblAufloesung == null) {
			lblAufloesung = new JLabel("");
			lblAufloesung.setBounds(10, 64, 185, 14);
		}
		return lblAufloesung;
	}
	
	
	private void buttonaction()
	{
		String eingabe;
		int eingabenr;
		int randomnr;
		
		eingabe = getTextEingabe().getText();
		
		eingabenr = Integer.parseInt(eingabe);
		randomnr = (int)(Math.random() * 10 + 1);
		
		if(eingabenr == randomnr)
		{
			System.out.println("Gewonnen");
			getLblState().setText("Gewonnen");
			getLblAufloesung().setText("Die Zahl war: " + randomnr);
		}
		else
		{
			System.out.println("Verloren");
			getLblState().setText("Verloren");
			getLblAufloesung().setText("Die Zahl war: " + randomnr);
		}
	}
}



