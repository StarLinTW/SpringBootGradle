package hello.controller;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hello.entity.GameRequest;
import hello.entity.GameResponse;
import hello.repo.GameRequestDao;
import hello.repo.GameResponseDao;


@RestController
@EnableAutoConfiguration
public class GameLaunch {

   
	@Autowired
    private GameRequestDao gameRequestDao;
	@Autowired
    private GameResponseDao gameResponseDao;
    
    @RequestMapping(value="/ZombieKilling")
    public GameResponse create(@RequestBody GameRequest gameRequest) {
      GameResponse gameReponse = new GameResponse();
      try {
    	  
    	  System.out.println(gameRequest);
    	  gameRequestDao.save(gameRequest);
    	  gameReponse = getResponse(gameRequest);
    	  gameResponseDao.save(gameReponse);
      }
      catch (Exception ex) {
    	  ex.printStackTrace();
      }
      return gameReponse;
    }
    
    private GameResponse getResponse(GameRequest gameRequest){
    	GameResponse gameReponse = new GameResponse();
    	gameReponse.setB("51800");
    	gameReponse.setBPL("5");
    	gameReponse.setCFGG("20");
    	gameReponse.setUserId("13456811");
    	gameReponse.setCreateDate(new Timestamp(System.currentTimeMillis()));
    	gameReponse.setCW("2");
    	gameReponse.setFID("1");
    	gameReponse.setLB("10000000");
    	gameReponse.setMSGID("BET");
    	gameReponse.setMUL("3");
    	gameReponse.setRS("6|8|19|8|0|");    	
    	return gameReponse;
    }
    
    @RequestMapping(value="/get/{currency}")
    public void getCurrency(@PathVariable("currency")String cur){
    	System.out.println(gameRequestDao.findByCurrencyStartingWith(cur));
    	//System.out.println(gameRequestDao.findByCurrency("CNY"));
    	
    }

}