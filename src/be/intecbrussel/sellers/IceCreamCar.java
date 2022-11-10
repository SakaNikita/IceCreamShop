package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public class IceCreamCar implements IceCreamSeller {

    public PriceList priceList;
    public Stock stock;
    public double profit;

    public IceCreamCar() {
        this.priceList = new PriceList();
        this.stock = new Stock();
        this.profit = profit;
    }

    @Override
    public Cone orderCone(Cone.Flavor[] balls) {
        Cone cone = prepareCone(balls);
        if (balls != null && balls.length > 0) {
            profit += priceList.getBallPrice() * balls.length;
        } else {
            profit += priceList.getBallPrice();
        }
        return new Cone();
    }

    public Cone prepareCone(Cone.Flavor[] balls) {
        if (stock.getCones() == 0 || stock.getBalls() == 0) {
            throw new NoMoreIceCreamException();
        }
        if (stock.getBalls() >= balls.length) {
            stock.setCones(stock.getCones() - 1);
            stock.setBalls(stock.getBalls() - balls.length);
            return new Cone();
        } else {
            System.out.println("Empty stock!");
            throw new NoMoreIceCreamException();
        }
    }

    @Override
    public IceRocket orderIceRocket(){
        IceRocket iceRocket = prepareIceRocket();
        profit += priceList.getRocketPrice();
        return new IceRocket();
    }

    private IceRocket prepareIceRocket () {
        if (stock.getIceRockets() == 0){
            throw new NoMoreIceCreamException();
        }
        stock.setIceRockets(stock.getIceRockets() - 1);
            return new IceRocket();
        }

        @Override
        public Magnum orderMagnum(Magnum.MagnumType type){
            Magnum magnum = prepareMagnum(type);
            profit += priceList.getMagnumPrice(Magnum.MagnumType.ALPINENUTS);
            return new Magnum(type);
        }
//        public Magnum prepareMagnum (Magnum.MagnumType type){
//            Magnum magnum = prepareMagnum(type);
//            profit += priceList.getMagnumPrice(type);
//            return new Magnum(type);
        //}
    private Magnum prepareMagnum(Magnum.MagnumType type) throws NoMoreIceCreamException{
        if (stock.getMagni() == 0){
            throw new NoMoreIceCreamException();
        }
        stock.setMagni(stock.getMagni() - 1);
        return new Magnum();
    }
    @Override
    public double getProfit() {
            return profit;
        }

}
