package pl.zaworov.learningApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.zaworov.learningApp.application.RiverDAO;

@Controller
public class LearningAppController {

	@Autowired
	RiverDAO riverDAO;

	@RequestMapping("/main")
	public String returnMain() {
		return "main";
	}

	@RequestMapping("/add")
	public String addRiver(Model model) {
		return "addRiver";
	}

	@RequestMapping("/list")
	public String showRivers() {
		return "showRivers";
	}

	@RequestMapping("/river/{id}")
	public String showRiverDetails(@PathVariable("id") Integer id, Model model) {
		model.addAttribute("river", riverDAO.getRiverById(id));
		return "details";
	}
}