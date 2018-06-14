package miracleletter.homecontroller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

	@RequestMapping(value="/")
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
	
	
	@RequestMapping("/login")
	public ModelAndView displayLoginPage(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}
	
	@RequestMapping(value="/processlogin", method=RequestMethod.POST)
	public ModelAndView processLogin(@RequestParam("email_address") String email_address,
			@RequestParam("password") String password, HttpServletRequest req) throws SQLException {
		ModelAndView mav = null;
		
		
		CustomerDAO cDAO = new CustomerDAO();
		Customer assignedCustomer = new Customer();
		assignedCustomer =  cDAO.getCustomerByEmail(email_address);
		
//		System.out.println(customer);
//		Customer assignedCustomer = cDAO.getCustomerByEmail(customer.getEmail_address());
		
		if (assignedCustomer !=null && cDAO.validateCustomer(assignedCustomer.getPassword(), password)) {
			mav = new ModelAndView("redirect:/");
			HttpSession session = null;
			session = req.getSession();
			session.setAttribute("email_address", email_address);
			session.setAttribute("password", password);
		} else {
//			HttpSession session = null;
//			HttpSession session = req.getSession();
//			session.setAttribute("customer", new Customer());	
			mav = new ModelAndView("redirect:/login");
		}
		
		return mav;
	}
}
