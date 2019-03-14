package com.chen.chenbootstraplayout.controller;

import com.chen.chenbootstraplayout.model.ChenMenu;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/")
    public String index(Model model){
        ChenMenu chenMenu = new ChenMenu();
        chenMenu.setMenuName("陈菜单自动生成");
        chenMenu.setMenuUrl("/testcaidan/caidan1");
        model.addAttribute("chenMenu", chenMenu);
        return "/indexmain";
    }

    @RequestMapping("/chen")
    public String chen(){
        return "/test2";
    }

    @RequestMapping("/testcaidan/chenmain")
    public String chenmain(){
        return "/testcaidan/chenmain";
    }

    @RequestMapping("/testcaidan/caidan1")
    public String chencaidan1(){
        return "/testcaidan/caidan1";
    }

    @RequestMapping("/testcaidan/caidan2")
    public String chencaidan2(){
        return "/testcaidan/caidan2";
    }

    @RequestMapping("/testcaidan/caidan3")
    public String chencaidan3(){
        return "/testcaidan/caidan3";
    }

    @RequestMapping("/testcaidan/chendataout")
    public String chencaidandataout(){
        return "/testcaidan/chendataout";
    }

    @RequestMapping("/testcaidan/chendatatable")
    public String chencaidandatatable(){
        return "/testcaidan/chendatatable";
    }
}
