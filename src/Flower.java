public class Flower {
    private String flowerColor;
    private String country;
    private float cost;
    private int lifeSpan;

    public  Flower(String flowerColor, String country,float cost,int lifeSpan){
        /*if (flowerColor==null || flowerColor.isBlank() || country.isEmpty()){
            this.flowerColor="белый";
        }else {
            this.flowerColor=flowerColor;}*/
        this.flowerColor=Human.divideIntoVariants(flowerColor,"белый");
        /*if (country==null || country.isBlank()){
            this.country="Россия";
        }else {
            this.country=country;}*/
        this.country=Human.divideIntoVariants(country,"Россия");
        if (cost==0 || cost<0){
            this.cost=1;}else{this.cost=cost;
        }
        if (lifeSpan>0 ){
            this.lifeSpan=lifeSpan;
        }else{this.lifeSpan=3;}
    }
    public String getFlowerColor(){
        return flowerColor;}
    public void setFlowerColor(String flowerColor){
        if (flowerColor!=null&& !flowerColor.isEmpty() && !flowerColor.isBlank()){
            this.flowerColor=flowerColor;}}
    public String getCountry(){
        return country;}
    public float getCost(){
        return cost;}
    public void setCost(float cost){
        if (cost>0 || cost!=0){
            this.cost=cost;}}

    public int getLifeSpan(){
        return lifeSpan;}
    public void setLifeSpan(int lifeSpan){
        if (lifeSpan>0 || lifeSpan!=0){
            this.lifeSpan=lifeSpan;}}
    /*private static double delum(int number){
        if (number)
    }*/

    @Override
    public String toString(){
        return "Цвет цветка"+getFlowerColor()+". Страна изготовитель"+getCountry()+". Цена  "+getCost()+".Сколько стоит в вазе после покупки "+getLifeSpan();}
}
