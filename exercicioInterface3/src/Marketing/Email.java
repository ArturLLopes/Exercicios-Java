package Marketing;

public record Email() implements MensagemMarketing {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando E-mail: " + mensagem);
    }
}
