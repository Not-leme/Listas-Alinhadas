
package listaligadasimplesbase;
import javax.swing.JOptionPane;

public class Listaligadasimplesbase {

    static No inicio = null;
    static No fim = null;
    
    public static void main(String[] args) {

        
        int valor, verificacao = Integer.parseInt(JOptionPane.showInputDialog("1 - Insere Inicio\n2 - Insere Fim\n3 - Remove Inicio\n4 - Remove Fim\n5 - Exibe\n6 - Exibe Invertido\n10 - Terminar"));
        boolean Flag = true;
        
        while(Flag){
            switch(verificacao){
            case 1:
                valor = Integer.parseInt(JOptionPane.showInputDialog("Valor"));
                insereInicio(valor);
                break;
            case 2:
                valor = Integer.parseInt(JOptionPane.showInputDialog("Valor"));
                insereFim(valor);
                break;
            case 3:
                removeInicio();
                break;
            case 4:
                removeFim();
                break;
            case 5:
                exibe();
                break;
            case 6:
                exibeInverso();
                break;
            case 10:
                Flag = false;
                break;
            default:
                break;
        }
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
