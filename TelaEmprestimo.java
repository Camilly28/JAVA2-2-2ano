package lista08;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaEmprestimo extends JFrame
{
	public TelaEmprestimo()
	{
		//PROJETO1
		
			this.setTitle("Tela de Acesso ao Sistema da BIBLIOTECA");
			this.setSize(500,300);
			this.setVisible(true);
			this.setResizable(true);
			
			Container c = this.getContentPane();
			
			JPanel painel = new JPanel();
			c.add(painel);
			
			 JLabel rotulo1 = new JLabel("Data de empréstimo: ");
			 painel.add(rotulo1);
			 JTextField caixa1 = new JTextField(30);
			 painel.add(caixa1);
			 JLabel rotulo2 = new JLabel("Prazo de entrega: ");
			 painel.add(rotulo2);
			 JTextField caixa2 = new JTextField(30);
			 painel.add(caixa2);
			 JLabel rotulo3 = new JLabel("Data de devolução: ");
			 painel.add(rotulo3);
			 JTextField caixa3 = new JTextField(30);
			 painel.add(caixa3);
			 
			 //FONTE E COR ------------------------------------
			 JButton botao1 = new JButton("ENTRAR");
				Font letra1 = new Font("SansSerif",Font.BOLD,24);
				botao1.setFont(letra1);
				botao1.setBackground(new Color(125,79,130));
				botao1.setForeground(Color.white);
				
				
				JButton botao2 = new JButton("LIMPAR");
				Font letra2 = new Font("SansSerif",Font.BOLD,24);
				botao2.setFont(letra2);
				botao2.setBackground(new Color(125,79,130));
				botao2.setForeground(Color.white);
				
				JButton botao3 = new JButton("FECHAR");
				Font letra3 = new Font("SansSerif",Font.BOLD,24);
				botao3.setFont(letra3);
				botao3.setBackground(new Color(125,79,130));
				botao3.setForeground(Color.white);
				
				painel.add(botao1);
				painel.add(botao2);
				painel.add(botao3);
			
			 //-----------------------------------------------------------
			 botao1.addActionListener(new ActionListener()
			 { 
				 public void actionPerformed(ActionEvent e) { JOptionPane.showMessageDialog(null,"DATA DE EMPRÉSTIMO: " +
			 caixa1.getText() + "\nPRAZO DE ENTREGA: " +caixa2.getText() + "\nDATA DE DEVOLUÇÃO: " +caixa3.getText());}
			 });
			 botao2.addActionListener(new ActionListener()
			 {
				 public void actionPerformed(ActionEvent e)
			     { 
					 caixa1.setText("");
			         caixa2.setText("");
			         caixa3.setText("");
			 }});
			 
			 botao3.addActionListener(new ActionListener()
			 { 
				 public void actionPerformed(ActionEvent e)
			     { System.exit(0); }
			 });
			 
			 
			 
			//PROJETO2 ----------------------------------------------
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
				
				
				
				//TRATAMENTO DE EVENTOS --------------------------------------
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
