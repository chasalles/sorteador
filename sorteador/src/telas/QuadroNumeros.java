package telas;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import aposta.Jogo;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class QuadroNumeros extends JPanel {

	private JLabel labelNumero01;
	private JLabel labelNumero02;
	private JLabel labelNumero03;
	private JLabel labelNumero04;
	private JLabel labelNumero05;
	private JLabel labelNumero06;
	private JLabel labelNumero07;
	private JLabel labelNumero08;
	private JLabel labelNumero09;
	private JLabel labelNumero10;
	private JLabel labelNumero11;
	private JLabel labelNumero12;
	private JLabel labelNumero13;
	private JLabel labelNumero14;
	private JLabel labelNumero15;
	private JLabel labelNumero16;
	private JLabel labelNumero17;
	private JLabel labelNumero18;
	private JLabel labelNumero19;
	private JLabel labelNumero20;
	private JLabel labelNumero21;
	private JLabel labelNumero22;
	private JLabel labelNumero23;
	private JLabel labelNumero24;
	private JLabel labelNumero25;
	private Jogo jogo;

	/**
	 * Create the panel.
	 */
	public QuadroNumeros() {
		setBackground(Color.GRAY);
		setLayout(new GridLayout(5, 5, 5, 5));
		
		jogo = new Jogo("5000", "9/9/9999");

		labelNumero01 = new JLabel("01");
		labelNumero01.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Integer n = 1;
				trocarCorDeFundo(labelNumero01, n);
			}
		});

		labelNumero01.setHorizontalAlignment(SwingConstants.CENTER);
		labelNumero01.setBackground(Color.WHITE);
		labelNumero01.setFont(new Font("Arial", Font.PLAIN, 30));
		labelNumero01.setOpaque(true);
		add(labelNumero01);

		labelNumero02 = new JLabel("02");
		labelNumero02.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Integer n = 2;
				trocarCorDeFundo(labelNumero02, n);
			}
		});
		labelNumero02.setHorizontalAlignment(SwingConstants.CENTER);
		labelNumero02.setBackground(Color.WHITE);
		labelNumero02.setFont(new Font("Arial", Font.PLAIN, 30));
		labelNumero02.setOpaque(true);
		add(labelNumero02);

		labelNumero03 = new JLabel("03");
		labelNumero03.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Integer n = 3;
				trocarCorDeFundo(labelNumero03, n);
			}
		});
		labelNumero03.setHorizontalAlignment(SwingConstants.CENTER);
		labelNumero03.setBackground(Color.WHITE);
		labelNumero03.setFont(new Font("Arial", Font.PLAIN, 30));
		labelNumero03.setOpaque(true);
		add(labelNumero03);

		labelNumero04 = new JLabel("04");
		labelNumero04.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Integer n = 4;
				trocarCorDeFundo(labelNumero04, n);
			}
		});
		labelNumero04.setHorizontalAlignment(SwingConstants.CENTER);
		labelNumero04.setBackground(Color.WHITE);
		labelNumero04.setFont(new Font("Arial", Font.PLAIN, 30));
		labelNumero04.setOpaque(true);
		add(labelNumero04);

		labelNumero05 = new JLabel("05");
		labelNumero05.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Integer n = 5;
				trocarCorDeFundo(labelNumero05, n);
			}
		});
		labelNumero05.setHorizontalAlignment(SwingConstants.CENTER);
		labelNumero05.setBackground(Color.WHITE);
		labelNumero05.setFont(new Font("Arial", Font.PLAIN, 30));
		labelNumero05.setOpaque(true);
		add(labelNumero05);

		labelNumero06 = new JLabel("06");
		labelNumero06.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Integer n = 6;
				trocarCorDeFundo(labelNumero06, n);
			}
		});
		labelNumero06.setHorizontalAlignment(SwingConstants.CENTER);
		labelNumero06.setBackground(Color.WHITE);
		labelNumero06.setFont(new Font("Arial", Font.PLAIN, 30));
		labelNumero06.setOpaque(true);
		add(labelNumero06);

		labelNumero07 = new JLabel("07");
		labelNumero07.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Integer n = 7;
				trocarCorDeFundo(labelNumero07, n);
			}
		});
		labelNumero07.setHorizontalAlignment(SwingConstants.CENTER);
		labelNumero07.setBackground(Color.WHITE);
		labelNumero07.setFont(new Font("Arial", Font.PLAIN, 30));
		labelNumero07.setOpaque(true);
		add(labelNumero07);

		labelNumero08 = new JLabel("08");
		labelNumero08.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Integer n = 8;
				trocarCorDeFundo(labelNumero08, n);
			}
		});
		labelNumero08.setHorizontalAlignment(SwingConstants.CENTER);
		labelNumero08.setBackground(Color.WHITE);
		labelNumero08.setFont(new Font("Arial", Font.PLAIN, 30));
		labelNumero08.setOpaque(true);
		add(labelNumero08);

		labelNumero09 = new JLabel("09");
		labelNumero09.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Integer n = 9;
				trocarCorDeFundo(labelNumero09, n);
			}
		});
		labelNumero09.setHorizontalAlignment(SwingConstants.CENTER);
		labelNumero09.setBackground(Color.WHITE);
		labelNumero09.setFont(new Font("Arial", Font.PLAIN, 30));
		labelNumero09.setOpaque(true);
		add(labelNumero09);

		labelNumero10 = new JLabel("10");
		labelNumero10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Integer n = 10;
				trocarCorDeFundo(labelNumero10, n);
			}
		});
		labelNumero10.setHorizontalAlignment(SwingConstants.CENTER);
		labelNumero10.setBackground(Color.WHITE);
		labelNumero10.setFont(new Font("Arial", Font.PLAIN, 30));
		labelNumero10.setOpaque(true);
		add(labelNumero10);

		labelNumero11 = new JLabel("11");
		labelNumero11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Integer n = 11;
				trocarCorDeFundo(labelNumero11, n);
			}
		});
		labelNumero11.setHorizontalAlignment(SwingConstants.CENTER);
		labelNumero11.setBackground(Color.WHITE);
		labelNumero11.setFont(new Font("Arial", Font.PLAIN, 30));
		labelNumero11.setOpaque(true);
		add(labelNumero11);

		labelNumero12 = new JLabel("12");
		labelNumero12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Integer n = 12;
				trocarCorDeFundo(labelNumero12, n);
			}
		});
		labelNumero12.setHorizontalAlignment(SwingConstants.CENTER);
		labelNumero12.setBackground(Color.WHITE);
		labelNumero12.setFont(new Font("Arial", Font.PLAIN, 30));
		labelNumero12.setOpaque(true);
		add(labelNumero12);

		labelNumero13 = new JLabel("13");
		labelNumero13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Integer n = 13;
				trocarCorDeFundo(labelNumero13, n);
			}
		});
		labelNumero13.setHorizontalAlignment(SwingConstants.CENTER);
		labelNumero13.setBackground(Color.WHITE);
		labelNumero13.setFont(new Font("Arial", Font.PLAIN, 30));
		labelNumero13.setOpaque(true);
		add(labelNumero13);

		labelNumero14 = new JLabel("14");
		labelNumero14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Integer n = 14;
				trocarCorDeFundo(labelNumero14, n);
			}
		});
		labelNumero14.setHorizontalAlignment(SwingConstants.CENTER);
		labelNumero14.setBackground(Color.WHITE);
		labelNumero14.setFont(new Font("Arial", Font.PLAIN, 30));
		labelNumero14.setOpaque(true);
		add(labelNumero14);

		labelNumero15 = new JLabel("15");
		labelNumero15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Integer n = 15;
				trocarCorDeFundo(labelNumero15, n);
			}
		});
		labelNumero15.setHorizontalAlignment(SwingConstants.CENTER);
		labelNumero15.setBackground(Color.WHITE);
		labelNumero15.setFont(new Font("Arial", Font.PLAIN, 30));
		labelNumero15.setOpaque(true);
		add(labelNumero15);

		labelNumero16 = new JLabel("16");
		labelNumero16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Integer n = 16;
				trocarCorDeFundo(labelNumero16, n);
			}
		});
		labelNumero16.setHorizontalAlignment(SwingConstants.CENTER);
		labelNumero16.setBackground(Color.WHITE);
		labelNumero16.setFont(new Font("Arial", Font.PLAIN, 30));
		labelNumero16.setOpaque(true);
		add(labelNumero16);

		labelNumero17 = new JLabel("17");
		labelNumero17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Integer n = 17;
				trocarCorDeFundo(labelNumero17, n);
			}
		});
		labelNumero17.setHorizontalAlignment(SwingConstants.CENTER);
		labelNumero17.setBackground(Color.WHITE);
		labelNumero17.setFont(new Font("Arial", Font.PLAIN, 30));
		labelNumero17.setOpaque(true);
		add(labelNumero17);

		labelNumero18 = new JLabel("18");
		labelNumero18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Integer n = 18;
				trocarCorDeFundo(labelNumero18, n);
			}
		});
		labelNumero18.setHorizontalAlignment(SwingConstants.CENTER);
		labelNumero18.setBackground(Color.WHITE);
		labelNumero18.setFont(new Font("Arial", Font.PLAIN, 30));
		labelNumero18.setOpaque(true);
		add(labelNumero18);

		labelNumero19 = new JLabel("19");
		labelNumero19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Integer n = 19;
				trocarCorDeFundo(labelNumero19, n);
			}
		});
		labelNumero19.setHorizontalAlignment(SwingConstants.CENTER);
		labelNumero19.setBackground(Color.WHITE);
		labelNumero19.setFont(new Font("Arial", Font.PLAIN, 30));
		labelNumero19.setOpaque(true);
		add(labelNumero19);

		labelNumero20 = new JLabel("20");
		labelNumero20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Integer n = 20;
				trocarCorDeFundo(labelNumero20, n);
			}
		});
		labelNumero20.setHorizontalAlignment(SwingConstants.CENTER);
		labelNumero20.setBackground(Color.WHITE);
		labelNumero20.setFont(new Font("Arial", Font.PLAIN, 30));
		labelNumero20.setOpaque(true);
		add(labelNumero20);

		labelNumero21 = new JLabel("21");
		labelNumero21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Integer n = 21;
				trocarCorDeFundo(labelNumero21, n);
			}
		});
		labelNumero21.setHorizontalAlignment(SwingConstants.CENTER);
		labelNumero21.setBackground(Color.WHITE);
		labelNumero21.setFont(new Font("Arial", Font.PLAIN, 30));
		labelNumero21.setOpaque(true);
		add(labelNumero21);

		labelNumero22 = new JLabel("22");
		labelNumero22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Integer n = 22;
				trocarCorDeFundo(labelNumero22, n);
			}
		});
		labelNumero22.setHorizontalAlignment(SwingConstants.CENTER);
		labelNumero22.setBackground(Color.WHITE);
		labelNumero22.setFont(new Font("Arial", Font.PLAIN, 30));
		labelNumero22.setOpaque(true);
		add(labelNumero22);

		labelNumero23 = new JLabel("23");
		labelNumero23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Integer n = 23;
				trocarCorDeFundo(labelNumero23, n);
			}
		});
		labelNumero23.setHorizontalAlignment(SwingConstants.CENTER);
		labelNumero23.setBackground(Color.WHITE);
		labelNumero23.setFont(new Font("Arial", Font.PLAIN, 30));
		labelNumero23.setOpaque(true);
		add(labelNumero23);

		labelNumero24 = new JLabel("24");
		labelNumero24.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Integer n = 24;
				trocarCorDeFundo(labelNumero24, n);
			}
		});
		labelNumero24.setHorizontalAlignment(SwingConstants.CENTER);
		labelNumero24.setBackground(Color.WHITE);
		labelNumero24.setFont(new Font("Arial", Font.PLAIN, 30));
		labelNumero24.setOpaque(true);
		add(labelNumero24);

		labelNumero25 = new JLabel("25");
		labelNumero25.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Integer n = 25;
				trocarCorDeFundo(labelNumero25, n);
			}
		});
		labelNumero25.setHorizontalAlignment(SwingConstants.CENTER);
		labelNumero25.setBackground(Color.WHITE);
		labelNumero25.setFont(new Font("Arial", Font.PLAIN, 30));
		labelNumero25.setOpaque(true);
		add(labelNumero25);
	}

	public void trocarCorDeFundo(JLabel jLabel, Integer n) {
		if (jLabel.getBackground() == Color.CYAN) {
			jLabel.setBackground(Color.WHITE);
			jogo.getApostaNumeros().remove(n);
		} else {
			jLabel.setBackground(Color.CYAN);
			jogo.getApostaNumeros().add(n);
		}
		
		System.out.println(jogo.getApostaNumeros());
	}
	
	public void colorirLabels(Color color) {
		labelNumero01.setBackground(color);
		labelNumero02.setBackground(color);
		labelNumero03.setBackground(color);
		labelNumero04.setBackground(color);
		labelNumero05.setBackground(color);
		labelNumero06.setBackground(color);
		labelNumero07.setBackground(color);
		labelNumero08.setBackground(color);
		labelNumero09.setBackground(color);
		labelNumero10.setBackground(color);
		labelNumero11.setBackground(color);
		labelNumero12.setBackground(color);
		labelNumero13.setBackground(color);
		labelNumero14.setBackground(color);
		labelNumero15.setBackground(color);
		labelNumero16.setBackground(color);
		labelNumero17.setBackground(color);
		labelNumero18.setBackground(color);
		labelNumero19.setBackground(color);
		labelNumero20.setBackground(color);
		labelNumero21.setBackground(color);
		labelNumero22.setBackground(color);
		labelNumero23.setBackground(color);
		labelNumero24.setBackground(color);
		labelNumero25.setBackground(color);
	}
	
	public void colorirLabelsIndividual(int n, Color color) {
		switch (n) {
		case 1:
			labelNumero01.setBackground(color);
			break;
		case 2:
			labelNumero02.setBackground(color);
			break;
		case 3:
			labelNumero03.setBackground(color);
			break;
		case 4:
			labelNumero04.setBackground(color);
			break;
		case 5:
			labelNumero05.setBackground(color);
			break;
		case 6:
			labelNumero06.setBackground(color);
			break;
		case 7:
			labelNumero07.setBackground(color);
			break;
		case 8:
			labelNumero08.setBackground(color);
			break;
		case 9:
			labelNumero09.setBackground(color);
			break;
		case 10:
			labelNumero10.setBackground(color);
			break;
		case 11:
			labelNumero11.setBackground(color);
			break;
		case 12:
			labelNumero12.setBackground(color);
			break;
		case 13:
			labelNumero13.setBackground(color);
			break;
		case 14:
			labelNumero14.setBackground(color);
			break;
		case 15:
			labelNumero15.setBackground(color);
			break;
		case 16:
			labelNumero16.setBackground(color);
			break;
		case 17:
			labelNumero17.setBackground(color);
			break;
		case 18:
			labelNumero18.setBackground(color);
			break;
		case 19:
			labelNumero19.setBackground(color);
			break;
		case 20:
			labelNumero20.setBackground(color);
			break;
		case 21:
			labelNumero21.setBackground(color);
			break;
		case 22:
			labelNumero22.setBackground(color);
			break;
		case 23:
			labelNumero23.setBackground(color);
			break;
		case 24:
			labelNumero24.setBackground(color);
			break;
		case 25:
			labelNumero25.setBackground(color);
			break;
		default:
			break;
		}
	}


	public JLabel getLabelNumero01() {
		return labelNumero01;
	}

	public void setLabelNumero01(JLabel labelNumero01) {
		this.labelNumero01 = labelNumero01;
	}

	public JLabel getLabelNumero02() {
		return labelNumero02;
	}

	public void setLabelNumero02(JLabel labelNumero02) {
		this.labelNumero02 = labelNumero02;
	}

	public JLabel getLabelNumero03() {
		return labelNumero03;
	}

	public void setLabelNumero03(JLabel labelNumero03) {
		this.labelNumero03 = labelNumero03;
	}

	public JLabel getLabelNumero04() {
		return labelNumero04;
	}

	public void setLabelNumero04(JLabel labelNumero04) {
		this.labelNumero04 = labelNumero04;
	}

	public JLabel getLabelNumero05() {
		return labelNumero05;
	}

	public void setLabelNumero05(JLabel labelNumero05) {
		this.labelNumero05 = labelNumero05;
	}

	public JLabel getLabelNumero06() {
		return labelNumero06;
	}

	public void setLabelNumero06(JLabel labelNumero06) {
		this.labelNumero06 = labelNumero06;
	}

	public JLabel getLabelNumero07() {
		return labelNumero07;
	}

	public void setLabelNumero07(JLabel labelNumero07) {
		this.labelNumero07 = labelNumero07;
	}

	public JLabel getLabelNumero08() {
		return labelNumero08;
	}

	public void setLabelNumero08(JLabel labelNumero08) {
		this.labelNumero08 = labelNumero08;
	}

	public JLabel getLabelNumero09() {
		return labelNumero09;
	}

	public void setLabelNumero09(JLabel labelNumero09) {
		this.labelNumero09 = labelNumero09;
	}

	public JLabel getLabelNumero10() {
		return labelNumero10;
	}

	public void setLabelNumero10(JLabel labelNumero10) {
		this.labelNumero10 = labelNumero10;
	}

	public JLabel getLabelNumero11() {
		return labelNumero11;
	}

	public void setLabelNumero11(JLabel labelNumero11) {
		this.labelNumero11 = labelNumero11;
	}

	public JLabel getLabelNumero12() {
		return labelNumero12;
	}

	public void setLabelNumero12(JLabel labelNumero12) {
		this.labelNumero12 = labelNumero12;
	}

	public JLabel getLabelNumero13() {
		return labelNumero13;
	}

	public void setLabelNumero13(JLabel labelNumero13) {
		this.labelNumero13 = labelNumero13;
	}

	public JLabel getLabelNumero14() {
		return labelNumero14;
	}

	public void setLabelNumero14(JLabel labelNumero14) {
		this.labelNumero14 = labelNumero14;
	}

	public JLabel getLabelNumero15() {
		return labelNumero15;
	}

	public void setLabelNumero15(JLabel labelNumero15) {
		this.labelNumero15 = labelNumero15;
	}

	public JLabel getLabelNumero16() {
		return labelNumero16;
	}

	public void setLabelNumero16(JLabel labelNumero16) {
		this.labelNumero16 = labelNumero16;
	}

	public JLabel getLabelNumero17() {
		return labelNumero17;
	}

	public void setLabelNumero17(JLabel labelNumero17) {
		this.labelNumero17 = labelNumero17;
	}

	public JLabel getLabelNumero18() {
		return labelNumero18;
	}

	public void setLabelNumero18(JLabel labelNumero18) {
		this.labelNumero18 = labelNumero18;
	}

	public JLabel getLabelNumero19() {
		return labelNumero19;
	}

	public void setLabelNumero19(JLabel labelNumero19) {
		this.labelNumero19 = labelNumero19;
	}

	public JLabel getLabelNumero20() {
		return labelNumero20;
	}

	public void setLabelNumero20(JLabel labelNumero20) {
		this.labelNumero20 = labelNumero20;
	}

	public JLabel getLabelNumero21() {
		return labelNumero21;
	}

	public void setLabelNumero21(JLabel labelNumero21) {
		this.labelNumero21 = labelNumero21;
	}

	public JLabel getLabelNumero22() {
		return labelNumero22;
	}

	public void setLabelNumero22(JLabel labelNumero22) {
		this.labelNumero22 = labelNumero22;
	}

	public JLabel getLabelNumero23() {
		return labelNumero23;
	}

	public void setLabelNumero23(JLabel labelNumero23) {
		this.labelNumero23 = labelNumero23;
	}

	public JLabel getLabelNumero24() {
		return labelNumero24;
	}

	public void setLabelNumero24(JLabel labelNumero24) {
		this.labelNumero24 = labelNumero24;
	}

	public JLabel getLabelNumero25() {
		return labelNumero25;
	}

	public void setLabelNumero25(JLabel labelNumero25) {
		this.labelNumero25 = labelNumero25;
	}

	public Jogo getJogo() {
		return jogo;
	}

	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}
}
