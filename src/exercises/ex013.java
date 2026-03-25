package exercises;

import java.util.Scanner;

public class ex013 {
    static void main(String[] args) {
        ClassForEx013[] hotelRooms = new ClassForEx013[10];
        Scanner sc = new Scanner(System.in);

        String name, email;
        int roomNumber;
        System.out.println("Insert the amount of students:");
        int amountStudents = sc.nextInt();

        for(int i=0; i<amountStudents; i++) {
            System.out.println("Student name: ");
            name = sc.next();
            System.out.println("Student email: ");
            email = sc.next();
            System.out.println("Room: ");
            roomNumber = sc.nextInt();

            hotelRooms[roomNumber] = new ClassForEx013(name, email, roomNumber);
        }
        for(int i=0; i<hotelRooms.length; i++) {
            if (hotelRooms[i] != null){
                System.out.println(hotelRooms[i]);
            }
        }
    }
}
