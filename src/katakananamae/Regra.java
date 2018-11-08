
package katakananamae;

//**classe estende da tabKatakana
public class Regra extends tabKatakana {
    
    String rnome="felipe   ";//atributo de teste
    String palavra="",letra,auxletra;//atributo que recebe os simbolos da tabKatakana
    int numero;//recebe o tamanho da string
    char alf,aux;//reccebeo valor da posição da string
    int i,p,tamanho,e;//contadores
    
    //construtor do objeto
    Regra(){}
    
    //METODO QUE VERIFICA E CONVERTE OS CARACTERS
    String manipula(String n){
        
        rnome=n+"   ";//RECEBE O NOME
        tamanho= rnome.length();//PEGA O TAMANHO DA STRING
         
        //INICIO LOOP DE VERICAÇÃO, REPETE ATE CHEGAR NO TAMANHO DA STRING
        for(e=0;e<tamanho;e++){
            
            numero= rnome.charAt(i);//RECEBE O VALOR DA POSIÇÃO DA STRING
            alf=(char)numero;//TRANSFORMA O VALOR EM CHAR
        
        //VERIFICA SE O VALOR É UMA VOGAL
        if(rnome.charAt(i)=='a'||rnome.charAt(i)=='i'||rnome.charAt(i)=='u'||rnome.charAt(i)=='e'||rnome.charAt(i)=='o'){
            numero= rnome.charAt(i);
            alf=(char)numero;
          
            //VERIFICA QUAL É A VOGAL E ATRIBUI O VALOR A POSIÇÃO **P**, QUE É A POSIÇÃO DENTRO DA ARRAY DA tabkATAKANA
            if(alf=='a'){
            p=0;}
            if(alf=='i'){
            p=1;}
            if(alf=='u'){
            p=2;}
            if(alf=='e'){
            p=3;}
            if(alf=='o'){
            p=4;}
            if(alf==' '){p=71;}
            letra=super.setkana(p);//PASSA A POSIÇÃO E RECEBE O VALOR DA DA TABELA          
            palavra=palavra+letra;//CONTRUI A FRASE, SOMA ELA COM O VALOR RECEBIDO
            
            i++;//MOVE A POSIÇÃO DA DA STRING PARA PROXIMA LETRA
            e++;//INCREMENTA LOOP
            
        }
        //CASO NÃO O VALOR DA POSIÇÃO DA STRING NÃO FOR UMA VOGAL, ENTÃO E CONSOANTE
        else{
            
             //INCREMENTA O VALOR POSIÇÃO,PARA VERIFICAR SE O PROXIMO NUMERO É VOGAL E FORMA UMA SILABA   
             i++;
            if(rnome.charAt(i)=='a'||rnome.charAt(i)=='i'||rnome.charAt(i)=='u'||rnome.charAt(i)=='e'||rnome.charAt(i)=='o'){
            numero= rnome.charAt(i);
            aux=(char)numero;
                //VERIFICA QUAL É CONSOANTE E QUAL É A PROXIMA VOGAL(FORMA A SILABA)E INCREMENTA A O POSIÇÃO
                if(alf=='b'){
                    if(aux=='a'){p=45;i++;}if(aux=='i'){p=46;i++;}if(aux=='u'){p=47;i++;}if(aux=='e'){p=48;i++;}if(aux=='o'){p=49;i++;}                    
                }
                if(alf=='c'){
                    if(aux=='a'){p=5;i++;}if(aux=='i'){p=16;i++;}if(aux=='u'){p=7;i++;}if(aux=='e'){p=18;i++;}if(aux=='o'){p=9;i++;}
                }
                if(alf=='d'){
                    if(aux=='a'){p=30;i++;}if(aux=='i'){p=31;i++;}if(aux=='u'){p=32;i++;}if(aux=='e'){p=33;i++;}if(aux=='o'){p=34;i++;}
                }
                //CASO ESPECIAL INDIFERENTE DA VOGAL SEMPRE VAI APONTAR PARA 42
                if(alf=='f'){
                    if(aux=='a'){p=42;e++;}if(aux=='i'){p=42;e++;}if(aux=='u'){p=42;e++;}if(aux=='e'){p=42;e++;}if(aux=='o'){p=42;e++;}
                }
                 if(alf=='g'){
                    if(aux=='a'){p=10;i++;}if(aux=='i'){p=11;i++;}if(aux=='u'){p=12;i++;}if(aux=='e'){p=13;i++;}if(aux=='o'){p=14;i++;}
                }
                 if(alf=='h'){
                    if(aux=='a'){p=40;i++;}if(aux=='i'){p=41;i++;}if(aux=='u'){p=42;i++;}if(aux=='e'){p=43;i++;}if(aux=='o'){p=44;i++;}
                }
                if(alf=='j'){
                    if(aux=='a'){p=21;i++;}if(aux=='i'){p=21;i++;}if(aux=='u'){p=21;i++;}if(aux=='e'){p=21;i++;}if(aux=='o'){p=21;i++;}
                }
                if(alf=='k'){
                    if(aux=='a'){p=5;i++;}if(aux=='i'){p=6;i++;}if(aux=='u'){p=7;i++;}if(aux=='e'){p=8;i++;}if(aux=='o'){p=9;i++;}
                }
                if(alf=='l'){
                    if(aux=='a'){p=63;i++;}if(aux=='i'){p=64;i++;}if(aux=='u'){p=65;i++;}if(aux=='e'){p=66;i++;}if(aux=='o'){p=67;i++;}
                }
                if(alf=='m'){
                    if(aux=='a'){p=55;i++;}if(aux=='i'){p=56;i++;}if(aux=='u'){p=57;i++;}if(aux=='e'){p=58;i++;}if(aux=='o'){p=59;i++;}               
                }
                if(alf=='n'){
                    if(aux=='a'){p=35;i++;}if(aux=='i'){p=36;i++;}if(aux=='u'){p=37;i++;}if(aux=='e'){p=38;i++;}if(aux=='o'){p=39;i++;}
                }
                if(alf=='p'){
                    if(aux=='a'){p=50;i++;}if(aux=='i'){p=51;i++;}if(aux=='u'){p=52;i++;}if(aux=='e'){p=53;i++;}if(aux=='o'){p=54;i++;}
                }
                if(alf=='q'){
                    if(aux=='a'){p=5;i++;}if(aux=='i'){p=6;i++;}if(aux=='u'){p=7;i++;}if(aux=='e'){p=8;i++;}if(aux=='o'){p=9;i++;}
                }
                if(alf=='r'){
                    if(aux=='a'){p=63;i++;}if(aux=='i'){p=64;i++;}if(aux=='u'){p=65;i++;}if(aux=='e'){p=66;i++;}if(aux=='o'){p=67;i++;}      
                }
                if(alf=='s'){
                    if(aux=='a'){p=15;i++;}if(aux=='i'){p=16;i++;}if(aux=='u'){p=17;i++;}if(aux=='e'){p=18;i++;}if(aux=='o'){p=19;i++;}
                }
                if(alf=='t'){
                    if(aux=='a'){p=25;i++;}if(aux=='i'){p=26;i++;}if(aux=='u'){p=27;i++;}if(aux=='e'){p=28;i++;}if(aux=='o'){p=29;i++;}
                }
                if(alf=='v'){
                    if(aux=='a'){p=67;i++;}if(aux=='i'){p=67;i++;}if(aux=='u'){p=67;i++;}if(aux=='e'){p=68;i++;}if(aux=='o'){p=68;i++;}
                }
                if(alf=='w'){
                     if(aux=='a'){p=67;i++;}if(aux=='i'){p=67;i++;}if(aux=='u'){p=68;i++;}if(aux=='e'){p=68;i++;}if(aux=='o'){p=68;i++;}
                }
                if(alf=='x'){
                     if(aux=='a'){p=16;i++;}if(aux=='i'){p=16;i++;}if(aux=='u'){p=16;i++;}if(aux=='e'){p=16;i++;}if(aux=='o'){p=16;i++;}
                }
                if(alf=='y'){
                     if(aux=='a'){p=61;i++;}if(aux=='i'){p=61;i++;}if(aux=='u'){p=62;i++;}if(aux=='e'){p=63;i++;}if(aux=='o'){p=63;i++;}
                }
                if(alf=='z'){
                     if(aux=='a'){p=20;i++;}if(aux=='i'){p=21;i++;}if(aux=='u'){p=22;i++;}if(aux=='e'){p=23;i++;}if(aux=='o'){p=24;i++;}
                }
                
            letra=super.setkana(p);          
            palavra=(String) palavra+ (String) letra;
            e++;  
            
            } 
            //CASO NÃO A PROXIMA POSIÇÃO DA STRING NÃO SEJA UMA VOGAL, COMO NA PALAVRA **BRASIL**
            else{
          
               if(alf==' '){p=71;} 
               
               
                if(alf=='b'){
                   //SE A POSIÇÃO DA STRING FOR DIFERENTE DAS VOGAIS, CONSIDERA O VALOR DA  SILABA COM 'U' 
                   if(aux!='a'||aux!='i'||aux!='u'||aux!='e'||aux!='o'){p=47;}
                }
                if(alf=='c'){
                    if(aux!='a'||aux!='i'||aux!='u'||aux!='e'||aux!='o'){p=7;}
                }
                if(alf=='d'){
                    if(aux!='a'||aux!='i'||aux!='u'||aux!='e'||aux!='o'){p=32;}
                }
                if(alf=='f'){
                    if(aux!='a'||aux!='i'||aux!='u'||aux!='e'||aux!='o'){p=42;}
                }
                 if(alf=='g'){
                    if(aux!='a'||aux!='i'||aux!='u'||aux!='e'||aux!='o'){p=12;}
                }
                 if(alf=='h'){
                    if(aux!='a'||aux!='i'||aux!='u'||aux!='e'||aux!='o'){p=42;}
                }
                if(alf=='j'){
                    if(aux!='a'||aux!='i'||aux!='u'||aux!='e'||aux!='o'){p=21;}
                }
                if(alf=='k'){
                    if(aux!='a'||aux!='i'||aux!='u'||aux!='e'||aux!='o'){p=7;}
                }
                if(alf=='l'){
                    if(aux!='a'||aux!='i'||aux!='u'||aux!='e'||aux!='o'){p=65;}
                }
                if(alf=='m'){
                    if(aux!='a'||aux!='i'||aux!='u'||aux!='e'||aux!='o'){p=57;}               
                }
                if(alf=='n'){
                    if(aux!='a'||aux!='i'||aux!='u'||aux!='e'||aux!='o'){p=70;}
                }
                if(alf=='p'){
                    if(aux!='a'||aux!='i'||aux!='u'||aux!='e'||aux!='o'){p=52;}
                }
                if(alf=='q'){
                    if(aux!='a'||aux!='i'||aux!='u'||aux!='e'||aux!='o'){p=7;}
                }
                if(alf=='r'){
                   if(aux!='a'||aux!='i'||aux!='u'||aux!='e'||aux!='o'){p=67;}
                }
                if(alf=='s'){
                    if(aux!='a'||aux!='i'||aux!='u'||aux!='e'||aux!='o'){p=17;}
                }
                if(alf=='t'){
                    if(aux!='a'||aux!='i'||aux!='u'||aux!='e'||aux!='o'){p=27;}
                }
                if(alf=='v'){
                    if(aux!='a'||aux!='i'||aux!='u'||aux!='e'||aux!='o'){p=68;}
                }
                if(alf=='w'){
                     if(aux!='a'||aux!='i'||aux!='u'||aux!='e'||aux!='o'){p=68;}
                }
                if(alf=='x'){
                     if(aux!='a'||aux!='i'||aux!='u'||aux!='e'||aux!='o'){p=16;}
                }
                if(alf=='y'){
                     if(aux!='a'||aux!='i'||aux!='u'||aux!='e'||aux!='o'){p=62;}
                }
               if(alf=='z'){
                    if(aux!='a'||aux!='i'||aux!='u'||aux!='e'||aux!='o'){p=22;}
                }
                              
               
            letra=super.setkana(p);          
            palavra=(String) palavra+ (String) letra;
            
            e++;
                }
            } 
        }
         //RETORNA O NOME CONVERTIDO
         return palavra;         
    }//fim loop
 }



    


