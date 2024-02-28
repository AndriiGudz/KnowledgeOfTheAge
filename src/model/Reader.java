package model;

public class Reader {
    private int id;
    private String nameReader;
    private Role role;

    public Reader(int id, String nameReader, Role role) {
        this.id = id;
        this.nameReader = nameReader;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getNameReader() {
        return nameReader;
    }

    public Role getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "id=" + id +
                ", nameReader='" + nameReader + '\'' +
                ", role=" + role +
                '}';
    }
}
