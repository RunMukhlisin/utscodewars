package uts_codewars;

public class Calculate {

    public static String bmi(double weight, double height) {
        double BMI = weight / (height * height);

        if (BMI <= 18.5) {
            return "Underweight";
        } else if (BMI <= 25.0) {
            return "Normal" ;
        }else if (BMI <= 30.0) {
            return "Overweight" ;
        }else {
            return "Obese" ;
        }
    }
    
    public static void main(String[] args) {
        double weight1 = 20;
        double height1 = 1.75;
        System.out.println("BMI Category: " + bmi (weight1, height1));
        
        double weight2 = 55;
        double height2 = 1.60;
        System.out.println("BMI Category: " + bmi (weight2, height2));
        
        double weight3 = 90;
        double height3 = 1.80;
        System.out.println("BMI Category: " + bmi (weight3, height3));
        
        double weight4 = 100;
        double height4 = 1.70;
        System.out.println("BMI Category: " + bmi (weight4, height4));
    }

}
