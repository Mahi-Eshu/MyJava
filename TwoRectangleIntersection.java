import java.util.*;

public class TwoRectangleIntersection{
    public static void main(String[] args){
        // rect1
        int x1 = 1, y1 = 1;
        int x2 = 5, y2 = 1;
        int x3 = 5, y3 = 4;
        int x4 = 1, y4 = 4;
        // rect2
        int x5 = 3, y5 = 2;
        int x6 = 7, y6 = 2;
        int x7 = 7, y7 = 5;
        int x8 = 3, y8 = 5;

        // bounding box condition
        int r1_minX = Math.min(Math.min(x1,x2), Math.min(x3,x4));
        int r1_maxX = Math.max(Math.max(x1,x2), Math.max(x3,x4));
        int r1_minY = Math.min(Math.min(y1,y2), Math.min(y3,y4));
        int r1_maxY = Math.max(Math.max(y1,y2), Math.max(y3,y4));

        int r2_minX = Math.min(Math.min(x5,x6), Math.min(x7,x8));
        int r2_maxX = Math.max(Math.max(x5,x6), Math.max(x7,x8));
        int r2_minY = Math.min(Math.min(y5,y6), Math.min(y7,y8));
        int r2_maxY = Math.max(Math.max(y5,y6), Math.max(y7,y8));

        // intersection points 
        int minX = Math.max(r1_minX,r2_minX);
        int maxX = Math.min(r1_maxX,r2_maxX);
        int minY = Math.max(r1_minY,r2_minY);
        int maxY = Math.min(r1_maxY,r2_maxY);


        //output
        System.out.println(minX +" "+ minY); //1
        System.out.println(minX+ " "+ maxY); //2
        System.out.println(maxX+" "+minY); //3
        System.out.println(maxX +" "+ maxY); //4
    }
}