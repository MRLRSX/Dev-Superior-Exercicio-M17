package ExercicioUm;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import ExercicioUm.entities.Product;

public class Program {
	public static void main(String[] args) {
		Set<Product> set01= new HashSet<>();
		Set<Product> set02 = new TreeSet<>();
		Set<Product> set03 = new LinkedHashSet<>();
		set01.add(new Product("TV", 900.0));
		set01.add(new Product("Notebook", 1200.0));
		set01.add(new Product("Tablet", 400.0));
		set02.addAll(set01);
		set03.addAll(set01);
		
		Product prod = new Product("Notebook", 1200.0);
		System.out.println(set01.contains(prod));
		
		set01.stream().forEach(System.out::println);		
		set02.stream().forEach(System.out::println);		
		set03.stream().forEach(System.out::println);
		
		set03.removeIf(x -> x.getName().charAt(0) == 'T');
		set03.stream().forEach(System.out::println);

	}
}
