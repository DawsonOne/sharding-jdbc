package com.wudi.shardingjdbc.dao;
;

import com.wudi.shardingjdbc.entity.OtherTable;

import java.util.List;

/**
 * 类功能简述：
 * 类功能详述：
 *
 * @author fanxb
 * @date 2019/3/22 16:25
 */
public interface OtherTableDao {

    /**
     * Description:
     *
     * @author fanxb
     * @date 2019/3/26 10:16
     * @param table table
     * @return long
     */
    long addOne(OtherTable table);

    /**
     * Description:
     *
     * @author fanxb
     * @date 2019/3/26 16:31
     * @return java.util.List<com.fanxb.sjdemo.entity.OtherTable>
     */
    List<OtherTable> getAll();


}
