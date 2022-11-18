public class Human {
    public int dateOfBirth;
    public String name;
    public String town;
    public String workingPosition;
    public  Human(int dateOfBirth, String name,String town,String workingPosition){

        /*
        if (town==null || town.isBlank()){
            this.town="Информация не указана";
        }else {
            this.town=town;
        }
        if (name==null || name.isBlank()){
            this.name="Информация не указана";
        }else{
            this.name=name;
        }
        if (workingPosition==null || workingPosition.isBlank()){
            this.workingPosition="Информация не указана";
        }else{
            this.workingPosition=workingPosition;
        }*/
        if (dateOfBirth<0){
            this.dateOfBirth=0;
        }else {
            this.dateOfBirth=dateOfBirth;
        }

        /*
        this.dateOfBirth=dateOfBirth;
        this.name=name;
        this.town=town;
        this.workingPosition=workingPosition;
*/
    }
    private String divideIntoVariants(String value,String defaultValue){
        if (value==null || value.isBlank()){
            return defaultValue;
        }else {
            return value;
        }
    }
    @Override
    public String toString(){
        return "Привет! Меня зовут"+name+". Я из города"+town+". Я родился "+dateOfBirth+"лет назад."+"Я работаю на должности"+workingPosition;
    }
}
