package service.locator.pattern;
public class ServiceLocatorPattern {
    public static void main(String[] args) {
       
        ServicoMensagem servico = LocalizadorDeServico.getServico("ServicoEmail");
        String email = servico.getCorpoMensagem();
        System.out.println(email);
        
        ServicoMensagem msmServico = LocalizadorDeServico.getServico("ServicoSMS");
        String msm = msmServico.getCorpoMensagem();
        System.out.println(msm);
        
        ServicoMensagem emailServico = LocalizadorDeServico.getServico("ServicoEmail");
        String newEmail = emailServico.getCorpoMensagem(); 
        System.out.println(newEmail);
    }
    
}
