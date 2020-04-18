package com.example.demo.Pojo;


public class TbOrder {

  private String id;
  private String userId;
  private String goodsId;
  private String addressId;
  private String goodsName;
  private long goodsNum;
  private double goodPrice;
  private long state;
  private java.sql.Timestamp orderTime;
  private java.sql.Timestamp payTime;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public String getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(String goodsId) {
    this.goodsId = goodsId;
  }


  public String getAddressId() {
    return addressId;
  }

  public void setAddressId(String addressId) {
    this.addressId = addressId;
  }


  public String getGoodsName() {
    return goodsName;
  }

  public void setGoodsName(String goodsName) {
    this.goodsName = goodsName;
  }


  public long getGoodsNum() {
    return goodsNum;
  }

  public void setGoodsNum(long goodsNum) {
    this.goodsNum = goodsNum;
  }


  public double getGoodPrice() {
    return goodPrice;
  }

  public void setGoodPrice(double goodPrice) {
    this.goodPrice = goodPrice;
  }


  public long getState() {
    return state;
  }

  public void setState(long state) {
    this.state = state;
  }


  public java.sql.Timestamp getOrderTime() {
    return orderTime;
  }

  public void setOrderTime(java.sql.Timestamp orderTime) {
    this.orderTime = orderTime;
  }


  public java.sql.Timestamp getPayTime() {
    return payTime;
  }

  public void setPayTime(java.sql.Timestamp payTime) {
    this.payTime = payTime;
  }

}
