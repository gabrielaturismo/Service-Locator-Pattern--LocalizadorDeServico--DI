package service.locator.pattern;
public class ContextoInicial {
    
    // Pesquisa
    
    public Object pesquisa(String nomeServico){
        if(nomeServico.equalsIgnoreCase("ServicoEmail")){
            return new ServicoEmail();
        }
        else if(nomeServico.equalsIgnoreCase("ServicoSMS")){
            return new ServicoSMS();
        }
    return null;    
    }
}