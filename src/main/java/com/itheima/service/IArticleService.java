package com.itheima.service;

import com.github.pagehelper.PageInfo;
import com.itheima.model.domain.Article;

import java.util.List;

/**
 * @Classname IArticleService
 * @Description TODO
 * @Date 2019-3-14 9:46
 * @Created by CrazyStone
 */

public interface IArticleService {
    // 分页查询文章列表
    public PageInfo<Article> selectArticleWithPage(Integer page, Integer count);

    // 统计前10的热度文章信息
    public List<Article> getHeatArticles();

}

