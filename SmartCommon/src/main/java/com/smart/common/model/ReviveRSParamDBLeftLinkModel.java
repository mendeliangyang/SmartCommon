/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smart.common.model;

import java.util.List;

/**
 *
 * @author Administrator
 */
public class ReviveRSParamDBLeftLinkModel {

    public String getDbll_tableName() {
        return dbll_tableName;
    }

    public void setDbll_tableName(String dbll_tableName) {
        this.dbll_tableName = dbll_tableName;
    }

    public String getDbll_sourceCol() {
        return dbll_sourceCol;
    }

    public void setDbll_sourceCol(String dbll_sourceCol) {
        this.dbll_sourceCol = dbll_sourceCol;
    }

    public String getDbll_linkCol() {
        return dbll_linkCol;
    }

    public void setDbll_linkCol(String dbll_linkCol) {
        this.dbll_linkCol = dbll_linkCol;
    }

    public List<String> getDbll_linkSeekCol() {
        return dbll_linkSeekCol;
    }

    public void setDbll_linkSeekCol(List<String> dbll_linkSeekCol) {
        this.dbll_linkSeekCol = dbll_linkSeekCol;
    }

    public String dbll_tableName; //关联的表名
    public String dbll_sourceCol; //关联主表的列明
    public String dbll_linkCol;//关联从表的列明
    public List<String> dbll_linkSeekCol;//查询从表的列明

}
