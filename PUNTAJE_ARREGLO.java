package EJERCICIO1;

public class PUNTAJE_ARREGLO {

	    public static int score(int[] numbers) {
	        int total = 0;

	        for (int num : numbers) {
	            if (num == 5) {
	                total += 5;
	            } else if (num % 2 == 0) {
	                total += 1;
	            } else {
	                total += 3;
	            }
	        }

	        return total;
	    }

	    public static void main(String[] args) {
	        System.out.println(score(new int[]{1, 2, 3, 4, 5}));   // 13 esto debe dar de resultado
	        System.out.println(score(new int[]{17, 19, 21}));       // 9 esto debe dar de resultado
	        System.out.println(score(new int[]{5, 5, 5}));          // 15 esto debe dar de resultado
	    }
	}

//Respuestas de las preguntas indicadas:
//Complejidad temporal 
//O(n)
//R: Porque el arreglo se recorre una sola vez, y en cada posición solo se hacen comparaciones simples.
//
//Complejidad espacial
//O(1)
//R:Porque no se crea otro arreglo ni estructura adicional. Solo se usa una variable total y la variable del ciclo.