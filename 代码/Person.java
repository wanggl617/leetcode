public class Person {
    private Integer age;
    private String userName;
    private Pet pet;
    public Person(){

    }
    public void setAge(Integer age){
        this.age = age;
    }
    public void setUserName(String name){
        this.userName = name;
    }
    public void setPet(Pet pet){
        this.pet = pet;
    }
    public void tostring(){
        System.out.println("person:"+"{"+age+","+userName+"}");
        pet.tostring();
    }
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(22);
        person.setUserName("name");
        person.setPet(new Pet(){
            
        });
        person.tostring();
    }
}
