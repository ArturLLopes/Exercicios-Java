package Marketing;

public record Sms() implements MensagemMarketing {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}
