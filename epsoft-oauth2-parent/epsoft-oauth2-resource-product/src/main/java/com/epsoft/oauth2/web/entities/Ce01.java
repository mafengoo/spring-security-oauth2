package com.epsoft.oauth2.web.entities;

import lombok.Data;

import java.io.Serializable;

@Data
public class Ce01 implements Serializable {

    private String eec001;          //劳动者个人内码(编码规则:uuid)
    private String eac011;          //劳动者个人编码(编码规则:大写字母c+日期时间到秒14位+6位随机数字码)
    private String aac001;          //内网劳动者个人编码
    private String aac002;          //公民身份号码
    private String aac003;          //姓名
    private String aac024;          //政治面貌代码
    private String aac004;          //性别代码
    private String aac005;          //民族代码
    private String aac006;          //出生日期
    private String aac009;          //户籍类别代码
    private String eec357;          //户籍所属行政区划代码
    private String aac010;          //户籍地址
    private String eec358;          //居住地所属行政区划代码
    private String eec103;          //工作年限代码
    private String aac011;          //学历代码
    private String aac183;          //专业代码
    private String eec360;          //计算机等级代码
    private String aac016;          //国家职业资格代码
    private String aac015;          //国家职业资格等级代码
    private String aac017;          //婚姻状况代码
    private String aac033;          //健康状况代码
    private String aae005;          //联系电话
    private String aac026;          //联系地址
    private String aae015;          //电子邮箱
    private String aae013;          //备注
    private String bus_uuid;        //业务文件记录内码(链接个人头像文件)
    private String aae011;          //外网账户内码
    private String aae012;          //内网账户内码
    private String ecc064;          //创建日期
    private String aae036;          //经办时间
    private String eae052;          //审核标志代码
    private String aae100;          //有效标志代码
    private String aab025;          //审核原因
    private String aac027;          //人员类型代码
    private String eec027;          //毕业时间
    private String eec026;          //学校名称
    private String aac012;          //人员类型
    private String aac115;          //职业技能情况
    private String aac099;          //证件类型
    private String bus_uuid2;       //业务文件记录内码(链接个人视频文件)
    private String auth;            //是否实名认证0 否 1是
    private String idtype;          //证件类型
    private String idnumber;        //证件号码


}