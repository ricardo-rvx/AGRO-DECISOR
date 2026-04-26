package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controller.decisaoController;

public class decisorAgricultorBoundary {
	public static void main(String[] args) {
		List<String> entradas = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		decisaoController dc = new decisaoController();
		int qtdSensores = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<=qtdSensores; i++) {
			entradas.add(sc.nextLine());
		}
		for(String linha : entradas) {
			System.out.println(dc.avaliarSensor(linha));
		}
	}

}
