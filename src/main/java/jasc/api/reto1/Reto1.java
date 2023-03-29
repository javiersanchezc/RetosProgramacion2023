package jasc.api.reto1;

import java.util.stream.IntStream;

public class Reto1 {
    /*
     * Escribe un programa que muestre por consola (con un print) los
     * números de 1 a 100 (ambos incluidos y con un salto de línea entre
     * cada impresión), sustituyendo los siguientes:
     * - Múltiplos de 3 por la palabra "fizz".
     * - Múltiplos de 5 por la palabra "buzz".
     * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
     */


//    Para cada número del 1 al 100:
//    Si el número es divisible por 3 y 5:
//    Imprimir "fizzbuzz"
//    Si el número es divisible por 3:
//    Imprimir "fizz"
//    Si el número es divisible por 5:
//    Imprimir "buzz"
//    Si el número no es divisible por 3 ni por 5:
//    Imprimir el número

    public static void main(String[] args) {

        for(int i=1; i<=100;i++){

            if(i%3==0&& i%5==0){

                System.out.println("fizz buuz "+i);

            }else if(i%3==0 ){
                System.out.println("fizz  "+i);

            } else if(i%5==0){
                System.out.println("buzz  "+i);
            }


        }

//        solucion usando streams en java
        IntStream.rangeClosed(1, 100)
                .mapToObj(i -> i % 3 == 0 ?
                        (i % 5 == 0 ? "fizzbuzz" : "fizz") :
                        (i % 5 == 0 ? "buzz" : String.valueOf(i)))
                .forEach(System.out::println);
    }
}
