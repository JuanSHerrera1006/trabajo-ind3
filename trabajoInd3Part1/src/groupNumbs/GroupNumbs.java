package groupNumbs;

public class GroupNumbs {

    private String[] numbs;

    public GroupNumbs(String[] numbs) {
        this.numbs = numbs;
    }

    public String[] getNumbs() {
        return numbs;
    }

    public void setNumbs(String[] numbs) {
        this.numbs = numbs;
    }

    public String maxNumb() {
        double numb;
        double maxNumb = Double.MIN_VALUE;
        for (String strNumb : numbs) {
            numb = Double.parseDouble(strNumb);
            if (numb > maxNumb) {
                maxNumb = numb;
            }
        }
        return String.valueOf(maxNumb);

    }
}
