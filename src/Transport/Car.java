package Transport;


//import java.security.Key;
//import java.time.LocalDate;

import java.security.Key;
import java.time.LocalDate;

public class Car {
    private final String brend;
    private final String model;
    private float engineCapacityInLiters;
    private String colour;
    private final int dateOfCreation;
    private final String countryCreation;

    private String gearBox;
    private final String bodyType;
    public String regNumber;
    private final int placesCount;
    private boolean winterTires;
    private final Key key;
    private final Insurance insurance;

    public Car(String brend, String model,
               float engineCapacityInLiters, String colour,
               int dateOfCreation, String countryCreation,
               String gearBox,String bodyType,String regNumber,
               int placesCount,boolean winterTires,Key key,Insurance insurance){
        /*if (brend==null || brend.isBlank()){
            this.brend="Информация не указана";
        }else{
            this.brend=brend;
        }*/
        this.brend=divideIntoVariants(brend,"Информация не указана");
        /*if (model==null || model.isBlank()){
            this.model="Информация не указана";
        }else{
            this.model=model;
        }*/
        this.model=divideIntoVariants(model,"Информация не указана");

        if (engineCapacityInLiters==0){
            this.engineCapacityInLiters=1.5f;
        }else {
            this.engineCapacityInLiters=engineCapacityInLiters;
        }
        /*if (colour==null || colour.isBlank()){
            this.colour="белый";
        }else{
            this.colour=colour;
        }*/
        this.colour=divideIntoVariants(colour,"белый");
        /*if (countryCreation==null || countryCreation.isBlank()){
            this.countryCreation="Информация не указана";
        }else{
            this.countryCreation=countryCreation;
        }*/
        this.countryCreation=divideIntoVariants(countryCreation,"Информация не указана");
        if (engineCapacityInLiters==0){
            this.dateOfCreation=2000;
        }else {
            this.dateOfCreation=dateOfCreation;}


        this.gearBox=divideIntoVariants(gearBox,"Информация не указана");
        this.bodyType=divideIntoVariants(bodyType,"Информация не указана");
        this.placesCount=Math.max(placesCount,0);
        this.regNumber=divideIntoVariants(regNumber,"Информация не указана");
        if (winterTires==true){
            System.out.println("Зимняя резина");
            this.winterTires=winterTires;
        } else if (winterTires==false) {
            System.out.println("летняя резина");
            this.winterTires=winterTires;

        }

        this.key=key;
        this.insurance=insurance;
        //setWinterTires(winterTires);//записать в сеттеры те которые не final, прописать для них сеттеры, применить валидацию из human
        //метод про зимнюю резину, метод про проверку номера на валидность, для каждой буквы проверяется 2 метода является ли это правильны символ и шаг
        //геттеры для
        /*this.brend=brend;
        this.model=model;
        this.engineCapacityInLiters=engineCapacityInLiters;
        this.colour=colour;
        this.dateOfCreation=dateOfCreation;
        this.countryCreation=countryCreation;*/
    }
    public static class Key{
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;
        public Key(boolean remoteEngineStart,boolean keylessAccess) {
            this.remoteEngineStart=remoteEngineStart;
            this.keylessAccess=keylessAccess;
        }
        public boolean isRemoteEngineStart(){
            return remoteEngineStart;
        }
        public boolean isKeylessAccess(){
            return keylessAccess;
        }
    }
    public static class Insurance{
        private final LocalDate validUntil;
        private final float cost;
        private final String number;

        public Insurance(LocalDate validUntil,float cost,String number){
            this.validUntil=validUntil !=null ? validUntil:LocalDate.now().plusDays(10);
            this.cost=Math.max(cost, 1f);
            this.number=divideIntoVariants(number,"default");
        }
        public boolean isNumberValid(){
            return number.length()==9;
        }
        public boolean isInsuranceValid(){
            return LocalDate.now().isBefore(this.validUntil);
        }
    }



    public static String divideIntoVariants(String value,String defaultValue){
        if (value==null || value.isBlank()){
            return defaultValue;
        }else {
            return value;}}

    public static boolean changeTiresSeasonal(boolean tires,int month) {
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("зимняя резина");
            return true;
        }else {
            System.out.println("летняя резина");
            return false;
        }
    }


    public String getBrend() {
        return brend;
    }
    public String getModel() {
        return model;
    }
    public float getEngineCapacityInLiters() {
        return engineCapacityInLiters;
    }
    public String getColour() {
        return colour;
    }
    public int getDateOfCreation() {
        return dateOfCreation;
    }
    public String getCountryCreation() {
        return countryCreation;
    }
    public String getGearBox() {
        return gearBox;
    }
    public String getBodyType() {
        return bodyType;
    }
    public String getRegNumber() {
        return regNumber;
    }
    public int getPlacesCount() {
        return placesCount;
    }
    public boolean getIsWinterTires(){
        return winterTires;
    }
    /*public String getIsWinterTires() {
        if (winterTires==true){
            return "Зимняя резина";
        } else if (winterTires==false) {
            return "летняя резина";
        }}*/


    public void setEngineCapacityInLiters(float engineCapacityInLiters) {
        if (engineCapacityInLiters>0 && engineCapacityInLiters!=0){
            this.engineCapacityInLiters = engineCapacityInLiters;}
    }

    public void setColour(String colour) {
        this.colour = divideIntoVariants(colour,getColour());
    }

    public void setGearBox(String gearBox) {
        this.gearBox = divideIntoVariants(gearBox,getGearBox());
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = divideIntoVariants(regNumber,getRegNumber());
    }

    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }

    /*public void setSeasonTires(){
            int currentMonth= LocalDate.now().getMonthValue();
            this.winterTires=currentMonth<=4 || currentMonth>=11;
        }
        public boolean isWinterValid(){
            if (this.regNumber.length()!=9){
                return false;
            }}*/
    public String toString(){
        return getBrend()+" "+getModel()+", "+getDateOfCreation()+
                " года выпуска, сборка в "+getCountryCreation()
                +", "+getColour()+" цвета, объём двигателя- "+getEngineCapacityInLiters()+
                " ,коробка передач"+getGearBox()+" ,тип кузова"+getBodyType()+
                ", регистрационный номер"+getRegNumber()+" ,колличество мест"+
                getPlacesCount()+",тип резины "+getIsWinterTires();
    }
    //проверка номера на вшивость
    public boolean isRegNumberValid(/*String regNumber*/){
        if(this.regNumber.length()!=9){
            return false;
        }
        char[] regNumberChars=this.regNumber.toCharArray();
        return isNumberLetter(regNumberChars[0]) &&
                isNumberLetter(regNumberChars[1]) &&
                isNumberLetter(regNumberChars[2]) &&
                isNumberLetter(regNumberChars[3]) &&
                isNumberLetter(regNumberChars[4]) &&
                isNumberLetter(regNumberChars[5]) &&
                isNumberLetter(regNumberChars[6]) &&
                isNumberLetter(regNumberChars[7]) &&
                isNumberLetter(regNumberChars[8]);
    }
    private boolean isNumber(char symbol){
        return Character.isDigit(symbol);//проверяет наличие цифр в строке
    }
    private boolean isNumberLetter(char symbol){
        String allowedSymbols="АВЕКМНОРСТУХ";
        return allowedSymbols.contains(""+symbol);//проверяет на наличие нужных букв в строке
    }
}

