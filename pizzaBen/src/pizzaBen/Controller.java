package pizzaBen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.util.*;
import java.io.*;


public class Controller
{
	private PizzaGUI gui;
	DefaultListModel dlm2 = new DefaultListModel<Warenkorb>();
	ArrayList<Warenkorb> warenkorbL = new ArrayList<Warenkorb>();
	ArrayList<Pizza> pizzaL = new ArrayList<Pizza>();
	ArrayList<Extras> extrasL = new ArrayList<Extras>();
	ArrayList<Groesse> groesseL = new ArrayList<Groesse>();
	
	
	private double gesamt;
	private double einzelpreis;
	
	public Controller()
	{
		this.gui = new PizzaGUI(this);
		registriereListener();
		fill();
	}
	
	private void registriereListener()
	{
		this.gui.setBtnRemoveALLListener(new BtnRemoveALLListener());
		this.gui.setComboBoxPizza(new ComboBoxPizzaListener());
		this.gui.setComboBoxExtras(new ComboBoxPizzaListener());
		this.gui.setComboBoxGroesse(new ComboBoxGroesseListener());
		this.gui.setBtnAdd(new BtnAddListener());
		this.gui.setBtnRemove(new BtnRemoveListener());
		this.gui.setBtnOrder(new BtnOrderListener());
	}
	
	class BtnRemoveALLListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			// TODO Auto-generated method stub
			warenkorbL.clear();
			aktualisieren();
		}
		
	}
	class ComboBoxPizzaListener implements ItemListener
	{

		@Override
		public void itemStateChanged(ItemEvent e)
		{
			// RUFT DIE AKTUALISIERENEINZELN FUNKTION FÜR DEN EINZELNEN GESAMTPREIS AUF
			// SOBALD ETWAS IN DER COMBOBOX VERÄNDERT WURDE
			aktualisierenEinzeln();
		}
		
	}
	class ComboBoxExtrasListener implements ItemListener
	{

		@Override
		public void itemStateChanged(ItemEvent e)
		{
			// RUFT DIE AKTUALISIERENEINZELN FUNKTION FÜR DEN EINZELNEN GESAMTPREIS AUF
			// SOBALD ETWAS IN DER COMBOBOX VERÄNDERT WURDE
			aktualisierenEinzeln();
		}
		
	}
	class ComboBoxGroesseListener implements ItemListener
	{

		@Override
		public void itemStateChanged(ItemEvent e)
		{
			// RUFT DIE AKTUALISIERENEINZELN FUNKTION FÜR DEN EINZELNEN GESAMTPREIS AUF
			// SOBALD ETWAS IN DER COMBOBOX VERÄNDERT WURDE
			aktualisierenEinzeln();
			
		}
		
	}
	class BtnAddListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			// FÜGT DURCH DEN BUTTON EIN WARENKORB OBJEKT IN DIE WARENKORBLISTE EIN
			// INKLUSIVE ERRECHNETER PREIS FÜR (PIZZA+ZUTATEN)*GROESSENFAKTOR
			warenkorbL.add(new Warenkorb((Pizza) gui.comboBoxPizza.getSelectedItem(),
					(Extras) gui.comboBoxExtras.getSelectedItem(), (Groesse) gui.comboBoxGroesse.getSelectedItem(),
					aktualisierenEinzeln()));
			// RUFT DIE AKTUALISIEREN FUNKTION AUF DAMIT WIEDER DER GESAMTPREIS ALLER PIZZEN
			// UND DIE LISTBOX AKTUALISIERT WERDEN
			aktualisieren();
		}
		
	}
	class BtnRemoveListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			// ENTFERNT DURCH DAS AUSWÄHLEN EINER PIZZA IN DER LISTBOX(list) UND DAS
			// AUSWÄHLEN DES BUTTONS DAS OBJEKT AUS DER WARENKORBLISTE
			int selectedIndex = gui.list.getSelectedIndex();
			warenkorbL.remove(selectedIndex);
			// RUFT DIE AKTUALISIEREN FUNKTION AUF DAMIT WIEDER DER GESAMTPREIS ALLER PIZZEN
			// UND DIE LISTBOX AKTUALISIERT WERDEN
			aktualisieren();
		}
		
	}
	class BtnOrderListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			// DURCH DAS AUSWÄHLEN DES BESTELL BUTTONS WIRD DER KUNDE GEFRAGT OB ER WIRKLICH
			// DIE OBJEKTE AUS DER BESTELLLISTE BESTELLEN MÖCHTE
			alert();
		}
	}
	
	public void alert()
	{
		JOptionPane.showMessageDialog(gui.btnOrder, warenkorbL, "Bestellvorgang abschließen?", JOptionPane.CANCEL_OPTION);
	}
		
	public double aktualisierenEinzeln()
	{
		// DER PREIS DER EINZELNEN PIZZA INKLUSIVE ALLER ZUSÄTZE WIRD AUF 0 GESETZT UND
		// AKTUALISIERT
		einzelpreis = 0;
		einzelpreis = (((Pizza) gui.comboBoxPizza.getSelectedItem()).getPreis()
				+ ((Extras) gui.comboBoxExtras.getSelectedItem()).getPreis())
				* ((Groesse) gui.comboBoxGroesse.getSelectedItem()).getFaktor();
		gui.lblPreisEinzel.setText(String.valueOf(einzelpreis));
		// EINZELPREIS WIRD ZURÜCKGEGEBEN DAMIT ANDERE METHODEN MIT DEM RÜCKGABEWERT
		// ARBEITEN KÖNNEN
		return einzelpreis;
	}
		
	public void aktualisieren()
	{
		// DEFAULTLISTMODEL WIRD GELEERT DAMIT ES DANACH DURCH DIE DURCHITERIERTE
		// WARENKORBLISTE GEFÜLLT WIRD
		dlm2.clear();
		// GESAMTPREIS ALLER PIZZEN WIRD GENULLT UND DANN ERNEUT AUF DEN AKTUALISIERTEN
		// PREIS GESETZT
		gesamt = 0;
		for (Warenkorb i : warenkorbL)
		{
			gesamt = gesamt + i.getPreis();
			dlm2.addElement(i);
		}
		gui.lblPreisGesamt.setText(String.valueOf(gesamt));
		gui.list.setModel(dlm2);
	}
	public void fill()
	{
		File file = new File("H:/11/Java/SchuleJavaGit/pizzaBen/src/pizzaBen/Speisekarte.txt");
		Scanner sc;
		
		try
		{
			sc = new Scanner(new FileReader(file));
			
			while(sc.hasNextLine())
			{
				String line = sc.nextLine();
				String[] parts = line.split(";");
				
				String name = parts[0].trim();
				int preis = Integer.parseInt(parts[1].trim());
				
				
				pizzaL.add(new Pizza(name,preis));
			}
			
			sc.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Datei konnte nicht geöffnet werden.");
		}
		catch (InputMismatchException e) {
		    System.out.println("Invalid input format in the file.");
		}
		
		
		
		
		
		
		Pizza margaritap = new Pizza("Margarita", 6);
		Pizza salamip = new Pizza("Salami", 7);
		Pizza schinkenp = new Pizza("Schinken", 7);

		Extras leer = new Extras("----", 0);
		Extras salami = new Extras("Salami", 1);
		Extras schinken = new Extras("Schinken", 1);
		Extras ananas = new Extras("Ananas", 2);
			
		Groesse klein = new Groesse("Klein", 1);
		Groesse mittel = new Groesse("Mittel", 1.25);
		Groesse groß = new Groesse("Groß", 1.5);

		pizzaL.add(margaritap);
		pizzaL.add(salamip);
		pizzaL.add(schinkenp);

		extrasL.add(leer);
		extrasL.add(salami);
		extrasL.add(schinken);
		extrasL.add(ananas);

		groesseL.add(klein);
		groesseL.add(mittel);
		groesseL.add(groß);
			
		
		//setModels();
		gui.getComboBoxPizza().setModel(new DefaultComboBoxModel<Pizza>(pizzaL.toArray(new Pizza[0])));
		gui.comboBoxExtras.setModel(new DefaultComboBoxModel<Extras>(extrasL.toArray(new Extras[0])));
		gui.comboBoxGroesse.setModel(new DefaultComboBoxModel<Groesse>(groesseL.toArray(new Groesse[0])));
	}
}
