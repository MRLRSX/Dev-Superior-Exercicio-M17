package ExercicioDois;

import java.time.LocalDateTime;

public class User {
	private String name;
	private LocalDateTime data;

	public User(String name, LocalDateTime data) {
		super();
		this.name = name;
		this.data = data;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "name: " + name + ", data: " + data + "]";
	}
    
}
