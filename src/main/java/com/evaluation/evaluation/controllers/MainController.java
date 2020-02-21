package com.evaluation.evaluation.controllers;

import com.evaluation.evaluation.utils.Consultar;
import com.evaluation.evaluation.utils.FileWR;
import com.evaluation.evaluation.utils.UrlConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Controller
@RequestMapping(UrlConstants.INDEX)
public class MainController {

    public String goIndex(){
        return "index";
    }



}
