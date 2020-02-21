package com.evaluation.evaluation.controllers;

import com.evaluation.evaluation.utils.Consultar;
import com.evaluation.evaluation.utils.FileWR;
import com.evaluation.evaluation.utils.UrlConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Controller
@RequestMapping(UrlConstants.USERS)
public class UsersController {

    @GetMapping("")
    public String goUsers(){

        int i=0;
        Runnable[]r = new Runnable[10];
        r[i++] = new FileWR();
        r[i++] = new FileWR();
        r[i++] = new Consultar();
        r[i++] = new FileWR();
        r[i++] = new FileWR();
        r[i++] = new Consultar();
        r[i++] = new FileWR();
        r[i++] = new FileWR();
        r[i++] = new Consultar();

        return "users";
    }
}
