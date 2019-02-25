package com.orville.caseshow.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @program:Graduate
 * @description:首页控制器
 * @author:orville
 * @create:2019-02-22 10:02
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(ModelMap map) {
        return "index";
    }
}
