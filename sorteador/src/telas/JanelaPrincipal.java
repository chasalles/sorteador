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
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class JanelaPrincipal extends JFrame {

	/**
	 *
	 */
	private QuadroNumeros panelQuadroNumeros;
	private JPanel contentPane;
	private LinkedList<Jogo> todosJogo;

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

		this.todosJogo = new LinkedList<Jogo>();

		Document doc;

		try {
			File input = new File("caixa.html");

			if (!input.exists()) {
				System.out.println("ALllll");
			}

			doc = Jsoup.parse(input, "UTF-8", "");

			Element content = doc.getElementsByClass("tabela-resultado lotofacil").first();
			// Elements links = content.getElementsByTag("a");
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

				todosJogo.add(jogo);
			}

			/*
			 * for (Element element : content.children()) { content.c for (Element element2
			 * : element.children().first().children()) {
			 * System.out.println(element2.html()); } }
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
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		panelQuadroNumeros = new QuadroNumeros();
		tabbedPane.addTab("Números", null, panelQuadroNumeros, null);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Mais Jogados", null, panel, null);
		
		JTextArea textArea = new JTextArea();
		textArea.setColumns(80);
		textArea.setRows(20);
		panel.add(textArea);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu menuArquivo = new JMenu("Arquivo");
		menuBar.add(menuArquivo);

		JMenuItem menuItem01 = new JMenuItem("Resultado Sorteio");
		menuItem01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuItem01Action(e);
			}
		});
		menuArquivo.add(menuItem01);
		
		JMenuItem menuItem02 = new JMenuItem("Mais Jogados");
		menuItem02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuItem02Action(e);
			}
		});
		menuArquivo.add(menuItem02);
	}

	public void menuItem01Action(ActionEvent e) {
		int sorteio = Integer.valueOf(JOptionPane.showInputDialog("Número do concurso")) - 1;
	
		System.out.println(todosJogo.size());
		
		if (sorteio > 0 && sorteio < todosJogo.size()) {
			System.out.println(todosJogo.get(sorteio).getApostaNumeros());
			
			for (Integer numero : todosJogo.get(sorteio).getApostaNumeros()) {
				colorirLabels(numero);
			}
		}else {
			System.out.println("NÃO EXISTE!");
		}
	}

	public void menuItem02Action(ActionEvent e) {
		System.out.println("SUsusus");
	}
	
	public void descolorirLabels() {
		panelQuadroNumeros.getLabelNumero01().setBackground(Color.WHITE);
		panelQuadroNumeros.getLabelNumero02().setBackground(Color.WHITE);
		panelQuadroNumeros.getLabelNumero03().setBackground(Color.WHITE);
		panelQuadroNumeros.getLabelNumero04().setBackground(Color.WHITE);
		panelQuadroNumeros.getLabelNumero05().setBackground(Color.WHITE);
		panelQuadroNumeros.getLabelNumero06().setBackground(Color.WHITE);
		panelQuadroNumeros.getLabelNumero07().setBackground(Color.WHITE);
		panelQuadroNumeros.getLabelNumero08().setBackground(Color.WHITE);
		panelQuadroNumeros.getLabelNumero09().setBackground(Color.WHITE);
		panelQuadroNumeros.getLabelNumero10().setBackground(Color.WHITE);
		panelQuadroNumeros.getLabelNumero11().setBackground(Color.WHITE);
		panelQuadroNumeros.getLabelNumero12().setBackground(Color.WHITE);
		panelQuadroNumeros.getLabelNumero13().setBackground(Color.WHITE);
		panelQuadroNumeros.getLabelNumero14().setBackground(Color.WHITE);
		panelQuadroNumeros.getLabelNumero15().setBackground(Color.WHITE);
		panelQuadroNumeros.getLabelNumero16().setBackground(Color.WHITE);
		panelQuadroNumeros.getLabelNumero17().setBackground(Color.WHITE);
		panelQuadroNumeros.getLabelNumero18().setBackground(Color.WHITE);
		panelQuadroNumeros.getLabelNumero19().setBackground(Color.WHITE);
		panelQuadroNumeros.getLabelNumero20().setBackground(Color.WHITE);
		panelQuadroNumeros.getLabelNumero21().setBackground(Color.WHITE);
		panelQuadroNumeros.getLabelNumero22().setBackground(Color.WHITE);
		panelQuadroNumeros.getLabelNumero23().setBackground(Color.WHITE);
		panelQuadroNumeros.getLabelNumero24().setBackground(Color.WHITE);
		panelQuadroNumeros.getLabelNumero25().setBackground(Color.WHITE);
	}

	public void colorirLabels(int n) {
		switch (n) {
		case 1:
			panelQuadroNumeros.getLabelNumero01().setBackground(new Color(255, 200, 0));
			break;
		case 2:
			panelQuadroNumeros.getLabelNumero02().setBackground(new Color(255, 200, 0));
			break;
		case 3:
			panelQuadroNumeros.getLabelNumero03().setBackground(new Color(255, 200, 0));
			break;
		case 4:
			panelQuadroNumeros.getLabelNumero04().setBackground(new Color(255, 200, 0));
			break;
		case 5:
			panelQuadroNumeros.getLabelNumero05().setBackground(new Color(255, 200, 0));
			break;
		case 6:
			panelQuadroNumeros.getLabelNumero06().setBackground(new Color(255, 200, 0));
			break;
		case 7:
			panelQuadroNumeros.getLabelNumero07().setBackground(new Color(255, 200, 0));
			break;
		case 8:
			panelQuadroNumeros.getLabelNumero08().setBackground(new Color(255, 200, 0));
			break;
		case 9:
			panelQuadroNumeros.getLabelNumero09().setBackground(new Color(255, 200, 0));
			break;
		case 10:
			panelQuadroNumeros.getLabelNumero10().setBackground(new Color(255, 200, 0));
			break;
		case 11:
			panelQuadroNumeros.getLabelNumero11().setBackground(new Color(255, 200, 0));
			break;
		case 12:
			panelQuadroNumeros.getLabelNumero12().setBackground(new Color(255, 200, 0));
			break;
		case 13:
			panelQuadroNumeros.getLabelNumero13().setBackground(new Color(255, 200, 0));
			break;
		case 14:
			panelQuadroNumeros.getLabelNumero14().setBackground(new Color(255, 200, 0));
			break;
		case 15:
			panelQuadroNumeros.getLabelNumero15().setBackground(new Color(255, 200, 0));
			break;
		case 16:
			panelQuadroNumeros.getLabelNumero16().setBackground(new Color(255, 200, 0));
			break;
		case 17:
			panelQuadroNumeros.getLabelNumero17().setBackground(new Color(255, 200, 0));
			break;
		case 18:
			panelQuadroNumeros.getLabelNumero18().setBackground(new Color(255, 200, 0));
			break;
		case 19:
			panelQuadroNumeros.getLabelNumero19().setBackground(new Color(255, 200, 0));
			break;
		case 20:
			panelQuadroNumeros.getLabelNumero20().setBackground(new Color(255, 200, 0));
			break;
		case 21:
			panelQuadroNumeros.getLabelNumero21().setBackground(new Color(255, 200, 0));
			break;
		case 22:
			panelQuadroNumeros.getLabelNumero22().setBackground(new Color(255, 200, 0));
			break;
		case 23:
			panelQuadroNumeros.getLabelNumero23().setBackground(new Color(255, 200, 0));
			break;
		case 24:
			panelQuadroNumeros.getLabelNumero24().setBackground(new Color(255, 200, 0));
			break;
		case 25:
			panelQuadroNumeros.getLabelNumero25().setBackground(new Color(255, 200, 0));
			break;
		default:
			break;
		}
	}

}
