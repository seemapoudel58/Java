package pk2;
import pk1.Student;
class Example2{
    public static void main(String[] args) {
        Student s = new Student();
        s.setRoll(11);
        s.setname("PadmaKanya ");
        System.out.println("Roll=" + s.getRoll());
        System.out.println("Name=" + s.getName());
}
}