public class Director{

    String fullName;

    public Director(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Director{" +
                "fullName='" + fullName + '\'' +
                '}';
    }

}
