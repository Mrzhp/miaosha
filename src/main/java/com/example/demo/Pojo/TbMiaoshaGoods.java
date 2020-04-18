package com.example.demo.Pojo;


public class TbMiaoshaGoods {

  private String id;
  private String goodsId;
  private double miaoshaPrice;
  private long stock;
  private java.sql.Timestamp startTime;
  private java.sql.Timestamp endTime;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(String goodsId) {
    this.goodsId = goodsId;
  }


  public double getMiaoshaPrice() {
    return miaoshaPrice;
  }

  public void setMiaoshaPrice(double miaoshaPrice) {
    this.miaoshaPrice = miaoshaPrice;
  }


  public long getStock() {
    return stock;
  }

  public void setStock(long stock) {
    this.stock = stock;
  }


  public java.sql.Timestamp getStartTime() {
    return startTime;
  }

  public void setStartTime(java.sql.Timestamp startTime) {
    this.startTime = startTime;
  }


  public java.sql.Timestamp getEndTime() {
    return endTime;
  }

  public void setEndTime(java.sql.Timestamp endTime) {
    this.endTime = endTime;
  }

}
