package com.songjing.oasys.staff.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;


/**
 * 部门表(Depart)表实体类
 *
 * @author songjing
 * @since 2021-01-26 16:06:46
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@TableName("depart")
public class Depart implements Serializable {

    /**
     * 部门编号
     */
    @TableField("DEPT_ID")
    private Integer deptId;

    /**
     * 部门名称
     */
    @TableField("DEPT_NAME")
    private String deptName;

    /**
     * 部门经理
     */
    @TableField("DEPT_MGR")
    private String deptMgr;

    /**
     * 部门员工人数
     */
    @TableField("DEPT_STAFF_COUNT")
    private Integer deptStaffCount;

    /**
     * 允许员工人数上限
     */
    @TableField("DEPT_STAFF_MAX")
    private Integer deptStaffMax;
}