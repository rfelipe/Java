package katakananamae;
import javax.swing.JOptionPane;


public class KatakanaNamae {
    public static void main(String[] args) {
      String nome,sobrenome;  
       
      //Intancia de objetos
      firstNome y;
      lastName x;
      Regra z,zz;
      tabKatakana k;
      y=new firstNome();
      x=new lastName();
      z=new Regra();
      zz=new Regra();
      k=new tabKatakana();
      //inicia o programa
             
      
      //teste
      JOptionPane.showMessageDialog(null,"##....KATAKANA NAMAE CONVERTER......##\n" + "*DIGITE apenas COM LETRAS MINUSCULAS* \n");
      //fimteste
      k.exibi();//tests tabela
      System.out.print("##KATAKANA NAMAE CONVERTER......## \n" );
       //System.out.print("*DIGITE COM LETRAS MINUSCULAS*\n");
      //chama metodo para pegar nome
      nome=y.peganome();
      //metodo pegar sobrenome
      sobrenome=x.pegaSobrenome();
     
      //CHAMA O METODO QUE CONVERTE O NOME E SOBRENOME E IMPRIME NA CAIXA DE DIALOGO
      JOptionPane.showMessageDialog(null,"Seu nome em Katakana:  \n" + z.manipula(nome)+"    "+zz.manipula(sobrenome));
      //chama o metodo para converte nome sobrenome 
    }  
}
