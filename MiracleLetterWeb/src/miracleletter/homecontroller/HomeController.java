package miracleletter.homecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView displayHomePage() {
		ModelAndView mav = new ModelAndView("home");
		return mav;
	}
	
	@RequestMapping(value="/about")
	public ModelAndView displayAboutPage() {
		ModelAndView mav = new ModelAndView("about");
		return mav;
	}
	
	@RequestMapping(value="/faq")
	public ModelAndView displayFAQPage() {
		ModelAndView mav = new ModelAndView("faq");
		return mav;
	}
	
	@RequestMapping(value="/contact")
	public ModelAndView displayContactPage() {
		ModelAndView mav = new ModelAndView("contact");
		return mav;
	}
	
}
