package Person;

public class Person {
    String name;
    int age;
    GENDER gender = GENDER.FEMALE;
    String hobbies;
    String friends;

    public static int personCounter = 0;

    public Person(String name, int age, GENDER gender, String hobbies, String friends){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobbies = hobbies;
        this.friends = friends;
        personCounter++;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public GENDER getGender() {
        return gender;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getFriends() {
        return friends;
    }

    public void setFriends(String friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", hobbies='" + hobbies + '\'' +
                ", friends='" + friends + '\'' +
                '}';
    }

    public void addNewFriends(String friendName){
        friends += " " + friendName;
//  egyoldalú barátság?
    }



}
