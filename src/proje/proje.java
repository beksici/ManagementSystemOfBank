package proje;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ItemEvent;

public class proje extends JFrame {

	private JPanel contentPane;
	private JTextField text_adsoyad;
	private JTextField text_sifre;
	static String adsoyad;
	static String þifre;
	static String kullanici;
	static String hesap_sayisi;
	String a;
	int b;
	int c=0;
	int boyut=0;
	String h;
	int hesapturusayisi;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					proje frame = new proje();
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
	public proje() {
		setTitle("GIRIS");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 481, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("G\u0130R\u0130\u015E");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(202, 11, 56, 51);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Kullan\u0131c\u0131 T\u00FCr\u00FC");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(187, 73, 97, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Kullan\u0131c\u0131 Ad\u0131 :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(89, 162, 97, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u015Eifre :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(89, 204, 97, 20);
		contentPane.add(lblNewLabel_3);
		
		text_adsoyad = new JTextField();
		text_adsoyad.setFont(new Font("Tahoma", Font.BOLD, 11));
		text_adsoyad.setBounds(202, 163, 145, 20);
		contentPane.add(text_adsoyad);
		text_adsoyad.setColumns(10);
		
		text_sifre = new JTextField();
		text_sifre.setFont(new Font("Tahoma", Font.BOLD, 11));
		text_sifre.setBounds(202, 205, 145, 20);
		contentPane.add(text_sifre);
		text_sifre.setColumns(10);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 108, 445, 43);
		contentPane.add(panel);
		
		JRadioButton musteri = new JRadioButton("Musteri");
		panel.add(musteri);
		
		JRadioButton temsilci = new JRadioButton("Musteri Temsilcisi");
		panel.add(temsilci);
		
		JRadioButton mudur = new JRadioButton("Mudur");
		panel.add(mudur);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(mudur);
		bg.add(temsilci);
		bg.add(musteri);
		
		JButton btn_giris = new JButton("GIRIS");
		btn_giris.addActionListener(new ActionListener() {
			@SuppressWarnings("resource")
			public void actionPerformed(ActionEvent e) {
				if(mudur.isSelected()) {
					kullanici="mudur";
				}
				else if(musteri.isSelected()) {
					kullanici="musteri";
				}
				else if(temsilci.isSelected()) {
					kullanici="musteri_temsilcisi";
				}
				adsoyad=text_adsoyad.getText();
				þifre=text_sifre.getText().toString();
				//kullanici="mudur";
				String sorgu="select count(adsoyad) as giris from "+kullanici+" where adsoyad='"+adsoyad+"' and sifre='"+þifre+"'";
				ResultSet myres=baglanti.yap(kullanici);
				myres=baglanti.sorgula(sorgu);
				try {
					while(myres.next()) {
						if(myres.getInt("giris")==1) {
							if(kullanici.equals("musteri")) {
								sorgu="select idno from "+kullanici+" where adsoyad='"+adsoyad+"' and sifre='"+þifre+"'";
								myres=baglanti.sorgula(sorgu);
								while(myres.next()) {
									a=myres.getString("idno");
								}
								sorgu="select count(id) as sayý from musteri_hesap where id='"+a+"'";
								myres=baglanti.sorgula(sorgu);
								while(myres.next()) {
									hesap_sayisi=myres.getString("sayý");
								}
								String[] hesaplar=new String[Integer.parseInt(hesap_sayisi)];
								String[] hesap_nolari =new String[Integer.parseInt(hesap_sayisi)];
								String[] hesapturu_id =new String[Integer.parseInt(hesap_sayisi)];
								String[] hesap_birimi =new String[Integer.parseInt(hesap_sayisi)];
								sorgu="select hesap_no from musteri_hesap where id='"+a+"'";
								myres=baglanti.sorgula(sorgu);
								while(myres.next()) {
									hesap_nolari[c]=myres.getString("hesap_no");
									c++;
								}
								for(c=0;c<hesap_nolari.length;c++) {
									sorgu="select hesapturu_id from hesapno_turu where hesapno='"+hesap_nolari[c]+"'";
									myres=baglanti.sorgula(sorgu);
									while(myres.next()) {
										hesapturu_id[c]=myres.getString("hesapturu_id");
										
									}
								}
								for(c=0;c<hesap_nolari.length;c++) {
									sorgu="select hesap_birimi from hesapturu where id='"+hesapturu_id[c]+"'";
									myres=baglanti.sorgula(sorgu);
									while(myres.next()) {
										hesap_birimi[c]=myres.getString("hesap_birimi");
										
									}
									boyut++;
								}
								c=0;
								
								hesap_secimi mu=new hesap_secimi(boyut,hesap_birimi,hesap_nolari);
								mu.setVisible(true);
							}else if(kullanici.equals("musteri_temsilcisi")) {
								musteri_temsilcisi mu_te=new musteri_temsilcisi();
								mu_te.setVisible(true);
							}else if(kullanici.equals("mudur")) {
								sorgu="select id from "+kullanici+" where adsoyad='"+adsoyad+"' and sifre='"+þifre+"'";
								myres=baglanti.sorgula(sorgu);
								while(myres.next()) {
									a=myres.getString("id");
								}
								mudur mudur=new mudur();
								mudur.setVisible(true);
							}
						}else {
							btn_giris.setText("hatalý giriþ");
						}
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btn_giris.setBounds(202, 260, 113, 20);
		contentPane.add(btn_giris);
		
		JButton btnNewButton = new JButton("ER Diyagram");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(342, 11, 113, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				er err=new er();
				err.setVisible(true);
			}
		});
		
	}
}
