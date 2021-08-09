public class pet {

    private String name;
    private int age;
    private String location;
    private boolean type;

    public pet(){
    }

    public pet(String name, int age, String location, boolean type){
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getLocation(){
        return location;
    }

    public boolean isType(){
        return type;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setLocation(String location) {
        this.location = location;
    }



}
