package ec.edu.puce;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class CrearClientes extends JInternalFrame {
	private JTextField textCedula;
	private JTextField textNombres;
	private JTextField textDireccion;
	private JTextField textTelefono;
	private JTextField textEmail;
	private JTable table;
	private JLabel lblMensaje;
	private Cliente cliente;
	private DefaultTableModel model;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearClientes frame = new CrearClientes();
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
	public CrearClientes() {
		setBounds(100, 100, 450, 530);
		getContentPane().setLayout(null);
		
		JLabel lblCedula = new JLabel("Cedula");
		lblCedula.setBounds(55, 35, 46, 14);
		getContentPane().add(lblCedula);
		
		textCedula = new JTextField();
		textCedula.setBounds(141, 32, 86, 20);
		getContentPane().add(textCedula);
		textCedula.setColumns(10);
		
		JLabel lblNombres = new JLabel("Nombres");
		lblNombres.setBounds(55, 74, 46, 14);
		getContentPane().add(lblNombres);
		
		textNombres = new JTextField();
		textNombres.setBounds(141, 71, 86, 20);
		getContentPane().add(textNombres);
		textNombres.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(55, 110, 46, 14);
		getContentPane().add(lblDireccion);
		
		textDireccion = new JTextField();
		textDireccion.setBounds(141, 110, 86, 20);
		getContentPane().add(textDireccion);
		textDireccion.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(55, 147, 46, 14);
		getContentPane().add(lblTelefono);
		
		textTelefono = new JTextField();
		textTelefono.setBounds(141, 141, 86, 20);
		getContentPane().add(textTelefono);
		textTelefono.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(55, 185, 46, 14);
		getContentPane().add(lblEmail);
		
		textEmail = new JTextField();
		textEmail.setBounds(141, 182, 86, 20);
		getContentPane().add(textEmail);
		textEmail.setColumns(10);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textCedula.setText(null);
				textNombres.setText(null);
				textDireccion.setText(null);
				textTelefono.setText(null);
				textEmail.setText(null);
				lblMensaje.setText(null);
			}
		});
		btnNuevo.setBounds(42, 267, 89, 23);
		getContentPane().add(btnNuevo);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblMensaje.setText("Registro guardado");
				agregarCliente();
			}
		});
		btnAgregar.setBounds(173, 267, 89, 23);
		getContentPane().add(btnAgregar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(291, 267, 89, 23);
		getContentPane().add(btnCancelar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(54, 331, 337, 124);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Cedula", "Nombres", "Direccion", "Telefono", "Email"
			}
		));
		scrollPane.setViewportView(table);
		model = (DefaultTableModel) table.getModel();
		
		lblMensaje = DefaultComponentFactory.getInstance().createLabel("");
		lblMensaje.setBounds(55, 226, 325, 30);
		getContentPane().add(lblMensaje);
		
		

	}
	private void agregarCliente() {
		cliente = new Cliente();
		cliente.setCedula(textCedula.getText());
		cliente.setNombres(textNombres.getText());
		cliente.setDireccion(textDireccion.getText());
		cliente.setTelefono(textTelefono.getText());
		cliente.setEmail(textEmail.getText());
		agregarFila();
	}
	
	private void agregarFila() {
		Object[] fila = new Object[5];
		fila[0] = cliente.getCedula();
		fila[1] = cliente.getNombres();
		fila[2] = cliente.getDireccion();
		fila[3] = cliente.getTelefono();
		fila[4] = cliente.getEmail();
		model.addRow(fila);
		
	}
}
