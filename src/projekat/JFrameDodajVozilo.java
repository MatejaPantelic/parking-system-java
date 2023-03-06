package projekat;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

import javax.swing.border.TitledBorder;


import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextPane;

public class JFrameDodajVozilo extends JFrame {

	private JPanel contentPane;
	private JTextField tfProiyvodjac;
	private JTextField tfModel;
	private JTextField tfBoja;
	private JTextField tfRegistracija;
	private JTextField tfVremeUlaska;
	private JTextField tfNumeracija;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameDodajVozilo frame = new JFrameDodajVozilo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFrameDodajVozilo() {
		setTitle("Parkiranje vozila");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 470);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 250));
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Podaci o vozilu", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(5, 10, 289, 212);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Proizvodja\u010D:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(10, 22, 103, 26);
		panel.add(lblNewLabel);
		
		JLabel lblModel = new JLabel("Model:");
		lblModel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblModel.setBounds(10, 58, 103, 26);
		panel.add(lblModel);
		
		JLabel lblBoja = new JLabel("Boja:");
		lblBoja.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblBoja.setBounds(10, 94, 103, 26);
		panel.add(lblBoja);
		
		JLabel lblRegistracija = new JLabel("Registracija:");
		lblRegistracija.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblRegistracija.setBounds(10, 130, 103, 26);
		panel.add(lblRegistracija);
		
		JLabel lblTipVozila = new JLabel("Tip vozila:");
		lblTipVozila.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblTipVozila.setBounds(10, 166, 103, 26);
		panel.add(lblTipVozila);
		
		tfProiyvodjac = new JTextField();
		tfProiyvodjac.setBounds(115, 24, 153, 24);
		panel.add(tfProiyvodjac);
		tfProiyvodjac.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfProiyvodjac.setColumns(10);
		
		tfModel = new JTextField();
		tfModel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfModel.setColumns(10);
		tfModel.setBounds(115, 58, 153, 24);
		panel.add(tfModel);
		
		tfBoja = new JTextField();
		tfBoja.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfBoja.setColumns(10);
		tfBoja.setBounds(115, 94, 153, 24);
		panel.add(tfBoja);
		
		tfRegistracija = new JTextField();
		tfRegistracija.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfRegistracija.setColumns(10);
		tfRegistracija.setBounds(115, 130, 153, 24);
		panel.add(tfRegistracija);
		
		JComboBox cbTipVozila = new JComboBox();
		cbTipVozila.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cbTipVozila.setModel(new DefaultComboBoxModel(new String[] {"Automobil", "Kombi vozilo", "Motocikl"}));
		cbTipVozila.setBounds(115, 166, 153, 24);
		panel.add(cbTipVozila);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(135, 206, 250));
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Mesto i vreme parkinga", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(298, 10, 343, 132);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNumeracijaParkingMesta = new JLabel("Numeracija parking mesta:");
		lblNumeracijaParkingMesta.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNumeracijaParkingMesta.setBounds(10, 22, 207, 26);
		panel_1.add(lblNumeracijaParkingMesta);
		
		JLabel lblVremeUlaskaNa = new JLabel("Vreme ulaska na parking:");
		lblVremeUlaskaNa.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblVremeUlaskaNa.setBounds(10, 58, 192, 26);
		panel_1.add(lblVremeUlaskaNa);
		
		JLabel lblVremeBoravka = new JLabel("Broj sati za uplatu:");
		lblVremeBoravka.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblVremeBoravka.setBounds(10, 94, 150, 26);
		panel_1.add(lblVremeBoravka);
		
		
		JComboBox cbBrojSati = new JComboBox();
		cbBrojSati.setToolTipText("Odaberite koliko \u010Dasova planirate da ostanete na parkingu");
		cbBrojSati.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cbBrojSati.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		cbBrojSati.setSelectedIndex(0);
		cbBrojSati.setBounds(160, 94, 67, 28);
		panel_1.add(cbBrojSati);
		
		JLabel lblNewLabel_1 = new JLabel("*");
		lblNewLabel_1.setBounds(270, 27, 9, 21);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(new Color(255, 69, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JLabel lblNewLabel_1_1 = new JLabel("*");
		lblNewLabel_1_1.setForeground(new Color(255, 69, 0));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(270, 58, 9, 21);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("*");
		lblNewLabel_1_2.setForeground(new Color(255, 69, 0));
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_2.setBounds(270, 130, 9, 21);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("*");
		lblNewLabel_1_3.setForeground(new Color(255, 69, 0));
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_3.setBounds(270, 166, 9, 21);
		panel.add(lblNewLabel_1_3);
		
		tfVremeUlaska = new JTextField();
		tfVremeUlaska.setEditable(false);
		tfVremeUlaska.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfVremeUlaska.setColumns(10);
		tfVremeUlaska.setBounds(216, 58, 105, 24);
		panel_1.add(tfVremeUlaska);
		
		tfNumeracija = new JTextField();
		tfNumeracija.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfNumeracija.setColumns(10);
		tfNumeracija.setBounds(216, 22, 105, 24);
		panel_1.add(tfNumeracija);
		
		
		JButton btnNazad = new JButton("Nazad");
		btnNazad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JFrameMeni m=new JFrameMeni();
				m.setVisible(true);
				dispose();
			}
		});
		btnNazad.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNazad.setBounds(151, 374, 129, 36);
		contentPane.add(btnNazad);
		
		JTextPane tpPriznanica = new JTextPane();
		tpPriznanica.setFont(new Font("Tahoma", Font.ITALIC, 16));
		tpPriznanica.setBackground(new Color(135, 206, 250));
		tpPriznanica.setEditable(false);
		tpPriznanica.setBounds(73, 55, 494, 309);
		contentPane.add(tpPriznanica);
		tpPriznanica.setVisible(false);
		
		JButton btnPocetak = new JButton("Početak");
		btnPocetak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JFrameMeni m=new JFrameMeni();
				m.setVisible(true);
				dispose();
			}
		});
		btnPocetak.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnPocetak.setBounds(259, 374, 129, 36);
		contentPane.add(btnPocetak);
		btnPocetak.setVisible(false);
				
		String vreme=Calendar.getInstance().getTime().toString();  //generisanje trenutnog vremena
		String sati[]=vreme.split(" ");
		tfVremeUlaska.setText(sati[3]);								//setovanje trenutnog vremena u fext field vreme ulaska
		
		JButton btnPotvrdi = new JButton("Potvrdi");
		btnPotvrdi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String proizvodjac=tfProiyvodjac.getText().trim();			//preuzimanje vrednosti sa polja forme
				String model=tfModel.getText().trim();
				String boja=tfBoja.getText().trim();
				String reg=tfRegistracija.getText().trim();
				String tip=cbTipVozila.getSelectedItem().toString();
				int mesto=0;
				boolean nastavak=false;
				try
				{
					if(!tfNumeracija.getText().isBlank())
					{
						mesto=Integer.parseInt(tfNumeracija.getText().trim());
						nastavak=true;
					}
				}
				catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Proverite unos numeracije parking mesta");
				}
				
				if(tfProiyvodjac.getText().isBlank() || tfModel.getText().isBlank() || tfRegistracija.getText().isBlank() || tfNumeracija.getText().isBlank())
				{
					JOptionPane.showMessageDialog(null, "Polja označena sa * moraju biti popunjena");
				}
				else if(nastavak)
				{
					int t=cbTipVozila.getSelectedIndex();					//preuzimanje tipa vozila i broja sati radi racunanja cene
					int sati=cbBrojSati.getSelectedIndex();
					double cena;
					cena=izracunajCenu(t, sati);   							//poziv metode za izracunavanje cene
					
					int rezultat=JOptionPane.showConfirmDialog(null,"Sa vašeg računa će biti umanjeno "+cena+" dinara.","Provera pre naplate",
							JOptionPane.YES_NO_OPTION);
					if(rezultat==0)
					{
						panel.setVisible(false);							//dosada vidljive komponente postavljam da budu nevidljive radi ispisivanja priznanice na istoj formi
						panel_1.setVisible(false);
						btnNazad.setVisible(false);
						btnPotvrdi.setVisible(false);
						
						Scanner scan=null;         						    //citanje iz datoteke
						try
						{
							scan=new Scanner(new File("korisnici.txt"));
						}
						catch (FileNotFoundException e) 
						{
							JOptionPane.showInternalMessageDialog(null, "Greska prilikom otvaranja datoteke");
						}
						String line="";
						String kor="";
						String loz="";
						String ime="";
						String prez="";
						String tel="";
						boolean pol;
						String brKar="";
						int mes, god;
						
						while(scan.hasNext())
						{
							line=scan.nextLine();
						}
						
						String pomocniNiz[];
						pomocniNiz=line.split("\t");			//smestanje u pomocni niz svih podataka korisnika koji je ulogovan
						kor=pomocniNiz[0];
						loz=pomocniNiz[1];
						ime=pomocniNiz[2];
						prez=pomocniNiz[3];
						tel=pomocniNiz[4];
						pol=Boolean.parseBoolean(pomocniNiz[5]);
						brKar=pomocniNiz[6];
						mes=Integer.parseInt(pomocniNiz[7]);
						god=Integer.parseInt(pomocniNiz[8]);
						
						Racun r=new Racun(brKar, mes, god);							//kreiranje objekta Racun na osnovu podataka sa forme
						Vozilo v=new Vozilo(proizvodjac,model,boja,reg,tip);		//kreiranje objekta Vozilo na osnovu podataka sa forme
						Korisnik k=new Korisnik(ime, prez, pol, tel, kor, loz, r, v);		//formiranje objekta klase Korisnik
						
						contentPane.add(tpPriznanica);								//prikazivanje priznanice
						tpPriznanica.setVisible(true);
						btnPocetak.setVisible(true);								
						tpPriznanica.setText(k.StampajPriznanicu()+"Broj parking mesta: "+mesto+"\nVreme ulaska na parking: "+tfVremeUlaska.getText()+"\n\nVaša uplata od "+cena+" dinara je upravo proknjižena!");
					}
					

					
				}
			}
		});
		btnPotvrdi.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnPotvrdi.setBounds(365, 374, 129, 36);
		contentPane.add(btnPotvrdi);
		
		JLabel lblNewLabel_1_4 = new JLabel("*");
		lblNewLabel_1_4.setForeground(new Color(255, 69, 0));
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_4.setBounds(324, 22, 9, 21);
		panel_1.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("*");
		lblNewLabel_1_5.setForeground(new Color(255, 69, 0));
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_5.setBounds(236, 94, 9, 21);
		panel_1.add(lblNewLabel_1_5);
			

	}
	private double izracunajCenu(int t, int s)  //metoda za racunanje cene
	{
		double c;
		if(t==0)
		{
			c=45*(s+1);
		}
		else if(t==1)
		{
			c=80*(s+1);
		}
		else
		{
			c=35*(s+1);
		}
		if(s==4 || s==5)					//obracunavanje pospusta od 10% ukoliko je zapocet 4 ili 5 cas parkiranja
			c=c*0.9;
		return c;
	}
}
