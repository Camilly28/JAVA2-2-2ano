package lista08;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TelaPrincipal extends JFrame
{
	public TelaPrincipal()
	{
		//PROJETO1
		this.setTitle("Tela de acesso ao Sistema da BIBLIOTECA");
		this.setSize(500,300);
		this.setVisible(true);
		this.setResizable(true);
		
		Container c = this.getContentPane();
		
		JPanel painel = new JPanel();
		c.add(painel);
		
		JLabel rotulo1 = new JLabel("O que deseja cadastrar?");
		painel.add(rotulo1);
		
		//GERENCIADOR DE LAYOUT--------------------------------------------------------
		//Container c = this.getContentPane();
		GridLayout layout = new GridLayout(2,2,5,5);
		c.setLayout(layout);
		
		JButton botao1 = new JButton("PROFESSOR");
		JButton botao2 = new JButton("ALUNO");
		JButton botao3 = new JButton("EMPRÉSTIMO");
		JButton botao4 = new JButton("LIVRO");
		
		c.add (botao1);
		c.add(botao2);
		c.add(botao3);
		c.add(botao4);
		
		
		//FONTE E COR --------------------------------------------
	//  JButton botao1 = new JButton("PROFESSOR");
		Font letra1 = new Font("SansSerif",Font.BOLD,24);
		botao1.setFont(letra1);
		botao1.setBackground(new Color(125,79,130));
		botao1.setForeground(Color.white);
		
		
	//	JButton botao2 = new JButton("ALUNO");
		Font letra2 = new Font("SansSerif",Font.BOLD,24);
		botao2.setFont(letra2);
		botao2.setBackground(new Color(125,79,130));
		botao2.setForeground(Color.white);
		
	//	JButton botao3 = new JButton("EMPRÉSTIMO");
		Font letra3 = new Font("SansSerif",Font.BOLD,24);
		botao3.setFont(letra3);
		botao3.setBackground(new Color(125,79,130));
		botao3.setForeground(Color.white);
		
	//	JButton botao4 = new JButton("LIVRO");
		Font letra4 = new Font("SansSerif",Font.BOLD,24);
		botao4.setFont(letra4);
		botao4.setBackground(new Color(125,79,130));
		botao4.setForeground(Color.white);
		
		 painel.add(botao1);
		 painel.add(botao2);
		 painel.add(botao3);
		 painel.add(botao4);
		 
		 botao1.addActionListener(new ActionListener()
		 { public void actionPerformed(ActionEvent e) { TelaProfessor objProfessor = new TelaProfessor();
		 }});
		 
		 botao2.addActionListener(new ActionListener()
		 { public void actionPerformed(ActionEvent e) { TelaAluno objAluno = new TelaAluno();
		 }});
		 
		 botao3.addActionListener(new ActionListener()
		 { public void actionPerformed(ActionEvent e) { TelaEmprestimo objEmprestimo = new TelaEmprestimo();
		 }});
		 
		 botao4.addActionListener(new ActionListener()
		 { public void actionPerformed(ActionEvent e) { TelaLivro objLivro = new TelaLivro();
		 }});

		 
		 
		 
		//PROJETO2----------------------------------------------------
			JMenuBar barraMenus = new JMenuBar();
			
			JMenu menu1 = new JMenu ("Cadastros Básicos");
			JMenu menu2 = new JMenu ("Consultas");
			JMenu menu3 = new JMenu ("Relatórios");
			JMenu menu4 = new JMenu ("Ajuda");
			
			JMenuItem item1 = new JMenuItem("Usuários");
			JMenuItem item2 = new JMenuItem("Recuperar Senha");
			JMenuItem item31 = new JMenuItem("Usuários Cadastros");
			JMenuItem item32 = new JMenuItem("Listas de E-mails");
			JMenuItem item4 = new JMenuItem("Sobre");
			
			menu1.add(item1);
			menu2.add(item2);
			menu3.add(item31);
			menu3.add(item32);
			menu4.add(item4);
			
			barraMenus.add(menu1);
			barraMenus.add(menu2);
			barraMenus.add(menu3);
			barraMenus.add(menu4);
			
			this.setJMenuBar(barraMenus);
			
			
			
			//TRATAMENTO DE EVENTOS-------------------------------------------------
			item1.addActionListener(new ActionListener()
			{	
				public void actionPeformed(ActionEvent e)
				{ JOptionPane.showMessageDialog(null, "ACIONOU O ITEM DE MENU 1!");
			}});
			
			item2.addActionListener(new ActionListener()
			{	
				public void actionPeformed(ActionEvent e)
				{ JOptionPane.showMessageDialog(null, "ACIONOU O ITEM DE MENU 2!");
			}});
			
			item31.addActionListener(new ActionListener()
			{	
				public void actionPeformed(ActionEvent e)
				{ JOptionPane.showMessageDialog(null, "ACIONOU O ITEM DE MENU 3!");
			}});
			
			item32.addActionListener(new ActionListener()
			{	
				public void actionPeformed(ActionEvent e)
				{ JOptionPane.showMessageDialog(null, "ACIONOU O ITEM DE MENU 3!");
			}});
			
			item4.addActionListener(new ActionListener()
			{	
				public void actionPeformed(ActionEvent e)
				{ JOptionPane.showMessageDialog(null, "ACIONOU O ITEM DE MENU 4!");
			}});
	}

}