package guru.springframework.joke.jokeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.joke.jokeapp.services.JokeService;



@Controller
public class jokeController {
	
	private JokeService jokeService;

	public jokeController(JokeService jokeService) {
		
		this.jokeService = jokeService;
	}
	
	@RequestMapping({"/", ""})
	public String showJoke(Model model) {
		model.addAttribute("joke", jokeService.getJoke());
		return "chucknorris";
	}

}
