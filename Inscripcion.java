import java.util.ArrayList;
import java.util.Scanner;

public class Inscripcion {
	Scanner in = new Scanner(System.in);
	Alumno a;
	ArrayList<Alumno> lista;
	int n;

	public Inscripcion() {
		a = new Alumno();
		lista = new ArrayList<>();
	}

	public Inicializacion(){
		System.out.println("Ingrese el numero de estudiantes");
		n = in.nextInt();
	}

	public void DatosAlumno() {
		for (int i = 0; i < n; i++) {
			// la lista comienza con la posicion 0 hasta n ; pero empiezo con el numero 1
			// hasta n+1.
			System.out.println("Ingrese el nombre y el apellido del alumno " + (i + 1));
			System.out.println("Nombre");
			a.setNombre(in.nextLine());
			System.out.println("Apellido");
			a.setApellido(in.nextLine());
			lista.add(a);
		}
	}

	public void InscripcionMateria() {
		// Limite de materias a inscribir 5
		int m;
		System.out.println("¿Cuantas materias desea inscribir?");
		m = in.nextInt();
		// mostrar materias que puede inscribir
		System.out.println("Estas son las materias que puede inscrbir y su codigo");
		System.out.println(
				"1.Mat01 \n2.Pro01 \n3.Fis01 \n4.His01 \n5.Psi01 \n6.Inf01 \n7.Man01 \n8.Qui01 \n9.TecQ01 \n10.Estru01");
		// seleccionar para guardar las materias que inscribio

	}

	public void DatosCarrera() {
		// ingresa las materia inscritas y las notas correspondientes a cada materia.
		// cantidad de notas 4 por materia con un 25% cada una.
		// tipo de excepcion en las notas import java.util.InputMismatchException;

	}

	public void imprimir() {
		for (int i = 0; i < lista.size(); i++) {
			Alumno a = lista.get(i);
			System.out.println(" Estudiante " + (i + 1));
			System.out.println("Nombre: " + a.getNombre() + "," + a.getApellido());
			// imprimir tambien el promedio de las materias y el global.
		}
	}
}
