public class HomeCounters {
    public static void main(String[] args) {
        double couldWater = 49.58;
        double hotWater = 138.01;
        double waterDisposal = 33.4;
        double electricity = 2.77;

        int countCouldWater = 12;
        int countHotWater = 10;
        int countElectricity = 250;

        double countWater = (countCouldWater * couldWater) + (countHotWater * hotWater) + ((countCouldWater + countHotWater) * waterDisposal );
        double countPower = electricity * countElectricity;
        double totalPrice = countWater + countPower;
        double tp = totalPrice;
        tp = Math.round(tp * 100);
        tp = tp/100;

        System.out.println("Ваши расходы по счетчикам " + totalPrice);
        System.out.println("Ваши расходы по счетчикам " + tp);



    }
}
