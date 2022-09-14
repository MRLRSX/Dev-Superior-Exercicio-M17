package ExercicioTres;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int n = entrada.nextInt();
		for (int i=0; i<n; i++) {
			int number = entrada.nextInt();
			a.add(number);
		}

		System.out.print("How many students for course B? ");
		n = entrada.nextInt();
		for (int i=0; i<n; i++) {
			int number = entrada.nextInt();
			b.add(number);
		}

		System.out.print("How many students for course C? ");
		n = entrada.nextInt();
		for (int i=0; i<n; i++) {
			int number = entrada.nextInt();
			c.add(number);
		}
		
		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);

		System.out.println("Total students: " + total.size());

		entrada.close();
	}
}
