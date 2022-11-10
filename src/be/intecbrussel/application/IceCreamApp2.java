package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.IceCreamCar;
import be.intecbrussel.sellers.IceCreamSeller;
import be.intecbrussel.sellers.PriceList;
import be.intecbrussel.sellers.Stock;

public class IceCreamApp2 {
    public static void main(String[] args){
        Stock stock = new Stock();
        stock.setCones(10);
        stock.setBalls(20);
        stock.setMagni(10);
        stock.setIceRockets(5);
        //stock.setBalls(stock.getMagni() + 2);
        IceCreamSeller iceCreamCar = new IceCreamCar();

        iceCreamCar.orderIceRocket().eat();
        iceCreamCar.orderIceRocket().eat();
        iceCreamCar.orderIceRocket().eat();

        iceCreamCar.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES).eat();

        Cone cone = iceCreamCar.orderCone(Cone.Flavor.values());

        Cone.Flavor[] balls = new Cone.Flavor[]{Cone.Flavor.values()[0], Cone.Flavor.values()[1]};
        Cone.Flavor[] flavors = {Cone.Flavor.VANILLA, Cone.Flavor.PISTACHE, Cone.Flavor.BANANA};
        Cone cone2 = iceCreamCar.orderCone(balls);

        cone.eat();
        cone2.eat();

//        stock.setCones(30);
//        stock.setBalls(30);
//        stock.setIceRockets(25);
//        stock.setMagni(36);



    }
}
