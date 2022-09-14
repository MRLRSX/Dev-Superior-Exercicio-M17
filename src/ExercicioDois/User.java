package ExercicioDois;

import java.time.LocalDateTime;
import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(data, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(data, other.data) && Objects.equals(name, other.name);
	}
	
    
}
