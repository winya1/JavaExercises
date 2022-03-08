public class Bird {

    public String bird;
    private String name;
    private String latinName;
    private int count;


    public Bird (String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.count = 0;
    }

    public void increasedCount() {
        this.count++;
    }

    public String getName() {
        return this.name;
    }


    public String toString() {
        return this.name + " (" + this.latinName + ") " + count + " observations";
     }

}

