package classes;

public class Curso extends Conteudo{
	
	private int hours;
	
	public Curso() {}
	
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	
	
	@Override
	public String toString() {
		return "Curso ["
				+ "\ntitle=" + getTitle()
				+ "\ndescription=" + getDescription()
				+ "\nhours=" + hours + 
				"\n]";
	}

	@Override
	public double calculaXP() {
		return XP_PADRAO * hours;
	}
	
	
	
}
