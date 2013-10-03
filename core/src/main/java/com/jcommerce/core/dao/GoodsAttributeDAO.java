/**
* Author: Bob Chen
*/

package com.jcommerce.core.dao;

import java.util.List;

import com.jcommerce.core.model.GoodsAttribute;

public interface GoodsAttributeDAO extends DAO {
    public List<GoodsAttribute> getGoodsAttributeList();

    public GoodsAttribute getGoodsAttribute(Long id);

    public void saveGoodsAttribute(GoodsAttribute obj);

    public void removeGoodsAttribute(Long id);
}
