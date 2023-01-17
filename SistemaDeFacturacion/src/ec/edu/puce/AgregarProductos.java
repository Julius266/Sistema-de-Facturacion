package ec.edu.puce;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AgregarProductos extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textCodigo;
	private JTextField textCantidad;
	private JTextField textDescripcion;
	private JTextField textPrecio;
	
	private productoc producto;
	private JTable table;
	private DefaultTableModel model;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgregarProductos frame = new AgregarProductos();
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
	public AgregarProductos() {
		setBounds(100, 100, 450, 514);
		getContentPane().setLayout(null);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(39, 51, 46, 14);
		getContentPane().add(lblCodigo);
		
		textCodigo = new JTextField();
		textCodigo.setBounds(112, 48, 86, 20);
		getContentPane().add(textCodigo);
		textCodigo.setColumns(10);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(39, 93, 46, 14);
		getContentPane().add(lblCantidad);
		
		textCantidad = new JTextField();
		textCantidad.setBounds(112, 93, 86, 20);
		getContentPane().add(textCantidad);
		textCantidad.setColumns(10);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setBounds(39, 152, 63, 14);
		getContentPane().add(lblDescripcion);
		
		textDescripcion = new JTextField();
		textDescripcion.setBounds(112, 152, 215, 20);
		getContentPane().add(textDescripcion);
		textDescripcion.setColumns(10);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(39, 201, 46, 14);
		getContentPane().add(lblPrecio);
		
		textPrecio = new JTextField();
		textPrecio.setBounds(112, 198, 86, 20);
		getContentPane().add(textPrecio);
		textPrecio.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(78, 290, 287, 117);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Codigo", "Cantidad", "Descripcion", "Precio"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textCodigo.setText(null);
				textCantidad.setText(null);
				textDescripcion.setText(null);
				textPrecio.setText(null);
			}
		});
		btnNuevo.setBounds(47, 240, 89, 23);
		getContentPane().add(btnNuevo);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				productoc producto = new productoc();
				agregarProducto();
			}
		});
		btnAgregar.setBounds(153, 240, 89, 23);
		getContentPane().add(btnAgregar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(262, 240, 89, 23);
		getContentPane().add(btnCancelar);
		
		model = (DefaultTableModel) table.getModel();

	}
	private void agregarProducto() {
		producto = new productoc();
		producto.setCodigo(textCodigo.getText());
		producto.setCantidad(textCantidad.getText());
		producto.setDescripcion(textDescripcion.getText());
		producto.setPrecio(textPrecio.getText());
		agregarFila();
		
	}
	
	private void agregarFila() {
		Object[] fila = new Object[4];
		fila[0] = producto.getCodigo();
		fila[1] = producto.getCantidad();
		fila[2] = producto.getDescripcion();
		fila[3] = producto.getPrecio();
		model.addRow(fila);
		
	}
}
