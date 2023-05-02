package facade;

public class EmailOutlook implements IEmail{
    @Override
    public void enviarEmail(String destinatario, String assunto, String conteudo) {
        System.out.printf("%s\n%s\n%s\nvia Outlook", destinatario, assunto, conteudo);
    }
}
