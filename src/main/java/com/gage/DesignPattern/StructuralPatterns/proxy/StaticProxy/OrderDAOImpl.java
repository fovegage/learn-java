package com.gage.DesignPattern.StructuralPatterns.proxy.StaticProxy;

public class OrderDAOImpl implements IOrderDAO {
    @Override
    public int insert(int db) {
        if (db == 1) {
            System.out.println("插入数据库DB1成功");

        } else {
            System.out.println("插入数据库DB2成功");
        }
        return db;
    }
}
