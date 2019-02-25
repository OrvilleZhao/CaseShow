package com.orville.caseshow.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program:Graduate
 * @description:nlp工具控制器
 * @author:orville
 * @create:2019-02-22 11:17
 */
@Controller
public class NlptoolController {
    @RequestMapping("/nlptool")
    public String index(ModelMap map) {
        return "nlptool";
    }
}
