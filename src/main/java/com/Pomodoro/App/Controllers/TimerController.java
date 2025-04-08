package com.Pomodoro.App.Controllers;

import com.Pomodoro.App.Models.Dtos.CycleInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


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

    @ResponseBody  //me retorna o conteudo e nao a pagina.
    @PostMapping("/NewCycle")
    public String  saveStudyCycle(@RequestBody CycleInfo cycleInfo)
    {

        System.out.println("Username: " + cycleInfo.getUsername());
        System.out.println("CycleId: " + cycleInfo.getCycleId());
        System.out.println("CycleConclusion: " + cycleInfo.isCycleConclusion());
        return "Dados recebidos com sucesso!";
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
