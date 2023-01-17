package ec.edu.puce;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.SwingConstants;
import java.awt.TextField;
import java.awt.Label;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CrearCliente extends JFrame {
	private JTextField textTelefono;
	private JTextField textDireccion;
	private JTextField textCedula;
	private JTextField textEmail;
	private JTextField textNombres;
	private JLabel lblMensaje;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearCliente frame = new CrearCliente();
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
	public CrearCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 478, 394);
		getContentPane().setLayout(null);
		
		JLabel lblCedula = new JLabel("Cedula");
		lblCedula.setBounds(40, 32, 46, 14);
		getContentPane().add(lblCedula);
		
		JLabel lblNombres = new JLabel("Nombres");
		lblNombres.setBounds(40, 73, 46, 14);
		getContentPane().add(lblNombres);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(40, 188, 46, 14);
		getContentPane().add(lblEmail);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(40, 146, 46, 14);
		getContentPane().add(lblTelefono);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(40, 110, 46, 14);
		getContentPane().add(lblDireccion);
		
		textTelefono = new JTextField();
		textTelefono.setBounds(111, 143, 255, 20);
		getContentPane().add(textTelefono);
		textTelefono.setColumns(10);
		
		textDireccion = new JTextField();
		textDireccion.setBounds(111, 107, 255, 20);
		getContentPane().add(textDireccion);
		textDireccion.setColumns(10);
		
		textCedula = new JTextField();
		textCedula.setBounds(111, 29, 122, 20);
		getContentPane().add(textCedula);
		textCedula.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setBounds(111, 185, 255, 20);
		getContentPane().add(textEmail);
		textEmail.setColumns(10);
		
		textNombres = new JTextField();
		textNombres.setBounds(111, 70, 255, 20);
		getContentPane().add(textNombres);
		textNombres.setColumns(10);
		
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
		btnNuevo.setBounds(40, 278, 89, 23);
		getContentPane().add(btnNuevo);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblMensaje.setText("Registro guardado");
			}
		});
		btnAgregar.setBounds(142, 278, 89, 23);
		getContentPane().add(btnAgregar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(245, 278, 89, 23);
		getContentPane().add(btnCancelar);
		
		lblMensaje = new JLabel(" ");
		lblMensaje.setBounds(53, 216, 313, 34);
		getContentPane().add(lblMensaje);
	}
}
