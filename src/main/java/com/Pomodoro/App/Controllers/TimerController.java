package com.Pomodoro.App.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping()
@Controller
public class TimerController
{
//Para nao esquecer: postmapping significa que estou aguardando receber os dados enviados via post
    //devo ter uma rota valida para isso.


    @GetMapping("/Home")
    public String home()
    {
        return "TimerPage";
    }

    @PostMapping("/NewCycle")
    public void saveStudyCycle()
    {

    }

    //para nao esquecer: estou indo pegar os dados.
    @GetMapping("/RecoveryCycle")
    public String recoveryStudyCycle()
    {
    return null;
    }

    @PostMapping("/RemoveCycle")
    public void removeStudyCycle()
    {

    }
}
