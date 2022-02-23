public class Pet {
    private Integer age;
    private String petName;
    public Pet(){

    }
    public void setAge(Integer age){
        this.age = age;
    }
    public void setPetName(String name){
        this.petName = name;
    }
    public void tostring(){
        System.out.println("pet:"+"{"+age+","+petName+"}");
    }
}
