import java.util.ArrayList;

/* 
    Universidade Federal do Ceará, 2018.1
    @Author: Rubens Anderson, 362984, Ciência da Computação
    @Version: 1.0

    Classe Sistema. Ela eh a manager.
 */

 public class Sistema{
     
     private ArrayList<ContaAbs> accounts = new ArrayList<ContaAbs>();

     // Esta implementacao de criarConta eh ao meu ver melhor do que a proposta, pois o usuario da main so 
     // tem contato com o id da conta retornado, e nao precisa gerir os ids ele mesmo.
     // alem disso, so precisa de uma assinatura e o tipo de conta eh passado como parametro

     public long criarConta(int tipo){
         long id = accounts.size();

        // aqui ha coerção da variavel especifica de conta para a abstrata mae
         switch(tipo){
             case 1:
                accounts.add(new ContaBasic(id));
                break;
             case 2:
                accounts.add(new ContaPlus(id));
                break;
             case 3:
                accounts.add(new ContaExtreme(id));
                break;
            default:
                System.out.println("\n\tErro: tipo de conta nao identificada! \n\tEspera-se uma conta do tipo 1: Basic - 2: Plus - 3: Extreme");
        }
        return id;
     }

     public void creditar(int id, double val){
         // aqui posso fazer uma gambiarra pra forçar coerção
         accounts.get(id).depositar(val);
     }
     public void debitar(int id, double val){
         // aqui posso fazer uma gambiarra pra forçar coerção
         accounts.get(id).debitar(val);
     }
     public double consultarSaldo(int id){
         return accounts.get(id).consultar();
     }
     public String show(int id){
        return accounts.get(id).toString();
     }
 }