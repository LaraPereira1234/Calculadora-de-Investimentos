package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuSobre extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuSobre frame = new MenuSobre();
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
	public MenuSobre() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 263, 195);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCalcInvest = new JLabel("CalcInvest - Calculadora de Investimentos");
		lblCalcInvest.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCalcInvest.setBounds(10, 11, 284, 14);
		contentPane.add(lblCalcInvest);
		
		JLabel lblVersão = new JLabel("Versão 1.0");
		lblVersão.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblVersão.setBounds(10, 36, 71, 14);
		contentPane.add(lblVersão);
		
		JLabel lblAutor = new JLabel("Autor: Lara Pereira");
		lblAutor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAutor.setBounds(10, 61, 120, 14);
		contentPane.add(lblAutor);
		
		JLabel lblContato = new JLabel("Contato: lara.p2006@aluno.ifsc.edu.br");
		lblContato.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblContato.setBounds(10, 86, 244, 14);
		contentPane.add(lblContato);
		
		JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnOK.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnOK.setBounds(87, 122, 65, 23);
		contentPane.add(btnOK);
	}
}
