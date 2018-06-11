package miracleletter.homecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import miracleletter.models.Customer;

@Controller
@RequestMapping("/")
@SessionAttributes("customer")
public class HomeController {
	
//	@ModelAttribute("customer")
//	public Customer setUpCustomerForm() {
//		return new Customer();
//	}

	@RequestMapping("/")
	public ModelAndView displayHomePage() {
		ModelAndView mav = new ModelAndView("home");
		return mav;
	}
	
	@RequestMapping("/letters")
	public ModelAndView displayLetters() {
		ModelAndView mav = new ModelAndView("letters");
		return mav;
	}
	
	@RequestMapping(value="/envelopes")
	public ModelAndView displayEnvelopes() {
		ModelAndView mav = new ModelAndView("envelopes");
		return mav;
	}
	
	@RequestMapping("/about")
	public ModelAndView displayAboutPage() {
		ModelAndView mav = new ModelAndView("about");
		return mav;
	}
	
	@RequestMapping("/faq")
	public ModelAndView displayFAQPage() {
		ModelAndView mav = new ModelAndView("faq");
		return mav;
	}
	
	@RequestMapping("/contact")
	public ModelAndView displayContactPage() {
		ModelAndView mav = new ModelAndView("contact");
		return mav;
	}
	
	@RequestMapping("/cart")
	public ModelAndView displayCart() {
		ModelAndView mav = new ModelAndView("cart");
		return mav;
	}
	
	@RequestMapping("/checkout")
	public ModelAndView displayCheckout() {
		ModelAndView mav = new ModelAndView("checkout");
		return mav;
	}
	
	@RequestMapping("/registration")
	public ModelAndView displayRegistrationPage() {
		ModelAndView mav = new ModelAndView("register");
		return mav;
	}
	
	
	@RequestMapping(value="/login")
	public ModelAndView displayLoginPage(@SessionAttribute("customer")Customer customer,
			BindingResult errors) {
//		if (errors.hasErrors()) {
//			ModelAndView mav = new ModelAndView("/");
//		}
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}
}
