package cn.itcast.servceImpl;

import cn.itcast.Service.SkuService;
import cn.itcast.dao.SkuMapper;
import cn.itcast.goods.Sku;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SkuServoceImpl implements SkuService {

    @Autowired
    private SkuMapper skuMapper;

    public List<Sku> findAll() {
        return skuMapper.selectAll();
    }
}
