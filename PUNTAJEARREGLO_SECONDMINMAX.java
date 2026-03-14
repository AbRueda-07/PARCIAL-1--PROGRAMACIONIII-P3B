package EJERCICIO2;

public class PUNTAJEARREGLO_SECONDMINMAX {

	    public static int[] secondMinMax(int[] numbers) {
	        int menor = Integer.MAX_VALUE;
	        int segundoMenor = Integer.MAX_VALUE;
	        int mayor = Integer.MIN_VALUE;
	        int segundoMayor = Integer.MIN_VALUE;

	        for (int num : numbers) {

	            // Este para buscar menor y segundo menor
	            if (num < menor) {
	                segundoMenor = menor;
	                menor = num;
	            } else if (num < segundoMenor && num != menor) {
	                segundoMenor = num;
	            }

	            // Buscar mayor y segundo mayor
	            if (num > mayor) {
	                segundoMayor = mayor;
	                mayor = num;
	            } else if (num > segundoMayor && num != mayor) {
	                segundoMayor = num;
	            }
	        }

	        return new int[]{segundoMenor, segundoMayor};
	    }

	    public static void main(String[] args) {
	        int[] numbers = {7, 2, 9, 8};
	        int[] resultado = secondMinMax(numbers);

	        System.out.println("[" + resultado[0] + ", " + resultado[1] + "]");
	    }
	}