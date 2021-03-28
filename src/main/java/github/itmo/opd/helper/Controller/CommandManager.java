package github.itmo.opd.helper.Controller;

import github.itmo.opd.helper.Model.EchoCommand;
import github.itmo.opd.helper.Model.MkdirCommand;
import github.itmo.opd.helper.Model.TouchCommand;

public class CommandManager {
    private final EchoCommand echoCommand = new EchoCommand();
    private final MkdirCommand mkdirCommand = new MkdirCommand();
    private final TouchCommand touchCommand = new TouchCommand();

    public void echo(String content, String fileName) {
        echoCommand.execute(new String[]{content, fileName});
    }

    public void mkdir(String fileName) {
        mkdirCommand.execute(new String[]{fileName});
    }

    public void touch(String fileName) {
        touchCommand.execute(new String[]{fileName});
    }
}
