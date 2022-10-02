package numRoot;

import java.text.DecimalFormat;

public class RootNumbs {

    private final String[] numbs;

    public RootNumbs(String[] numbs) {
        this.numbs = numbs;
    }

    public String[] sqrtNumbs() {
        double newNum;
        DecimalFormat f = new DecimalFormat("##.00");
        String[] ans = new String[numbs.length];
        for (int i = 0; i < numbs.length; i++) {
            newNum = Math.sqrt(Double.parseDouble(numbs[i]));
            ans[i] = f.format(newNum);
        }
        return ans;

    }

    public String[] cbrtNumbs() {
        double newNum;
        DecimalFormat f = new DecimalFormat("##.00");
        String[] ans = new String[numbs.length];
        for (int i = 0; i < numbs.length; i++) {
            newNum = Math.cbrt(Double.parseDouble(numbs[i]));
            ans[i] = f.format(newNum);
        }
        return ans;

    }

    public String[] pow2Numbs() {
        double newNum;
        DecimalFormat f = new DecimalFormat("##.0");
        String[] ans = new String[numbs.length];
        for (int i = 0; i < numbs.length; i++) {
            newNum = Math.pow(Double.parseDouble(numbs[i]), 2);
            ans[i] = f.format(newNum);
        }
        return ans;

    }
}
