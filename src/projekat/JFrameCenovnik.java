package projekat;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.border.TitledBorder;
import javax.swing.JTextPane;
import javax.swing.border.EtchedBorder;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFrameCenovnik extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameCenovnik frame = new JFrameCenovnik();
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
	public JFrameCenovnik() {
		setTitle("Cenovnik");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 470);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNazad = new JButton("Nazad");
		btnNazad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JFrameMeni m=new JFrameMeni();						//otvaranje JFrameMeni
				m.setVisible(true);
				dispose();
			}
		});
		Image nazad=new ImageIcon(this.getClass().getResource("/back.png")).getImage();
		btnNazad.setIcon(new ImageIcon(nazad));
		btnNazad.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNazad.setBounds(246, 387, 125, 36);
		contentPane.add(btnNazad);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 153, 255));
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Cena usluge parkiranja", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 102, 51)));
		panel.setBounds(10, 10, 631, 235);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextPane txtpnNaplataParkingaSe = new JTextPane();
		txtpnNaplataParkingaSe.setEditable(false);
		txtpnNaplataParkingaSe.setBackground(new Color(102, 153, 255));
		txtpnNaplataParkingaSe.setForeground(new Color(255, 255, 255));
		txtpnNaplataParkingaSe.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnNaplataParkingaSe.setText("Naplata parkinga se obra\u010Dunava na osnovu broja zapo\u010Detih \u010Dasova provedenih na parkingu i to po slede\u0107im tarifama:\r\n      Automobili:\r\n          45 dinara po \u010Dasu\r\n      Kombi vozila(mini-van):\r\n          60 dinara po \u010Dasu\r\n      Motocikli:\r\n          35 dinara po \u010Dasu\r\n\r\n~Napomena:\r\n\tMaksimala vreme koje mo\u017Eete provesti na parkingu jeste 5 sati. Za zapo\u010Deti \u010Detvrti ili peti \u010Das naplate ostvarujete popust od 10%.");
		txtpnNaplataParkingaSe.setBounds(10, 20, 611, 205);
		panel.add(txtpnNaplataParkingaSe);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(102, 153, 255));
		panel_1.setBorder(new TitledBorder(null, "Politika poslovanja", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 102, 51)));
		panel_1.setBounds(10, 255, 631, 124);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 20, 611, 94);
		panel_1.add(scrollPane);
		
		JTextPane txtpnSistemZaNaplatu = new JTextPane();
		txtpnSistemZaNaplatu.setBackground(new Color(102, 153, 255));
		txtpnSistemZaNaplatu.setText("    Sistem za naplatu parkinga nije nadle\u017Ean za eventualna o\u0161te\u0107enja vozila nastala na parkirali\u0161tu, bila ona izazvana od strane drugog kosrisnika parkinga ili od strane tre\u0107eg lica.\r\nZa slu\u010Daj nepravilnog parkiranja(zauzimanje vi\u0161e pakring mesta, parkiranje na nepredvidjenoj povr\u0161ini i sl.) servis zadr\u017Eava pravo kontaktiranja de\u017Eurne slu\u017Ebe za uklanjanje nepropisno parkiranih vozila. \r\nU slu\u010Daju prijave nepravilnosti i eventualnih \u017Ealbi mo\u017Eete nas kontaktirati putem dole navedenih vidova komunikacija.\r\n\r\nSrda\u010Dno,\r\nVa\u0161 Sistem naplate parkinga.\r\n\r\nTelefon: +381 64 218 218,\tE-mail: naplata.parkinga@gmail.com");
		scrollPane.setViewportView(txtpnSistemZaNaplatu);
	}
}
