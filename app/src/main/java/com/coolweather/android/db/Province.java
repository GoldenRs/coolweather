package com.coolweather.android.db;


import org.litepal.crud.DataSupport;

/**
 * id记录省的编号
 * provinceName记录省的名字
 * provinceCOde记录省的代号
 */
public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCOde;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCOde() {
        return provinceCOde;
    }

    public void setProvinceCOde(int provinceCOde) {
        this.provinceCOde = provinceCOde;
    }
}
