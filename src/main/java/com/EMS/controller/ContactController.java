package com.EMS.controller;


import com.EMS.model.ContactForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactController {

    @GetMapping("/contact")
    public String showContactForm(Model model) {
        model.addAttribute("contactForm", new ContactForm());
        return "contact";
    }

    @PostMapping("/contact")
    public String submitContactForm(ContactForm contactForm, Model model) {
        // For now, we’ll just print the details to the console
        System.out.println("Received contact form submission: " + contactForm);
        model.addAttribute("message", "Thank you for contacting us, " + contactForm.getName() + "!");
        return "contact"; // You could redirect to a different page if needed
    }
}
