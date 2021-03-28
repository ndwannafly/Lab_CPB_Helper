package github.itmo.opd.helper.Model;

import static github.itmo.opd.helper.Controller.CommandHelper.*;

public class EchoCommand implements ICommand {

    @Override
    public void execute(String[] arg) {
        assert arg.length == 2: "echo must have 2 arguments";
        String content = arg[0];
        String fileName = arg[1];
        System.out.println("echo \"" + content + "\" > " + display() + fileName);
    }
}
