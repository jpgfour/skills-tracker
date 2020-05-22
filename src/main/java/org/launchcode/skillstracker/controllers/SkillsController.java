package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    //return root request
    @GetMapping()
    public String plainOldHTML(){
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>" +
                "<ol>" +
                "<li>Basic</li>" +
                "<li>Pascal</li>" +
                "<li>Visual Basic</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String returnForm(){
        return "<form action='/' method='get'>" +
                "<label for='name'>Name:</label>" + //submit a request to the root? I hope
                "<br>" +
                "<input type='text' name='name'>" +
                "<br>" +
                "<label for='fave1'>My favorite language:</label>" +
                "<br>" +
                "<select name='fave1' id='fave1'>\\n\" +\n" +
                "//                \"    <option value=\\\"\\\">--Please choose an option--</option>\\n\" +\n" +
                "//                \"    <option value=\\\"basic\\\">Basic</option>\\n\" +\n" +
                "//                \"    <option value=\\\"pascal\\\">Pascal</option>\\n\" +" +
                "//                \"    <option value=\\\"vb\\\">Visual Basic</option>\\n\" +" +
                "</select>" +
                "<br>" +
                "<label for='fave2'>My second favorite language:</label>" +
                "<br>" +
                "<select name='fave2' id='fave2'>\\n\" +\n" +
                "//                \"    <option value=\\\"\\\">--Please choose an option--</option>\\n\" +\n" +
                "//                \"    <option value=\\\"basic\\\">Basic</option>\\n\" +\n" +
                "//                \"    <option value=\\\"pascal\\\">Pascal</option>\\n\" +" +
                "//                \"    <option value=\\\"vb\\\">Visual Basic</option>\\n\" +" +
                "</select>" +
                "<br>" +
                "<label for='fave3'>My third favorite language:</label>" +
                "<br>" +
                "<select name='fave3' id='fave3'>\\n\" +\n" +
                "//                \"    <option value=\\\"\\\">--Please choose an option--</option>\\n\" +\n" +
                "//                \"    <option value=\\\"basic\\\">Basic</option>\\n\" +\n" +
                "//                \"    <option value=\\\"pascal\\\">Pascal</option>\\n\" +" +
                "//                \"    <option value=\\\"vb\\\">Visual Basic</option>\\n\" +" +
                "</select>" +
                "<br>" +
                "<input type ='submit' value='SUBMIT!'>" +
                "</form>";

    }





}
