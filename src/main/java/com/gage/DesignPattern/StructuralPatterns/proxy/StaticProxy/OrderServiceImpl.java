package com.gage.DesignPattern.StructuralPatterns.proxy.StaticProxy;

public class OrderServiceImpl implements IOrderService {

    // spring boot 自动注入
    private IOrderDAO iServiceDAO = null;

    @Override
    public int saveOrder(int db) {
        iServiceDAO = new OrderDAOImpl();
        System.out.println("准备插入订单数据");
        return iServiceDAO.insert(db);
    }
}
