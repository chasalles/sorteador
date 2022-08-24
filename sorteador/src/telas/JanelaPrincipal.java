package telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import aposta.Jogo;

@SuppressWarnings("serial")
public class JanelaPrincipal extends JFrame {

	/**
	 *
	 */
	private QuadroNumeros panelQuadroNumeros;
	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JTextArea textArea;
	private LinkedList<Jogo> todosJogo;
	private LinkedList<Jogo> repetidosJogo;
	private Document doc;

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
		this.repetidosJogo = new LinkedList<Jogo>();

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
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		panelQuadroNumeros = new QuadroNumeros();

		
		tabbedPane.addTab("Números", null, panelQuadroNumeros, null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		tabbedPane.addTab("Mais Jogados", null, panel, null);
		
		textArea = new JTextArea();
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
		
		JMenuItem menuItem03 = new JMenuItem("Ultimos Jogos");
		menuItem03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuItem03Action(e);
			}
		});
		menuArquivo.add(menuItem03);
		
		JMenuItem menuItem04 = new JMenuItem("Verifica");
		menuItem04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int contador = 0;
				for (int i = 0; i < todosJogo.size(); i++) {
					if(panelQuadroNumeros.getJogo().isIgual(todosJogo.get(i).getApostaNumeros())) {
						contador++;
					}
				}
				
				textArea.append("números de jogos iguais: " + contador);
				
			}
		});
		menuArquivo.add(menuItem04);
	}

	public void menuItem01Action(ActionEvent e) {
		int sorteio = Integer.valueOf(JOptionPane.showInputDialog("Número do concurso")) - 1;
	
		System.out.println(todosJogo.size());
		
		if (sorteio > 0 && sorteio < todosJogo.size()) {
			System.out.println(todosJogo.get(sorteio).getApostaNumeros());
			
			for (Integer numero : todosJogo.get(sorteio).getApostaNumeros()) {
				panelQuadroNumeros.colorirLabelsIndividual(numero, Color.YELLOW);
			}
		}else {
			System.out.println("NÃO EXISTE!");
		}
	}

	public void menuItem02Action(ActionEvent e) {
		for (int i = 0; i < todosJogo.size(); i++) {
			if(!temJogoIgual(todosJogo.get(i))) {
				contagemJogos(todosJogo.get(i));
			}
		}
		
		for (Jogo jogo : repetidosJogo) {
			System.out.println("Jogo: " + jogo.getConcurso());
			System.out.println(jogo.getApostaNumeros());
			
			textArea.append("Jogo: " + jogo.getConcurso());
			textArea.append(jogo.getApostaNumeros().toString() + "\n");
		}
		
		System.out.println("Acabou!");
	}
	
	public void contagemJogos(Jogo jogo) {
		for (int i = 0; i < todosJogo.size(); i++) {
			if(jogo.isIgual(todosJogo.get(i).getApostaNumeros())) {
				jogo.incrementaVezes();
			}
		}
		
		if(jogo.getVezes() > 1) {
			System.out.println("TAMMM: " + jogo.getVezes());
			repetidosJogo.add(jogo);
		}	
	}
	
	public boolean temJogoIgual(Jogo jogo) {
		for (int i = 0; i < repetidosJogo.size(); i++) {
			if(jogo.isIgual(repetidosJogo.get(i).getApostaNumeros())) {
				return true;
			}
		}
		return false;
	}
	
	public void menuItem03Action(ActionEvent e) {
		int rangeJogos = Integer.valueOf(JOptionPane.showInputDialog("Últimos concursos"));
		
		int[] vetorCor = new int[25];
		Arrays.fill(vetorCor, 0);
		
		for (int i = todosJogo.size() - 1; i >= todosJogo.size() - rangeJogos; i--) {
			for (int j = 0; j < todosJogo.get(i).getApostaNumeros().size(); j++) {
				vetorCor[todosJogo.get(i).getApostaNumeros().get(j) - 1]++;
			}
		}
		
		panelQuadroNumeros.colorirLabels(Color.WHITE);
		
		int verde = 255 / rangeJogos;
		
		for (int i = 0; i < 25; i++) {
			Color color = new Color(0, vetorCor[i] * verde, 0);
			panelQuadroNumeros.colorirLabelsIndividual(i + 1, color);
		}
		
	}
}
