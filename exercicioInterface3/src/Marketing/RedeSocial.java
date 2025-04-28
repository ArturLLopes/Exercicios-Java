package Marketing;

public record RedeSocial() implements MensagemMarketing {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Publicando em Rede Social: " + mensagem);
    }
}
