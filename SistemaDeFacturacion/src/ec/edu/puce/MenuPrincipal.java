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
		
		JMenu mnClientes = new JMenu("Clientes");
		menuBar.add(mnClientes);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Crear Clientes");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			CrearClientes crearclientes = new CrearClientes();
			public void actionPerformed(ActionEvent e) {
				
				if (crearclientes.isVisible() == false) {
					desktopPane.add(crearclientes);
	                crearclientes.setVisible(true);
	                Dimension desktopSize = desktopPane.getSize();
	                Dimension FrameSize = crearclientes.getSize();
	                crearclientes.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
	                crearclientes.show();
	                }
				
				     
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
		
		JMenuItem mntmAgregarproductos = new JMenuItem("AgregarProductos");
		mntmAgregarproductos.addActionListener(new ActionListener() {
			AgregarProductos agregarProductos = new AgregarProductos();
			public void actionPerformed(ActionEvent e) {
				
				if (agregarProductos.isVisible() == false) {
					desktopPane.add(agregarProductos);
					agregarProductos.setVisible(true);
	                Dimension desktopSize = desktopPane.getSize();
	                Dimension FrameSize = agregarProductos.getSize();
	                agregarProductos.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
	                agregarProductos.show();
	                }
				
			}
		});
		mnProductos.add(mntmAgregarproductos);
		
		JMenu mnRedesSociales = new JMenu("Redes Sociales");
		menuBar.add(mnRedesSociales);
		
		JMenuItem mntmFacebook = new JMenuItem("Facebook");
		mntmFacebook.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/ec/edu/puce/imagenes/facebook (1).png")));
		mnRedesSociales.add(mntmFacebook);
		
		JMenuItem mntmInstagram = new JMenuItem("Instagram");
		mntmInstagram.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/ec/edu/puce/imagenes/instagram.png")));
		mnRedesSociales.add(mntmInstagram);
		contenedor = new JPanel();
		contenedor.setBackground(new Color(128, 0, 255));
		contenedor.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contenedor);
		contenedor.setLayout(new CardLayout(0, 0));
		
		desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(128, 128, 192));
		contenedor.add(desktopPane, "name_373318154559200");
		desktopPane.setLayout(null);
	}
}
