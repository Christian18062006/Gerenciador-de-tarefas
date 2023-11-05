package gerenciador_tarefas;

public class Tarefas {
	private String nomeTarefa;
	private String descricaoTarefa;
	private int prioridade;
	public Tarefas(String nomeTarefa, String descricaoTarefa, int prioridade) {
		this.nomeTarefa=nomeTarefa;
		this.descricaoTarefa=descricaoTarefa;
		this.prioridade=prioridade;
		}
	@Override
	public String toString() {
		return ("Nome da tarefa: \n"+ nomeTarefa + "prioridade da tarefa: \n"+ prioridade);
	}
	public String getNomeTarefa() {
		return nomeTarefa;
	}
	public String getDescricaoTarefa() {
		return descricaoTarefa;
	}
	public int getPrioridade() {
		return prioridade;
	}

}
