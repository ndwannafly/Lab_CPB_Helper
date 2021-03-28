package github.itmo.opd.helper.Model;

public class File extends Component {
    private String content;

    public File(String name) {
        this.name = name;
    }

    public File(String name, String content) {
        this.name = name;
        this.content = content;
    }
}
