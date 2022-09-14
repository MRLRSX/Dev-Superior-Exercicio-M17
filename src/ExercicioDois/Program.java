package ExercicioDois;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		DateTimeFormatter dateTimeFormartter = DateTimeFormatter.ISO_DATE_TIME;
		System.out.print("Enter file full path: ");
		String path = entrada.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			Set<User> set = new HashSet<>();
			
			String line = br.readLine();
			while (line != null) {
				
				String[] fields = line.split(" ");
				String username = fields[0];
				LocalDateTime moment = LocalDateTime.parse(fields[1], dateTimeFormartter);
				
				set.add(new User(username, moment));
				
				line = br.readLine();
			}	
			System.out.println("Total users: " + set.size());
			set.stream().forEach(System.out::println);
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		entrada.close();
	}
}
