public class Auto {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    Auto() {
        color = "белый цвет";
        model = "devault";
        engineVolume = 1.5;
        productionYear = 2000;
    }

        public void auto1 () {
            brand = "Lada";
            model = "Granta";
            engineVolume = 1.7;
            color = "желтого цвета";
            productionYear = 2015;
            productionCountry = " сборка в России";
            System.out.println(brand + " " + model + " " + productionYear + " года выпуска," + productionCountry + ", " + color + ", объём двигателя: " + engineVolume + " л.");
        }

        public void auto2 () {
            brand = "Audi";
            model = "A8 50 L TDI quattro";
            engineVolume = 3;
            color = "чёрного цвета";
            productionYear = 2020;
            productionCountry = " сборка в Германии";
            System.out.println(brand + " " + model + " " + productionYear + " года выпуска," + productionCountry + ", " + color + ", объём двигателя: " + engineVolume + " л.");
        }
        public void auto3 () {
            brand = "BMW";
            model = "Z8";
            engineVolume = 3;
            color = "чёрного цвета";
            productionYear = 2021;
            productionCountry = " сборка в Германии";
            System.out.println(brand + " " + model + " " + productionYear + " года выпуска," + productionCountry + ", " + color + ", объём двигателя: " + engineVolume + " л.");
        }
        public void auto4 () {
            brand = "Kia";
            model = "Sportage 4-го поколения";
            engineVolume = 2.4;
            color = "красного цвета";
            productionYear = 2018;
            productionCountry = " сборка в Южной Корее";
            System.out.println(brand + " " + model + " " + productionYear + " года выпуска," + productionCountry + ", " + color + ", объём двигателя: " + engineVolume + " л.");
        }
        public void auto5 () {
            brand = "Hyundai";
            model = "Avante";
            engineVolume = 1.6;
            color = "оранжевого цвета";
            productionYear = 2016;
            productionCountry = " сборка в Южной Корее";
            System.out.println(brand + " " + model + " " + productionYear + " года выпуска," + productionCountry + ", " + color + ", объём двигателя: " + engineVolume + " л.");
        }

}
