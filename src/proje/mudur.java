package proje;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTextField;
import javax.swing.JButton;

public class mudur extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	
	String parabirimadý,eklenecekkurdegeri,guncellenecekbirim,styenikur,yenimaas,yenifaiz,yenigecikmis,yenibilgi1,yenibilgi2,yenibilgi3,yenibilgi4,yenibilgi5,yenibilgi6;
	int tursayýsý,yenikur,temsilcisayýsý,i,bir1=1,musterisayýsý,gelir,gider,kar,rezerv,gelir1,gider1,kar1,rezerv1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mudur frame = new mudur();
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
	public mudur() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 989, 576);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 953, 515);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Genel Durum", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("GELIR :");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_7.setBounds(337, 52, 72, 33);
		panel.add(lblNewLabel_7);
		
		textField_13 = new JTextField();
		textField_13.setBounds(419, 58, 137, 26);
		panel.add(textField_13);
		textField_13.setColumns(10);
		
		JLabel lblNewLabel_7_1 = new JLabel("GIDER :");
		lblNewLabel_7_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_7_1.setBounds(337, 131, 72, 33);
		panel.add(lblNewLabel_7_1);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(419, 137, 137, 26);
		panel.add(textField_14);
		
		JLabel lblNewLabel_7_2 = new JLabel("KAR :");
		lblNewLabel_7_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_7_2.setBounds(353, 207, 56, 33);
		panel.add(lblNewLabel_7_2);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(419, 213, 137, 26);
		panel.add(textField_15);
		
		JLabel lblNewLabel_7_3 = new JLabel("TOPLAM BAKIYE :");
		lblNewLabel_7_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_7_3.setBounds(257, 289, 152, 33);
		panel.add(lblNewLabel_7_3);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(419, 292, 137, 26);
		panel.add(textField_16);
		
		JButton btnNewButton_5 = new JButton("GETIR");
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_5.setBounds(419, 347, 137, 33);
		panel.add(btnNewButton_5);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Para Birimi Ekle", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Para Birimi Ad\u0131 :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(229, 110, 153, 22);
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(392, 113, 143, 22);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Kur De\u011Feri :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(229, 171, 153, 22);
		panel_1.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(392, 175, 143, 22);
		panel_1.add(textField_1);
		
		JButton btnNewButton = new JButton("Ekle");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBounds(347, 243, 242, 22);
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Kur De\u011Feri G\u00FCncelle", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("GUNCELLENECEK PARA BIRIMI : ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2.setBounds(130, 112, 282, 32);
		panel_2.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(422, 112, 145, 32);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("YENI KUR DEGERI :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_3.setBounds(237, 168, 175, 32);
		panel_2.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(422, 177, 145, 32);
		panel_2.add(textField_3);
		
		JButton btnNewButton_1 = new JButton("GUNCELLE");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1.setBounds(404, 255, 185, 32);
		panel_2.add(btnNewButton_1);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Maa\u015F Belirle", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("YENI MAAS :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_4.setBounds(275, 123, 119, 32);
		panel_3.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(404, 129, 156, 26);
		panel_3.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("GUNCELLE");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_2.setBounds(384, 185, 207, 26);
		panel_3.add(btnNewButton_2);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Kredi ve Gecikme Faiz Belirle", null, panel_4, null);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("KREDI FAIZI :");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_5.setBounds(275, 101, 140, 32);
		panel_4.add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.setBounds(425, 100, 160, 40);
		panel_4.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_5_1 = new JLabel("GECIKME FAIZI :");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_5_1.setBounds(254, 196, 154, 32);
		panel_4.add(lblNewLabel_5_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(425, 195, 160, 40);
		panel_4.add(textField_6);
		
		JButton btnNewButton_3 = new JButton("GUNCELLE");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_3.setBounds(400, 276, 215, 32);
		panel_4.add(btnNewButton_3);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("M\u00FC\u015Fteri Ekle", null, panel_5, null);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("AD SOYAD :");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_6.setBounds(262, 36, 107, 31);
		panel_5.add(lblNewLabel_6);
		
		textField_7 = new JTextField();
		textField_7.setBounds(379, 44, 170, 20);
		panel_5.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_6_1 = new JLabel("TC NO :");
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_6_1.setBounds(262, 92, 107, 31);
		panel_5.add(lblNewLabel_6_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(379, 100, 170, 20);
		panel_5.add(textField_8);
		
		JLabel lblNewLabel_6_2 = new JLabel("TELEFON :");
		lblNewLabel_6_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_6_2.setBounds(262, 160, 107, 31);
		panel_5.add(lblNewLabel_6_2);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(379, 168, 170, 20);
		panel_5.add(textField_9);
		
		JLabel lblNewLabel_6_3 = new JLabel("ADRES :");
		lblNewLabel_6_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_6_3.setBounds(262, 214, 107, 31);
		panel_5.add(lblNewLabel_6_3);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(379, 222, 170, 20);
		panel_5.add(textField_10);
		
		JLabel lblNewLabel_6_4 = new JLabel("E-POSTA :");
		lblNewLabel_6_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_6_4.setBounds(262, 266, 107, 31);
		panel_5.add(lblNewLabel_6_4);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(379, 274, 170, 20);
		panel_5.add(textField_11);
		
		JLabel lblNewLabel_6_5 = new JLabel("SIFRE :");
		lblNewLabel_6_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_6_5.setBounds(262, 318, 107, 31);
		panel_5.add(lblNewLabel_6_5);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(379, 326, 170, 20);
		panel_5.add(textField_12);
		
		JButton btnNewButton_4 = new JButton("EKLE");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_4.setBounds(379, 384, 170, 31);
		panel_5.add(btnNewButton_4);
		
		
		btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String sorgu="select count(id) as giris from hesapturu";
					ResultSet myres=baglanti.yap("mudur");
					myres=baglanti.sorgula(sorgu);
					try {
						while(myres.next()) {
							tursayýsý=myres.getInt("giris");
						}
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					parabirimadý=textField.getText();
					eklenecekkurdegeri=textField_1.getText();
					sorgu="insert into hesapturu (id,hesap_birimi,kur) values('"+(tursayýsý+1)+"','"+parabirimadý+"','"+(Integer.parseInt(eklenecekkurdegeri))+"')";
					baglanti.ekle(sorgu);
					btnNewButton.setText("BASARIYLA EKLENDI");
					
				}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guncellenecekbirim=textField_2.getText();
				styenikur=textField_3.getText();
				yenikur=Integer.parseInt(styenikur);
				String sorgu="update hesapturu set kur='"+yenikur+"' where hesap_birimi='"+guncellenecekbirim+"'";
				ResultSet myres=baglanti.yap("mudur");
				baglanti.update(sorgu);
				btnNewButton_1.setText("GUNCELLENDI");
			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sorgu="select count(id) as giris from musteri_temsilcisi";
				ResultSet myres=baglanti.yap("mudur");
				myres=baglanti.sorgula(sorgu);
				try {
					while(myres.next()) {
						temsilcisayýsý=myres.getInt("giris");
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				yenimaas=textField_4.getText();
				for(i=0;i<temsilcisayýsý;i++) {
					sorgu="update musteri_temsilcisi set maas='"+yenimaas+"' where id='"+(i+1)+"'";
					myres=baglanti.yap("mudur");
					baglanti.update(sorgu);
				}
				btnNewButton_2.setText("GUNCELLENDI");
			}
		});
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				yenifaiz=textField_5.getText();
				yenigecikmis=textField_6.getText();
				String sorgu="update banka_durumu set faiz='"+yenifaiz+"' where id='"+bir1+"'";
				ResultSet myres=baglanti.yap("mudur");
				baglanti.update(sorgu);
				sorgu="update banka_durumu set gecikme_faizi='"+yenigecikmis+"' where id='"+bir1+"'";
				myres=baglanti.yap("mudur");
				baglanti.update(sorgu);
				btnNewButton_3.setText("GUNCELLENDI");
			}
		});
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sorgu="select count(idno) as giris from musteri";
				ResultSet myres=baglanti.yap("mudur");
				myres=baglanti.sorgula(sorgu);
				try {
					while(myres.next()) {
						musterisayýsý=myres.getInt("giris");
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				yenibilgi1=textField_7.getText();
				yenibilgi2=textField_8.getText();
				yenibilgi3=textField_9.getText();
				yenibilgi4=textField_10.getText();
				yenibilgi5=textField_11.getText();
				yenibilgi6=textField_12.getText();
				sorgu="insert into musteri (idno,adsoyad,tc_no,tel,adres,e_posta,sifre) values('"+(musterisayýsý+1)+"','"+yenibilgi1+"','"+yenibilgi2+"','"+yenibilgi3+"','"+yenibilgi4+"','"+yenibilgi5+"','"+yenibilgi6+"')";
				baglanti.ekle(sorgu);
				btnNewButton_4.setText("MUSTERI EKLENDI");
			}
		});
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sorgu="select gelir from banka_durumu where id='"+1+"'";
				ResultSet myres=baglanti.yap("mudur");
				myres=baglanti.sorgula(sorgu);
				try {
					while(myres.next()) {
						gelir1=myres.getInt("gelir");
						textField_13.setText(String.valueOf(gelir1));
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
				sorgu="select gider from banka_durumu where id='"+1+"'";
				myres=baglanti.sorgula(sorgu);
				try {
					while(myres.next()) {
						gider1=myres.getInt("gider");
						textField_14.setText(String.valueOf(gider1));
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
				sorgu="select kar from banka_durumu where id='"+1+"'";
				myres=baglanti.sorgula(sorgu);
				try {
					while(myres.next()) {
						kar1=myres.getInt("kar");
						textField_15.setText(String.valueOf(kar1));
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
				sorgu="select rezerv from banka_durumu where id='"+1+"'";
				myres=baglanti.sorgula(sorgu);
				try {
					while(myres.next()) {
						rezerv1=myres.getInt("rezerv");
						textField_16.setText(String.valueOf(rezerv1));
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
	}
}
