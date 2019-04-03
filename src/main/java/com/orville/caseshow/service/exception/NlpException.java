package com.orville.caseshow.service.exception;

import com.orville.caseshow.service.nlpir.NlpirLib;

/**
 * @program:caseshow
 * @description:nlp异常类
 * @author:orville
 * @create:2019-02-26 09:17
 */
public class NlpException extends Exception{
    public NlpException(String msg){
        super(msg);
    }
}
