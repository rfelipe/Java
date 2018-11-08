

package katakananamae;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class lastName  {
    
    String sobrenome="rodrigues";
    Scanner pegateclado = new Scanner(System.in);
    
    lastName(){      
   }
    //pega sobrenome
    String pegaSobrenome(){
    //System.out.print("Digite seu sobrenome:");
    sobrenome=JOptionPane.showInputDialog("Digite seu 2° Nome: ");
    //sobrenome = pegateclado.next();
    this.sobrenome = sobrenome; 
    return sobrenome;
    }
   void exibisobrenome(){
   System.out.println(sobrenome);}
    
}
