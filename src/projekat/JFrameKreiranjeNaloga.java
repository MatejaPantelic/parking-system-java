package projekat;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;

public class JFrameKreiranjeNaloga extends JFrame {

	private JPanel contentPane;
	private JTextField tfIme;
	private JTextField tfPrezime;
	private JTextField tfEmail;
	private JTextField tfTelefon;
	private JTextField tfBrojKartice;
	private JTextField tfVerifikacioniKod;
	private JTextField tfPotvrdaLoznke;
	private JTextField tfLozinka;
	private JTextField tfKorisnickoIme;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameKreiranjeNaloga frame = new JFrameKreiranjeNaloga();
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
	public JFrameKreiranjeNaloga() {
		setTitle("Kreiranje novog naloga");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 470);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 0, 0));
		panel.setBackground(new Color(135, 206, 250));
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 255, 255), new Color(160, 160, 160)), "Li\u010Dni podaci", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 10, 282, 229);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ime:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(10, 36, 78, 22);
		panel.add(lblNewLabel);
		
		JLabel lblPrezime = new JLabel("Prezime:");
		lblPrezime.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrezime.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblPrezime.setBounds(10, 68, 78, 22);
		panel.add(lblPrezime);
		
		JLabel lblPol = new JLabel("Pol:");
		lblPol.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPol.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblPol.setBounds(10, 100, 78, 22);
		panel.add(lblPol);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblEmail.setBounds(10, 132, 78, 22);
		panel.add(lblEmail);
		
		JLabel lblBrojTelefona = new JLabel("Telefon:");
		lblBrojTelefona.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBrojTelefona.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblBrojTelefona.setBounds(10, 164, 78, 22);
		panel.add(lblBrojTelefona);
		
		tfIme = new JTextField();
		tfIme.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfIme.setBounds(98, 36, 152, 22);
		panel.add(tfIme);
		tfIme.setColumns(10);
		
		tfPrezime = new JTextField();
		tfPrezime.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfPrezime.setColumns(10);
		tfPrezime.setBounds(98, 68, 152, 22);
		panel.add(tfPrezime);
		
		tfEmail = new JTextField();
		tfEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfEmail.setColumns(10);
		tfEmail.setBounds(98, 132, 152, 22);
		panel.add(tfEmail);
		
		tfTelefon = new JTextField();
		tfTelefon.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfTelefon.setColumns(10);
		tfTelefon.setBounds(98, 164, 152, 22);
		panel.add(tfTelefon);
		
		JRadioButton rdbtnM = new JRadioButton("M");
		rdbtnM.setBackground(new Color(135, 206, 250));
		rdbtnM.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnM.setBounds(94, 102, 41, 21);
		rdbtnM.setSelected(true);
		panel.add(rdbtnM);
		
		JRadioButton rdbtnZ = new JRadioButton("\u017D");
		rdbtnZ.setBackground(new Color(135, 206, 250));
		rdbtnZ.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnZ.setBounds(137, 102, 41, 21);
		panel.add(rdbtnZ);
		
		ButtonGroup pol=new ButtonGroup();					//grupa radio dugmadi za pol
		pol.add(rdbtnM);
		pol.add(rdbtnZ);
		
		JLabel lblNewLabel_2 = new JLabel("*");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_2.setBounds(255, 36, 17, 16);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("*");
		lblNewLabel_2_1.setForeground(Color.RED);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_2_1.setBounds(255, 68, 17, 16);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("*");
		lblNewLabel_2_1_1.setForeground(Color.RED);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_2_1_1.setBounds(255, 164, 17, 16);
		panel.add(lblNewLabel_2_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Podaci o teku\u0107em ra\u010Dunu", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBackground(new Color(135, 206, 250));
		panel_1.setBounds(302, 10, 339, 192);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblBrojKartice = new JLabel("Broj kartice:");
		lblBrojKartice.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBrojKartice.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblBrojKartice.setBounds(10, 38, 132, 22);
		panel_1.add(lblBrojKartice);
		
		JLabel lblVerifikacioniKod = new JLabel("Verifikacioni kod:");
		lblVerifikacioniKod.setHorizontalAlignment(SwingConstants.RIGHT);
		lblVerifikacioniKod.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblVerifikacioniKod.setBounds(10, 70, 132, 22);
		panel_1.add(lblVerifikacioniKod);
		
		JLabel lblDatumIsteka = new JLabel("Mesec isteka:");
		lblDatumIsteka.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDatumIsteka.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblDatumIsteka.setBounds(10, 102, 132, 22);
		panel_1.add(lblDatumIsteka);
		
		tfBrojKartice = new JTextField();
		tfBrojKartice.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfBrojKartice.setColumns(10);
		tfBrojKartice.setBounds(152, 38, 152, 22);
		panel_1.add(tfBrojKartice);
		
		tfVerifikacioniKod = new JTextField();
		tfVerifikacioniKod.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfVerifikacioniKod.setColumns(10);
		tfVerifikacioniKod.setBounds(152, 70, 152, 22);
		panel_1.add(tfVerifikacioniKod);
		
		JLabel lblGodinaIsteka = new JLabel("Godina isteka:");
		lblGodinaIsteka.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGodinaIsteka.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblGodinaIsteka.setBounds(10, 134, 132, 22);
		panel_1.add(lblGodinaIsteka);
		
		JComboBox cbMesecIsteka = new JComboBox();
		cbMesecIsteka.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		cbMesecIsteka.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cbMesecIsteka.setBounds(152, 106, 66, 22);
		panel_1.add(cbMesecIsteka);
		
		JComboBox cbGodinaIsteka = new JComboBox();
		cbGodinaIsteka.setModel(new DefaultComboBoxModel(new String[] {"2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028"}));
		cbGodinaIsteka.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cbGodinaIsteka.setBounds(152, 134, 66, 22);
		panel_1.add(cbGodinaIsteka);
		
		JLabel lblNewLabel_2_2 = new JLabel("*");
		lblNewLabel_2_2.setForeground(Color.RED);
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_2_2.setBounds(312, 38, 17, 16);
		panel_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("*");
		lblNewLabel_2_3.setForeground(Color.RED);
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_2_3.setBounds(312, 70, 17, 16);
		panel_1.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("*");
		lblNewLabel_2_4.setForeground(Color.RED);
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_2_4.setBounds(226, 107, 17, 16);
		panel_1.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("*");
		lblNewLabel_2_5.setForeground(Color.RED);
		lblNewLabel_2_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_2_5.setBounds(226, 134, 17, 16);
		panel_1.add(lblNewLabel_2_5);
		
		JLabel lblNoviNalog = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/novNalog.png")).getImage();
		lblNoviNalog.setIcon(new ImageIcon(img));
		lblNoviNalog.setBounds(39, 249, 179, 174);
		contentPane.add(lblNoviNalog);
		
		JLabel lblNewLabel_1 = new JLabel("Korisni\u010Dko ime:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 19));
		lblNewLabel_1.setBounds(247, 261, 155, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Lozinka:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.ITALIC, 19));
		lblNewLabel_1_1.setBounds(247, 288, 155, 22);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Potvrda lozinke:");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.ITALIC, 19));
		lblNewLabel_1_2.setBounds(247, 316, 155, 22);
		contentPane.add(lblNewLabel_1_2);
		
		tfPotvrdaLoznke = new JTextField();
		tfPotvrdaLoznke.setBounds(412, 316, 141, 22);
		contentPane.add(tfPotvrdaLoznke);
		tfPotvrdaLoznke.setColumns(10);
		
		tfLozinka = new JTextField();
		tfLozinka.setColumns(10);
		tfLozinka.setBounds(412, 288, 141, 22);
		contentPane.add(tfLozinka);
		
		tfKorisnickoIme = new JTextField();
		tfKorisnickoIme.setColumns(10);
		tfKorisnickoIme.setBounds(412, 261, 141, 22);
		contentPane.add(tfKorisnickoIme);
		
		JButton btnKreirajNalog = new JButton("Kreiraj nalog");
		btnKreirajNalog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String ime=tfIme.getText().trim();					//preuzimanje vrednosti polja sa forme
				String prezime=tfPrezime.getText().trim();
				Boolean pol=rdbtnM.isSelected();
				String telefon=tfTelefon.getText().trim();
				String brKartice=tfBrojKartice.getText().trim();
				int mesec=Integer.parseInt(cbMesecIsteka.getSelectedItem().toString());
				int godina=Integer.parseInt(cbGodinaIsteka.getSelectedItem().toString());
				int kod;
				String korinsnicko=tfKorisnickoIme.getText().trim();
				String lozinka=tfLozinka.getText().trim();
				String potvrda=tfPotvrdaLoznke.getText().trim();
				try
				{
					kod=Integer.parseInt(tfVerifikacioniKod.getText().trim());
				}
				catch(Exception e)
				{
					if(!(tfVerifikacioniKod.getText().isBlank()))
					JOptionPane.showMessageDialog(null, "Pogresan verifikacioni kod kartice!");
				}

				
				if(tfIme.getText().equals("") || tfPrezime.getText().equals("") || tfTelefon.getText().equals("") || tfBrojKartice.getText().equals("") || 
						tfVerifikacioniKod.getText().equals("") || tfKorisnickoIme.getText().equals("") || tfLozinka.getText().equals("") || tfPotvrdaLoznke.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Polja označena sa * moraju biti popunjena!");
				}
					
				else if(!lozinka.equals(potvrda))
				{
					JOptionPane.showMessageDialog(null, "Lozinka nije verifikovana, unesite je ponovo!");
					tfLozinka.setText("");
					tfPotvrdaLoznke.setText("");
				}
				else
				{
					PrintWriter izl=null;										//upis podataka u datoteku
					try
					{
						izl=new PrintWriter(new FileWriter("korisnici.txt",true));
					}
					catch (IOException e) {
						JOptionPane.showMessageDialog(null, "Neuspesno otvranje datoteke.");
					}
					izl.println(korinsnicko+"\t"+lozinka+"\t"+ime+"\t"+prezime+"\t"+telefon+"\t"+pol+"\t"+brKartice+"\t"+mesec+"\t"+godina);
					izl.flush();
					izl.close();
							
					
					JOptionPane.showMessageDialog(null, "Uspešno ste kreirali nalog!");
					tfIme.setText("");											//praznjenje polja na formi
					tfPrezime.setText("");
					tfEmail.setText("");
					tfTelefon.setText("");
					tfBrojKartice.setText("");
					tfVerifikacioniKod.setText("");
					cbMesecIsteka.setSelectedIndex(0);
					cbGodinaIsteka.setSelectedIndex(0);
					tfKorisnickoIme.setText("");
					tfLozinka.setText("");
					tfPotvrdaLoznke.setText("");
				}
			}
		});
		btnKreirajNalog.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnKreirajNalog.setBounds(423, 369, 130, 33);
		contentPane.add(btnKreirajNalog);
		
		JButton btnNazad = new JButton("Nazad");
		btnNazad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JFramePocetna p=new JFramePocetna();							//otvaranje JFramePocetna
				p.setVisible(true);
				dispose();
			}
		});
		btnNazad.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNazad.setBounds(279, 369, 130, 33);
		contentPane.add(btnNazad);
		
		JLabel lblNewLabel_2_5_1 = new JLabel("*");
		lblNewLabel_2_5_1.setForeground(Color.RED);
		lblNewLabel_2_5_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_2_5_1.setBounds(559, 261, 17, 16);
		contentPane.add(lblNewLabel_2_5_1);
		
		JLabel lblNewLabel_2_5_2 = new JLabel("*");
		lblNewLabel_2_5_2.setForeground(Color.RED);
		lblNewLabel_2_5_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_2_5_2.setBounds(559, 288, 17, 16);
		contentPane.add(lblNewLabel_2_5_2);
		
		JLabel lblNewLabel_2_5_3 = new JLabel("*");
		lblNewLabel_2_5_3.setForeground(Color.RED);
		lblNewLabel_2_5_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_2_5_3.setBounds(559, 316, 17, 16);
		contentPane.add(lblNewLabel_2_5_3);
	}
}
