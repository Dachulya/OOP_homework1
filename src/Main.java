import static java.awt.Color.red;

import Transport.Car;
import com.sun.jdi.connect.Transport;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        /*Human maxsim= new Human(35,"", "Минск","бренд-менеджер");
        Human Anya= new Human(29,"Аня", "","методист образовательных программ");
        Human Katya= new Human(28,"Катя", "Калининград","продакт-менеджер");
        Human Artem= new Human(27,"Артём", "Москва","директор по развитию бизнеса");

        Human Vladumir=new Human(21,"Владимир","Казань","");*/
        /*Human maxsim= new Human();
        maxsim.name=" Максим";
        maxsim.town=" Минск";
        maxsim.dateOfBirth=35;
        maxsim.workingPosition=" бренд-менеджер";
        Human Anya= new Human();
        Anya.name=" Аня";
        Anya.town=" Москва";
        Anya.dateOfBirth=29;
        Anya.workingPosition=" методист образовательны программ";
        Human Katya= new Human();
        Katya.name=" Катя";
        Katya.town=" Калинград";
        Katya.dateOfBirth=28;
        Katya.workingPosition=" продакт-менеджер";
        Human Artem= new Human();
        Artem.name=" Артём ";
        Artem.town=" Москва ";
        Artem.dateOfBirth=27;
        Artem.workingPosition=" директор по развитию бизнеса";
        */
        /*System.out.println(Vladumir);
        System.out.println(maxsim.getName());
        System.out.println(Anya.getName());
        System.out.println(Katya);
        System.out.println(Artem);*/
        Car ladaGranda = new Car("", "", 0, "",
                0, "", "механика",
                "купе", "123456789", 4, false,
                new Transport.Car.Key(true, true),
                new Transport.Car.Insurance(LocalDate.EPOCH, 507.7f, "123456789"));
        Car AudiA8_50LTDI = new Car("Audi", "A8  50 L TDI",
                3, "чёрного цвета", 2020,
                "Германия", "автомат", "универсал",
                "123456789", 4, true, new Transport.Car.Key(true, true),
                new Transport.Car.Insurance(LocalDate.EPOCH, 507.7f, "123456789"));
        Car BMWZ8 = new Car("BMW", "Z8", 3, "чёрного цвета",
                2018, "Германия",
                "механика", "седан", "45454545",
                4, true, new Transport.Car.Key(true, true),
                new Transport.Car.Insurance(LocalDate.EPOCH, 507.7f, "123456789"));
        Car KiaSportage = new Car("Kia", "Sportage",
                2.4f, "оранжевого цвета", 2018,
                "Южная Корея", "механика", "пикап",
                "123456789", 4, true, new Transport.Car.Key(true, true),
                new Transport.Car.Insurance(LocalDate.EPOCH, 507.7f, "123456789"));
        Car HuindayAvante = new Car("Huinday", "Avante",
                1.6f, "красного цвета", 2016,
                "Южная Корея", "механика", "хетчбэк", "123456789",
                4, false, new Transport.Car.Key(true, true),
                new Transport.Car.Insurance(LocalDate.EPOCH, 507.7f, "1234567899"));

        /*Car first= new Car();
        first.brend=" Lada ";
        first.model=" Granda";
        first.engineCapacityInLiters= 1.7f;
        first.colour=" жёлтого цвета";
        first.dateOfCreation=2015;
        first.countryCreation=" Россия";
        Car second= new Car();
        second.brend=" Audi";
        second.model=" A8 50 L TDI quatro";
        second.engineCapacityInLiters=3;
        second.colour=" чёрный";
        second.dateOfCreation=2020;
        second.countryCreation=" Германия";
        Car three= new Car();
        three.brend=" BMW";
        three.model=" Z8";
        three.engineCapacityInLiters=3;
        three.colour=" чёрный";
        three.dateOfCreation=2021;
        three.countryCreation=" Германия";
        Car four= new Car();
        four.brend=" Kia";
        four.model=" Sportage4";
        four.engineCapacityInLiters=2.4f;
        four.colour=" красный";
        four.dateOfCreation=2018;
        four.countryCreation=" Южная корея";
        Car five= new Car();
        five.brend=" Hyundai";
        five.model=" Avante";
        five.engineCapacityInLiters=1.6f;
        five.colour=" оранжевый";
        five.dateOfCreation=2016;
        five.countryCreation=" Южная корея";
*/
        HuindayAvante.setColour("");
        //System.out.println(Transport.Car.isRegNumberValid(HuindayAvante.getRegNumber()));
        //System.out.println(Transport.Car.changeTiresSeasonal(HuindayAvante.getIsWinterTires(),8));

        System.out.println(HuindayAvante.getColour());
        System.out.println(ladaGranda);
        System.out.println(AudiA8_50LTDI);
        System.out.println(BMWZ8);
        System.out.println(KiaSportage);
        System.out.println(HuindayAvante);

        Flower Roza = new Flower("", "Голландия", 35.67f, 0);
        Flower Hrizantema = new Flower("", "", 15.00f, 5);
        Flower Pion = new Flower("", "Англия", 69.90f, 1);
        Flower Gipsofila = new Flower("", "Турция", 19.50f, 10);

        /*System.out.println(Roza.getFlowerColor());
        Roza.setFlowerColor("зелёный");
        System.out.println(Roza.getFlowerColor());*/
        System.out.println(Roza.getCost() * 3);

        System.out.println(Bouquet(Roza.getCost(), 4, Hrizantema.getCost(), 7, Pion.getCost(), 2, Gipsofila.getCost(), 2));
        /*System.out.println(Roza);
        System.out.println(Hrizantema);
        System.out.println(Pion);
        System.out.println(Gipsofila);*/
    }
        //System.out.println(Bouquet(3,5,7,6));

    public static float Bouquet(float coastRoza,int countRoza,float coastHrizantema,
                                int countHrizantema,float coastPion,int countPion,
                                float coastGipsofila, int countGipsofila){
        float costRoza = coastRoza*countRoza;
        float costHrizantema = coastHrizantema*countHrizantema;
        float costPion = coastPion*countPion;
        float costGipsofila = coastGipsofila*countGipsofila;
        float costBouquet=(costGipsofila+costHrizantema+costRoza+costPion)*0.1f+
                    (costGipsofila+costHrizantema+costRoza+costPion);
        return  costBouquet;
        }
    }
