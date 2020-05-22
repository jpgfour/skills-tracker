package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    //return root request
    @GetMapping()
    public String plainOldHTML(){
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>THE BEST programming languages.  It's true.</h2>" +
                "<ol>" +
                "<li>Basic</li>" +
                "<li>Pascal</li>" +
                "<li>Visual Basic</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
        public String returnEmptyForm(){

            return "<form action='/form' method='post'>" +
                    "<label for='name'>Name:</label>" + //submit a request to the root? I hope
                    "<br>" +
                    "<input type='text' name='name'>" +
                    "<br>" +
                    "<label for='fave1'>My favorite language:</label>" +
                    "<br>" +
                    "<select name='fave1' id='fave1'>" +
                    "<option value=''>--Please choose an option--</option>"+
                    "<option value='Basic'>Basic</option>" +
                    "<option value='Pascal'>Pascal</option>" +
                    "<option value='Visual Basic'>Visual Basic</option>" +
                    "</select>" +
                    "<br>" +
                    "<label for='fave2'>My second favorite language:</label>" +
                    "<br>" +
                    "<select name='fave2' id='fave2'>" +
                    "<option value=''>--Please choose an option--</option>"+
                    "<option value='Basic'>Basic</option>" +
                    "<option value='Pascal'>Pascal</option>" +
                    "<option value='Visual Basic'>Visual Basic</option>" +
                    "</select>" +
                    "<br>" +
                    "<label for='fave3'>My third favorite language:</label>" +
                    "<br>" +
                    "<select name='fave3' id='fave3'>" +
                    "<option value=''>--Please choose an option--</option>"+
                    "<option value='Basic'>Basic</option>" +
                    "<option value='Pascal'>Pascal</option>" +
                    "<option value='Visual Basic'>Visual Basic</option>" +
                    "</select>" +
                    "<br>" +
                    "<input type ='submit' value='SUBMIT!'>" +
                    "</form>";
        }

        @PostMapping("form")
        public String returnFormResults(@RequestParam String name, @RequestParam String fave1, @RequestParam String fave2, @RequestParam String fave3){

            return "<html>" +
                        "<body>" +
                        "<h1>" +
                        name +
                        "</h1>" +
                        "<h2>" +
                        "<ol>" +
                        "<li>" +
                        fave1 +
                        "</li>" +
                        "<li>" +
                        fave2 +
                        "</li>" +
                        "<li>" +
                        fave3 +
                        "</li>" +
                        "</ol>" +
                        "<h2>" +
                        "</body>" +
                        "</html>";
        }

}
