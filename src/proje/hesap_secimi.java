package proje;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class hesap_secimi extends JFrame {

	private JPanel contentPane;
	int boyut1;
	String[] hesapbirimi=new String[boyut1];
	String[] hesapnolari=new String[boyut1];
	String hb,hn;
	int j,l,y;
	String[] ne=new String[5];
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hesap_secimi frame = new hesap_secimi(0,args, args);
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
	public hesap_secimi(int boyut, String[] hesap_birimi,String[] hesap_nolari) {
		ne[0]="alo";
		ne[1]="ben";
		ne[2]="emre";
		ne[3]="abin";
		boyut1=boyut;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 898, 321);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton[] buttons=new JButton[5];
		for(j=0;j<5;j++) {
			//System.out.println(j);
			buttons[j]=new JButton();
			buttons[j].setBounds(175*(j+1)-150,100,150,50);
			contentPane.add(buttons[j]);
		}
		
		ActionListener al=new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==buttons[0]) {
					ne[4]=String.valueOf(0);
					setVisible(false);
					musteri mu=new musteri(hesap_birimi,hesap_nolari,ne);
					mu.setVisible(true);
				}
				if(e.getSource()==buttons[1]) {
					ne[4]=String.valueOf(1);
					setVisible(false);
					musteri mu=new musteri(hesap_birimi,hesap_nolari,ne);
					mu.setVisible(true);
				}
				if(e.getSource()==buttons[2]) {
					ne[4]=String.valueOf(2);
					setVisible(false);
					musteri mu=new musteri(hesap_birimi,hesap_nolari,ne);
					mu.setVisible(true);
				}
				if(e.getSource()==buttons[3]) {
					ne[4]=String.valueOf(3);
					setVisible(false);
					musteri mu=new musteri(hesap_birimi,hesap_nolari,ne);
					mu.setVisible(true);
				}
				if(e.getSource()==buttons[4]) {
					ne[4]=String.valueOf(4);
					setVisible(false);
					musteri mu=new musteri(hesap_birimi,hesap_nolari,ne);
					mu.setVisible(true);
				}
			}
		};
		
		
		for(y=0;y<boyut1;y++) {
			buttons[y].setText(hesap_birimi[y].toUpperCase()+"  Hesap no= "+hesap_nolari[y]);
			buttons[y].addActionListener(al);
		}
	}
}

