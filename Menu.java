package gerenciador_tarefas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	private int opcao;
	private Scanner leitura;
	private String nomeTarefa;
	private String descricaoTarefa;
	private int prioridade;
	private Tarefas tarefa;
	private ListaTarefas tarefas;
	public Menu() {
		this.leitura = new Scanner(System.in);
		this.tarefas=new ListaTarefas();
	}

	public void exibiMenu() {
		while (true) {
			try {
				System.out.println("Escolha sua opção. 1: cadastrar tarefa. 2: listar tarefas por prioridade. 3: sair do gerenciador.");
				opcao=leitura.nextInt();
				switch (opcao) {
				case 1: {
					System.out.println("Digite o nome da tarefa.");
					nomeTarefa=leitura.next();
					leitura.nextLine();
					System.out.println("Digite a descrição da tarefa.");
					descricaoTarefa=leitura.nextLine();
					System.out.println("Agora digite a prioridade da tarefa de 1 a 5.");
					prioridade=leitura.nextInt();
					tarefa = new Tarefas(nomeTarefa, descricaoTarefa, prioridade);
					tarefas.adicionarTarefa(tarefa);
					System.out.println("Tarefa cadastrada.");
					break;
				}
				case 2: {
					tarefas.ordenarPrioridade();
				tarefas.listarTarefas();
					break;
				}
				case 3: {
					leitura.close();
					return;
				}
				default:
					throw new IllegalArgumentException("Opção inválida.");
				}
			} catch (InputMismatchException e) {
				System.out.println("Só tecle números, por favor.");
				leitura.nextLine();
			}
		}
	}
}
