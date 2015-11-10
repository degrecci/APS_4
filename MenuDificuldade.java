import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


public class MenuDificuldade extends JFrame implements ActionListener {

	// DECLARANDO VARIAVEIS;
	private static final long serialVersionUID = 1L;
	private JPanel jp_total;
	private BotaoMenu[] botoes = new BotaoMenu[5];


	public JFrame frame = new JFrame("Dificuldade");



	//MTD. CONSTRUTOR;
	public MenuDificuldade(){

		super("Tela Menu");


		//Setando configs da janela
		frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		frame.setLocation(150,150);
		frame.setSize(150,200);
		frame.setResizable(true);
		frame.setVisible(true);

		//Layouts

		jp_total = new JPanel(new GridLayout(4,1,2,2));
		for(int x=1;x<5;x++){
			botoes[x]= new BotaoMenu();
			botoes[x].setBorder(new LineBorder(Color.BLACK, 1));
			jp_total.add(botoes[x]);
			botoes[x].addActionListener(this);
		}
		frame.add(jp_total);

		botoes[1].setText("8 SEQUENCIAS");
		botoes[2].setText("14 SEQUENCIAS");
		botoes[3].setText("20 SEQUENCIAS");
		botoes[4].setText("31 SEQUENCIAS");




	}


	public void actionPerformed(ActionEvent e){

		if (e.getSource()== botoes[1]){
			new Jogo();
			frame.dispose();
		}if (e.getSource()== botoes[2]){
			new Jogo();
			frame.dispose();
		}if (e.getSource()== botoes[3]){
			new Jogo();
			frame.dispose();
		}if (e.getSource()== botoes[4]){
			new Jogo();
			frame.dispose();
		}
	}
}
