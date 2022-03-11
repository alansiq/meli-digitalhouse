import java.util.Random;

public class Challenge {

    public static void main(String[] args) {

        Integer[][] temperaturesMatrix = {
                {-2, 33},
                {-3, 32},
                {-8, 27},
                {4, 37},
                {6, 42},
                {5, 43},
                {0, 39},
                {-7, 26},
                {-1, 31},
                {-10, 35}
        };



        String[] citiesVector = {
                "Londres",
                "Madrid",
                "Nueva York",
                "Buenos Aires",
                "Asunción",
                "São Paulo",
                "Lima",
                "Santiago de Chile",
                "Lisboa",
                "Tokio",
        };

        int minTempIndex = 0;
        int maxTempIndex = 0;

        int maxRegisteredTemp = Integer.MIN_VALUE;
        int minRegisteredTemp = Integer.MAX_VALUE;

        for (int i = 0; i < temperaturesMatrix.length; i++) {
            for (int j = 0; j < temperaturesMatrix[i].length; j++) {
                if (temperaturesMatrix[i][j] > maxRegisteredTemp) {
                    maxRegisteredTemp = temperaturesMatrix[i][j];
                    maxTempIndex = i;
                }

                if (temperaturesMatrix[i][j] < minRegisteredTemp) {
                    minRegisteredTemp = temperaturesMatrix[i][j];
                    minTempIndex = i;
                }
            }
        }

        printMaxTemp(citiesVector[maxTempIndex], maxRegisteredTemp);
        printMinTemp(citiesVector[minTempIndex], minRegisteredTemp);

    }

    public static void printMaxTemp(String city, int temp) {
        System.out.println(city + " foi a cidade com a maior temperatura, chegando em: " + temp + " graus celsius");
    }

    public static void printMinTemp(String city, int temp) {
        System.out.println("Enquanto isso " + city + " bate o recorde de menor temperatura, com congelantes: " + temp + " graus celsius");
    }
}


