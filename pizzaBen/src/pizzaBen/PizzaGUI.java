package pizzaBen;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import pizzaBen.Controller.BtnAddListener;
import pizzaBen.Controller.BtnOrderListener;
import pizzaBen.Controller.BtnRemoveALLListener;
import pizzaBen.Controller.BtnRemoveListener;
import pizzaBen.Controller.ComboBoxGroesseListener;
import pizzaBen.Controller.ComboBoxPizzaListener;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class PizzaGUI extends JFrame
{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	protected JList list;
	private JLabel lblNewLabel_4;
	protected JLabel lblPreisGesamt;
	protected JLabel lblPreisEinzel;
	protected JComboBox comboBoxGroesse;
	protected JButton btnAdd;
	protected JButton btnRemove;
	protected JButton btnOrder;
	protected JComboBox comboBoxPizza;
	protected JComboBox comboBoxExtras;

	// ANLEGEN VON DEFAULTLISTMODEL UND ARRAYLISTS SOWIE DER VARIABLE FÜR DEN
	// GESAMTPREIS
	
	private Controller controller;
	protected JButton btnRemoveALL;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public PizzaGUI(Controller controller)
	{
		
		initialize();
		this.controller = controller;
			
	}
	

	private void initialize()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getList());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getLblPreisGesamt());
		contentPane.add(getLblPreisEinzel());
		contentPane.add(getComboBoxGroesse());
		contentPane.add(getBtnAdd());
		contentPane.add(getBtnRemove());
		contentPane.add(getBtnOrder());
		contentPane.add(getComboBoxPizza());
		contentPane.add(getComboBoxExtras());
		setVisible(true);
		

		JLabel lblNewLabel_5 = new JLabel("€");
		lblNewLabel_5.setBounds(210, 219, 14, 14);
		contentPane.add(lblNewLabel_5);

		JLabel lblNewLabel_5_1 = new JLabel("€");
		lblNewLabel_5_1.setBounds(370, 36, 14, 14);
		contentPane.add(lblNewLabel_5_1);
		contentPane.add(getBtnRemoveALL());
		
	}

	private JLabel getLblNewLabel()
	{
		if (lblNewLabel == null)
		{
			lblNewLabel = new JLabel("Pizza:");
			lblNewLabel.setBounds(10, 11, 46, 14);
		}
		return lblNewLabel;
	}

	private JLabel getLblNewLabel_1()
	{
		if (lblNewLabel_1 == null)
		{
			lblNewLabel_1 = new JLabel("Extras:");
			lblNewLabel_1.setBounds(10, 36, 46, 14);
		}
		return lblNewLabel_1;
	}

	private JLabel getLblNewLabel_2()
	{
		if (lblNewLabel_2 == null)
		{
			lblNewLabel_2 = new JLabel("Größe:");
			lblNewLabel_2.setBounds(293, 11, 46, 14);
		}
		return lblNewLabel_2;
	}

	private JLabel getLblNewLabel_3()
	{
		if (lblNewLabel_3 == null)
		{
			lblNewLabel_3 = new JLabel("Preis:");
			lblNewLabel_3.setBounds(293, 36, 46, 14);
		}
		return lblNewLabel_3;
	}

	private JList getList()
	{
		if (list == null)
		{
			list = new JList();
			list.setBounds(10, 59, 371, 149);
		}
		return list;
	}

	private JLabel getLblNewLabel_4()
	{
		if (lblNewLabel_4 == null)
		{
			lblNewLabel_4 = new JLabel("Gesamtpreis:");
			lblNewLabel_4.setBounds(10, 219, 107, 14);
		}
		return lblNewLabel_4;
	}

	private JLabel getLblPreisGesamt()
	{
		if (lblPreisGesamt == null)
		{
			lblPreisGesamt = new JLabel("0.00 ");
			lblPreisGesamt.setBounds(234, 219, 46, 14);
		}
		return lblPreisGesamt;
	}

	private JLabel getLblPreisEinzel()
	{
		if (lblPreisEinzel == null)
		{
			lblPreisEinzel = new JLabel("0.00 ");
			lblPreisEinzel.setBounds(395, 36, 46, 14);
		}
		return lblPreisEinzel;
	}

	protected JComboBox getComboBoxGroesse()
	{
		if (comboBoxGroesse == null)
		{
			comboBoxGroesse = new JComboBox();
			comboBoxGroesse.setBounds(360, 7, 123, 22);
		}
		return comboBoxGroesse;
	}

	private JButton getBtnAdd()
	{
		if (btnAdd == null)
		{
			btnAdd = new JButton("Hinzufügen");
			btnAdd.setBounds(394, 69, 89, 23);
		}
		return btnAdd;
	}

	private JButton getBtnRemove()
	{
		if (btnRemove == null)
		{
			btnRemove = new JButton("Entfernen");
			btnRemove.setBounds(394, 103, 89, 23);
		}
		return btnRemove;
	}

	private JButton getBtnOrder()
	{
		if (btnOrder == null)
		{
			btnOrder = new JButton("Bestellen");
			btnOrder.setBounds(391, 137, 143, 71);
		}
		return btnOrder;
	}

	protected JComboBox getComboBoxPizza()
	{
		if (comboBoxPizza == null)
		{
			comboBoxPizza = new JComboBox();
			comboBoxPizza.setBounds(59, 7, 165, 22);
		}
		return comboBoxPizza;
	}

	private JComboBox getComboBoxExtras()
	{
		if (comboBoxExtras == null)
		{
			comboBoxExtras = new JComboBox();
			comboBoxExtras.setBounds(59, 32, 165, 22);

		}
		return comboBoxExtras;
	}
	private JButton getBtnRemoveALL() {
		if (btnRemoveALL == null) {
			btnRemoveALL = new JButton("Warenkorb leeren");
			btnRemoveALL.setBounds(395, 215, 139, 23);
		}
		return btnRemoveALL;
	}


	public void setBtnRemoveALLListener(BtnRemoveALLListener btnRemoveALLListener)
	{
		// TODO Auto-generated method stub
		btnRemoveALL.addActionListener(btnRemoveALLListener);
	}


	public void setComboBoxPizza(ComboBoxPizzaListener comboBoxPizzaListener)
	{
		// TODO Auto-generated method stub
		comboBoxPizza.addItemListener(comboBoxPizzaListener);
	}


	public void setComboBoxExtras(ComboBoxPizzaListener comboBoxPizzaListener)
	{
		// TODO Auto-generated method stub
		comboBoxExtras.addItemListener(comboBoxPizzaListener);
	}


	public void setComboBoxGroesse(ComboBoxGroesseListener comboBoxGroesseListener)
	{
		// TODO Auto-generated method stub
		comboBoxGroesse.addItemListener(comboBoxGroesseListener);
	}


	public void setBtnAdd(BtnAddListener btnAddListener)
	{
		// TODO Auto-generated method stub
		btnAdd.addActionListener(btnAddListener);
	}


	public void setBtnRemove(BtnRemoveListener btnRemoveListener)
	{
		// TODO Auto-generated method stub
		btnRemove.addActionListener(btnRemoveListener);
	}


	public void setBtnOrder(BtnOrderListener btnOrderListener)
	{
		// TODO Auto-generated method stub
		btnOrder.addActionListener(btnOrderListener);
	}
}
