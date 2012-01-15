package presentacio;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class View6 extends JFrame {

	private JPanel contentPane;
	private ControladorVistaReservarHabitacio controladorVistaReservarHabitacio;
	private JLabel lblReserva;

	/**
	 * Create the frame.
	 */
	public View6() {
		controladorVistaReservarHabitacio = new ControladorVistaReservarHabitacio();
		setTitle("BonsHotels");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 120);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblReserva = new JLabel("Reserva feta correctament!");
		lblReserva.setHorizontalAlignment(SwingConstants.CENTER);
		lblReserva.setBounds(10, 27, 224, 14);
		contentPane.add(lblReserva);
		
		JButton ok = new JButton("OK");
		ok.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				controladorVistaReservarHabitacio
					.PrOKMissatgeFi();
			}
		});
		ok.setBounds(78, 61, 89, 23);
		contentPane.add(ok);
	}
	
}
