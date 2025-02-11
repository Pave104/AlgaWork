package com.example.algaworks.algaworks.controller;


import ch.qos.logback.core.model.Model;
import com.example.algaworks.algaworks.model.Convidado;
import com.example.algaworks.algaworks.repository.Convidados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class FestaController {


    @Autowired
   private  Convidados convites;

    public FestaController(Convidados convites) {
        this.convites = convites;
    }

    @GetMapping("/convidados")
    public ModelAndView listar(){

        ModelAndView   modelAndView =new ModelAndView("ListaConvidados") ;
String novo="Lista de Convidados";
           modelAndView.addObject("titulo",novo);

            modelAndView.addObject("convidados",convites.findAll());

            return  modelAndView;
    }



      /**
     * @param convidado 
     */
      @PostMapping("/convidados")
    public String  salvar(Convidado convidado ){

      this.convites.save(convidado);
       return "redirect:/convidados";
    }





}
