package pl.zaworov.learningApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.zaworov.learningApp.application.RiverDAO;

@Controller
public class LearningAppController {

	@Autowired
	RiverDAO riverDAO;

	// probne - do usuniecia
	@RequestMapping("/main")
	public String returnMain() {
		return "main";
	}

	@RequestMapping("/add-river")
	public String addRiver(Model model) {
		return "addRiver";
	}

	// @RequestMapping("/list")
	// public void showRivers() {
	// // show rivers
	// }
	@RequestMapping("/list")
	public String showRivers() {
		return "showRivers";
		// show rivers
	}

	@RequestMapping("/model")
	public String modelExample(Model model) {
		model.addAttribute("message", "Information passed to main.jsp by method modelExample()");
		return "main";
	}
}