package alura.med.voll.ApiRest.endereco;

public record DadosEndereco(String logradouro,
                            String cep,
                            String bairro,
                            String cidade,
                            String uf,
                            String complemento,
                            String numero) {
}
