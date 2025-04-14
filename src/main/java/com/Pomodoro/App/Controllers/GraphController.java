package com.Pomodoro.App.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class GraphController
{
    @GetMapping("/Graph")
    public String GraphPage ()
    {
        return "Graph";
    }
}
