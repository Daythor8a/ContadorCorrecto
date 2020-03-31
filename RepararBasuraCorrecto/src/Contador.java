import java.util.Arrays;

public class Contador {

        public static void main (String [] args) {

            /**
             * Ingresa valores
             */
            int[] ar = {0, 1, 0, 1, -1, 0};
            Arrays.sort(ar);
            int contador=0;
            int aux=ar[0];
            int j2 = 0;
            for (int i = 0; i < ar.length; i++) {

                if(aux == ar[i]){
                    contador++;

                } else {

                    for(int j=j2; j<=1; j+=2) {
                        if (j == 0) {System.out.println("Basura: ");}
                        else{
                            System.out.println("Reparar: ");
                        }
                    }

                    System.out.print(contador + ",");
                    contador = 1;
                    j2++;
                    aux = ar[i];
                }
            }
            System.out.print("Correcto: "+contador );
        }

}
