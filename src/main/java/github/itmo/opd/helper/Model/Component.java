package github.itmo.opd.helper.Model;

public abstract class Component {
    String name;
    boolean[] permission;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean[] getPermission() {
        return permission;
    }

    public void setPermission(boolean[] permission) {
        this.permission = permission;
    }
}
