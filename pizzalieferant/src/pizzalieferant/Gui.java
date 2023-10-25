package pizzalieferant;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Gui
{

	private JFrame frmPizzadienst;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JComboBox comboBoxExtras;
	private JComboBox comboBoxPizza;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_2_1;
	private JComboBox comboBoxGroesse;
	private JLabel lblPreis;
	private JButton btnHinzufuegen;
	private JButton btnEntfernen;
	private JButton btnBestellen;
	private JList list;
	private JLabel lblNewLabel_3;
	private JLabel lblGesamtpreis;
	private DefaultComboBoxModel<pizzatyp> pizzaliste = new DefaultComboBoxModel<>();
	private DefaultComboBoxModel<extras> extrasliste = new DefaultComboBoxModel<>();
	private DefaultComboBoxModel<groesse> groesseliste = new DefaultComboBoxModel<>();
	private pizza pizzen[];
	private DefaultListModel dlml = new DefaultListModel();
	private JList<pizza> pizzauebersicht = new JList<pizza>(dlml);
	private double gesamtpreis = 0.0;
	
	
    
	


	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Gui window = new Gui();
					window.frmPizzadienst.setVisible(true);
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
	public Gui()
	{
		
		initialize();
		erzeugeModel();
		erzeugePizzen();
		erzeugeExtras();
		erzeugeGroesse();
	}

	

	private void erzeugeModel()
	{
		pizzaliste = new DefaultComboBoxModel<pizzatyp>();
		comboBoxPizza.setModel(pizzaliste);
		
		
		extrasliste = new DefaultComboBoxModel<extras>();
		comboBoxExtras.setModel(extrasliste);
		
		groesseliste = new DefaultComboBoxModel<groesse>();
		comboBoxGroesse.setModel(groesseliste);
			
	}

	private void erzeugePizzen()
	{
		pizzatyp salami = new pizzatyp("Salami",7.5 );
		pizzatyp peperoni = new pizzatyp("Peperoni",5.5 );
		pizzatyp hawaii = new pizzatyp("Hawaii",8.5 );
		pizzaliste.addElement(salami);
		pizzaliste.addElement(peperoni);
		pizzaliste.addElement(hawaii);
	}

	private void erzeugeExtras()
	{
		extras nun = new extras("-", 0);
		extras salad = new extras("Salad", 5);
		extras getrank = new extras("Getränk", 5);
		extrasliste.addElement(nun);
		extrasliste.addElement(salad);
		extrasliste.addElement(getrank);
	}
	
	private void erzeugeGroesse()
	{
		groesse klein = new groesse("Klein", 2);
		groesse medium = new groesse("Medium", 3);
		groesse gross = new groesse("Groß", 4);
		groesse xl = new groesse("XL", 5);
		groesseliste.addElement(klein);
		groesseliste.addElement(medium);
		groesseliste.addElement(gross);
		groesseliste.addElement(xl);
		
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frmPizzadienst = new JFrame();
		frmPizzadienst.setTitle("Pizzadienst");
		frmPizzadienst.setBounds(100, 100, 450, 370);
		frmPizzadienst.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPizzadienst.getContentPane().setLayout(null);
		frmPizzadienst.getContentPane().add(getLblNewLabel());
		frmPizzadienst.getContentPane().add(getLblNewLabel_1());
		frmPizzadienst.getContentPane().add(getComboBoxExtras());
		frmPizzadienst.getContentPane().add(getComboBoxPizza());
		frmPizzadienst.getContentPane().add(getLblNewLabel_2());
		frmPizzadienst.getContentPane().add(getLblNewLabel_2_1());
		frmPizzadienst.getContentPane().add(getComboBoxGroesse());
		frmPizzadienst.getContentPane().add(getLblPreis());
		frmPizzadienst.getContentPane().add(getBtnHinzufuegen());
		frmPizzadienst.getContentPane().add(getBtnEntfernen());
		frmPizzadienst.getContentPane().add(getBtnBestellen());
		frmPizzadienst.getContentPane().add(getList());
		frmPizzadienst.getContentPane().add(getLblNewLabel_3());
		frmPizzadienst.getContentPane().add(getLblGesamtpreis());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Pizza:");
			lblNewLabel.setBounds(10, 11, 46, 14);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Extras:");
			lblNewLabel_1.setBounds(10, 47, 46, 14);
		}
		return lblNewLabel_1;
	}
	private JComboBox getComboBoxExtras() {
		if (comboBoxExtras == null) {
			comboBoxExtras = new JComboBox(extrasliste);
			comboBoxExtras.setBounds(66, 47, 105, 22);
		}
		return comboBoxExtras;
	}
	private JComboBox getComboBoxPizza() {
		if (comboBoxPizza == null) {
			comboBoxPizza = new JComboBox(pizzaliste);
			comboBoxPizza.setBounds(66, 7, 105, 22);
		}
		return comboBoxPizza;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Größe:");
			lblNewLabel_2.setBounds(247, 11, 46, 14);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_2_1() {
		if (lblNewLabel_2_1 == null) {
			lblNewLabel_2_1 = new JLabel("Preis");
			lblNewLabel_2_1.setBounds(247, 47, 46, 14);
		}
		return lblNewLabel_2_1;
	}
	private JComboBox getComboBoxGroesse() {
		if (comboBoxGroesse == null) {
			comboBoxGroesse = new JComboBox(groesseliste);
			comboBoxGroesse.setBounds(303, 7, 89, 22);
		}
		return comboBoxGroesse;
	}
	private JLabel getLblPreis() {
		if (lblPreis == null) {
			lblPreis = new JLabel("New label");
			lblPreis.setBounds(303, 47, 83, 14);
		}
		return lblPreis;
	}
	private JButton getBtnHinzufuegen() {
		if (btnHinzufuegen == null) {
			btnHinzufuegen = new JButton("Hinzufügen");
			btnHinzufuegen.addMouseListener(new MouseAdapter()
			{
				@Override
			    public void mouseClicked(MouseEvent e) {
			        hinzufuegen();
			    }
				
			});
			btnHinzufuegen.setBounds(303, 85, 89, 23);
		}
		return btnHinzufuegen;
	}
	private JButton getBtnEntfernen() {
		if (btnEntfernen == null) {
			btnEntfernen = new JButton("Entfernen");
			btnEntfernen.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					entfernen();
				}
			});
			btnEntfernen.setBounds(303, 133, 89, 23);
		}
		return btnEntfernen;
	}
	private JButton getBtnBestellen() {
		if (btnBestellen == null) {
			btnBestellen = new JButton("Bestellen");
			btnBestellen.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					bestellen();
				}
			});
			btnBestellen.setBounds(303, 208, 89, 60);
		}
		return btnBestellen;
	}
	
	private JList getList() {
		if (list == null) {
			list = new JList(dlml);
			list.setBounds(10, 85, 283, 183);
			list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 
		}
		return list;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Gesamtpreis:");
			lblNewLabel_3.setBounds(10, 290, 105, 14);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblGesamtpreis() {
		if (lblGesamtpreis == null) {
			lblGesamtpreis = new JLabel("New label");
			lblGesamtpreis.setBounds(213, 290, 80, 14);
		}
		return lblGesamtpreis;
	}
	
	public void hinzufuegen()
	{
		
		pizzatyp selectedPizza = (pizzatyp) comboBoxPizza.getSelectedItem();
	    extras selectedExtras = (extras) comboBoxExtras.getSelectedItem();
	    groesse selectedGroesse = (groesse) comboBoxGroesse.getSelectedItem();

	    double totalPrice = selectedPizza.getPreis() + selectedExtras.getPreis() + selectedGroesse.getPreis();
	    lblPreis.setText(totalPrice+ "€");
	    pizza selectedPizzaItem = new pizza(selectedPizza, selectedExtras, selectedGroesse, totalPrice);

	    dlml.addElement(selectedPizzaItem);
	    
	    gesamtpreis += totalPrice;
	    lblGesamtpreis.setText(gesamtpreis + "€");
		
		
		
	}
	
	public void entfernen() {
	    int selectedIndex = list.getSelectedIndex();
	    
	    if (selectedIndex != -1) {
	        
	        pizza selectedPizzaItem = (pizza) dlml.getElementAt(selectedIndex);
	        
	       
	        gesamtpreis -= selectedPizzaItem.getGesamtpreis();
	        
	       
	        lblGesamtpreis.setText(gesamtpreis + "€");
	        
	     
	        dlml.removeElementAt(selectedIndex);
	    }
	}
	
	public void bestellen() {
	    dlml.clear(); // Clear the list
	    lblGesamtpreis.setText("0 €"); // Reset the total price label
	    lblPreis.setText("0 €"); // Reset the item price label
	}

}
