public class CBBAtividadePratica4 {
    public static void main(String[] args){
        int[] numeros = new int[100];

        for(int i=0;i<101;i++){
            numeros[i] = i;
            System.out.println(numeros[i]);
        }
    }
}

//O código acima gera um erro já que está tentando atribuir um valor em um índice maior doque o que foi especificado na inicialização do array (101);