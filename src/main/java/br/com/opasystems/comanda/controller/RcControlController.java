package br.com.opasystems.comanda.controller;

import br.com.opasystems.comanda.domain.RcControl;
import br.com.opasystems.comanda.exception.ValidationException;
import br.com.opasystems.comanda.service.RcControlService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;


@RestController
@RequestMapping("/control")
public class RcControlController {

    private static final Logger log = LoggerFactory.getLogger(RcControlController.class);

    @Autowired
    private RcControlService rcControlService;

    @PostMapping
    public String register(@RequestBody RcControl control) throws ValidationException {

            rcControlService.register(control);
            return "Dispositivo RC registrado com sucesso";

    }
    @DeleteMapping
    public String remove(@RequestBody RcControl control){
            rcControlService.remove(control);
            return "Dispositivo RC removido com sucesso";
    }
    @GetMapping
    public List<RcControl> list(){
        return rcControlService.list();
    }
}
