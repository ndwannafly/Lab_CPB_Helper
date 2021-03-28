package github.itmo.opd.helper.Controller;

import github.itmo.opd.helper.Model.Directory;

import static github.itmo.opd.helper.HelperApplication.*;

public class CommandHelper {
    public static String display() {
        StringBuilder path = new StringBuilder();
        for (Directory directory: filePath) {
            path.append(directory.getName()).append("\\");
        }
        return path.toString();
    }
}
