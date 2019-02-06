package calculoimc;

public class Tamanho {
    /**
     * calcula a media do palmito
     */
    
    double media;
    int op;
    public double calcular(double idade, double altura){
        if(idade >= 10 && idade <= 13 ){
            op = 0;
            return media = 11;     
        }else if(idade >= 14 && idade <= 16){
            op = 1;
            return media = 13;
        }else{
            op = 2;
            return media = 16;
        }
    }
    /**
     * calcula o tamanho ta na media de palmitos
     */
    public String CalcSit(double tamanho){
        if(op == 0){
               if(tamanho <= 10){
                   return "Seu palmito eh peqeuno";
               }else if(tamanho == 11){
                   return "Seu palmito esta na media";
               }else{
                   return "Seu palmito eh enorme";
               }
        } else if(op == 1){
            if(tamanho <= 12){
                return "Seu palmito eh pequeno";
            }else if(tamanho == 13){
                return "Seu palmito esta na media";
            }else{
                return "O Senhor tem um palmitão";
            }
        }else{
            if(tamanho <= 15){
                return "tem um palmitinho";
            }else if(tamanho == 16){
                return "Seu palmito esta na media";
            }else{
                return "jesus q palmitao";
            }
        }
    }
    public String NomeDoCara(String nome){
            return nome;
    }
}
