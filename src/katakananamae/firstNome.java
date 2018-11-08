
package katakananamae;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class firstNome {
   String nome="felipe";
   Scanner pegateclado = new Scanner(System.in);
   
   firstNome(){
       
   }
   //PEGA O NOME DO USUARIO
   String peganome(){
    //System.out.print("Digite seu Nome:");
   nome=JOptionPane.showInputDialog("Digite seu 1° Nome: ");
    //nome = pegateclado.next();
    this.nome = nome;
    return nome;
    }
   void exibinome(){
       
   System.out.println(nome);
   }
 }

