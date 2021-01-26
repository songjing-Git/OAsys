package com.songjing.oasys.staff.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;


/**
 * (User)表实体类
 *
 * @author songjing
 * @since 2021-01-26 17:08:07
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@TableName("user")
public class User implements Serializable {

    /**
     * 员工编号
     */
    @TableField("STAFF_ID")
    private Integer staffId;

    /**
     * 名称
     */
    @TableField("STAFF_NAME")
    private String staffName;

    /**
     * 用户头像
     */
    @TableField("HEAD_PHOTO")
    private byte[] headPhoto;

    /**
     * OA登录账号
     */
    @TableField("USER_NAME")
    private String userName;

    /**
     * OA账号密码
     */
    @TableField("PASSWORD")
    private String password;

    /**
     * 性别
     */
    @TableField("GENDER")
    private Integer gender;

    /**
     * 生日
     */
    @TableField("BIRTHDAY")
    private Date birthday;

    /**
     * 身份证
     */
    @TableField("ID_CARD")
    private Long idCard;

    /**
     * 婚姻状况  0-未婚，1-已婚，2-离异，3-丧偶
     */
    @TableField("WEDLOCK")
    private Integer wedlock;

    /**
     * 民族
     */
    @TableField("NATION")
    private String nation;

    /**
     * 籍贯
     */
    @TableField("NATIVE_PLACE")
    private Integer nativePlace;

    /**
     * 政治面貌
     */
    @TableField("POLITIC_ID")
    private Integer politicId;

    /**
     * 邮箱
     */
    @TableField("EMAIL")
    private String email;

    /**
     * 电话号码
     */
    @TableField("PHONE")
    private Long phone;

    /**
     * 联系地址
     */
    @TableField("ADDRESS")
    private String address;

    /**
     * 所属部门
     */
    @TableField("DEPT_ID")
    private Integer deptId;

    /**
     * 职位等级
     */
    @TableField("JOB_LEVEL_ID")
    private Integer jobLevelId;

    /**
     * 工龄
     */
    @TableField("WORK_AGE")
    private Integer workAge;

    /**
     * 薪资
     */
    @TableField("salary_id")
    private Integer salaryId;

    /**
     * 最高学历
     */
    @TableField("TIP_TOP_DEGREE")
    private String tipTopDegree;

    /**
     * 所属专业
     */
    @TableField("SPECIALTY")
    private String specialty;

    /**
     * 毕业院校
     */
    @TableField("SCHOOL")
    private String school;

    /**
     * 入职日期
     */
    @TableField("BEGIN_DATE")
    private Date beginDate;

    /**
     * 在职状态 0-离职， 1在职
     */
    @TableField("WORK_STATE")
    private Integer workState;

    /**
     * 合同起始日期
     */
    @TableField("BEGIN_CONTRACT")
    private Date beginContract;

    /**
     * 合同终止日期
     */
    @TableField("END_CONTRACT")
    private Date endContract;
}