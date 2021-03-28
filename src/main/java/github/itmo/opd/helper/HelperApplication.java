package github.itmo.opd.helper;

import github.itmo.opd.helper.Model.Directory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SpringBootApplication
public class HelperApplication {
    public static List<Directory> filePath = new ArrayList<>() {
        {
            add(new Directory(""));
        }
    };

    public static void main(String[] args) {
        SpringApplication.run(HelperApplication.class, args);
    }

}
