package com.Pomodoro.App.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class RankingController
{
    @GetMapping("/Ranking")
    public String RankingPage()
    {
        return "Ranking";
    }






    @ResponseBody
    @PostMapping("/searchAll")
    public String SearchAll()
    {
        //atualize uma parte da pagina sem altera os demais.
        return "0";
    }
}
