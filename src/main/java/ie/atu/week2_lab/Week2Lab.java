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
    @GetMapping("/calculate")
    public String calculate(@RequestParam int num1,@RequestParam int num2,@RequestParam String operation)
    {
        float ans;
        switch (operation)
        {
            case"add":
                ans = num1 + num2;
                break;
            case"subtract":
                ans = num1 - num2;
                break;
            case"divide":
                if(num2==0)
                {
                    return "You cannot divide by zero";

                }
                else{
                    ans = (float)num1/num2;
                }
                break;
            case "multiply":
                ans = num1*num2;
                break;
            default:
                return "Default statement";
        }
        return "The answer is "+ Float.toString(ans);
    }

}
