package projekat;

import java.util.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.Color;

public class JFramePocetna extends JFrame {

	private JPanel contentPane;
	private JTextField tfKorisnickoIme;
	private JPasswordField pfLozinka;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFramePocetna frame = new JFramePocetna();
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
	public JFramePocetna() {
		setTitle("Sistem za naplatu parkinga");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 470);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Korisni\u010Dko ime:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Sylfaen", Font.ITALIC, 27));
		lblNewLabel.setBounds(59, 157, 209, 42);
		contentPane.add(lblNewLabel);
		
		pfLozinka = new JPasswordField();
		pfLozinka.setHorizontalAlignment(SwingConstants.LEFT);
		pfLozinka.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		pfLozinka.setBounds(276, 209, 234, 29);
		contentPane.add(pfLozinka);
		
		tfKorisnickoIme = new JTextField();
		tfKorisnickoIme.setHorizontalAlignment(SwingConstants.LEFT);
		tfKorisnickoIme.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		tfKorisnickoIme.setBounds(276, 157, 234, 31);
		contentPane.add(tfKorisnickoIme);
		tfKorisnickoIme.setColumns(10);
		
		JButton btnPrijava = new JButton("Prijavi se");
		btnPrijava.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String korisnicko=tfKorisnickoIme.getText().trim();  //preuzimanje unesenih vrednosti sa polja
				@SuppressWarnings("deprecation")
				String lozinka=pfLozinka.getText().trim();
				Scanner scan=null;
				Scanner sc=null;
				try
				{
					scan=new Scanner(new File("korisnici.txt"));     //definisanje objekata klase Scanner radi citanja iz datoteke
					sc=new Scanner(new File("korisnici.txt"));
				}
				catch (FileNotFoundException e) 
				{
					JOptionPane.showInternalMessageDialog(null, "Greska prilikom otvaranja datoteke");
				}
				String line="";
				String kor="";
				String loz="";
				int i=0,brEl=0;
				while(sc.hasNext())                                  //odredjivanje broja vec postojecih zapisa u datoteci
				{
					sc.nextLine();
					brEl++;
				}
				String []niz=new String[brEl];
				while(scan.hasNext())								//citanje iz datoteke i smestanje sadrzaja u niz
				{
					line=scan.nextLine();
					niz[i++]=line;
				}
				String[]pomocniNiz;
				boolean otvori=false;
				int pamcenje=0;
				for(i=0;i<niz.length;i++)							//izdvajanje korisnickog imena i lozinke iz celokupnog zapisa
				{
					pomocniNiz=niz[i].split("\t");
					kor=pomocniNiz[0];
					loz=pomocniNiz[1];
					if(kor.equals(korisnicko) && loz.equals(lozinka))
					{
						otvori=true;
						pamcenje=i;
					}
				}
				if(otvori==true)									//otvaranje nove forme
				{
					JFrameMeni p=new JFrameMeni();
					p.setVisible(true);
					dispose();
					
					String pom=niz[pamcenje];               		//stavljanje ulogovanog korisnika na poslednje mesto u txt fajlu
					niz[pamcenje]=niz[niz.length-1];
					niz[niz.length-1]=pom;
					
					PrintWriter izl=null;							
					try
					{
						izl=new PrintWriter(new FileWriter("korisnici.txt"));
					}
					catch (IOException e) {
						JOptionPane.showMessageDialog(null, "Neuspesno otvranje datoteke.");
					}
					izl.print("");
					for(int j=0;j<niz.length;j++)
						izl.println(niz[j]);						//ponovan upis u datoteku po novom rasporedu
					izl.flush();
					izl.close();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Pogrešno uneti pristupni podaci");
					tfKorisnickoIme.setText("");
					pfLozinka.setText("");
				}
			}
		});
		Image okej=new ImageIcon(this.getClass().getResource("/cm1.png")).getImage();
		btnPrijava.setIcon(new ImageIcon(okej));
		btnPrijava.setFont(new Font("Sylfaen", Font.PLAIN, 22));
		btnPrijava.setBounds(205, 284, 221, 42);
		contentPane.add(btnPrijava);
		
		JLabel lblLozinka = new JLabel("Lozinka:");
		lblLozinka.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLozinka.setFont(new Font("Sylfaen", Font.ITALIC, 27));
		lblLozinka.setBounds(59, 209, 209, 42);
		contentPane.add(lblLozinka);

		
		JButton btnKreirajNoviNalog = new JButton("Kreiraj novi nalog");
		btnKreirajNoviNalog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JFrameKreiranjeNaloga k=new JFrameKreiranjeNaloga();
				k.setVisible(true);
				dispose();
			}
		});
		btnKreirajNoviNalog.setFont(new Font("Sylfaen", Font.PLAIN, 22));
		btnKreirajNoviNalog.setBounds(205, 336, 221, 42);
		contentPane.add(btnKreirajNoviNalog);
		
		
		JLabel lbSlikaParking = new JLabel("");
		lbSlikaParking.setHorizontalAlignment(SwingConstants.CENTER);
		Image img=new ImageIcon(this.getClass().getResource("/parking2.png")).getImage();
		lbSlikaParking.setIcon(new ImageIcon(img));
		lbSlikaParking.setBounds(232, 10, 147, 134);
		contentPane.add(lbSlikaParking);
	}
}
