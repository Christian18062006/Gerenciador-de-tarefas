package gerenciador_tarefas;

import java.util.Scanner;

public class Gerenciador {

	public static void main(String[] args) {
		System.out.println("Bem vindo ao gerenciador de tarefas.");
		Menu menu = new Menu();
		menu.exibiMenu();
	}

}
