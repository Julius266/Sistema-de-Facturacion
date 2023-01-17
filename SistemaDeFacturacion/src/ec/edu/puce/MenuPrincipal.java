package ec.edu.puce;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.CardLayout;
import javax.swing.JToolBar;

public class MenuPrincipal extends JFrame {

	private JPanel contenedor;
	private JDesktopPane desktopPane;

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
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnClientes = new JMenu("Clientes");
		menuBar.add(mnClientes);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Crear Clientes");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CrearCliente crearclientes = new CrearCliente();
	                crearclientes.setVisible(true);      
			}
		}); 
		mnClientes.add(mntmNewMenuItem);
		
		JMenuItem mntmListaClientes = new JMenuItem("Lista de clientes");
		mntmListaClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListaDeClientes listaclientes = new ListaDeClientes();
				listaclientes.setVisible(true);
			}
		});
		mnClientes.add(mntmListaClientes);
		
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
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		mntmSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		mnSistema.add(mntmSalir);
		contenedor = new JPanel();
		contenedor.setBackground(new Color(128, 0, 255));
		contenedor.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contenedor);
		contenedor.setLayout(null);
		
		desktopPane = new JDesktopPane();
		contenedor.add(desktopPane, "name_433212790685800");
		desktopPane.setLayout(null);
	}
}
