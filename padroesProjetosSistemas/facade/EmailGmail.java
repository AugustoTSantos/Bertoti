package facade;

public class EmailGmail implements IEmail {

    @Override
    public void enviarEmail(String destinatario, String assunto, String conteudo) {
        System.out.printf("%s\n%s\n%s\nvia Gmail", destinatario, assunto, conteudo);
    }
}
