public class CBBAtividadePratica5 {
    public static void main(String[] args) {
        String dias[] = {"Domingo","Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};
        int i = 0;
        System.out.println("Usando while:");
        while ( i < dias.length ) {
            System.out.println(dias[i]);
            i++;
        }
        System.out.println("Usando do-while:");
        i = 0;
        do {
            System.out.println(dias[i]);
            i++;
        } while (i < dias.length );
        System.out.println("Usando for:");
        for (i = 0; i < dias.length; i++) {
            System.out.println(dias[i]);
        }
    }
    
}