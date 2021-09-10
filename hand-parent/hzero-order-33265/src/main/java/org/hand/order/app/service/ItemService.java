package org.hand.order.app.service;

import org.hand.order.domain.entity.Item;

import io.choerodon.core.domain.Page;
import io.choerodon.mybatis.pagehelper.domain.PageRequest;

/**
 * 应用服务
 *
 * @author long.chen08@hand-china.com 2021-07-31 09:17:09
 */
public interface ItemService {

    /**
     * 查询参数
     *
     * @param tenantId 租户ID
     * @param item 
     * @param pageRequest 分页
     * @return 列表
     */
    Page<Item> list(Long tenantId, Item item, PageRequest pageRequest);

    /**
     * 详情
     *
     * @param tenantId 租户ID
     * @param itemId 主键
     * @return 列表
     */
        Item detail(Long tenantId, Long itemId);

    /**
     * 创建
     *
     * @param tenantId 租户ID
     * @param item 
     * @return 
     */
        Item create(Long tenantId, Item item);

    /**
     * 更新
     *
     * @param tenantId 租户ID
     * @param item 
     * @return 
     */
        Item update(Long tenantId, Item item);

    /**
     * 删除
     *
     * @param item 
     */
    void remove(Item item);
}
