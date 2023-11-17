package nozama;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


import nozama.nozamagui;
import nozama.nozamaartikel;

import java.util.*;
import java.io.*;
import java.nio.*;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;


public class nozamaController
{
	
	private nozamagui gui;
	
	protected DefaultListModel dlmLager = new DefaultListModel<nozamaartikel>();
	protected DefaultListModel dlmWarenkorb = new DefaultListModel<nozamaartikel>();
	
	ArrayList<nozamaartikel> lager = new ArrayList<nozamaartikel>();
	ArrayList<nozamaartikel> warenkorb = new ArrayList<nozamaartikel>();
	
	
	public nozamaController()
	{
		gui = new nozamagui();
		
		gui.getListVerfugbar().setModel(dlmLager);
		gui.getListWarenkorb().setModel(dlmWarenkorb);
		
		registriereListener();
		fill();
	}
	
	
	private void registriereListener()
	{
		// TODO Auto-generated method stub
		gui.setListener(new Kaufen());
		gui.setListener(new Entfernen());
		gui.setListener(new Abschicken());
		
	}


	public void aktualisieren()
	{
	}
	
	
	public void fill()
	{
		
		String test;
		JFileChooser chooser = new JFileChooser();
		chooser.showOpenDialog(null);
		test = chooser.getSelectedFile().toString();
																																
		
		
		Scanner sc;
		
		try
		{
			
			sc = new Scanner(new FileReader(test));
			
			while(sc.hasNextLine())
			{
				String line = sc.nextLine();
				String[] parts = line.split(";");
				
				int id = Integer.parseInt(parts[0].trim());
				String name = parts[1].trim();
				int preis = Integer.parseInt(parts[2].trim());
				
				nozamaartikel a = new nozamaartikel(id, name,preis);
				dlmLager.addElement(a);
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
		
		
	}
	class Kaufen implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			// TODO Auto-generated method stub
			System.out.println("Kaufen");
			
			 nozamaartikel a = (nozamaartikel) gui.getListVerfugbar().getSelectedValue();
			 dlmWarenkorb.addElement(a);
		}
	}
	
	class Entfernen implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			// TODO Auto-generated method stub
			System.out.println("Entfernt");
			nozamaartikel a = (nozamaartikel) gui.getListWarenkorb().getSelectedValue();
			 dlmWarenkorb.removeElement(a);
		}
	}
	
	class Abschicken implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			// TODO Auto-generated method stub
			System.out.println("Abschicken");
			dlmWarenkorb.clear();
		}
	}
	
	

}
