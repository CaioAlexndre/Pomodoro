package com.Pomodoro.App.Controllers;

import com.Pomodoro.App.Models.Dtos.CategoryInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class CategoryController
{
    @PostMapping("/SaveCategory")
    @ResponseBody
    public String SaveCategory(@ModelAttribute CategoryInfo categoryInfo)
    {
        System.out.println(categoryInfo.getCategoryname());
        return categoryInfo.getCategoryname();
    }

}
