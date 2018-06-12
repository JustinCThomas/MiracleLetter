package miracleletter.homecontroller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import miracleletter.dao.CustomerDAO;
import miracleletter.models.Customer;

@Controller
@RequestMapping("/")
@SessionAttributes("customer")
public class HomeController {
	
	@ModelAttribute("customer")
	public Customer setUpCustomerForm() {
		return new Customer();
	}

	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView displayHomePage(@SessionAttribute(name="customer", required=false) Customer customer) {
		ModelAndView mav = new ModelAndView("home");
		return mav;
	}
	
	@RequestMapping(value="/processlogin", method=RequestMethod.POST)
	public ModelAndView processLogin(@ModelAttribute("customer") Customer customer) throws SQLException {
		ModelAndView mav = new ModelAndView("home");
		CustomerDAO cDAO = new CustomerDAO();
		System.out.println(customer);
		Customer assignedCustomer = cDAO.getCustomerByEmail(customer.getEmail_address());
		System.out.println("FSAFASFASFSAFSAFSAFSAFSA");
		if (cDAO.validateCustomer(assignedCustomer.getPassword(), customer.getPassword())) {
			mav.addObject("customer", assignedCustomer);
		}
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
	
	
	@RequestMapping("/login")
	public ModelAndView displayLoginPage(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}
}
