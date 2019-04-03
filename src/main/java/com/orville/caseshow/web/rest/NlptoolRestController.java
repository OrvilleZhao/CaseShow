package com.orville.caseshow.web.rest;

import com.orville.caseshow.service.NlptoolService;
import com.orville.caseshow.service.exception.NlpException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program:caseshow
 * @description:nlp工具rest控制器
 * @author:orville
 * @create:2019-02-26 09:06
 */
@RestController
@RequestMapping("/nlptool")
public class NlptoolRestController {

    @Autowired
    NlptoolService nlptoolService;

    @RequestMapping(value = "/get_fenci",method = RequestMethod.POST)
    @ResponseBody
    public String getFenciRes(@RequestParam("content") String content){
        String result = "";
        try {
            result = nlptoolService.getFenciRes(content);
        } catch (NlpException e) {
            e.printStackTrace();
        }
        return result;
    }

    @RequestMapping(value = "/get_keywords",method = RequestMethod.POST)
    @ResponseBody
    public String getKeywordsRes(@RequestParam("content")String content){
        String result = "";
        try {
            result = nlptoolService.getKeyWordsRes(content);
        }catch (NlpException e){
            e.printStackTrace();
        }
        return result;
    }

    @RequestMapping(value = "/get_newwords",method = RequestMethod.POST)
    @ResponseBody
    public String getNewwordsRes(@RequestParam("content")String content){
        String result = "";
        try {
            result = nlptoolService.getNewwordRes(content);
            if(result.equals("")){
                result = "无新词";
            }
        }catch (NlpException e){
            e.printStackTrace();
        }
        return result;
    }

    @RequestMapping(value="/get_entityextraction")
    @ResponseBody
    public String getEntityExtraction(@RequestParam("content")String content){
        String result = "";
        try {
            result = nlptoolService.getEntityExtraction(content);
            if(result.equals("")){
                result = "无实体";
            }
        }catch(NlpException e){
            e.printStackTrace();
        }
        return result;
    }
}
