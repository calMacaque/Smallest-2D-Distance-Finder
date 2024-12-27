import java.util.Scanner;
import java.util.Arrays;

class Main{
    
    //method for finding closest points
static void closestPoints(double[][] table) {
    double[][] closestPts = new double[2][2]; // Table for closest points
    double closest = Double.MAX_VALUE; // Start with largest possible double number in java
    for (int i = 0; i < table.length - 1; i++) {
        for (int j = i + 1; j < table.length; j++) {
            double xSq = Math.pow((table[i][0] - table[j][0]), 2);
            double ySq = Math.pow((table[i][1] - table[j][1]), 2);
            double distance = Math.sqrt(xSq + ySq);

            if (distance < closest) {
                closest = distance;
                closestPts[0][0] = table[i][0];
                closestPts[0][1] = table[i][1];
                closestPts[1][0] = table[j][0];
                closestPts[1][1] = table[j][1];
            }
        }
    }
    System.out.println("Smallest distance: " + closest + "\n");
    System.out.println("The 2 points are: " + Arrays.deepToString(closestPts));
}

    
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of points: ");
        int points = sc.nextInt();
        
        //creating coordinate table
        double[][] coordinates = new double[points][2];
        double x, y;
        for(int i = 0; i < points; i++){
            System.out.println("Enter coordinates of point " + (i+1) + ": ");
              x = sc.nextDouble();
              y = sc.nextDouble();
              coordinates[i][0] = x;
              coordinates[i][1] = y;
              System.out.println();
        }
        closestPoints(coordinates);
        sc.close();
    }
}
