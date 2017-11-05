package com.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户类
* 类描述:
* @author zh
* @date 2017年11月5日 下午5:38:42
 */
public class Customer implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String custId;			//客户id
	private String custName;		//姓名
	private String passWord;		//密码
	private String gender;			//性别
	private String orgId;			//所属机构id
	private String phone;			//电话号码
	private String IDNumber;		//身份证号
	private String province;		//所属省份
	private String city;			//所在城市
	private String area;			//所在具体区域
	private Date birthday;			//生日
	private String desc;			//描述
	private Date createTime;		//创建时间
	
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getIDNumber() {
		return IDNumber;
	}
	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
