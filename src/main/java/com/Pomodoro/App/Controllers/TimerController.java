package com.Pomodoro.App.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping()
@RestController
public class TimerController
{
//Para nao esquecer: postmapping significa que estou aguardando receber os dados enviados via post
    //devo ter uma rota valida para isso.
    @PostMapping("/NewCycle")
    public void saveStudyCycle()
    {

    }

    //para nao esquecer: estou indo pegar os dados.
    @GetMapping("/RecoveryCycle")
    public void recoveryStudyCycle()
    {

    }

    @PostMapping("/RemoveCycle")
    public void removeStudyCycle()
    {

    }
}
