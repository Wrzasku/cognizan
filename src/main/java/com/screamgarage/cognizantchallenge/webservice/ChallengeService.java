package com.screamgarage.cognizantchallenge.webservice;

import com.screamgarage.cognizantchallenge.entity.Challenge;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableAutoConfiguration
@CrossOrigin(origins = "http://localhost:4200")
public class ChallengeService {
    @RequestMapping(value = "/api/challenge" , method = RequestMethod.GET)
    List<Challenge> home(){
        return List.of(new Challenge("test", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean tempus posuere leo, id aliquam tortor maximus quis. Suspendisse a leo pulvinar, volutpat lorem ac, dictum leo. Vestibulum placerat neque cursus dolor tincidunt, ut venenatis nunc scelerisque. Pellentesque condimentum augue sodales lorem dapibus ultrices. Fusce in nisi ac elit posuere pulvinar sit amet ut dui. Phasellus pellentesque felis eleifend, viverra turpis eget, rutrum nisl. Donec at ligula et urna pharetra ullamcorper faucibus at ipsum. Sed ut mauris vel velit porttitor finibus quis ac nulla. Praesent gravida viverra diam, sed imperdiet nisi aliquet vitae. Nullam laoreet a metus efficitur elementum. Integer laoreet a risus ut sollicitudin." ),
                new Challenge("test2", "ipsum dolor sit amet, consectetur adipiscing elit. Aenean tempus posuere leo, id aliquam tortor maximus quis. Suspendisse a leo pulvinar, volutpat lorem ac, dictum leo. Vestibulum placerat neque cursus dolor tincidunt, ut venenatis nunc scelerisque. Pellentesque condimentum augue sodales lorem dapibus ultrices. Fusce in nisi ac elit posuere pulvinar sit amet ut dui. Phasellus pellentesque felis eleifend, viverra turpis eget, rutrum nisl. Donec at ligula et urna pharetra ullamcorper faucibus at ipsum. Sed ut mauris vel velit porttitor finibus quis ac nulla. Praesent gravida viverra diam, sed imperdiet nisi aliquet vitae. Nullam laoreet a metus efficitur elementum. Integer laoreet a risus ut sollicitudin." )
                );
    }
}
