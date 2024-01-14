package practice.collections;

public class Footballer {


    private String name;
    private String club;
    private long price;

    public Footballer(String name, String club, long price, int age) {
        this.name = name;
        this.club = club;
        this.price = price;
        this.age = age;
    }

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Footballer{" +
                "name='" + name + '\'' +
                ", club='" + club + '\'' +
                ", price=" + price +
                ", age=" + age +
                '}';
    }
}
