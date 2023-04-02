public class Guest {

    private String name;
    private int age;
    private double money;
    private int sobriety;
    private boolean isBanned;
    private char currency;
    private String favouriteDrink;

    public Guest(String name, int age, double money, int sobriety, boolean isBanned, char currency, String favouriteDrink
    ){
        this.name = name;
        this.age = age;
        this.money = money;
        this.sobriety = sobriety;
        this.isBanned = isBanned;
        this.currency = currency;
        this.favouriteDrink = favouriteDrink;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getSobriety() {
        return sobriety;
    }

    public void setSobriety(int sobriety) {
        this.sobriety = sobriety;
    }

    public boolean getIsBanned() {
        return isBanned;
    }

    public void setIsBanned(boolean banned) {
        isBanned = banned;
    }

    public char getCurrency() {
        return currency;
    }

    public void setCurrency(char currency) {
        this.currency = currency;
    }

    public String getFavouriteDrink() {
        return favouriteDrink;
    }

    public void setFavouriteDrink(String favouriteDrink) {
        this.favouriteDrink = favouriteDrink;
    }

}