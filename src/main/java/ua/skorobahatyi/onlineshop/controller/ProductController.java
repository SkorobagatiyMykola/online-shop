package ua.skorobahatyi.onlineshop.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.skorobahatyi.onlineshop.service.ProductService;

@Controller
@AllArgsConstructor
@RequestMapping("/v1/products")
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public String getAllProducts(Model model) {
        System.out.println("============================");
        model.addAttribute("products", productService.getAllProducts());

        return "products/allProducts";
    }

}
