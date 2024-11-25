package Katas.DiamondKata;

import java.util.List;

public class Diamond {

    public static String printDiamond(int n) {
        String diamond;
        int asteriskHelper = n - 2;
        int layerHelper = (n -1)/2;

        if (n <= 0 || n%2 == 0){
            diamond = null;
        } else {
            StringBuilder diamondBuilder = new StringBuilder();

            diamondBuilder.append("*".repeat(n)).append("\n");
            for (int i = 1; i < layerHelper + 1; i++) {
                StringBuilder miniBuild = new StringBuilder();
                String nextLayer = miniBuild.append(" ".repeat(i)).append("*".repeat(asteriskHelper)).append("\n").toString();

                diamondBuilder.append(nextLayer).insert(0, nextLayer);
                asteriskHelper -= 2;
            }

            diamond = diamondBuilder.toString();
        }

        return diamond;
    }
}
