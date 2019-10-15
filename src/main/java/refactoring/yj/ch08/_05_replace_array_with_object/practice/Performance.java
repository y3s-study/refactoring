package refactoring.yj.ch08._05_replace_array_with_object.practice;

public class Performance {
    private String name;
    private Integer wins;

    public void setName(String name) {
        this.name = name;
    }

    public void setWins(String wins) {
        this.wins = Integer.parseInt(wins);
    }

    public String getName() {
        return name;
    }

    public Integer getWins() {
        return wins;
    }
}
