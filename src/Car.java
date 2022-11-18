public class Car {
    public String brend;
    public String model;
    public float engineCapacityInLiters;
    public String colour;
    public int dateOfCreation;
    public String countryCreation;
    public Car(String brend,String model,float engineCapacityInLiters, String colour, int dateOfCreation, String countryCreation){
        if (brend==null || brend.isBlank()){
            this.brend="Информация не указана";
        }else{
            this.brend=brend;
        }
        if (model==null || model.isBlank()){
            this.model="Информация не указана";
        }else{
            this.model=model;
        }
        if (engineCapacityInLiters==0){
            this.engineCapacityInLiters=1.5f;
        }else {
            this.engineCapacityInLiters=engineCapacityInLiters;
        }
        if (colour==null || colour.isBlank()){
            this.colour="белый";
        }else{
            this.colour=colour;
        }
        if (countryCreation==null || countryCreation.isBlank()){
            this.countryCreation="Информация не указана";
        }else{
            this.countryCreation=countryCreation;
        }
        if (engineCapacityInLiters==0){
            this.dateOfCreation=2000;
        }else {
            this.dateOfCreation=dateOfCreation;
        }
        /*this.brend=brend;
        this.model=model;
        this.engineCapacityInLiters=engineCapacityInLiters;
        this.colour=colour;
        this.dateOfCreation=dateOfCreation;
        this.countryCreation=countryCreation;*/

    }

    public String toString(){
        return brend+" "+model+", "+dateOfCreation+" года выпуска, сборка в "+countryCreation+", "+colour+" цвета, объём двигателя- "+engineCapacityInLiters;
    }

}
