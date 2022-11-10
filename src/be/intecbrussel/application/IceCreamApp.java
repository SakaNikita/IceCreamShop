package be.intecbrussel.application;


import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.IceCreamSeller;
import be.intecbrussel.sellers.PriceList;

public class IceCreamApp{
    public static void main(String[] args) {

        PriceList priceList =new PriceList(3,2,4);
        IceCreamSeller iceCreamSalon= new IceCreamSalon(priceList);
        Eatable[] eatables = new Eatable[6];

        Magnum magnum = new Magnum(Magnum.MagnumType.BLACKCHOCOLATE);
        IceRocket iceRocket = new IceRocket();

        iceCreamSalon.orderCone(Cone.Flavor.values());
        iceCreamSalon.orderMagnum(Magnum.MagnumType.MILKCHOCOLATE).eat();
        iceCreamSalon.orderIceRocket().eat();
        iceCreamSalon.orderMagnum(Magnum.MagnumType.ALPINENUTS).eat();

        Cone.Flavor[] balls = {Cone.Flavor.LEMON, Cone.Flavor.VANILLA, Cone.Flavor.PISTACHE};
        Cone cone = new Cone(balls);

        priceList.setMagnumStandardPrice(4);
        priceList.setBallPrice(3);
        priceList.setRocketPrice(2.5);
        iceCreamSalon.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES).eat();
        iceCreamSalon.orderMagnum(Magnum.MagnumType.WHITECHOCOLATE).eat();
        iceCreamSalon.orderMagnum(Magnum.MagnumType.ALPINENUTS).eat();
        iceCreamSalon.orderMagnum(Magnum.MagnumType.MILKCHOCOLATE).eat();
        iceCreamSalon.orderMagnum(Magnum.MagnumType.BLACKCHOCOLATE).eat();
        iceCreamSalon.orderCone(Cone.Flavor.values()).eat();
        iceCreamSalon.orderIceRocket().eat();


    }
}

