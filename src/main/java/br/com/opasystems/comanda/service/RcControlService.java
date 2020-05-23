package br.com.opasystems.comanda.service;

import br.com.opasystems.comanda.domain.RcControl;
import br.com.opasystems.comanda.exception.ValidationException;
import br.com.opasystems.comanda.repository.RcControlRepository;
import org.springframework.data.domain.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

@Service
public class RcControlService {

    @Autowired
    private RcControlRepository repository;

    public void register(RcControl control) {
        Assert.notNull(control, "Parâmetro obrigatório não informado: control");
        System.out.println("Registrando controle código: "+control.getCode());

        if(repository.exists(Example.of(control))  ){
            throw new ValidationException("ALREADY_REGISTERED", "Dispositivo já existe na base de dados");
        }
        repository.save(control);
    }
    public void remove(RcControl control){
        Assert.notNull(control, "Parâmetro obrigatório não informado: control");
        System.out.println("Removendo controle código: "+control.getCode());
        if(!repository.exists(Example.of(control))  ){
            throw new ValidationException("NOT_FOUND", "Dispositivo não existe na base de dados");
        }
        repository.delete(control);
    }
    public List<RcControl> list(){
        return repository.findAll();
    }
}
