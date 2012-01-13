package presentacio;

import java.util.HashSet;
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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class View2 extends JFrame {

	private JPanel contentPane;
	private JScrollPane pane;
	private static JTextField areaMessage;
	private JList<String> poblacions;
	private JTextField sIni;
	private JTextField sFi;
	private JTextField sNumOcup;
	private ControladorVistaReservarHabitacio controladorVistaReservarHabitacio;

	/**
	 * Create the frame.
	 */
	public View2(HashSet<String> pb) {
		setTitle("BonsHotels");
		controladorVistaReservarHabitacio = new ControladorVistaReservarHabitacio();
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 270, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JButton ok = new JButton("OK");
		ok.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				controladorVistaReservarHabitacio
					.PrOKObteHotels(poblacions.getSelectedValue(), sIni.getText(), sFi.getText(), sNumOcup.getText());
			}
		});
		ok.setBounds(10, 231, 117, 23);
		contentPane.add(ok);
		JButton cancel = new JButton("Cancel");
		cancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controladorVistaReservarHabitacio.PrCancel();
			}
		});
		cancel.setBounds(137, 231, 117, 23);
		contentPane.add(cancel);
		JLabel label1 = new JLabel("Població:");
		label1.setBounds(15, 15, 57, 14);
		contentPane.add(label1);
		JLabel label2 = new JLabel("Data inici: (dd/mm/aa)");
		label2.setBounds(15, 110, 129, 14);
		contentPane.add(label2);
		JLabel label3 = new JLabel("Data fi: (dd/mm/aa)");
		label3.setBounds(15, 150, 129, 14);
		contentPane.add(label3);
		JLabel label4 = new JLabel("Nombre ocupants:");
		label4.setBounds(15, 190, 129, 14);
		contentPane.add(label4);
		areaMessage = new JTextField();
		areaMessage.setHorizontalAlignment(SwingConstants.CENTER);
		areaMessage.setText("Area Message");
		areaMessage.setBounds(10, 271, 244, 20);
		contentPane.add(areaMessage);
		areaMessage.setColumns(10);
		areaMessage.setEditable(false);
		pane = new JScrollPane();
		pane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		pane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		pane.setLocation(82, 13);
		pane.setSize(172, 80);
		contentPane.add(pane);
		poblacions = new JList<String>();
		pane.setViewportView(poblacions);
		poblacions.setListData((String[]) pb.toArray());
		sIni = new JTextField();
		sIni.setColumns(10);
		sIni.setBounds(154, 107, 100, 20);
		contentPane.add(sIni);
		sFi = new JTextField();
		sFi.setColumns(10);
		sFi.setBounds(154, 150, 100, 20);
		contentPane.add(sFi);
		sNumOcup = new JTextField();
		sNumOcup.setBounds(154, 190, 100, 20);
		contentPane.add(sNumOcup);
		sNumOcup.setColumns(10);
	}
	
	public static void mostraMissatge(String msg) {
		areaMessage.setText(msg);
	}
	
}
