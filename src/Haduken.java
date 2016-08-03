import java.util.ArrayList;
import java.util.List;

public class Haduken {

	protected List<String> validaPessoa(Pessoa pessoa) {
		List<String> constraints = new ArrayList<String>();
		if (pessoa != null) {
			if (pessoa.cpf != null) {
				if (pessoa.name != null) {
					if (pessoa.telefonesFixos != null) {
						for (String telefone : pessoa.telefonesFixos) {
							if (telefone != null) {
								boolean telefoneEValido = telefoneEValido(telefone);
								if (!telefoneEValido) {
									constraints.add("Erro - Telefone inválido");
									return constraints;
								} else {
									return constraints;
								}
							} else {
								constraints.add("Erro - Telefone não preenchido");
								return constraints;
							}
						}
					}
				}
			}
		}

		return constraints;
	}

	private boolean telefoneEValido(String telefone) {
		if (telefone.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}

}
