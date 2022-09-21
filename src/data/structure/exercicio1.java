package data.structure;
import java.util.List;
import java.util.ArrayList;

public class exercicio1 {
	public static void main(String[] args) {
		List<TemperaturaMedia> mediaTemp = new ArrayList<>();
		
		TemperaturaMedia temp1 = new TemperaturaMedia("Janeiro", 34d);
		TemperaturaMedia temp2 = new TemperaturaMedia("Fevereiro", 35d);
		TemperaturaMedia temp3 = new TemperaturaMedia("Março", 23.5);
		TemperaturaMedia temp4 = new TemperaturaMedia("Abril", 22.6);
		TemperaturaMedia temp5 = new TemperaturaMedia("Maio", 27.9);
		TemperaturaMedia temp6 = new TemperaturaMedia("Junho", 30d);
		
		mediaTemp.add(temp1);
		mediaTemp.add(temp2);
		mediaTemp.add(temp3);
		mediaTemp.add(temp4);
		mediaTemp.add(temp5);
		mediaTemp.add(temp6);
		
		//calculando a média semestral
		double soma = 0d;
		for(int i = 0; i < mediaTemp.size(); i++) {
			soma += mediaTemp.get(i).getTemperaturaMedia();
		}
		double media = soma/mediaTemp.size();
		System.out.println(media);
		
		for(int i = 0; i < mediaTemp.size(); i++) {
			if(mediaTemp.get(i).getTemperaturaMedia() > media) {
				System.out.println("Mês de " + mediaTemp.get(i).getMes() + " com média de " + mediaTemp.get(i).getTemperaturaMedia());
			}
		}
	}
}

class TemperaturaMedia {
	private String mes;
	private Double temperaturaMedia;
	
	public TemperaturaMedia(String mes, Double temperaturaMedia) {
		this.mes = mes;
		this.temperaturaMedia = temperaturaMedia;
	}
	
	public String getMes() {
		return this.mes;
	}
	public Double getTemperaturaMedia() {
		return this.temperaturaMedia;
	}
	
}
