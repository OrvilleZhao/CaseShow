package com.orville.caseshow.service;

import com.orville.caseshow.service.exception.NlpException;

/**
 * @program:caseshow
 * @description:Nlp服务接口
 * @author:orville
 * @create:2019-02-26 09:14
 */
public interface NlptoolService {
    /**
     * 获取分词结果
     * @param content
     * @return
     * @throws NlpException
     */
    String getFenciRes(String content) throws NlpException;

    /**
     * 进行词频统计
     * @param content
     * @return
     * @throws NlpException
     */
    String getWordFrequency(String content) throws NlpException;

    /**
     * 抽取关键词
     * @param content
     * @return
     * @throws NlpException
     */
    String getKeyWordsRes(String content) throws NlpException;

    /**
     * 实体抽取
     * @param content
     * @return
     * @throws NlpException
     */
    String getEntityExtraction(String content) throws NlpException;

    /**
     * 新词发现
     * @param content
     * @return
     * @throws NlpException
     */
    String getNewwordRes(String content) throws NlpException;

    /**
     * 自动文摘
     * @param content
     * @return
     * @throws NlpException
     */
    String getAutoSummarization(String content) throws NlpException;
}
