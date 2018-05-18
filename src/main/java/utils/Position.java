package main.java.utils;

public class Position {
    private int xPoint;
    private int yPoint;
    private String  compassPoint;

    public Position(int xPoint, int yPoint, String compassPoint) {
        this.xPoint = xPoint;
        this.yPoint = yPoint;
        this.compassPoint = compassPoint;
    }

    int getXPoint() {
        return xPoint;
    }

    void setXPoint(int xPoint) {
        this.xPoint = xPoint;
    }

    int getYPoint() {
        return yPoint;
    }

    void setYPoint(int yPoint) {
        this.yPoint = yPoint;
    }

    String getCompassPoint() {
        return compassPoint;
    }

    void setCompassPoint(String compassPoint) {
        this.compassPoint = compassPoint;
    }
}
