package PACKAGE_NAME;public class main {
   private static String name = "Ahymukan";
    private static float weightOnEarth = 201.5f;
    private static float marsGravityPercentage = 0.38f;

    public static void main(String[] args) {
        float weightOnMars = weightOnEarth * marsGravityPercentage;
        System.out.println("Weight on Mars before casting to double: " + weightOnMars);
        double marsWeightDouble = weightOnMars;
        System.out.printf("Weight on Mars as double: %.4f%n", marsWeightDouble);
        int marsWeightInt = (int) marsWeightDouble;
        System.out.println("Weight on Mars as int after casting: " + marsWeightInt);
        char marsWeightChar = (char) marsWeightInt;
        System.out.println("Weight on Mars as char after casting: " + marsWeightChar);
        int newWeightInt = marsWeightChar + 10;
        System.out.println("New weight after performing math operation on char: " + newWeightInt);
    }
}
