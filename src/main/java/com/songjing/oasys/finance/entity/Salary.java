package com.songjing.oasys.finance.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;


/**
 * (Salary)表实体类
 *
 * @author songjing
 * @since 2021-01-26 19:13:16
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@TableName("salary")
public class Salary implements Serializable {

    /**
     * 薪资编号
     */
    @TableField("salary_id")
    private Integer salaryId;

    /**
     * 基础薪资
     */
    @TableField("base_salary")
    private Integer baseSalary;

    /**
     * 岗位工资
     */
    @TableField("post_wage")
    private Integer postWage;

    /**
     * 绩效工资
     */
    @TableField("merit_pay")
    private Integer meritPay;

    /**
     * 应发薪资
     */
    @TableField("payable_salary")
    private Integer payableSalary;

    /**
     * 全勤奖
     */
    @TableField("full_prize")
    private Integer fullPrize;

    /**
     * 加班费
     */
    @TableField("overtime_pay")
    private Integer overtimePay;

    /**
     * 养老保险
     */
    @TableField("endowment_insurance")
    private Object endowmentInsurance;

    /**
     * 医疗保险
     */
    @TableField("medical_insurance")
    private Object medicalInsurance;

    /**
     * 失业保险
     */
    @TableField("unemp_insurance")
    private Object unempInsurance;

    /**
     * 工伤保险
     */
    @TableField("work_injury_insurance")
    private Object workInjuryInsurance;

    /**
     * 生育保险
     */
    @TableField("birth_insurance")
    private Object birthInsurance;

    /**
     * 住房公积金
     */
    @TableField("housing_provident_fund")
    private Object housingProvidentFund;

    /**
     * 公积金比例
     */
    @TableField("provident_fund_pp")
    private Object providentFundPp;

    /**
     * 个人所得税
     */
    @TableField("personal_income_tax")
    private Object personalIncomeTax;

    /**
     * 实发工资
     */
    @TableField("net_salary")
    private Object netSalary;

    /**
     * 备注
     */
    @TableField("remark")
    private String remark;
}