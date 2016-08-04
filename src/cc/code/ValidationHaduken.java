package cc.code;
import java.util.ArrayList;
import java.util.List;

public class ValidationHaduken {

	protected List<String> validaPessoa(Pessoa pessoa) {
		
		List<String> constraints = new ArrayList<String>();
		if (pessoa != null) {
			if (pessoa.cpf != null) {
				if (pessoa.name != null) {
					constraints.addAll(validaTelefone(pessoa.telefonesFixos, constraints));
					constraints.addAll(validaTelefone(pessoa.telefonesCelulares, constraints));
				}
			}
		}

		return constraints;
	}

	public List<String> validaTelefone(List<String> telefones, List<String> constraints) {
		if (telefones != null) {
			for (String telefone : telefones) {
				if (telefone != null) {
					if (telefone.isEmpty()) {
						constraints.add("Erro - Telefone inválido");
						return constraints;
					} else {
						validaTamanhoTelefone(constraints, telefone);
					}
					
				} else {
					constraints.add("Erro - Telefone não preenchido");
					return constraints;
				}
			}
		}
		return constraints;

	}

	public List<String> validaTamanhoTelefone(List<String> constraints, String telefone) {
		if(telefone.length() < 8){
			constraints.add("Erro - Telefone inválido");
			return constraints;
		}
		return constraints;
	}
}
