package service.locator.pattern;
public class LocalizadorDeServico {
    private static Cache cache = new Cache();
    
    //  verificará o cache
    // se nullo adicionará novo objeto ao cache
    
    public static ServicoMensagem getServico(String nomeServico){
        ServicoMensagem servico = cache.getServico(nomeServico);
        
        if(servico != null){
            return servico;
        }
        
        ContextoInicial inicio = new ContextoInicial();
        ServicoMensagem primeiroServico = (ServicoMensagem) inicio.pesquisa(nomeServico);
        cache.addServico(primeiroServico);
        return primeiroServico;

    }
}
