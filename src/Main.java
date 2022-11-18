public class Main {
    public static void main(String[] args) {
        Human maxsim= new Human(-35,"", "Минск","бренд-менеджер");
        Human Anya= new Human(-29,"Аня", "","методист образовательных программ");
        Human Katya= new Human(-28,"Катя", "Калининград","продакт-менеджер");
        Human Artem= new Human(-27,"Артём", "Москва","директор по развитию бизнеса");

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
        System.out.println(maxsim);
        System.out.println(Anya);
        System.out.println(Katya);
        System.out.println(Artem);

        Car ladaGranda= new Car("","",0,"", 0,"");
        Car AudiA8_50LTDI= new Car("Audi","A8  50 L TDI",3,"чёрного цвета", 2020,"Германия");
        Car BMWZ8= new Car("BMW","Z8",3,"чёрного цвета", 2018,"Германия");
        Car KiaSportage= new Car("Kia","Sportage",2.4f,"оранжевого цвета", 2018,"Южная Корея");
        Car HuindayAvante= new Car("Huinday","Avante",1.6f,"красного цвета", 2016,"Южная Корея");

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
        System.out.println(ladaGranda);
        System.out.println(AudiA8_50LTDI);
        System.out.println(BMWZ8);
        System.out.println(KiaSportage);
        System.out.println(HuindayAvante);

    }
}