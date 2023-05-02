package facade;

public class EmailFacade {
    private EmailGmail emailGmail;
    private EmailOutlook emailOutlook;

    public EmailFacade(EmailGmail emailGmail, EmailOutlook emailOutlook) {
        this.emailGmail = emailGmail;
        this.emailOutlook = emailOutlook;
    }

    public void enviarEmailGmail(String destinatario) {
        String assunto = "Confirmação de Pedido";
        String conteudo = "Seu pedido foi confirmado e será enviado em breve.";

        emailGmail.enviarEmail(destinatario, assunto, conteudo);
    }
    
    public void enviarEmailOutlook(String destinatario) {
        String assunto = "Pedido enviado";
        String conteudo = "Seu pedido foi enviado e deve chegar em breve.";

        emailOutlook.enviarEmail(destinatario, assunto, conteudo);
    }
}
