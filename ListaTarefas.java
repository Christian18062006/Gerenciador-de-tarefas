package gerenciador_tarefas;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ListaTarefas {
	ArrayList<Tarefas> tarefas;
	public ListaTarefas() {
		tarefas = new ArrayList<>();
	}

	public void listarTarefas() {
		for (Tarefas tarefas2 : tarefas) {
			System.out.println(tarefas2);
	}
}
	public void ordenarPrioridade() {
		Collections.sort(tarefas, Comparator.comparing(Tarefas::getPrioridade).reversed());
	}
	public void adicionarTarefa(Tarefas tarefa) {
		tarefas.add(tarefa);
	}
}