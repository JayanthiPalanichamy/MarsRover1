package main.java.MarsRoverMain;
import main.java.utils.MarsRover;

import java.util.Scanner;
public class MarsRoverMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxX = scanner.nextInt();
        int maxY = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        String compass= scanner.next();
        String instruction = scanner.next();
        String[] instructionAry = instruction.split("");

        MarsRover marsRover1 = new MarsRover(x,y,compass,maxX,maxY);
        for (int i = 0, n = instruction.length(); i < n; i++) {
            marsRover1.move(instructionAry[i]);
        }
        marsRover1.getPosition();

        x = scanner.nextInt();
        y = scanner.nextInt();
        compass= scanner.next();
        instruction = scanner.next();
        instructionAry = instruction.split("");

        MarsRover marsRover2 = new MarsRover(x,y,compass,maxX,maxY);
        for (int i = 0, n = instruction.length(); i < n; i++) {
            marsRover2.move(instructionAry[i]);
        }
        marsRover2.getPosition();
    }
}
