package classes;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
	private String name;
	private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
	private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
	
	public void subscribeBootcamp(Bootcamp bootcamp) {
		this.conteudosInscritos.addAll(bootcamp.getContent());
		bootcamp.getSubscribedDevs().add(this);
	}
	
	
	public void progress() {
		Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
		if(conteudo.isPresent()) {
			this.conteudosConcluidos.add(conteudo.get());
			this.conteudosInscritos.remove(conteudo.get());
		}else {
			System.err.println("Você não está matriculado em nenhum conteúdo!");
		}
	}
	
	
	public double calcularTotalXP() {
		return this.conteudosConcluidos.stream()
		.mapToDouble(conteudo -> conteudo.calculaXP())
		.sum();
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Conteudo> getConteudosInscritos() {
		return conteudosInscritos;
	}
	public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
		this.conteudosInscritos = conteudosInscritos;
	}
	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}
	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((conteudosConcluidos == null) ? 0 : conteudosConcluidos.hashCode());
		result = prime * result + ((conteudosInscritos == null) ? 0 : conteudosInscritos.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Dev other = (Dev) obj;
		if (conteudosConcluidos == null) {
			if (other.conteudosConcluidos != null)
				return false;
		} else if (!conteudosConcluidos.equals(other.conteudosConcluidos))
			return false;
		if (conteudosInscritos == null) {
			if (other.conteudosInscritos != null)
				return false;
		} else if (!conteudosInscritos.equals(other.conteudosInscritos))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
}
