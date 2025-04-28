package Marketing;

public record WhatsApp() implements MensagemMarketing {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando WhatsApp: " + mensagem);
    }
}
