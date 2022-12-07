import java.time.LocalDate;
import java.util.Arrays;
import java.util.Locale;

public class Human {
    private int birthYear;
    private String name;
    private String town;
    private String workingPosition;
    public  Human(int age, String name,String town,String workingPosition){
        /*if (town==null || town.isBlank()){
            this.town="Информация не указана";
        }else {
            this.town=town;}*/
        this.town=divideIntoVariants(town,"Информация не указана");
        /*if (name==null || name.isBlank()){
            this.name="Информация не указана";}else{
            this.name=name;}*/
        this.name=divideIntoVariants(name,"Информация не указана");
        /*if (workingPosition==null || workingPosition.isBlank()){
            this.workingPosition="Пока нигде не трудоустроен";
        }else{
            this.workingPosition=workingPosition;}*/
        this.workingPosition=divideIntoVariants(workingPosition,"Информация не указана");
        /*if (age<0){
            this.birthYear= LocalDate.now().getYear()-Math.abs(age);
        }else {
            this.birthYear= LocalDate.now().getYear()-age;}*/
        this.birthYear=Math.min(LocalDate.now().getYear()-age,LocalDate.now().getYear()-age-0);
        /*
        this.dateOfBirth=dateOfBirth;
        this.name=name;
        this.town=town;
        this.workingPosition=workingPosition;
*/}

    public static String divideIntoVariants(String value,String defaultValue){
        if (value==null || value.isBlank()){
            return defaultValue;
        }else {
            return value;}}//проверка которую можно подставить к разным строкам , что бы не прописывать много раз?её можно было и в сеттерах тут прописать
    public String getTown(){
        return town;}
    public void setTown(String town){
        if (town!=null&& !town.isEmpty() && !town.isBlank()){
            this.town=town;}}
    public String getName(){
        return name;}
    public void setName(String name){
        if (name!=null&& !name.isEmpty() && !name.isBlank()){
            this.name=name;}}
    public int getAge(){
        return LocalDate.now().getYear()-birthYear;}

    @Override
    public String toString(){
        return "Привет! Меня зовут"+getName()+". Я из города"+getTown()+". Я родился "+getAge()+"году."+"Я работаю на должности "+workingPosition;}
}
