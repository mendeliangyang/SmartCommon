/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smart.common.model;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.LinkedHashMap;

/**
 *
 * @author Administrator
 */
public class ReviveRSParamModel {

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getRsid() {
        return rsid;
    }

    public void setRsid(String rsid) {
        this.rsid = rsid;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public String getDb_tableName() {
        return db_tableName;
    }

    public void setDb_tableName(String db_tableName) {
        this.db_tableName = db_tableName;
    }

    public String getPkValue() {
        return pkValue;
    }

    public void setPkValue(String pkValue) {
        this.pkValue = pkValue;
    }

    public Map<String, String> getPkValues() {
        return pkValues;
    }

    public void setPkValues(Map<String, String> pkValues) {
        this.pkValues = pkValues;
    }

    public String getFileColumn() {
        return fileColumn;
    }

    public void setFileColumn(String fileColumn) {
        this.fileColumn = fileColumn;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public short getDb_pageSize() {
        return db_pageSize;
    }

    public void setDb_pageSize(short db_pageSize) {
        this.db_pageSize = db_pageSize;
    }

    public int getDb_pageNum() {
        return db_pageNum;
    }

    public void setDb_pageNum(int db_pageNum) {
        this.db_pageNum = db_pageNum;
    }

    public int getDb_skipNum() {
        return db_skipNum;
    }

    public void setDb_skipNum(int db_skipNum) {
        this.db_skipNum = db_skipNum;
    }

    public short getDb_topNum() {
        return db_topNum;
    }

    public void setDb_topNum(short db_topNum) {
        this.db_topNum = db_topNum;
    }

    public String getDb_orderBy() {
        return db_orderBy;
    }

    public void setDb_orderBy(String db_orderBy) {
        this.db_orderBy = db_orderBy;
    }

    public Set<String> getDb_columns() {
        return db_columns;
    }

    public void setDb_columns(Set<String> db_columns) {
        this.db_columns = db_columns;
    }

    public Set<String> getDb_RULcolumns() {
        return db_RULcolumns;
    }

    public void setDb_RULcolumns(Set<String> db_RULcolumns) {
        this.db_RULcolumns = db_RULcolumns;
    }

    public Map<String, String> getDb_valueColumns() {
        return db_valueColumns;
    }

    public void setDb_valueColumns(Map<String, String> db_valueColumns) {
        this.db_valueColumns = db_valueColumns;
    }

    public Map<String, String> getDb_valueFilter() {
        return db_valueFilter;
    }

    public void setDb_valueFilter(Map<String, String> db_valueFilter) {
        this.db_valueFilter = db_valueFilter;
    }

    public String getTreeNId() {
        return treeNId;
    }

    public void setTreeNId(String treeNId) {
        this.treeNId = treeNId;
    }

    public String getTreeNUpColumn() {
        return treeNUpColumn;
    }

    public void setTreeNUpColumn(String treeNUpColumn) {
        this.treeNUpColumn = treeNUpColumn;
    }

    public String getTreeNUpId() {
        return treeNUpId;
    }

    public void setTreeNUpId(String treeNUpId) {
        this.treeNUpId = treeNUpId;
    }

    public String getTreeNColumn() {
        return treeNColumn;
    }

    public void setTreeNColumn(String treeNColumn) {
        this.treeNColumn = treeNColumn;
    }

    public List<ReviveRSParamDBLeftLinkModel> getDb_leftLink() {
        return db_leftLink;
    }

    public void setDb_leftLink(List<ReviveRSParamDBLeftLinkModel> db_leftLink) {
        this.db_leftLink = db_leftLink;
    }

    public String token;//登录凭证

    public String rsid; //rsid
    public String handle; //base64 或者上传，指定 数据 insert，或者update
    public String db_tableName; //需要操作的表名称

    public String pkValue; //查询，删除，修改，删除 如果使用pkValue
    public Map<String, String> pkValues;// 如果是多列，使用 pkValues替代

    public String fileColumn; //base64，或者上传文件指定保存文件的列名称

    public String sql; //查询，sql条件

    public short db_pageSize = -1; //查询，传入分页大小 与db_pageNum一起使用

    public int db_pageNum = -1;//查询，分页页码 与db_pageSize一起使用

    public int db_skipNum = -1; //查询，跳过多少条数据查询 与db_topNum一起使用

    public short db_topNum = -1; //查询，查询多少条数据 与db_skipNum一起使用

    public String db_orderBy; //查询，需要指定的排序

    public Set<String> db_columns;//查询是需要用指定查询的columns

    public Set<String> db_RULcolumns;//查询是需要用指定查询的RULcolumns

    public Map<String, String> db_valueColumns;//添加，指定列名称和值  ，修改，指定修改的列和值

    public Map<String, String> db_valueFilter;//修改，安装列值来修改数据，删除，安装列值来删除数据
    
    public String treeNId;// 树形数据的树形节点编号
    
    public String treeNUpColumn;//树形节点数据父节点名称
    
    public String treeNUpId;//树形节点数据父节点编号
    
    public String treeNColumn;//树形节点编号列名称
    
    public List<ReviveRSParamDBLeftLinkModel> db_leftLink;// 关联从表集合

    public LinkedHashMap<String, String> db_exportColumns; // 导出excel

    public String getInformation() {
        StringBuffer sb = new StringBuffer();

        sb.append(String.format("ReviveRSParamModel:  db_tableName :'%s'", db_tableName)).append("\t");
        sb.append(String.format("token :'%s'",token)).append("\t");
        sb.append(String.format("rsid :'%s'", rsid)).append("\t");
        sb.append(String.format("sql :'%s'", sql)).append("\t");
        sb.append(String.format("db_orderBy:'%s'",db_orderBy)).append("\t");
        sb.append(String.format("pkValue :'%s'", pkValue)).append("\t");
        
        if (pkValues != null) {
            sb.append(String.format("pkValues size:'%d'", pkValues.size()));
            for (String keySet : pkValues.keySet()) {
                sb.append(String.format("pkValues key:'%s',value:'%s'", keySet, pkValues.get(keySet)));
            }
            sb.append("\t");
        } else {
            sb.append("pkValues is null \t");
        }
        if (db_columns != null) {
            sb.append(String.format("db_columns size :'%s'", db_columns.size()));
            for (String db_column : db_columns) {
                sb.append(String.format("%s", db_column));
            }
            sb.append("\t");
        } else {
            sb.append("db_columns is null \t");
        }

        if (db_valueColumns != null) {
            sb.append(String.format("db_valueColumns size :'%d'", db_valueColumns.size()));
            for (String keySet : db_valueColumns.keySet()) {
                sb.append(String.format("db_valueColumns key:'%s',value:'%s'", keySet, db_valueColumns.get(keySet)));
            }
            sb.append("\t");
        } else {
            sb.append("db_valueColumns is null \t");
        }
        if (db_valueFilter != null) {
            sb.append(String.format("db_valueFilter size :'%d'", db_valueFilter.size()));
            for (String keySet : db_valueFilter.keySet()) {
                sb.append(String.format("db_valueFilter key:'%s',value:'%s'", keySet, db_valueFilter.get(keySet)));
            }
            sb.append("\t");
        } else {
            sb.append("db_valueFilter is null \t");
        }

        if (db_RULcolumns != null) {
            sb.append(String.format("db_RULcolumns size :'%s'", db_RULcolumns.size()));
            sb.append("\t");
        } else {
            sb.append("db_RULcolumns is null \t");
        }
        sb.append(String.format("handle :'%s'", handle));
        sb.append("\t");
        return sb.toString();
    }

    public void destroySelf() {
        this.db_RULcolumns = null;
        this.db_columns = null;
        this.db_orderBy = null;
        this.db_tableName = null;
        this.db_valueColumns = null;
        this.db_valueFilter = null;
        this.fileColumn = null;
        this.handle = null;
        this.pkValue = null;
        this.rsid = null;
        this.sql = null;
        this.pkValues = null;
    }

}
