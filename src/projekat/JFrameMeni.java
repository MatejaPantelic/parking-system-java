package projekat;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;

public class JFrameMeni extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameMeni frame = new JFrameMeni();
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
	public JFrameMeni() {
		setTitle("Meni");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 470);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnDodajVozilo = new JButton("Dodaj vozilo");
		btnDodajVozilo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JFrameDodajVozilo d=new JFrameDodajVozilo();				//otvaranje JFrameDodajVozilo
				d.setVisible(true);
				dispose();
			}
		});
		btnDodajVozilo.setFont(new Font("Sylfaen", Font.PLAIN, 22));
		btnDodajVozilo.setBounds(204, 119, 221, 42);
		contentPane.add(btnDodajVozilo);
		
		JButton btnCenovnik = new JButton("Cenovnik");
		btnCenovnik.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JFrameCenovnik c=new JFrameCenovnik();						//otvaranje JFrameCenovnik            
				c.setVisible(true);
				dispose();
			}
		});
		btnCenovnik.setFont(new Font("Sylfaen", Font.PLAIN, 22));
		btnCenovnik.setBounds(204, 195, 221, 42);
		contentPane.add(btnCenovnik);
		
		JButton btnOdjava = new JButton("Odjava");
		btnOdjava.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JFramePocetna p=new JFramePocetna();						//povratak na JFramePocetna
				p.setVisible(true);
				dispose();
				
			}
		});
		btnOdjava.setFont(new Font("Sylfaen", Font.PLAIN, 22));
		btnOdjava.setBounds(204, 266, 221, 42);
		contentPane.add(btnOdjava);
		
		JLabel lbNaslovMenu = new JLabel("MENI");
		lbNaslovMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lbNaslovMenu.setForeground(new Color(100, 149, 237));
		lbNaslovMenu.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 50));
		lbNaslovMenu.setBounds(251, 29, 163, 66);
		contentPane.add(lbNaslovMenu);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		Image img=new ImageIcon(this.getClass().getResource("/men.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(199, 29, 70, 66);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image img1=new ImageIcon(this.getClass().getResource("/car.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img1));
		lblNewLabel_1.setBounds(489, 264, 141, 159);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image img2=new ImageIcon(this.getClass().getResource("/van.png")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img2));
		lblNewLabel_2.setBounds(20, 264, 141, 159);
		contentPane.add(lblNewLabel_2);
	}
}
