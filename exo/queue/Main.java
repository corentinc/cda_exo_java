package exo.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Student secondeArthur = new Student("Arthur", SchoolLevel.SECONDE);
        Student premiereToto = new Student("Toto", SchoolLevel.PREMIERE);
        Student gretaJean = new Student("Jean", SchoolLevel.GRETA);
        Student terminalChristine = new Student("Christine", SchoolLevel.TERMINAL);

        Queue<Student> studentQueue = new PriorityQueue<>();

        studentQueue.add(secondeArthur);
        studentQueue.add(terminalChristine);
        studentQueue.add(premiereToto);
        studentQueue.add(gretaJean);

        while (!studentQueue.isEmpty()) {
            Student nextStudentToEat = studentQueue.poll();
            System.out.println(nextStudentToEat.toString());
        }
    }
}
