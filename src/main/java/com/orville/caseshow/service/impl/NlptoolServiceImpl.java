package com.orville.caseshow.service.impl;

import com.orville.caseshow.service.NlptoolService;
import com.orville.caseshow.service.exception.NlpException;
import com.orville.caseshow.service.nlpir.NlpirLib;
import com.orville.caseshow.service.nlpir.NlpirMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @program:caseshow
 * @description:nlp工具实现类
 * @author:orville
 * @create:2019-02-26 09:40
 */
@Service
public class NlptoolServiceImpl implements NlptoolService {

    private static Logger logger = LoggerFactory.getLogger(NlptoolServiceImpl.class);

    @Override
    public String getFenciRes(String content) throws NlpException {
        try {
          String result = NlpirMethod.NLPIR_ParagraphProcess(content, 1);
          return result.replaceAll(" ","\n");
        }catch(Exception ex){
            logger.info(ex.getMessage());
            throw new NlpException("分词功能异常");
        }
    }

    @Override
    public String getWordFrequency(String content) throws NlpException {
        return null;
    }

    @Override
    public String getKeyWordsRes(String content) throws NlpException {
        try {
            String result = NlpirMethod.NLPIR_GetKeyWords(content, 10, true);
            return result.replaceAll("#","\n");
        }catch(Exception ex){
            logger.info(ex.getMessage());
            throw new NlpException("关键词获取异常");
        }
    }

    @Override
    public String getEntityExtraction(String content) throws NlpException {
        try {
            String result = "";
            return result.replaceAll("#","\n");
        }catch (Exception ex){
            logger.info(ex.getMessage());
            throw new NlpException("实体获取异常");
        }
    }

    @Override
    public String getNewwordRes(String content) throws NlpException {
        try {
            String result = NlpirMethod.NLPIR_GetNewWords(content, 10, true);
            return result.replaceAll("#","\n");
        }catch (Exception ex){
            logger.info(ex.getMessage());
            throw new NlpException("新词获取异常");
        }
    }

    @Override
    public String getAutoSummarization(String content) throws NlpException {
        return null;
    }
}
