package com.orville.caseshow.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @program:Graduate
 * @description:案例检索控制器
 * @author:orville
 * @create:2019-02-22 10:16
 */
@Controller
public class SearchController {
    @RequestMapping("/search")
    public String index(ModelMap map) {
        return "search";
    }
}
