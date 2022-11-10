package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Magnum;

public class PriceList {

    public double ballPrice;
    public double rocketPrice;
    public double magnumStandardPrice;

    public PriceList(){
    }

    public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice) {
        this.ballPrice = ballPrice;
        this.rocketPrice = rocketPrice;
        this.magnumStandardPrice = magnumStandardPrice;
    }

    public double getBallPrice() {
        return ballPrice;
    }
    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }

    public double getRocketPrice() {
        return rocketPrice;
    }
    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice;
    }

    public void setMagnumStandardPrice(double magnumStandardPrice) {
        this.magnumStandardPrice = magnumStandardPrice;
    }


    public double getMagnumPrice(Magnum.MagnumType type) {
//        if (type == Magnum.MagnumType.ALPINENUTS) {
//            setMagnumStandardPrice(1.5 * magnumStandardPrice);
            switch (type) {
                case ALPINENUTS:
                    return 1.5 * magnumStandardPrice;
                case ROMANTICSTRAWBERRIES:
                    return 2 * magnumStandardPrice;
                default:
                    return magnumStandardPrice;
            }
        }

}
