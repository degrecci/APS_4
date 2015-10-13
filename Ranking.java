import java.awt.*;

public class Ranking extends JFrame{

  private JTabbedPane modos;
  private JLabel pontuacao, jogador;
  private JButton voltar;
  private JPanel modo1, modo2, modo3;

  public Ranking (){

    super ("Ranking");

    pontuação = new JLabel ("Pontuação");
    jogador = new JLabel ("Jogador");
    voltar = new JButton ("Voltar");
    modo1 = new JPanel();
    modo1.setLayout(null);
    modo2 = new JPanel();
    modo2.setLayout(null);
    modo3 = new JPanel();
    modo3.setLayout(null);
    modos = new JTabbedPane();

    modos.addTab("Modo 1", modo1);
    modos.addTab("Modo 2", modo2);
    modos.addTab("Modo 3", modo3);

    Container janela;
    janela = getContentPane();
    janela.setLayout(new BorderLayout());
    janela.add(modos, BorderLayout.CENTER); 
  }
}
