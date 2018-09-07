package firstExample;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  @RequestMapping("/message")
  public String index() {
    return "Basic Example which show that you succesfully start a web service";
  }
	
}
