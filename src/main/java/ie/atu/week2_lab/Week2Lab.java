package ie.atu.week2_lab;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/person")
@RestController
public class Week2Lab {

    @GetMapping("/sayHello")
    public String sayHell() {

        return "Hi there";

    }
    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name)
    {
        return "Your name is " +name;
    }
    @GetMapping ("/details")
    public String details (@RequestParam String name, @RequestParam int age)
    {
        return "Your name is " + name +" and you are " + age + " years old ";
    }
}
