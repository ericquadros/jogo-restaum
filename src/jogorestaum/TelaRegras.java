package jogorestaum;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;

public class TelaRegras extends JFrame {

	private JButton btJogar;
	private JButton btRank;
	private JButton btRegras;
	private JButton fundo;
	private JTextArea caixaTextoPontos;
	private String msg;
	
	jogorestaum.Principal pr = new jogorestaum.Principal();
	
	public TelaRegras(){
		
		setTitle("Jogo Resta Um"); // seta um t�tulo para a janela
		setSize(500, 480); // seta uma dimens�o
		Color corBg = new Color(153,204,255); //new Color(153,204,204);
		getContentPane().setBackground(corBg);
		setLocationRelativeTo(null); // seta a posi��o
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // define que a execu��o ser� finalizada quando a janela for fechada
		setResizable(false); // seta para n�o ser poss�vel redimensionar a janela
		//pack();
		setVisible(true);

		getContentPane().setLayout(null);

		// instancia os bot�es e atribuindo os seus nomes
		btJogar = new  ImagemBotao("jogar.png"); //JButton("Jogar");
		btJogar.setName("jogar");
		btRank = new ImagemBotao("resultados.png"); //JButton("Resultados");
		btRegras  = new ImagemBotao("regras.png"); //JButton("Regras");
		fundo = new ImagemBotao("fundo.png");
		fundo.setSize(100, 100);
		
		msg = "Objetivo: ";
		msg += "  Resta Um � uma esp�cie de quebra-cabe�as, ou seja, um jogo de intelig�ncia e estrat�gia que tem como finalidade fazer com que sobre apenas uma unica pe�a ao fim do jogo. \n";
		msg += "\nComo jogar: ";
		msg += "  No in�cio do jogo � organizado no tabuleiro um total de 32  pe�as, em um tabuleiro com a forma de um sinal de �+� (mais ou adi��o) e ficando livre o espa�o central (O tabuleiro possui um total de Trinta e tr�s pe�as).";
		
		msg += "\n   Para eliminar uma pe�a � necess�rio �pular� sobre a mesma, como o jogo de Damas, ou seja, escolha a pe�a que ir� pular a outra pe�a que possui uma casa vazia ao lado. Assim, vence quando sobrar apenas uma pe�a no fim do jogo, ou perde se sobrar duas ou mais.";
		//formatando caixa de texto
		caixaTextoPontos = new JTextArea("\n            Regras e Instru��es do Jogo Resta Um\n");
		caixaTextoPontos.append(msg);
		caixaTextoPontos.setSize(400,300);
		caixaTextoPontos.setWrapStyleWord(true);
		caixaTextoPontos.setLineWrap(true);
		caixaTextoPontos.setEditable(false);
		caixaTextoPontos.setFocusable(false);
		//caixaTextoPontos.setForeground(Color.blue); // ERA WHITE
		caixaTextoPontos.setFont(new Font("Tahoma",Font.PLAIN,14));
		caixaTextoPontos.setBackground(corBg);
		
		
		//objeto.setBounds (posicaoColuna,posicaoLinha,comprimentodalinha,alturadalinha);
		btJogar.setBounds(175, 260, 100, 100);
		btRank.setBounds(120, 305, 210, 150);
		btRegras.setBounds(5, 180, 150, 150);
		fundo.setBounds(0,0,500,500);
		caixaTextoPontos.setBounds(30, 10, 400, 270);
		
		//Repintar
		getContentPane().repaint();
		//Adicionando objetos
		getContentPane().add(btJogar);
		getContentPane().add(caixaTextoPontos);
		getContentPane().add(btRank);
		//getContentPane().add(btRegras);
		getContentPane().add(fundo);
		
		// registra os bot�es ao Listener
		
		btJogar.addActionListener(new Acoes());
		btRank.addActionListener(new Acoes());
		btRegras.addActionListener(new Acoes());
	}
	
	private class ImagemBotao extends JButton {
		ImagemBotao(String icon) {
					
			Icon ico = new ImageIcon("src/img/"+icon);
			this.setText(icon);
			this.setOpaque(false);
			this.setContentAreaFilled(false);
			this.setBorderPainted(false);
			this.setIcon(ico);
		}
	}
	
	
	public class Acoes implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			System.out.println(e.getActionCommand());
			
			if((e.getActionCommand()).contains("jogar")){
				System.out.println("Troca janela para a jogar");
				setVisible(false);
				pr.escolherTela(1);
				
			}else if ((e.getActionCommand()).contains("regras")){
				System.out.println("Troca janela para a regras");
				setVisible(false);
				pr.escolherTela(4);
				
			}else if((e.getActionCommand()).contains("resultados")){
			System.out.println("Troca janela para a resultados");
			setVisible(false);
			pr.escolherTela(3);
			
		}
		
	}
	
}
	
}
/*
msg = "Este Jogo Resta um � o mais legal de todos!";
/*        caixaTexto = new JTextArea(
	        "aqui vai o texto
	    	  caixaTexto.setWrapStyleWord(true);
	        caixaTexto.setLineWrap(true);
	        caixaTexto.setEditable(false);
	        caixaTexto.setFocusable(false);
	        caixaTexto.setForeground(Color.WHITE); // ERA WHITE
	        caixaTexto.setBackground(Color.BLUE);  */