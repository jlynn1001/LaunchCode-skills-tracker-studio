package org.launchcode.skillstracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {
@GetMapping
@ResponseBody
    public String codingLanguageList(){
    return "<html>\n" +
            "</head>\n" +
            "<body>\n" +
            "<h1>Skills Tracker</h1>\n" +
            "<h2>We have a few skills we would like to learn. Here is the list:</h2>" +
            "    <ol>\n" +
            "        <li>Java</li>\n" +
            "        <li>C#</li>\n" +
            "        <li>Javascript</li>\n" +
            "    </ol>\n" +
            "</body>\n" +
            "</html>";
}
@GetMapping("/form")
@ResponseBody
    public String codeLanguageForm(){
    return
            "<form method='POST'>" +
            "Name: <br>" +
            "<input type = 'text' name = 'name'/>" +
            "<br>My favorite language:<br>" +
            "    <select name = 'firstChoice'>" +
            "        <option value = 'Java'>Java</option>" +
            "        <option value = 'C#'>C#</option>" +
            "        <option value = 'JavaScript'>JavaScript</option>" +
            "    </select>" +
            "<br>My second favorite language:<br>" +
            "    <select name = 'secondChoice'>" +
            "        <option value = 'Java'>Java</option>" +
            "        <option value = 'C#'>C#</option>" +
            "        <option value = 'JavaScript'>JavaScript</option>" +
            "    </select>" +
            "<br>My third favorite  language:<br>" +
            "    <select name = 'thirdChoice'>" +
            "        <option value = 'Java'>Java</option>" +
            "        <option value = 'C#'>C#</option>" +
            "        <option value = 'JavaScript'>JavaScript</option>" +
            "    </select><br>" +
            "<input type = 'submit' value = 'Submit'/>" +
            "</form>" ;
}
@PostMapping("/form")
@ResponseBody
public String handleForm(@RequestParam String name, @RequestParam String firstChoice, @RequestParam String secondChoice, @RequestParam String thirdChoice)
{
  return "<h1>" + name + "</h1>" +
   "<ol>" +
          "<li>" + firstChoice + "</li>" +
          "<li>" + secondChoice + "</li>" +
          "<li>" + thirdChoice + "</li>" +
          "</ol>";
}
}
