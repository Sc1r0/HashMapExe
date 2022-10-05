public class Students implements Comparable<Students> {
    private String name;
    private int age;
    private char sex;

    public Students(String name, int age, char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void setSex(char sex){
        this.sex = sex;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public char getSex(){
        return sex;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    @Override
    public int compareTo(Students o) {
        if (this.age<o.getAge()){
            return -1;
        }

        if (this.getAge() > o.getAge()){
            return 1;
        }

        return 0;
    }

    // instead of returning the default hashcode for the object, return the age
    /*
    @Override
    public int hashCode(){
        return age;
    }
    */
}
