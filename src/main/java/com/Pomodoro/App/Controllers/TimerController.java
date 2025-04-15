package com.Pomodoro.App.Controllers;

import com.Pomodoro.App.Models.Dtos.CycleInfo;
import com.Pomodoro.App.Models.StudyCycleModel;
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
        StudyCycleModel studyCycle = new StudyCycleModel(cycleInfo);

            if (studyCycle.SaveCycleBD( studyCycle ))
            {
                System.out.println("dados salvos");
                return "Nice";
            }
            else
            {
                System.out.println("erro ao salvar");
                return "erro";
            }
    }



        //nao faz sentido remover um ciclo de estudo.
    //timer controller tambem nao deve recuperar os ciclos de estudo
}
