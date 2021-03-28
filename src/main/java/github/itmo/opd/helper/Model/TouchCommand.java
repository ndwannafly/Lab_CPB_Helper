package github.itmo.opd.helper.Model;

import static github.itmo.opd.helper.HelperApplication.filePath;

public class TouchCommand implements ICommand {

    @Override
    public void execute(String[] arg) {
        assert arg.length == 1: "touch must have only 1 argument";
        System.out.println("touch " + arg[0]);

        Directory currentDirectory = filePath.get(filePath.size()-1);
        File file = new File(arg[0]);

        currentDirectory.addFile(file);
    }
}
