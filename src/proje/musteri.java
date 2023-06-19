package proje;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class musteri extends JFrame {

	private JPanel contentPane;
	private String hesap_sayisi;
	private JTextField textField;
	private JTextField textField_1;
	int a,u,bir=1,bos1,bos2,bos3,tursayisi,r,as,gno,gmiktar,hedefkur,hesapkur,hedefbakiye,hesapbakiye,bankarezerv,bankagelir,intborc,intborcmiktar,hesapbakiye1,bankarezerv1,bankagelir1,bankarezerv2,bankagelir2,gider1,gider2,gider3,gider4,bankagelir3;
	String b,miktar,bos3s,adsoyad,gnno,gnmiktar,hedefbirim,hedefbirimid,hesapbakiyesi,hedefbakiyesi,hebak,mybak,brezerv,borc,borcmiktar,mybak1;
	String[] turler=new String[10];
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
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					musteri frame = new musteri(args,args,args);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param hesapnolari,int i 
	 * @param hesap_birimi 
	 * @throws SQLException 
	 */
	public musteri(String[] hesap_birimi, String[] hesap_nolari,String[] ne){
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1042, 684);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		int suankihesapbirimi=Integer.parseInt(ne[4]);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 1006, 623);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Para Cek", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BAKIYE :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(309, 98, 91, 27);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(410, 101, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("MIKTAR :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(309, 195, 91, 20);
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(410, 198, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("CEK");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBounds(309, 275, 187, 27);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Para Yat\u0131r", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("BAKIYE :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2.setBounds(379, 125, 91, 27);
		panel_1.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(480, 128, 86, 20);
		panel_1.add(textField_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("MIKTAR :");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_1.setBounds(379, 222, 91, 20);
		panel_1.add(lblNewLabel_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(480, 225, 86, 20);
		panel_1.add(textField_3);
		
		JButton btnYatr = new JButton("YATIR");
		btnYatr.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnYatr.setBounds(379, 302, 187, 27);
		panel_1.add(btnYatr);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Hesap A\u00E7", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("HESAP TURU");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_5.setBounds(452, 62, 155, 35);
		panel_2.add(lblNewLabel_5);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(35, 123, 956, 96);
		panel_2.add(panel_9);
		
		JButton btnNewButton_2 = new JButton("HESAP AC");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_2.setBounds(331, 273, 385, 22);
		panel_2.add(btnNewButton_2);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Hesap Sil", null, panel_3, null);
		panel_3.setLayout(null);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBounds(10, 65, 981, 84);
		panel_3.add(panel_10);
		
		JButton btnNewButton_3 = new JButton("SIL");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_3.setBounds(256, 181, 510, 23);
		panel_3.add(btnNewButton_3);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Para Transferi", null, panel_4, null);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("HESAP NO :");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_6.setBounds(297, 107, 119, 30);
		panel_4.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("MIKTAR :");
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_6_1.setBounds(297, 170, 99, 30);
		panel_4.add(lblNewLabel_6_1);
		
		textField_9 = new JTextField();
		textField_9.setBounds(402, 112, 86, 20);
		panel_4.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(402, 175, 86, 20);
		panel_4.add(textField_10);
		textField_10.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("GONDER");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_4.setBounds(273, 228, 245, 23);
		panel_4.add(btnNewButton_4);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Bor\u00E7 \u00D6deme", null, panel_5, null);
		panel_5.setLayout(null);
		
		JLabel lblBorc = new JLabel("BORC :");
		lblBorc.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblBorc.setBounds(364, 157, 91, 27);
		panel_5.add(lblBorc);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(465, 163, 86, 20);
		panel_5.add(textField_11);
		
		JLabel lblNewLabel_1_2 = new JLabel("MIKTAR :");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_2.setBounds(364, 208, 91, 20);
		panel_5.add(lblNewLabel_1_2);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(465, 211, 86, 20);
		panel_5.add(textField_12);
		
		JButton btnOde = new JButton("ODE");
		btnOde.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnOde.setBounds(364, 288, 187, 27);
		panel_5.add(btnOde);
		
		JLabel lblBakye = new JLabel("BAKIYE :");
		lblBakye.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblBakye.setBounds(364, 108, 91, 27);
		panel_5.add(lblBakye);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(465, 114, 86, 20);
		panel_5.add(textField_13);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Kredi Talep", null, panel_6, null);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Bilgi G\u00FCncelleme", null, panel_7, null);
		panel_7.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("BILGILERIM :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_3.setBounds(47, 26, 134, 44);
		panel_7.add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("GUNCELLE");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1.setBounds(345, 370, 162, 23);
		panel_7.add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("ADRES :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_4.setBounds(305, 137, 86, 17);
		panel_7.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(421, 134, 134, 20);
		panel_7.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(421, 188, 134, 20);
		panel_7.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(421, 289, 134, 20);
		panel_7.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_7.setBounds(191, 35, 800, 32);
		panel_7.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_4_1 = new JLabel("TELEFON :");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_4_1.setBounds(305, 191, 106, 17);
		panel_7.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("SIFRE :");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_4_2.setBounds(305, 288, 86, 17);
		panel_7.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_2_1 = new JLabel("E-POSTA :");
		lblNewLabel_4_2_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_4_2_1.setBounds(305, 240, 86, 17);
		panel_7.add(lblNewLabel_4_2_1);
		
		textField_8 = new JTextField();
		textField_8.setBounds(421, 241, 134, 20);
		panel_7.add(textField_8);
		textField_8.setColumns(10);
		
		JPanel panel_8 = new JPanel();
		tabbedPane.addTab("Ayl\u0131k \u00D6zet", null, panel_8, null);
		
		u=Integer.parseInt(ne[4]);
		//System.out.println(u);
		
		String sorgu="select bakiye from hesap where hesapno='"+hesap_nolari[Integer.parseInt(ne[4])]+"'";
		ResultSet myres=baglanti.yap("musteri");
		myres=baglanti.sorgula(sorgu);
		try {
			while(myres.next()) {
				a=myres.getInt("bakiye");
				b=String.valueOf(a);
				//System.out.println(a);
				textField.setText(b);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String sorgu="select bakiye from hesap where hesapno='"+hesap_nolari[Integer.parseInt(ne[4])]+"'";
					ResultSet myres=baglanti.yap("musteri");
					myres=baglanti.sorgula(sorgu);
					try {
						while(myres.next()) {
							a=myres.getInt("bakiye");
							b=String.valueOf(a);
							//System.out.println(a);
							textField.setText(b);
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					sorgu="select rezerv from banka_durumu where id='"+bir+"'";
					myres=baglanti.sorgula(sorgu);
					try {
						while(myres.next()) {
							bankarezerv2=myres.getInt("rezerv");
						}
					} catch (SQLException e4) {
						e4.printStackTrace();
					}
					sorgu="select gider from banka_durumu where id='"+bir+"'";
					myres=baglanti.sorgula(sorgu);
					try {
						while(myres.next()) {
							gider1=myres.getInt("gider");
						}
					} catch (SQLException e5) {
						e5.printStackTrace();
					}
					miktar=textField_1.getText();
					bos1=Integer.parseInt(b);
					bos2=Integer.parseInt(miktar);
					if(bos1>=bos2) {
						bos1-=bos2;
						gider1+=bos2;
						bankarezerv2-=bos2;
						b=String.valueOf(bos1);
						sorgu="select gelir from banka_durumu where id='"+bir+"'";
						myres=baglanti.sorgula(sorgu);
						try {
							while(myres.next()) {
								bankagelir3=myres.getInt("gelir");
							}
						} catch (SQLException e5) {
							e5.printStackTrace();
						}
						//System.out.println(a);
						textField_2.setText(b);
						textField.setText(b);
						textField_13.setText(b);
						sorgu="UPDATE hesap set bakiye='"+b+"' where hesapno='"+hesap_nolari[Integer.parseInt(ne[4])]+"'";
						myres=baglanti.yap("musteri");
						baglanti.update(sorgu);
						sorgu="UPDATE banka_durumu set rezerv='"+bankarezerv2+"' where id='"+bir+"'";
						baglanti.update(sorgu);
						sorgu="UPDATE banka_durumu set gider='"+gider1+"' where id='"+bir+"'";
						baglanti.update(sorgu);
						sorgu="UPDATE banka_durumu set kar='"+(bankagelir3-gider1)+"' where id='"+bir+"'";
						baglanti.update(sorgu);
					}else {
						btnNewButton.setText("YETERSIZ BAKIYE");
					}
				}
			});
			
			
			
			sorgu="select bakiye from hesap where hesapno='"+hesap_nolari[Integer.parseInt(ne[4])]+"'";
			myres=baglanti.yap("musteri");
			myres=baglanti.sorgula(sorgu);
			try {
				while(myres.next()) {
					a=myres.getInt("bakiye");
					b=String.valueOf(a);
					//System.out.println(a);
					textField_2.setText(b);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				btnYatr.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String sorgu="select bakiye from hesap where hesapno='"+hesap_nolari[Integer.parseInt(ne[4])]+"'";
						ResultSet myres=baglanti.yap("musteri");
						myres=baglanti.sorgula(sorgu);
						try {
							while(myres.next()) {
								a=myres.getInt("bakiye");
								b=String.valueOf(a);
								//System.out.println(a);
								textField_2.setText(b);
							}
						} catch (SQLException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}
						sorgu="select rezerv from banka_durumu where id='"+bir+"'";
						myres=baglanti.sorgula(sorgu);
						try {
							while(myres.next()) {
								bankarezerv1=myres.getInt("rezerv");
							}
						} catch (SQLException e4) {
							e4.printStackTrace();
						}
						sorgu="select gelir from banka_durumu where id='"+bir+"'";
						myres=baglanti.sorgula(sorgu);
						try {
							while(myres.next()) {
								bankagelir2=myres.getInt("gelir");
							}
						} catch (SQLException e5) {
							e5.printStackTrace();
						}
						miktar=textField_3.getText();
						bos1=Integer.parseInt(b);
						bos2=Integer.parseInt(miktar);
							bos1+=bos2;
							bankarezerv1+=bos2;
							bankagelir2+=bos2;
							b=String.valueOf(bos1);
							sorgu="select gider from banka_durumu where id='"+bir+"'";
							myres=baglanti.sorgula(sorgu);
							try {
								while(myres.next()) {
									gider4=myres.getInt("gider");
								}
							} catch (SQLException e5) {
								e5.printStackTrace();
							}
							//System.out.println(a);
							textField.setText(b);
							textField_2.setText(b);
							textField_13.setText(b);
							sorgu="UPDATE hesap set bakiye='"+b+"' where hesapno='"+hesap_nolari[Integer.parseInt(ne[4])]+"'";
							myres=baglanti.yap("musteri");
							baglanti.update(sorgu);
							sorgu="UPDATE banka_durumu set rezerv='"+bankarezerv1+"' where id='"+bir+"'";
							baglanti.update(sorgu);
							sorgu="UPDATE banka_durumu set gelir='"+bankagelir2+"' where id='"+bir+"'";
							baglanti.update(sorgu);
							sorgu="UPDATE banka_durumu set kar='"+(bankagelir2-gider4)+"' where id='"+bir+"'";
							baglanti.update(sorgu);
					}
				});
			
				sorgu="select id from musteri_hesap where hesap_no='"+hesap_nolari[Integer.parseInt(ne[4])]+"'";
				myres=baglanti.yap("musteri");
				myres=baglanti.sorgula(sorgu);
				try {
					while(myres.next()) {
						bos3=myres.getInt("id");
						bos3s=String.valueOf(bos3);
						sorgu="select * from musteri where idno='"+bos3+"'";
						myres=baglanti.sorgula(sorgu);
						try {
							while(myres.next()) {
								textField_7.setText("Ad Soyad :"+myres.getString("adsoyad")+"--- Adres :"+myres.getString("adres")+"--- Telefon :"+myres.getString("tel")+"--- E-posta :"+myres.getString("e_posta")+"--- Þifre :"+myres.getString("sifre"));
							}
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String sorgu="UPDATE musteri set adres='"+textField_4.getText()+"',tel='"+textField_5.getText()+"',e_posta='"+textField_8.getText()+"',sifre='"+textField_6.getText()+"' where idno='"+bos3s+"'";
						ResultSet myres=baglanti.yap("musteri");
						baglanti.update(sorgu);
						sorgu="select adsoyad,adres,tel,e_posta,sifre from musteri where idno='"+bos3+"'";
						myres=baglanti.sorgula(sorgu);
						try {
							while(myres.next()) {
								textField_7.setText("Ad Soyad :"+myres.getString("adsoyad")+"-- Adres :"+myres.getString("adres")+"Telefon :"+myres.getString("tel")+"-- E-posta :"+myres.getString("e_posta")+"-- Þifre :"+myres.getString("sifre"));
							}
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				});
				sorgu="select count(id) as giris from hesapturu";
				myres=baglanti.sorgula(sorgu);
				try {
					while(myres.next()) {
						tursayisi=myres.getInt("giris");
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				for(as=0;as<tursayisi;as++) {
					sorgu="select hesap_birimi from hesapturu where id='"+(as+1)+"'";
					myres=baglanti.sorgula(sorgu);
					try {
						while(myres.next()) {
							turler[as]=myres.getString("hesap_birimi");
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				JRadioButton[] rbuttons=new JRadioButton[tursayisi];
				for(r=0;r<tursayisi;r++) {
					rbuttons[r]=new JRadioButton();
					rbuttons[r].setText(turler[r]);
					panel_9.add(rbuttons[r]);
				}
				ButtonGroup bgg=new ButtonGroup();
				for(r=0;r<tursayisi;r++) {
					bgg.add(rbuttons[r]);
				}
				sorgu="SELECT adsoyad from musteri where idno='"+bos3+"'";
				myres=baglanti.sorgula(sorgu);
				try {
					while(myres.next()) {
						adsoyad=myres.getString("adsoyad");
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				btnNewButton_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						for(r=0;r<tursayisi;r++) {
							if(rbuttons[r].isSelected()) {
								String bos333=turler[r];
								String sorgu="insert into hesapac_istekler (idno,adsoyad,hesapbirimi) values('"+bos3+"','"+adsoyad+"','"+bos333+"')";
								baglanti.ekle(sorgu);
								btnNewButton_2.setText("HESAP ISTEGI GONDERILDI");
							}
						}
					}
				});
				JRadioButton[] rbuttonss=new JRadioButton[hesap_nolari.length];
				for(r=0;r<hesap_nolari.length;r++) {
					rbuttonss[r]=new JRadioButton();
					rbuttonss[r].setText("Hesap No:"+hesap_nolari[r]+" Hesap Birimi:"+hesap_birimi[r]);
					panel_10.add(rbuttonss[r]);
				}
				ButtonGroup bggg=new ButtonGroup();
				for(r=0;r<hesap_nolari.length;r++) {
					bggg.add(rbuttonss[r]);
				}
				btnNewButton_3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						for(r=0;r<hesap_nolari.length;r++) {
							if(rbuttonss[r].isSelected()) {
								
								String sorgu="insert into hesapsil_istekler (idno,hesapno,hesapbirimi) values('"+bos3+"','"+hesap_nolari[r]+"','"+hesap_birimi[r]+"')";
								baglanti.ekle(sorgu);
								btnNewButton_3.setText("HESAP SILME ISTEGI GONDERILDI");
							}
						}
					}
				});
				
				btnNewButton_4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						gnno=textField_9.getText();
						gnmiktar=textField_10.getText();
						gmiktar=Integer.parseInt(gnmiktar);
						String sorgu="SELECT hesapturu_id FROM hesapno_turu where hesapno='"+Integer.parseInt(gnno)+"'";
						ResultSet myres=baglanti.sorgula(sorgu);
						try {
							while(myres.next()) {
								hedefbirimid=myres.getString("hesapturu_id");
							}
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
						sorgu="SELECT kur FROM hesapturu where id='"+((Integer.parseInt(ne[4]))+1)+"'";
						myres=baglanti.sorgula(sorgu);
						try {
							while(myres.next()) {
								hesapkur=myres.getInt("kur");
							}
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
						sorgu="SELECT kur FROM hesapturu where id='"+Integer.parseInt(hedefbirimid)+"'";
						myres=baglanti.sorgula(sorgu);
						try {
							while(myres.next()) {
								hedefkur=myres.getInt("kur");
							}
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
						sorgu="SELECT bakiye FROM hesap where hesapno='"+Integer.parseInt(gnno)+"'";
						myres=baglanti.sorgula(sorgu);
						try {
							while(myres.next()) {
								hebak=myres.getString("bakiye");
							}
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
						sorgu="SELECT bakiye FROM hesap where hesapno='"+hesap_nolari[Integer.parseInt(ne[4])]+"'";
						myres=baglanti.sorgula(sorgu);
						try {
							while(myres.next()) {
								mybak=myres.getString("bakiye");
							}
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
						System.out.println(hesapkur+" "+hedefkur+" "+hebak+" "+mybak);
						hedefbakiye=Integer.parseInt(hebak);
						hesapbakiye=Integer.parseInt(mybak);
						if(hesapkur>hedefkur) {
							hedefbakiye+=gmiktar*(hesapkur/hedefkur);
							hesapbakiye-=gmiktar;
							System.out.println(hesapkur+" "+hedefkur+" "+hedefbakiye+" "+hesapbakiye);
						}else if(hesapkur==hedefkur) {
							hedefbakiye+=gmiktar;
							hesapbakiye-=gmiktar;
						}else {
							hedefbakiye+=gmiktar*((float)hesapkur/(float)hedefkur);
							hesapbakiye-=gmiktar;
						}
						System.out.println(hesapkur+" "+hedefkur+" "+hedefbakiye+" "+hesapbakiye);
						hesapbakiyesi=String.valueOf(hesapbakiye);
						hedefbakiyesi=String.valueOf(hedefbakiye);
						sorgu="update hesap set bakiye='"+hesapbakiyesi+"' where hesapno='"+hesap_nolari[Integer.parseInt(ne[4])]+"'";
						baglanti.update(sorgu);
						sorgu="update hesap set bakiye='"+hedefbakiyesi+"' where hesapno='"+Integer.parseInt(gnno)+"'";
						baglanti.update(sorgu);
						btnNewButton_4.setText("Transfer Gerceklesti");
						
					}
				});
				sorgu="select rezerv from banka_durumu where id='"+bir+"'";
				myres=baglanti.sorgula(sorgu);
				try {
					while(myres.next()) {
						bankarezerv=myres.getInt("rezerv");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				System.out.println(bankarezerv);
				sorgu="select borc from hesap where hesapno='"+hesap_nolari[Integer.parseInt(ne[4])]+"'";
				myres=baglanti.sorgula(sorgu);
				try {
					while(myres.next()) {
						intborc=myres.getInt("borc");
						borc=String.valueOf(intborc);
						textField_11.setText(borc);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				sorgu="select bakiye FROM hesap where hesapno='"+hesap_nolari[Integer.parseInt(ne[4])]+"'";
				myres=baglanti.sorgula(sorgu);
				try {
					while(myres.next()) {
						mybak1=myres.getString("bakiye");
						textField_13.setText(mybak1);
						hesapbakiye1=Integer.parseInt(mybak1);
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				sorgu="select gelir from banka_durumu where id='"+bir+"'";
				myres=baglanti.sorgula(sorgu);
				try {
					while(myres.next()) {
						bankagelir=myres.getInt("gelir");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				btnOde.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String sorgu="select bakiye FROM hesap where hesapno='"+hesap_nolari[Integer.parseInt(ne[4])]+"'";
						ResultSet myres=baglanti.sorgula(sorgu);
						try {
							while(myres.next()) {
								mybak1=myres.getString("bakiye");
								textField_13.setText(mybak1);
								hesapbakiye1=Integer.parseInt(mybak1);
							}
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
						
						sorgu="select borc from hesap where hesapno='"+hesap_nolari[Integer.parseInt(ne[4])]+"'";
						myres=baglanti.sorgula(sorgu);
						try {
							while(myres.next()) {
								intborc=myres.getInt("borc");
								borc=String.valueOf(intborc);
								textField_11.setText(borc);
							}
						} catch (SQLException e3) {
							e3.printStackTrace();
						}
						
			
						borcmiktar=textField_12.getText();
						intborcmiktar=Integer.parseInt(borcmiktar);
						System.out.println(intborcmiktar+" "+hesapbakiye1);
						if(hesapbakiye1>=intborcmiktar) {
							if(intborc>=intborcmiktar) {
								intborc=intborc-intborcmiktar;
								hesapbakiye1=hesapbakiye1-intborcmiktar;
								bankagelir=bankagelir+intborcmiktar;
								bankarezerv=bankarezerv+intborcmiktar;
								borc=String.valueOf(intborc);
								sorgu="select gider from banka_durumu where id='"+bir+"'";
								myres=baglanti.sorgula(sorgu);
								try {
									while(myres.next()) {
										gider3=myres.getInt("gider");
									}
								} catch (SQLException e5) {
									e5.printStackTrace();
								}
								textField_11.setText(borc);
								mybak1=String.valueOf(hesapbakiye1);
								textField.setText(mybak1);
								textField_2.setText(mybak1);
								textField_13.setText(mybak1);
								sorgu="UPDATE hesap set bakiye='"+mybak1+"' where hesapno='"+hesap_nolari[Integer.parseInt(ne[4])]+"'";
								baglanti.update(sorgu);
								sorgu="UPDATE hesap set borc='"+intborc+"' where hesapno='"+hesap_nolari[Integer.parseInt(ne[4])]+"'";
								baglanti.update(sorgu);
								sorgu="UPDATE banka_durumu set rezerv='"+bankarezerv+"' where id='"+bir+"'";
								baglanti.update(sorgu);
								sorgu="UPDATE banka_durumu set gelir='"+bankagelir+"' where id='"+bir+"'";
								baglanti.update(sorgu);
								sorgu="UPDATE banka_durumu set kar='"+(bankagelir-gider3)+"' where id='"+bir+"'";
								baglanti.update(sorgu);
								btnOde.setText("BORC ODENDI");
								System.out.println(intborcmiktar+" "+hesapbakiye1);
							}
							else {
								btnOde.setText("GECERSIZ MIKTAR");
							}
							
						}else {
								btnOde.setText("GECERSIZ MIKTAR");
						}
					}
				});
			
		}
}
