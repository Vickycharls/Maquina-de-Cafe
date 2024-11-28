    public class Main {
    private static int cups = 10;
    private static int coffee = 50; // Oz disponibles
    private static int sugar = 20; // Cucharadas disponibles

    // Método para obtener el tamaño del vaso
    public static String getCupSize(String size) {
        switch (size.toLowerCase()) {
            case "small":
                if (cups == 0 || coffee < 3) return "Insufficient resources";
                cups--; coffee -= 3;
                return "3 Oz";
            case "medium":
                if (cups == 0 || coffee < 5) return "Insufficient resources";
                cups--; coffee -= 5;
                return "5 Oz";
            case "large":
                if (cups == 0 || coffee < 7) return "Insufficient resources";
                cups--; coffee -= 7;
                return "7 Oz";
            default:
                return "Invalid size";
        }
    }

    // Método para agregar azúcar
    public static String addSugar(int spoons) {
        if (spoons < 0 || sugar < spoons) {
            return "Insufficient sugar";
        }
        sugar -= spoons;
        return spoons + (spoons == 1 ? " spoon of sugar" : " spoons of sugar");
    }
}