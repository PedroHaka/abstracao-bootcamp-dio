package classes;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
	
	private LocalDate data;
	
	public Mentoria() {}
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Mentoria ["
				+ "\ntitle=" + getTitle()
				+ "\ndescription=" + getDescription()
				+ "\nDate=" + data + 
				"\n]";
	}
	
		
	@Override
	public double calculaXP() {
		return XP_PADRAO + 20d;
	}
	
	
	
	
}
