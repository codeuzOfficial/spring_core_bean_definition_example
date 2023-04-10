package dasturlash.uz;

public class InitMethodComponent {
    private String title;

    public void initializationMethod() {
        System.out.println("init method called");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
