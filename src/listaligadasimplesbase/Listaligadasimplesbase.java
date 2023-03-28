
package listaligadasimplesbase;

public class Listaligadasimplesbase {

    static No inicio = null;
    static No fim = null;
    
    public static void main(String[] args) {

        for(int i = 0; i < 1; i++){
            No Novo = new No(i);
            insereFim(i);
        }
        
        removeFim();
        
        exibe();
        if(inicio != null){
            System.out.println("Valor do fim: " + fim.valor);
            System.out.println("Valor do inicio: " + inicio.valor);
        }
        
        
    }

    private static void insereInicio(int x) {
        No Novo = new No(x);
        
        if(inicio == null){
            inicio = Novo;
            fim = Novo;
        }else {
            Novo.prox = inicio;
            inicio = Novo;
        }
    }
    
    private static void insereFim(int x) {
        No Novo = new No(x);
        
        if(inicio == null){
            inicio = Novo;
            fim = Novo;
        }else {
            No temp = inicio;
            
            while(temp.prox != null){
                temp = temp.prox;
            }
            temp.prox = Novo;
            fim = Novo;
        }
    }
    
    private static void removeInicio() {
        if(inicio == null){
            System.out.println("Nao ha termos");
        }else if(inicio.prox == null){
            inicio = null;
            fim = null;
        }else inicio = inicio.prox;
    }
    
    private static void removeFim() {
        if (fim == null){
            System.out.println("Nao ha termos");
        }else if (inicio == fim){
            inicio = null;
            fim = null;
        }else{
            No temp = inicio;
            
            while (temp.prox != fim){
                temp = temp.prox;
            }
            temp.prox = null;
            fim = temp;
        }
    }
    
    private static void exibe() {
        No temp = inicio;
        
        if(inicio == null){
            System.out.println("Nao ha termos");
        }else {
            System.out.println(temp.valor);
            while(temp.prox != null){
                System.out.println(temp.prox.valor);
                temp = temp.prox;
            }
        }
    }
    
    private static void exibeInverso() {
        
    }
    
    
}
