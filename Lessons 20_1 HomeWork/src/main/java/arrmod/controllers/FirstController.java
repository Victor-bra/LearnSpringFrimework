package arrmod.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname,
                            Model model){

        model.addAttribute("message", "Hello, " + name + " " + surname);
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodbyePage(@RequestParam(value = "name", required = false) String name,
                              @RequestParam(value = "surname", required = false) String surname){

        System.out.println("Goodbye, " + name + " " + surname);

        return "first/goodbye";
    }
    @GetMapping("/calculator")
    public String calculatorPage(@RequestParam("firstNumber") int firstNumber,
                                 @RequestParam("secondNumber") int secondNumber,
                                 @RequestParam("action") String action,
                                 Model model){

        String str = "";
        try {
            switch (action){
                case "multiplication":
                    str = (firstNumber*secondNumber)+"";
                    break;
                case "addition":
                    str = (firstNumber+secondNumber)+"";
                    break;
                case "subtraction":
                    str = (firstNumber-secondNumber)+"";
                    break;
                case "division":
                    str = ((double)firstNumber/(double)secondNumber)+"";
                    break;
                default:
                    str = "Unknown argument";
            }
        }catch (Exception e){
            str = "Parameter transfer error";
        }

        model.addAttribute("message", str);

        return "first/calculator";
    }
}
