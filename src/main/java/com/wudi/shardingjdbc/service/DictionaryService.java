package com.wudi.shardingjdbc.service;

import com.wudi.shardingjdbc.dao.DictionaryDao;
import com.wudi.shardingjdbc.entity.Dictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 类功能简述：
 * 类功能详述：
 *
 * @author fanxb
 * @date 2019/3/26 10:17
 */
@Service
public class DictionaryService {

    @Autowired
    private DictionaryDao dictionaryDao;

    public long addOne(Dictionary dictionary) {
        this.dictionaryDao.addOne(dictionary);
        return dictionary.getDictionaryId();
    }
}
