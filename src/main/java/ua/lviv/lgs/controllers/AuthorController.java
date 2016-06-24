package ua.lviv.lgs.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.lviv.lgs.entity.Author;
import ua.lviv.lgs.services.AuthorService;

import java.util.List;

/**
 * Created by Yulian Bulbuk on 22.06.2016.
 */
@Controller
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @RequestMapping(value = "/allAuthors", method = RequestMethod.GET)
    private String authorsAll(Model model){
        List<Author> authorList = authorService.findAll();
        model.addAttribute("authors",authorList);
        return "authorsAll";
    }

    @RequestMapping(value = "authorNew", method = RequestMethod.GET)
    private String authorNew(){
        return "fromViewToController";
    }

    @RequestMapping(value = "createAuthor", method = RequestMethod.POST)
    private String createNewAuthor(@RequestParam("name")String name,@RequestParam("country")String country ){
        authorService.add(name,country);
        return "redirect:/allAuthors";
    }


}
