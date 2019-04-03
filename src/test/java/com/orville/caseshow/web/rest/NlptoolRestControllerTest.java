package com.orville.caseshow.web.rest;

import com.orville.caseshow.CaseshowApplication;
import com.orville.caseshow.service.NlptoolService;
import com.orville.caseshow.service.exception.NlpException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CaseshowApplication.class)
public class NlptoolRestControllerTest {

    @Autowired
    NlptoolService nlptoolService;

    @Test
    public void getFenciRes() {
        try {
            nlptoolService.getFenciRes("我是一个兵");
        } catch (NlpException e) {
            e.printStackTrace();
        }
    }
}