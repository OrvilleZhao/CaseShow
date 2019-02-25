package com.orville.caseshow.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program:Graduate
 * @description:关于控制器
 * @author:orville
 * @create:2019-02-22 11:27
 */
@Controller
public class AboutController {
    @RequestMapping("/about")
    public String index(ModelMap map) {
        return "about";
    }
}
