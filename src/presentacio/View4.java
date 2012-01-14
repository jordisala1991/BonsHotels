package presentacio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class View4 extends JFrame {

	private JPanel contentPane;
	private JTextField areaMessage;
	private JTextField hotel;
	private JTextField poblacio;
	private JTextField sIn;
	private JTextField sFi;
	private JTextField sNits;
	private JTextField tipusHab;
	private JTextField sPreu;
	private JTextField dni;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View4 frame = new View4();
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
	public View4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 289, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hotel:");
		lblNewLabel.setBounds(22, 39, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Població:");
		lblNewLabel_1.setBounds(22, 79, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Data inici:");
		lblNewLabel_2.setBounds(22, 119, 81, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Data fi:");
		lblNewLabel_3.setBounds(22, 159, 81, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Nombre nits:");
		lblNewLabel_4.setBounds(22, 199, 81, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Tipus Habitació:");
		lblNewLabel_5.setBounds(22, 239, 81, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Preu:");
		lblNewLabel_6.setBounds(22, 279, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("DNI:");
		lblNewLabel_7.setBounds(22, 319, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(28, 390, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(141, 390, 89, 23);
		contentPane.add(btnCancel);
		
		areaMessage = new JTextField();
		areaMessage.setHorizontalAlignment(SwingConstants.CENTER);
		areaMessage.setText("Area message");
		areaMessage.setEditable(false);
		areaMessage.setBounds(35, 435, 195, 20);
		contentPane.add(areaMessage);
		areaMessage.setColumns(10);
		
		hotel = new JTextField();
		hotel.setEditable(false);
		hotel.setBounds(141, 39, 100, 20);
		contentPane.add(hotel);
		hotel.setColumns(10);
		
		poblacio = new JTextField();
		poblacio.setEditable(false);
		poblacio.setBounds(141, 79, 100, 20);
		contentPane.add(poblacio);
		poblacio.setColumns(10);
		
		sIn = new JTextField();
		sIn.setEditable(false);
		sIn.setBounds(141, 119, 100, 20);
		contentPane.add(sIn);
		sIn.setColumns(10);
		
		sFi = new JTextField();
		sFi.setEditable(false);
		sFi.setBounds(141, 159, 100, 20);
		contentPane.add(sFi);
		sFi.setColumns(10);
		
		sNits = new JTextField();
		sNits.setEditable(false);
		sNits.setBounds(141, 199, 100, 20);
		contentPane.add(sNits);
		sNits.setColumns(10);
		
		tipusHab = new JTextField();
		tipusHab.setEditable(false);
		tipusHab.setBounds(141, 239, 100, 20);
		contentPane.add(tipusHab);
		tipusHab.setColumns(10);
		
		sPreu = new JTextField();
		sPreu.setEditable(false);
		sPreu.setBounds(141, 279, 100, 20);
		contentPane.add(sPreu);
		sPreu.setColumns(10);
		
		dni = new JTextField();
		dni.setBounds(141, 319, 100, 20);
		contentPane.add(dni);
		dni.setColumns(10);
	}
}
