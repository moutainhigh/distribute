package com.example.shardingjdbcdemo.model;

import java.math.BigDecimal;

public class Order {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_1.order_id
     *
     * @mbg.generated Sat Sep 21 23:03:14 CST 2019
     */
    private Long orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_1.order_amount
     *
     * @mbg.generated Sat Sep 21 23:03:14 CST 2019
     */
    private BigDecimal orderAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_1.order_status
     *
     * @mbg.generated Sat Sep 21 23:03:14 CST 2019
     */
    private Integer orderStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_1.user_id
     *
     * @mbg.generated Sat Sep 21 23:03:14 CST 2019
     */
    private Integer userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_1.order_id
     *
     * @return the value of t_order_1.order_id
     *
     * @mbg.generated Sat Sep 21 23:03:14 CST 2019
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_1.order_id
     *
     * @param orderId the value for t_order_1.order_id
     *
     * @mbg.generated Sat Sep 21 23:03:14 CST 2019
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_1.order_amount
     *
     * @return the value of t_order_1.order_amount
     *
     * @mbg.generated Sat Sep 21 23:03:14 CST 2019
     */
    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_1.order_amount
     *
     * @param orderAmount the value for t_order_1.order_amount
     *
     * @mbg.generated Sat Sep 21 23:03:14 CST 2019
     */
    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_1.order_status
     *
     * @return the value of t_order_1.order_status
     *
     * @mbg.generated Sat Sep 21 23:03:14 CST 2019
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_1.order_status
     *
     * @param orderStatus the value for t_order_1.order_status
     *
     * @mbg.generated Sat Sep 21 23:03:14 CST 2019
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_1.user_id
     *
     * @return the value of t_order_1.user_id
     *
     * @mbg.generated Sat Sep 21 23:03:14 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_1.user_id
     *
     * @param userId the value for t_order_1.user_id
     *
     * @mbg.generated Sat Sep 21 23:03:14 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", orderAmount=" + orderAmount +
                ", orderStatus=" + orderStatus +
                ", userId=" + userId +
                '}';
    }
}