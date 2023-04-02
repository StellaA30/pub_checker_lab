public class Guest {

    private String name;
    private int age;
    private double wallet;

    public Guest(String name, int age, double wallet){

        this.name = name;
        this.age = age;
        this.wallet = wallet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {

        return this.age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }
}

