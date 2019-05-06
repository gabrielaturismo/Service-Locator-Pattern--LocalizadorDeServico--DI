package service.locator.pattern;

import java.util.ArrayList;
import java.util.List;

    //Lista

public class Cache {
    private List<ServicoMensagem> servicos;

    public Cache(){
        servicos = new ArrayList<ServicoMensagem>();
    }

    public ServicoMensagem getServico(String serviceName){
        
        for (ServicoMensagem servico : servicos) {
            if(servico.getNomeServico().equalsIgnoreCase(serviceName)){
                System.out.println("Objeto  " + serviceName + " em cache");
                return servico;
            }
        }
        return null;
    }

    public void addServico(ServicoMensagem novoService){
        boolean exists = false;

        for (ServicoMensagem servico : servicos) {
            if(servico.getNomeServico().equalsIgnoreCase(novoService.getNomeServico())){
                exists = true;
            }
        }
        if(!exists){
            servicos.add(novoService);
        }
    }
            
            
}
