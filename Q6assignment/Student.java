package college.students;

public class Student {
    public String name = "Ranbeer";
    private int roll = 101;
    protected double marks = 92.5;

    public void displayPublic() {
        System.out.println("Accessing public member: " + name);
    }

    protected void displayProtected() {
        System.out.println("Accessing protected member: " + marks);
    }
}

