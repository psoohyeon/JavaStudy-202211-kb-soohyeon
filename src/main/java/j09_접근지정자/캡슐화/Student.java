package j09_접근지정자.캡슐화;

public class Student {
    private  String name;
    public  String gender;

    public Student() {}

    public Student (String name, String gender) { // 생성자를 통해서 값을 입력하는 방식
        this.name = name;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    /*
   public String name;
      public String getName() {
        return name;

    */

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);

    }
}
