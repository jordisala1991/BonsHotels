package presentacio;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

import domini.HotelInformation;
import domini.TipusHabInformation;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class View3 extends JFrame {

	private JPanel contentPane;
	private static JTextField areaMessage;
	private JTextField sIni;
	private JTextField sFi;
	private JTextField sNumOcup;
	private ControladorVistaReservarHabitacio controladorVistaReservarHabitacio;
	private JTextField sPobl;
	private JTextField sDescripcio;
	private JTextField sCategoria;
	private JTextField sAvaluacio;
	private JTextField sNombreDisp;
	private JTextField sPreu;
	private JScrollPane pane1;
	private JList<String> sHotel;
	private JScrollPane pane2;
	private JList<String> sTipusHab;

	/**
	 * Create the frame.
	 */
	public View3(final Set<HotelInformation> hotels, String pob, Date dIni, Date dFi, int numOcup) {
		setTitle("BonsHotels");
		controladorVistaReservarHabitacio = new ControladorVistaReservarHabitacio();
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 270, 626);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblPoblacio = new JLabel("Població:");
		lblPoblacio.setBounds(10, 11, 129, 14);
		contentPane.add(lblPoblacio);
		
		JLabel lbldIni = new JLabel("Data inici:");
		lbldIni.setBounds(10, 43, 129, 14);
		contentPane.add(lbldIni);
		
		JLabel lbldFi = new JLabel("Data fi:");
		lbldFi.setBounds(10, 74, 129, 14);
		contentPane.add(lbldFi);
		
		JLabel lblNumOcup = new JLabel("Nombre ocupants:");
		lblNumOcup.setBounds(10, 105, 129, 14);
		contentPane.add(lblNumOcup);
		
		JLabel lblHotel = new JLabel("Hotel:");
		lblHotel.setBounds(10, 130, 129, 14);
		contentPane.add(lblHotel);
		
		JLabel lblDescripcio = new JLabel("Descripció:");
		lblDescripcio.setBounds(10, 221, 129, 14);
		contentPane.add(lblDescripcio);
		
		JLabel lblCategoria = new JLabel("Categoria:");
		lblCategoria.setBounds(10, 316, 129, 14);
		contentPane.add(lblCategoria);
		
		JLabel lblAvaluacio = new JLabel("Avaluació:");
		lblAvaluacio.setBounds(10, 344, 129, 14);
		contentPane.add(lblAvaluacio);
		
		JLabel lblTipusHab = new JLabel("Tipus habitació:");
		lblTipusHab.setBounds(10, 369, 129, 14);
		contentPane.add(lblTipusHab);
		
		JLabel lblNombreDisp = new JLabel("Nombre disponibles:");
		lblNombreDisp.setBounds(10, 466, 129, 14);
		contentPane.add(lblNombreDisp);
		
		JLabel lblPreu = new JLabel("Preu:");
		lblPreu.setBounds(10, 494, 129, 14);
		contentPane.add(lblPreu);
		
		pane1 = new JScrollPane();
		pane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		pane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		pane1.setLocation(94, 130);
		pane1.setSize(160, 80);
		contentPane.add(pane1);
		
		sHotel = new JList<String>();
		pane1.setViewportView(sHotel);
		
		pane2 = new JScrollPane();
		pane2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		pane2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		pane2.setLocation(94, 369);
		pane2.setSize(160, 80);
		contentPane.add(pane2);
		
		sTipusHab = new JList<String>();
		pane2.setViewportView(sTipusHab);
		
		areaMessage = new JTextField();
		areaMessage.setHorizontalAlignment(SwingConstants.CENTER);
		areaMessage.setText("Area Message");
		areaMessage.setBounds(10, 567, 244, 20);
		contentPane.add(areaMessage);
		areaMessage.setColumns(10);
		areaMessage.setEditable(false);
		
		sPobl = new JTextField();
		sPobl.setEditable(false);
		sPobl.setColumns(10);
		sPobl.setBounds(154, 8, 100, 20);
		contentPane.add(sPobl);
		sPobl.setText(pob);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		
		sIni = new JTextField();
		sIni.setEditable(false);
		sIni.setColumns(10);
		sIni.setBounds(154, 40, 100, 20);
		contentPane.add(sIni);
		sIni.setText(sdf.format(dIni));
		
		sFi = new JTextField();
		sFi.setEditable(false);
		sFi.setColumns(10);
		sFi.setBounds(154, 71, 100, 20);
		contentPane.add(sFi);
		sFi.setText(sdf.format(dFi));
		
		sNumOcup = new JTextField();
		sNumOcup.setEditable(false);
		sNumOcup.setBounds(154, 102, 100, 20);
		contentPane.add(sNumOcup);
		sNumOcup.setColumns(10);
		sNumOcup.setText(String.valueOf(numOcup));
				
		sDescripcio = new JTextField();
		sDescripcio.setColumns(10);
		sDescripcio.setBounds(10, 246, 244, 56);
		contentPane.add(sDescripcio);
				
		sCategoria = new JTextField();
		sCategoria.setColumns(10);
		sCategoria.setBounds(154, 313, 100, 20);
		contentPane.add(sCategoria);
				
		sAvaluacio = new JTextField();
		sAvaluacio.setColumns(10);
		sAvaluacio.setBounds(154, 341, 100, 20);
		contentPane.add(sAvaluacio);
		
		sNombreDisp = new JTextField();
		sNombreDisp.setColumns(10);
		sNombreDisp.setBounds(154, 463, 100, 20);
		contentPane.add(sNombreDisp);
		
		sPreu = new JTextField();
		sPreu.setColumns(10);
		sPreu.setBounds(154, 491, 100, 20);
		contentPane.add(sPreu);
		
		Iterator<HotelInformation> it = hotels.iterator();
		String[] array_hotels = new String[hotels.size()];
		for (int i = 0; i < hotels.size(); ++i) array_hotels[i] = it.next().getNomHotel();
		sHotel.setListData(array_hotels);
		
		sHotel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				HotelInformation hi = new HotelInformation();
				Iterator<HotelInformation> it = hotels.iterator();
				boolean trobat = false;
				while (it.hasNext() && !trobat) {
					hi = it.next();
					if (hi.getNomHotel() == sHotel.getSelectedValue()) trobat = true;
				}
				sDescripcio.setText(hi.getDesc());
				sCategoria.setText(hi.getCategoria());
				sAvaluacio.setText(String.valueOf(hi.getAvaluacio()));
				Iterator<TipusHabInformation> it2 = hi.getHabs().iterator();
				
				String[] array_tipusHab = new String[hi.getHabs().size()];
				for (int i = 0; i < hi.getHabs().size(); ++i) array_tipusHab[i] = it2.next().getNom();
				sTipusHab.setListData(array_tipusHab);
				sNombreDisp.setText("");
				sPreu.setText("");
			}
		});
		
		sTipusHab.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				HotelInformation hi = new HotelInformation();
				Iterator<HotelInformation> it = hotels.iterator();
				boolean trobat = false;
				while (it.hasNext() && !trobat) {
					hi = it.next();
					if (hi.getNomHotel() == sHotel.getSelectedValue()) trobat = true;
				}
				Iterator<TipusHabInformation> it2 = hi.getHabs().iterator();
				TipusHabInformation thi = new TipusHabInformation();
				trobat = false;
				while (it2.hasNext() && !trobat) {
					thi = it2.next();
					if (thi.getNom() == sTipusHab.getSelectedValue()) trobat = true;
				}
				sNombreDisp.setText(String.valueOf(thi.getNum()));
				sPreu.setText(String.valueOf(thi.getPreu()));
			}
		});
		
		JButton ok = new JButton("OK");
		ok.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				controladorVistaReservarHabitacio
					.PrOKSeleccionarHabitacio(sHotel.getSelectedValue(), sTipusHab.getSelectedValue());
			}
		});
		ok.setBounds(10, 533, 117, 23);
		contentPane.add(ok);
		
		JButton cancel = new JButton("Cancel");
		cancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controladorVistaReservarHabitacio.PrCancel();
			}
		});
		cancel.setBounds(137, 533, 117, 23);
		contentPane.add(cancel);
			
	}
	
	public static void mostraMissatge(String msg) {
		areaMessage.setText(msg);
	}
}
