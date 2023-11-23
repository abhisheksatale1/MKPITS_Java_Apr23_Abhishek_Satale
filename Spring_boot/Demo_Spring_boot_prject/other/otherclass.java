package other;

import com.example.demo_project_spring_boot.Account.Account;
import org.springframework.stereotype.Component;

@Component
public class otherclass implements Account {

    @Override
    public String display() {

        return "This is Other class";
    }
}
