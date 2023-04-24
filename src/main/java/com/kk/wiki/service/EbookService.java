package com.kk.wiki.service;

import com.kk.wiki.domain.Ebook;
import com.kk.wiki.domain.EbookExample;
import com.kk.wiki.mapper.EbookMapper;
import com.kk.wiki.req.EbookReq;
import com.kk.wiki.resp.EbookResp;
import com.kk.wiki.util.CopyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class EbookService {
    @Resource
    private EbookMapper ebookMapper;

    public List<EbookResp> list(EbookReq req) {
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%" + req.getName() + "%");
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);
        return CopyUtil.copyList(ebookList, EbookResp.class);
    }
}
