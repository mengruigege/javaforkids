public class TemperatureConverter {
    public static void main(String[] args){
        System.out.println("Convering 21C to Fahrenheit. " + convertTemp(21,'F'));
        System.out.println("Convering 72F to Celsius. " + convertTemp(72,'C'));
    }

    public static String convertTemp (float temperature, char convertTo){
        switch (convertTo){
            case 'F':
                float f  = 9 * temperature / 5 + 32;
                return "The temperature in Fahrenheit is " + f;
            case 'C':
                float c = (temperature - 32) * 5 / 9;
                return "The temperature in Celsis is " + String.format("%06.1f", c);
             default:
                return "You can enter either F or C as convertTo argument ";
        }
    }
}
