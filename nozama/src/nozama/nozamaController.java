package nozama;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
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
	
	DefaultListModel dlmLager = new DefaultListModel<nozamaartikel>();
	DefaultListModel dlmWarenkorb = new DefaultListModel<nozamaartikel>();
	
	ArrayList<nozamaartikel> lager = new ArrayList<nozamaartikel>();
	ArrayList<nozamaartikel> warenkorb = new ArrayList<nozamaartikel>();
	
	
	public nozamaController()
	{
		this.gui = new nozamagui(this);
		//registriereListener();
		//fill();
	}
	
	
	public void aktualisieren()
	{
		gui.listVerfugbar.setModel(dlmLager);
		gui.listWarenkorb.setModel(dlmWarenkorb)
	}
	

}
