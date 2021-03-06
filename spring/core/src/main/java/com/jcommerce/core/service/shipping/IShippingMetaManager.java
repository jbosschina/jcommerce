package com.jcommerce.core.service.shipping;

import java.util.List;
import java.util.Map;

import com.jcommerce.core.model.Shipping;
import com.jcommerce.core.model.ShippingArea;

public interface IShippingMetaManager {
//    public String getCode(String orderId, String paymentId);
    
    public void install(String shippingCode);
    
    public void uninstall(Long shippingId);
    
    public ShippingConfigMeta getShippingConfigMeta(Long shippingId);
    
    public void saveShippingConfig(ShippingConfigMeta meta);
    
    public List<ShippingConfigMeta> getCombinedShippingMetaList();
    
    public List<Shipping> getShippingList();
    
    public List<ShippingConfigMeta> getInstalledShippingMetaList();
    
    public ShippingAreaMeta getShippingAreaMeta(Long shippingAreaId, Long shippingId);
    
    public boolean saveShippingArea(ShippingArea sa, Map<String, Object> props);
    
    public double calculate(String shippingCode, double goodsWeight, double goodsAmount, Map<String, String> configValues);
}
