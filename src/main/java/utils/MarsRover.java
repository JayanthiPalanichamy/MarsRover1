package main.java.utils;

public class MarsRover {
    Position p;
    int maxX;
    int maxY;
    public MarsRover(int x,int y, String compass,int maxX,int maxY) {
        p = new Position(x, y, compass);
        this.maxX = maxX;
        this.maxY = maxY;
    }
    public void move(String s){
        if(s.equals("M")) {
            if(p.getCompassPoint().equals("N")) {
                if(p.getYPoint() + 1 <= maxY) {
                    p.setYPoint(p.getYPoint() + 1);
                }
            }
            else if(p.getCompassPoint().equals("S")) {
                if(p.getYPoint() - 1 >= 0) {
                    p.setYPoint(p.getYPoint() - 1);
                }
            }
            else if(p.getCompassPoint().equals("W")) {
                if(p.getXPoint() - 1 >= 0) {
                    p.setXPoint(p.getXPoint() - 1);
                }
            }
            else if(p.getCompassPoint().equals("E")) {
                if(p.getXPoint() + 1 <= maxX ){
                    p.setXPoint(p.getXPoint() + 1);
                }
            }
        }
        else if(s.equals("L")) {
            if(p.getCompassPoint().equals("N")) {
                p.setCompassPoint("W");
            }
            else if(p.getCompassPoint().equals("S")) {
                p.setCompassPoint("E");
            }
            else if(p.getCompassPoint().equals("W")) {
                p.setCompassPoint("S");
            }
            else if(p.getCompassPoint().equals("E")) {
                p.setCompassPoint("N");
            }
        }
        else if(s.equals("R")) {
            if(p.getCompassPoint().equals("N")) {
                p.setCompassPoint("E");
            }
            else if(p.getCompassPoint().equals("S")) {
                p.setCompassPoint("W");
            }
            else if(p.getCompassPoint().equals("W")) {
                p.setCompassPoint("N");
            }
            else if(p.getCompassPoint().equals("E")) {
                p.setCompassPoint("S");
            }
        }
    }

    public void getPosition() {
        System.out.println(p.getXPoint()+" "+p.getYPoint()+" "+p.getCompassPoint());
    }
}
