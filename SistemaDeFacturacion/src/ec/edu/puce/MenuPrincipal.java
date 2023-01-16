package ec.edu.puce;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.CardLayout;

public class MenuPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
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
	public MenuPrincipal() {
		setTitle("SISTEMA DE FACTURACION");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(92, 10, 264, 22);
		contentPane.add(menuBar);
		
		JMenu mnClientes = new JMenu("Clientes");
		menuBar.add(mnClientes);
		
		JMenuItem mntmCrearClientes = new JMenuItem("Crear Clientes");
		mntmCrearClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CrearCliente crearcliente = new CrearCliente();
				crearcliente.setVisible(true);
			}
		});
		mnClientes.add(mntmCrearClientes);
		
		JMenuItem mntmListaDeClientes = new JMenuItem("Lista de clientes");
		mnClientes.add(mntmListaDeClientes);
		
		JMenu mnProductos = new JMenu("Productos");
		menuBar.add(mnProductos);
		
		JMenu mnRedesSociales = new JMenu("Redes Sociales");
		menuBar.add(mnRedesSociales);
		
		JMenuItem mntmFacebook = new JMenuItem("Facebook");
		mntmFacebook.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/ec/edu/puce/imagenes/facebook (1).png")));
		mnRedesSociales.add(mntmFacebook);
		
		JMenuItem mntmInstagram = new JMenuItem("Instagram");
		mntmInstagram.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/ec/edu/puce/imagenes/instagram.png")));
		mnRedesSociales.add(mntmInstagram);
		
		JMenu mnSistema = new JMenu("Sistema");
		menuBar.add(mnSistema);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		mnSistema.add(mntmSalir);
	}

}
