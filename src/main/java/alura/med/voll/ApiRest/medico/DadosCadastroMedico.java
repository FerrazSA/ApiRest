package alura.med.voll.ApiRest.medico;

import alura.med.voll.ApiRest.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome,
                                  String email,
                                  String crm,
                                  Especialidade especialidade,
                                  DadosEndereco endereco) {
}
