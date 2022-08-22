package telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import aposta.Jogo;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaPrincipal extends JFrame {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private LinkedList<Jogo> jogo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					JanelaPrincipal frame = new JanelaPrincipal();
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
	public JanelaPrincipal() {
		iniciaComponentes();
		
		this.jogo = new LinkedList<Jogo>();

		Document doc;
		
		try {
			File input = new File("caixa.html");
			
			if(!input.exists()) {
				System.out.println("ALllll");
			}
			
			doc = Jsoup.parse(input, "UTF-8", "");
			
			
			
			Element content = doc.getElementsByClass("tabela-resultado lotofacil").first();
			//Elements links = content.getElementsByTag("a");
			// Elements content2 = content.getElementsByClass("tabela-resultado lotofacil");
			
			for (int i = 1; i < content.childrenSize(); i++) {
				
				Elements elements = content.child(i).children().first().children();
	
				Jogo jogo = new Jogo(elements.get(0).html(), elements.get(1).html());
				
				jogo.adicionaNumero(elements.get(2).html());
				jogo.adicionaNumero(elements.get(3).html());
				jogo.adicionaNumero(elements.get(4).html());
				jogo.adicionaNumero(elements.get(5).html());
				jogo.adicionaNumero(elements.get(6).html());
				jogo.adicionaNumero(elements.get(7).html());
				jogo.adicionaNumero(elements.get(8).html());
				jogo.adicionaNumero(elements.get(9).html());
				jogo.adicionaNumero(elements.get(10).html());
				jogo.adicionaNumero(elements.get(11).html());
				jogo.adicionaNumero(elements.get(12).html());
				jogo.adicionaNumero(elements.get(13).html());
				jogo.adicionaNumero(elements.get(14).html());
				jogo.adicionaNumero(elements.get(15).html());
				jogo.adicionaNumero(elements.get(16).html());
				
				System.out.println(elements.get(0).html());
				System.out.println(elements.get(1).html());
				System.out.println(elements.get(2).html());
				System.out.println(elements.get(3).html());
				System.out.println(elements.get(4).html());
				System.out.println(elements.get(5).html());
				System.out.println(elements.get(6).html());
				System.out.println(elements.get(7).html());
				System.out.println(elements.get(8).html());
				System.out.println(elements.get(9).html());
				System.out.println(elements.get(10).html());
				System.out.println(elements.get(11).html());
				System.out.println(elements.get(12).html());
				System.out.println(elements.get(13).html());
				System.out.println(elements.get(14).html());
				System.out.println(elements.get(15).html());
				System.out.println(elements.get(16).html());	
			}
			
		/*	for (Element element : content.children()) {
				content.c
				for (Element element2 : element.children().first().children()) {
					System.out.println(element2.html());
				}
			}
			*/
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void iniciaComponentes() {
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(100, 100, 617, 373);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		QuadroNumeros panel = new QuadroNumeros();
		contentPane.add(panel);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu menuArquivo = new JMenu("Arquivo");
		menuBar.add(menuArquivo);
		
		JMenuItem menuItem01 = new JMenuItem("Resultado Sorteio");
		menuItem01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuItem01Action();
			}
		});
		menuArquivo.add(menuItem01);
	}
	
	public void menuItem01Action() {
		System.out.println("Entrou!!");
	}

}
