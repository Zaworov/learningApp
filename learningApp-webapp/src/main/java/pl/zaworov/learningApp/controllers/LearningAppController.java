package pl.zaworov.learningApp.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.zaworov.learningApp.application.RiverDAO;
import pl.zaworov.learningApp.domain.RiverAdditionDTO;

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

	@RequestMapping("/river-{id}")
	public String showRiverDetails(@PathVariable("id") Integer id, Model model) {
		model.addAttribute("river", riverDAO.getRiverById(id));
		return "river";
	}

	@RequestMapping("/formularz")
	public String riverForm(@ModelAttribute("form") @Valid RiverAdditionDTO form, BindingResult result) {
		if (result.hasErrors()) {
			return "widok.formularz";
		} else {
			return "redirect:/poFormularzu";
		}
	}
}