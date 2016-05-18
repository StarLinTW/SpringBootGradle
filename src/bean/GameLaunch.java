package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class GameLaunch {

    @Autowired
    private GameDao gameDao;
    
    @RequestMapping("/ZombieKilling")
    @ResponseBody
    public String create() {
      String userId = "";
      try {
    	  GameRequest gameRequest = new GameRequest();
    	  Payload payload = new Payload();
    	  gameRequest.setCurrency("GG");   	  
    	  payload.setPID("123");
    	  gameRequest.setPayload(payload);
    	  gameDao.save(gameRequest);
      }
      catch (Exception ex) {
    	  ex.printStackTrace();
        return "Error creating the user: " + ex.toString();
      }
      return "User succesfully created with id = " + userId;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(GameLaunch.class, args);
    }

}