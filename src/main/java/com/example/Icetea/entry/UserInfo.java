package com.example.Icetea.entry;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class UserInfo {
  /**
   * 主键id
   */
  private String id;

  /**
   * 姓名
   */
  private String name;

  /**
   * 性别
   */
  private String sex;

  /**
   * 年龄
   */
  private int age;

  /**
   * 出生日期
   */
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(pattern = "yyyy-MM-dd")
  private Date birthday;

  /**
   * 电话
   */
  private String phone;

  /**
   * 邮箱
   */
  private String eMail;

  /**
   * 地址
   */
  private String address;

  /**
   * 身份证号
   */
  private String idCard;

  /**
   * 是否删除
   */
  private String isDelete;

  /**
   * 创建人
   */
  private String createUser;

  /**
   * 创建时间
   */
  private Date createTime;

  /**
   * 最后修改人
   */
  private String lastModifyUser;

  /**
   * 最后修改时间
   */
  private Date lastModifyTime;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getEMail() {
    return eMail;
  }

  public void setEMail(String eMail) {
    this.eMail = eMail;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public String getIdCard() {
    return idCard;
  }

  public void setIdCard(String idCard) {
    this.idCard = idCard;
  }


  public String getIsDelete() {
    return isDelete;
  }

  public void setIsDelete(String isDelete) {
    this.isDelete = isDelete;
  }


  public String getCreateUser() {
    return createUser;
  }

  public void setCreateUser(String createUser) {
    this.createUser = createUser;
  }


  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public String getLastModifyUser() {
    return lastModifyUser;
  }

  public void setLastModifyUser(String lastModifyUser) {
    this.lastModifyUser = lastModifyUser;
  }

  public Date getLastModifyTime() {
    return lastModifyTime;
  }

  public void setLastModifyTime(Date lastModifyTime) {
    this.lastModifyTime = lastModifyTime;
  }
}
