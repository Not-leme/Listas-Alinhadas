package listaligadasimplesbase;

import javax.swing.JOptionPane;

public class Listaligadasimplesbase {

    static No inicio = null;
    static No fim = null;

    public static void main(String[] args) {

        boolean Flag = true;

        while (Flag) {
            int valor, verificacao = Integer.parseInt(JOptionPane.showInputDialog("1 - Insere Inicio\n2 - Insere Fim\n3 - Remove Inicio\n4 - Remove Fim\n5 - Exibe"
                    + "\n6 - Exibe Invertido\n7 - Empilhar\n8 - Desempilhar\n9 - Topo\n10 - Vazia\n11 - Cheia\n12 - Tamanho\n20 - Terminar"));

            switch (verificacao) {
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
                case 7:
                    Empilhar(Integer.parseInt(JOptionPane.showInputDialog("Valor")));
                    break;
                case 8:
                    Desempilhar();
                    break;
                case 9:
                    Topo();
                    break;
                case 10:
                    Vazia();
                    break;
                case 11:
                    Cheia();
                    break;
                case 12:
                    Tamanho();
                    break;
                case 20:
                    Flag = false;
                    break;
                default:
                    break;
            }
        }

    }

    private static void insereInicio(int x) {
        No Novo = new No(x);

        if (inicio == null) {
            inicio = Novo;
            fim = Novo;
        } else {
            Novo.prox = inicio;
            inicio = Novo;
        }
    }

    private static void insereFim(int x) {
        No Novo = new No(x);

        if (inicio == null) {
            inicio = Novo;
            fim = Novo;
        } else {
            No temp = inicio;

            while (temp.prox != null) {
                temp = temp.prox;
            }
            temp.prox = Novo;
            fim = Novo;
        }
    }

    private static void removeInicio() {
        if (inicio == null) {
            System.out.println("Nao ha termos");
        } else if (inicio.prox == null) {
            inicio = null;
            fim = null;
        } else {
            inicio = inicio.prox;
        }
    }

    private static void removeFim() {
        if (fim == null) {
            System.out.println("Nao ha termos");
        } else if (inicio == fim) {
            inicio = null;
            fim = null;
        } else {
            No temp = inicio;

            while (temp.prox != fim) {
                temp = temp.prox;
            }
            temp.prox = null;
            fim = temp;
        }
    }

    private static void exibe() {
        No temp = inicio;

        if (inicio == null) {
            System.out.println("Nao ha termos");
        } else {
            System.out.println(temp.valor);
            while (temp.prox != null) {
                System.out.println(temp.prox.valor);
                temp = temp.prox;
            }
        }
    }

    private static void exibeInverso() {
        No FinalTemp = fim;

        if (fim == null) {
            JOptionPane.showConfirmDialog(null, "Nao ha termos");
        } else if (inicio.prox == null) {
            JOptionPane.showConfirmDialog(null, inicio.valor);
        } else {
            boolean flag = true;

            while (flag) {
                No Temp = inicio;

                if (FinalTemp == fim) {
                    System.out.println(FinalTemp.valor);
                }

                while (Temp.prox != FinalTemp) {
                    Temp = Temp.prox;
                }
                FinalTemp = Temp;
                System.out.println(FinalTemp.valor);

                if (FinalTemp == inicio) {
                    flag = false;
                }

            }

        }
    }

    private static void Empilhar(int valor) {
        No Novo = new No(valor);

        if (fim == null) {
            inicio = Novo;
            fim = Novo;
        } else {
            fim.prox = Novo;
            fim = Novo;
        }
    }

    private static void Desempilhar() {
        No temp = inicio;

        if (fim == null) {
            JOptionPane.showConfirmDialog(null, "Nao ha termos");
        } else {
            while (temp.prox != fim) {
                temp = temp.prox;
            }
            fim = temp;
        }

    }

    private static void Topo() {
        if (fim == null) {
            JOptionPane.showConfirmDialog(null, "Nao ha termos");
        } else {
            JOptionPane.showConfirmDialog(null, "Topo: " + fim);
        }
    }

    private static void Vazia() {
        if (fim == null) {
            JOptionPane.showConfirmDialog(null, "Esta vazia");
        }
    }

    private static void Cheia() {
        JOptionPane.showConfirmDialog(null, "Nao ha limites, apenas em sua memoria ram");
    }

    private static void Tamanho() {
        No temp = inicio;

        if (inicio == null) {
            System.out.println("Nao ha termos");
        } else {
            int tamanho = 1;
            while (temp.prox != null) {
                tamanho += 1;
                temp = temp.prox;
            }
            JOptionPane.showConfirmDialog(null, "Tamanho: " + tamanho);
        }
    }

}
