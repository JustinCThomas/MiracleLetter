package miracleletter.homecontroller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	
	@RequestMapping(value="/design")
	public ModelAndView displayDesignPage() {
		ModelAndView mav = new ModelAndView("design");
		return mav;
	}
	
	@RequestMapping(value="/buy")
	public ModelAndView displayBuyingPage(HttpServletRequest req, RedirectAttributes attributes) {
		ModelAndView mav = null;
		
		HttpSession session = null;
		session = req.getSession();
		String email_address = (String) session.getAttribute("email_address"); 
		
		if (email_address != null) {
			mav = new ModelAndView("buy");
		} else {
			mav = new ModelAndView("redirect:/");
			attributes.addFlashAttribute("errorMessage", "<span>Can only access \"buy\" page when logged in.</span>");
		}
			
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
	
	@RequestMapping(value="/processcart", method=RequestMethod.POST)
	public ModelAndView processCart(@RequestParam("template-choice") String template_choice,
			@RequestParam("envelope-type") String envelope_type, HttpServletRequest req, RedirectAttributes attributes) {
		
		List<String> letterChoices = new ArrayList<String>();
		List<String> envelopeChoices = new ArrayList<String>();
		
		HttpSession session = null;
		session = req.getSession();
		
		if (session.getAttribute(template_choice) == null &&
			session.getAttribute(envelope_type) == null) {
			letterChoices.add(template_choice);
			envelopeChoices.add(envelope_type);
			
		} else {
			letterChoices = (List<String>) session.getAttribute(template_choice);
			letterChoices.add(template_choice);
			
			envelopeChoices = (List<String>) session.getAttribute(envelope_type);
			envelopeChoices.add(envelope_type);
			
			System.out.println(template_choice);
			System.out.println(envelope_type);
		}
		

		session.setAttribute("template_choice", template_choice);
		session.setAttribute("envelope_type", envelope_type);
		
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
	
	@RequestMapping("/processregistration")
	public ModelAndView processRegistration(@RequestParam("email_address") String email_address,
			@RequestParam("password") String password, RedirectAttributes attributes) throws SQLException {
		ModelAndView mav = null;
		
		CustomerDAO cDAO = new CustomerDAO();
		Customer customer= new Customer();
		customer =  cDAO.getCustomerByEmail(email_address);
		
//		Checks if a customer account exists for that email_address
		if (customer == null) {
			mav = new ModelAndView("redirect:/");
			customer = new Customer();
			customer.setEmail_address(email_address);
			customer.setPassword(password);
			cDAO.registerCustomer(customer);
			attributes.addFlashAttribute("registerSuccess", "<span id='register-success'>Successfully registered!</span>");
		} else {
			attributes.addFlashAttribute("emailInUse", "<span>Email is already in use.</span>");
			mav = new ModelAndView("redirect:registration");
		}
		
		return mav;	
	}
	
	
	@RequestMapping("/login")
	public ModelAndView displayLoginPage(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}
	
	@RequestMapping(value="/processlogin", method=RequestMethod.POST)
	public ModelAndView processLogin(@RequestParam("email_address") String email_address,
			@RequestParam("password") String password, HttpServletRequest req, RedirectAttributes attributes) throws SQLException {
		ModelAndView mav = null;
		
		
		CustomerDAO cDAO = new CustomerDAO();
		Customer assignedCustomer = new Customer();
		assignedCustomer =  cDAO.getCustomerByEmail(email_address);

		
		if (assignedCustomer != null && cDAO.validateCustomer(assignedCustomer.getPassword(), password)) {
			mav = new ModelAndView("redirect:/");
			HttpSession session = null;
			session = req.getSession();
			session.setAttribute("email_address", email_address);
			session.setAttribute("password", password);
		} else {
			attributes.addFlashAttribute("errorMessage", "<span>Username and password is incorrect.</span>");
			mav = new ModelAndView("redirect:/login");
		}	
		return mav;
	}
}
