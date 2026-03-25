package exercises;

public class ClassForEx013 {
    public String name;
    public String email;
    public int roomNumber;

    public ClassForEx013(String name,  String email, int roomNumber) {
        this.name = name;
        this.email = email;
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "Name: " + this.name
                +"\nEmail: " + this.email
                +"\nRoom number: " + this.roomNumber;
    }
}
