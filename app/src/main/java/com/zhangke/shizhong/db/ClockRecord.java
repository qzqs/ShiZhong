package com.zhangke.shizhong.db;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by ZhangKe on 2018/7/17.
 */
@Entity
public class ClockRecord {

    @Id(autoincrement = true)
    private Long id;
    private Long parentPlanId;
    private String name;
    /**
     * 日期
     */
    private String date;
    /**
     * 备注
     */
    private String description;
    @Generated(hash = 2013652895)
    public ClockRecord(Long id, Long parentPlanId, String name, String date,
            String description) {
        this.id = id;
        this.parentPlanId = parentPlanId;
        this.name = name;
        this.date = date;
        this.description = description;
    }
    @Generated(hash = 675671732)
    public ClockRecord() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getParentPlanId() {
        return this.parentPlanId;
    }
    public void setParentPlanId(Long parentPlanId) {
        this.parentPlanId = parentPlanId;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDate() {
        return this.date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
