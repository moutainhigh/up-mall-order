/**
 * @filename:TrackingService 2020年04月08日
 * @project up-mall板根商城  V1.0
 * Copyright(c) 2020 binggleWang Co. Ltd. 
 * All right reserved. 
 */
package com.zsl.upmall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zsl.upmall.entity.OrderShopMaster;

import java.util.List;

/**
 * @Description:TODO(用户和代理商服务层)
 * @version: V1.0
 * @author: binggleWang
 * 
 */
public interface OrderShopMasterService extends IService<OrderShopMaster> {
    /**
     * 获取供应商订单主键id
     * @param orderId
     * @param shopId
     * @return
     */
    Long getOrderShopMasterId(Long orderId, Integer shopId);

    /**
     * 获取供应商订单主键集合
     * @param orderId
     * @return
     */
    List<Long> listOrderShopMasterId(Long orderId);
}