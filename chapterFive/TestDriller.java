package chapterFive;

public class TestDriller {

    int amount;
    int price;

    public int calculatePrice(int copy) {

            if (copy >= 1 && copy <= 4) {
                price = 1500;
                amount = copy * price;
            }

            if (copy >= 5 && copy <= 9) {
                price = 1400;
                 amount = copy * price;
            }
            if (copy >= 10 && copy <= 29) {
                price = 1200;
                amount = copy * price;
            }
            if (copy >= 30 && copy <= 49) {
                price = 1100;
                amount = copy * price;
            }

            if (copy >=50  && copy <= 99) {
                price = 1000;
                 amount = copy * price;
            }
            if (copy >=100  && copy <= 199){
                price = 900;
                 amount = copy * price;
            }
            if (copy >= 200) {
                price = 800;
                amount = copy * price;
            }
        return amount;
    }
}


