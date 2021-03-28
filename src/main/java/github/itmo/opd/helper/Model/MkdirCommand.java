package github.itmo.opd.helper.Model;

import static github.itmo.opd.helper.HelperApplication.*;

public class MkdirCommand implements ICommand {

    @Override
    public void execute(String[] arg) {
        assert arg.length == 1: "mkdir must have only 1 argument";
        System.out.println("mkdir " + arg[0]);
        Directory directory = new Directory(arg[0]);
        filePath.add(directory);
    }
}
