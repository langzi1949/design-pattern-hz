package com.zmglove.advanced;

public class ConcretFactory implements  AdvancedFactory{
    /**
     * 通过一种反射的方式进行实例的创建
     *
     * @param clazz
     * @return
     */
    @Override
    public <T extends Product> T create(Class<T> clazz) {
        Product product = null;

        try {
            product = (Product) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            // TODO
            e.printStackTrace();
        }

        return (T)product;
    }
}
