package com.spring.mvc.controller;

import com.spring.mvc.service.LottoService;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/lotto")
public class Lotto {
    @Autowired
    private LottoService lottoService;
    
    
    //http://localhost:8080/SpringMVC1102/mvc/lotto/get
    @RequestMapping("/get")
    public String get(Model model){
        Set<Integer> lotto = lottoService.getLotto();
        model.addAttribute("lotto",lotto);
        return "lotto_page";
    }
}
