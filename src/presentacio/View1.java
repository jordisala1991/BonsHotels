package presentacio;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class View1 extends JFrame {

	private JPanel contentPane;
	private static JTextField areaMessage;
	private ControladorVistaReservarHabitacio controladorVistaReservarHabitacio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View1 frame = new View1();
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
	public View1() {
		controladorVistaReservarHabitacio = new ControladorVistaReservarHabitacio();
		setTitle("BonsHotels");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 120);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JButton reservarHabitacio = new JButton("Reservar Habitació");
		reservarHabitacio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				controladorVistaReservarHabitacio.PrReservarHabitacio();
			}
		});
		reservarHabitacio.setBounds(50, 11, 150, 30);
		contentPane.add(reservarHabitacio);
		areaMessage = new JTextField();
		areaMessage.setText("Area Message");
		areaMessage.setHorizontalAlignment(SwingConstants.CENTER);
		areaMessage.setFont(new Font("Tahoma", Font.PLAIN, 11));
		areaMessage.setEditable(false);
		areaMessage.setBounds(10, 61, 224, 20);
		contentPane.add(areaMessage);
		areaMessage.setColumns(10);
	}
	
	public static void mostraMissatge(String msg) {
		areaMessage.setText(msg);
	}
	
}
