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
public class View5 extends JFrame {

	private JPanel contentPane;
	private static JTextField areaMessage;
	private JTextField hotel;
	private JTextField poblacio;
	private JTextField sIn;
	private JTextField sFi;
	private JTextField sNits;
	private JTextField tipusHab;
	private JTextField sPreu;
	private JTextField nom;
	private ControladorVistaReservarHabitacio controladorVistaReservarHabitacio;
	private JTextField cognoms;
	private JTextField numCredit;
	private JTextField sdCad;

	/**
	 * Create the frame.
	 */
	public View5(ReservaInformation dades) {
		controladorVistaReservarHabitacio = new ControladorVistaReservarHabitacio();
		setResizable(false);
		setTitle("BonsHotels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 265, 648);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hotel:");
		lblNewLabel.setBounds(22, 39, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Població:");
		lblNewLabel_1.setBounds(22, 79, 70, 14);
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
		lblNewLabel_5.setBounds(22, 239, 108, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Preu:");
		lblNewLabel_6.setBounds(22, 279, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Nom:");
		lblNewLabel_7.setBounds(22, 319, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblCognoms = new JLabel("Cognoms:");
		lblCognoms.setBounds(22, 359, 81, 14);
		contentPane.add(lblCognoms);
		
		JLabel lblNmCrdit = new JLabel("Núm crèdit:");
		lblNmCrdit.setBounds(22, 399, 81, 14);
		contentPane.add(lblNmCrdit);
		
		JLabel lblDataCaducitatddmmaa = new JLabel("Data caducitat:\r\n");
		lblDataCaducitatddmmaa.setBounds(22, 439, 95, 14);
		contentPane.add(lblDataCaducitatddmmaa);
		
		JLabel lblddmmaa = new JLabel("\r\n(dd/mm/aa)");
		lblddmmaa.setBounds(22, 453, 81, 14);
		
		JButton oKButton = new JButton("OK");
		oKButton.setBounds(28, 510, 89, 23);
		oKButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controladorVistaReservarHabitacio.PrOKReservaCreada(numCredit.getText(), sdCad.getText());
			}
		});
		contentPane.add(oKButton);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.setBounds(141, 510, 89, 23);
		cancelButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controladorVistaReservarHabitacio.PrCancel();
			}
		});
		contentPane.add(cancelButton);
		
		areaMessage = new JTextField();
		areaMessage.setBounds(22, 555, 225, 20);
		areaMessage.setHorizontalAlignment(SwingConstants.CENTER);
		areaMessage.setText("Area Message");
		areaMessage.setEditable(false);
		contentPane.add(areaMessage);
		areaMessage.setColumns(10);
		
		hotel = new JTextField();
		hotel.setBounds(130, 36, 100, 20);
		hotel.setEditable(false);
		contentPane.add(hotel);
		hotel.setColumns(10);
		hotel.setText(dades.getHotel());
		
		poblacio = new JTextField();
		poblacio.setBounds(130, 76, 100, 20);
		poblacio.setEditable(false);
		contentPane.add(poblacio);
		poblacio.setColumns(10);
		poblacio.setText(dades.getPob());
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		
		sIn = new JTextField();
		sIn.setBounds(130, 116, 100, 20);
		sIn.setEditable(false);
		contentPane.add(sIn);
		sIn.setColumns(10);		
		sIn.setText(sdf.format(dades.getdIni()));
		
		sFi = new JTextField();
		sFi.setBounds(130, 156, 100, 20);
		sFi.setEditable(false);
		contentPane.add(sFi);
		sFi.setColumns(10);
		sFi.setText(sdf.format(dades.getdFi()));
	
	
		sNits = new JTextField();
		sNits.setBounds(130, 196, 100, 20);
		sNits.setEditable(false);
		contentPane.add(sNits);
		sNits.setColumns(10);
        long diferencia = dades.getdFi().getTime() - dades.getdIni().getTime();
        int dias = (int) Math.floor(diferencia / (1000 * 60 * 60 * 24));
        sNits.setText(String.valueOf(dias));
		
		tipusHab = new JTextField();
		tipusHab.setBounds(130, 236, 100, 20);
		tipusHab.setEditable(false);
		contentPane.add(tipusHab);
		tipusHab.setColumns(10);
		tipusHab.setText(dades.getTipusHab());
		
		sPreu = new JTextField();
		sPreu.setBounds(130, 276, 100, 20);
		sPreu.setEditable(false);
		contentPane.add(sPreu);
		sPreu.setColumns(10);
		sPreu.setText(String.valueOf(dades.getPreuTotal()));
		
		nom = new JTextField();
		nom.setBounds(130, 316, 100, 20);
		nom.setEditable(false);
		contentPane.add(nom);
		nom.setColumns(10);
		nom.setText(dades.getNomClient());
		
		cognoms = new JTextField();
		cognoms.setEditable(false);
		cognoms.setBounds(130, 356, 100, 20);
		contentPane.add(cognoms);
		cognoms.setColumns(10);
		cognoms.setText(dades.getCognoms());
		
		numCredit = new JTextField();
		numCredit.setBounds(130, 396, 100, 20);
		contentPane.add(numCredit);
		numCredit.setColumns(10);
		
		sdCad = new JTextField();
		sdCad.setBounds(130, 436, 100, 20);
		contentPane.add(sdCad);
		sdCad.setColumns(10);
	}
	
	public static void mostraMissatge(String msg) {
		areaMessage.setText(msg);
	}
}
