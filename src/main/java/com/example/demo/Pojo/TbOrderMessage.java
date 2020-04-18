package com.example.demo.Pojo;


public class TbOrderMessage {

  private String id;
  private String exchangeName;
  private String routingKey;
  private String messageBody;
  private long retryCount;
  private java.sql.Timestamp messageTime;
  private long state;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getExchangeName() {
    return exchangeName;
  }

  public void setExchangeName(String exchangeName) {
    this.exchangeName = exchangeName;
  }


  public String getRoutingKey() {
    return routingKey;
  }

  public void setRoutingKey(String routingKey) {
    this.routingKey = routingKey;
  }


  public String getMessageBody() {
    return messageBody;
  }

  public void setMessageBody(String messageBody) {
    this.messageBody = messageBody;
  }


  public long getRetryCount() {
    return retryCount;
  }

  public void setRetryCount(long retryCount) {
    this.retryCount = retryCount;
  }


  public java.sql.Timestamp getMessageTime() {
    return messageTime;
  }

  public void setMessageTime(java.sql.Timestamp messageTime) {
    this.messageTime = messageTime;
  }


  public long getState() {
    return state;
  }

  public void setState(long state) {
    this.state = state;
  }

}
