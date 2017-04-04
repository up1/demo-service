package demo.adapter;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserAdapter {

    public User getUserDetail(long userId) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:9001/user/" + userId;
        User user = restTemplate.getForObject(url, User.class);
        return  user;
    }

}


