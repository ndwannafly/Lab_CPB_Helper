package github.itmo.opd.helper.Model;

import java.util.List;

public class Directory extends Component {
    private List<Component> contentList;

    public Directory(String name) {
        this.name = name;
    }

    public void addFile(File file) {
        contentList.add(file);
    }
}
