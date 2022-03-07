package classes;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Bootcamp {
	private String name;
	private String description;
	private final LocalDate initialDate = LocalDate.now();
	private final LocalDate finalDate = initialDate.plusDays(45);
	private Set<Dev> subscribedDevs = new HashSet<>();
	private Set<Conteudo> content = new HashSet<>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Set<Dev> getSubscribedDevs() {
		return subscribedDevs;
	}
	public void setSubscribedDevs(Set<Dev> subscribedDevs) {
		this.subscribedDevs = subscribedDevs;
	}
	public Set<Conteudo> getContent() {
		return content;
	}
	public void setContent(Set<Conteudo> content) {
		this.content = content;
	}
	public LocalDate getInitialDate() {
		return initialDate;
	}
	public LocalDate getFinalDate() {
		return finalDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((finalDate == null) ? 0 : finalDate.hashCode());
		result = prime * result + ((initialDate == null) ? 0 : initialDate.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((subscribedDevs == null) ? 0 : subscribedDevs.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (finalDate == null) {
			if (other.finalDate != null)
				return false;
		} else if (!finalDate.equals(other.finalDate))
			return false;
		if (initialDate == null) {
			if (other.initialDate != null)
				return false;
		} else if (!initialDate.equals(other.initialDate))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (subscribedDevs == null) {
			if (other.subscribedDevs != null)
				return false;
		} else if (!subscribedDevs.equals(other.subscribedDevs))
			return false;
		return true;
	}
	
	
}
