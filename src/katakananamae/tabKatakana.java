
package katakananamae;

import java.util.Arrays;

public class tabKatakana {
 //TABELA DE CARTER KATAKANA   
 String[] kananormal={"ア","イ","ウ","エ","オ"
                      ,"カ","キ","ク","ケ","コ"
                      ,"ガ","ギ","グ","ゲ","ゴ"
                      ,"サ","シ","ス","セ","ソ"
                      ,"ザ","ジ","ズ","ゼ","ゾ"
                      ,"タ","チ","ツ","テ","ト"
                      ,"ダ","ヂ","ヅ","デ","ド"
                      ,"ナ","ニ","ヌ","ネ","ノ"
                      ,"ハ","ヒ","フ","ヘ","ホ"
                      ,"バ","ビ","ブ","ベ","ボ"
                      ,"パ","ピ","プ","ペ","ポ"
                      ,"マ","ミ","ム","メ","モ"
                      ,"ヤ",    "ユ",     "ヨ"
                      ,"ラ","リ","ル","レ","ロ"
                      ,"ワ","ヲ","ン"," "};
 //TABELA DE SONS CONTRAIDOS
  String[] Kanacontraidos={"キャ","キュ","キョ"
                          ,"ギャ","ギュ","ギョ"
                          ,"シャ","シュ","ショ"
                          ,"ジャ","ジョ","ジョ"
                          ,"チャ","チュ","チョ"
                          ,"ニャ","ニュ","ニョ"
                          ,"ヒャ","ヒュ","ヒョ"
                          ,"ビャ","ビュ","ビョ"
                          ,"ピャ","ピュ","ピョ"
                          ,"ミャ","ミュ","ミョ"
                          ,"リャ","リュ","リョ"};
  String kana;  
  tabKatakana(){}
//TESTA TABELA
public String setkana(int a){
   int b=a; 
kana=kananormal[b];
return kana;
}
//testa tabela
void exibi(){
 System.out.println(Arrays.toString(kananormal));
}
            
}