package presentacio;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import domini.ReservaInformation;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;

@SuppressWarnings("serial")
public class View4 extends JFrame {

	private JPanel contentPane;
	private static JTextField areaMessage;
	private JTextField hotel;
	private JTextField poblacio;
	private JTextField sIn;
	private JTextField sFi;
	private JTextField sNits;
	private JTextField tipusHab;
	private JTextField sPreu;
	private JTextField dni;
	private ControladorVistaReservarHabitacio controladorVistaReservarHabitacio;

	/**
	 * Create the frame.
	 */
	public View4(ReservaInformation res) {
		controladorVistaReservarHabitacio = new ControladorVistaReservarHabitacio();
		setTitle("BonsHotels");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 265, 520);
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
		
		JButton oKButton = new JButton("OK");
		oKButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controladorVistaReservarHabitacio.PrOKObteDadesClient(dni.getText());
			}
		});
		
		
		oKButton.setBounds(28, 390, 89, 23);
		contentPane.add(oKButton);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controladorVistaReservarHabitacio.PrCancel();
			}
		});
		cancelButton.setBounds(141, 390, 89, 23);
		contentPane.add(cancelButton);
		
		areaMessage = new JTextField();
		areaMessage.setHorizontalAlignment(SwingConstants.CENTER);
		areaMessage.setText("Area message");
		areaMessage.setEditable(false);
		areaMessage.setBounds(35, 435, 195, 20);
		contentPane.add(areaMessage);
		areaMessage.setColumns(10);
		
		hotel = new JTextField();
		hotel.setEditable(false);
		hotel.setBounds(111, 39, 100, 20);
		contentPane.add(hotel);
		hotel.setColumns(10);
		hotel.setText(res.getHotel());
		
		poblacio = new JTextField();
		poblacio.setEditable(false);
		poblacio.setBounds(111, 79, 100, 20);
		contentPane.add(poblacio);
		poblacio.setColumns(10);
		poblacio.setText(res.getPob());
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		
		sIn = new JTextField();
		sIn.setEditable(false);
		sIn.setBounds(111, 119, 100, 20);
		contentPane.add(sIn);
		sIn.setColumns(10);
		sIn.setText(sdf.format(res.getdIni()));
		
		sFi = new JTextField();
		sFi.setEditable(false);
		sFi.setBounds(111, 159, 100, 20);
		contentPane.add(sFi);
		sFi.setColumns(10);
		sFi.setText(sdf.format(res.getdFi()));
		
		sNits = new JTextField();
		sNits.setEditable(false);
		sNits.setBounds(111, 199, 100, 20);
		contentPane.add(sNits);
		sNits.setColumns(10);
        long diferencia = res.getdFi().getTime() - res.getdIni().getTime();
        int dias = (int) Math.floor(diferencia / (1000 * 60 * 60 * 24));
        sNits.setText(String.valueOf(dias));
		
		
		tipusHab = new JTextField();
		tipusHab.setEditable(false);
		tipusHab.setBounds(111, 239, 100, 20);
		contentPane.add(tipusHab);
		tipusHab.setColumns(10);
		tipusHab.setText(res.getTipusHab());
		
		sPreu = new JTextField();
		sPreu.setEditable(false);
		sPreu.setBounds(111, 279, 100, 20);
		contentPane.add(sPreu);
		sPreu.setColumns(10);
		sPreu.setText(String.valueOf(res.getPreuTotal()));
		
		dni = new JTextField();
		dni.setBounds(111, 319, 100, 20);
		contentPane.add(dni);
		dni.setColumns(10);
	}
	
	public static void mostraMissatge(String msg) {
		areaMessage.setText(msg);
	}
}
