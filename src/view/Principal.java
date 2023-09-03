package view;
import br.edu.fateczl.ordenacao.quicksort.*;
import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		QuickSort Qs = new QuickSort();
		
		int[] array_vetor_ent = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
			System.out.printf("Exercicio 1.QuickSort\n\t Sem misturar: %s\n",
			Arrays.toString(array_vetor_ent));
		int[] array_vetor_saida = Qs.misto(array_vetor_ent);	
			System.out.printf("Organizado: %s\n",
			Arrays.toString(array_vetor_saida));
		
		int[] array_vetor1 = {44, 43, 42, 41, 40, 39, 38};
			System.out.printf("\nExercicio 2.QuickSort\n\t Sem misturar: %s\n", 
			Arrays.toString(array_vetor1));
		int[] array_vetor_saida1 = Qs.misto(array_vetor1);
			System.out.printf("Organizado: %s\n",
			Arrays.toString(array_vetor_saida1));
			
			
		int[] array_vetor2 = {31, 32, 33, 34, 99, 98, 97, 96};
			System.out.printf("\nExercicio 3. QuickSort \n\t Sem misturar: %s\n",
			Arrays.toString(array_vetor2));
		int[] array_vetor_saida2 = Qs.misto(array_vetor2);	
			System.out.printf("Organizado: %s\n",
			Arrays.toString(array_vetor_saida2));
		
}
}