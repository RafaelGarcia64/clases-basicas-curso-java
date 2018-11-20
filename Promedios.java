public class Promedios {// esta creo que seria nuestra clase abstracta.

public CalPromedioMateria(){
	double promedio = 0.0;
	double contador = 0.0;
	for(int i = 0; i<4; i++){
	contador += notas[i];	
	return promedio =(contador/4);}
	}

	public void PromedioGlobal() {
		double contador = 0.0;
		for (int i = 0; i < m; i++) {
			contador += promedio;
		}
		System.out.println("Promedio Global es:" + contador / m);
	}
}