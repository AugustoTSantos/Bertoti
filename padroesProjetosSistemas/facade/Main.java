package facade;

public class Main {
    public static void main(String[] args) {
        EmailGmail emailGmail = new EmailGmail();
        EmailOutlook emailOutlook = new EmailOutlook();
        EmailFacade emailFacade = new EmailFacade(emailGmail, emailOutlook);

        emailFacade.enviarEmailGmail("exemplo@exemplo.com");
        emailFacade.enviarEmailOutlook("exemplo@exemplo.com");
    }
}
