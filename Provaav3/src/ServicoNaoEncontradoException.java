public class ServicoNaoEncontradoException extends Exception{


    public ServicoNaoEncontradoException(int idServico) {
        super("Serviço com ID " + idServico + " não foi encontrado.");
    }

}
