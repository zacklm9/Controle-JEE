package org.sid.billingservice.feign;

import org.sid.billingservice.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import javax.ws.rs.QueryParam;

@FeignClient(name = "PRODUCT-SERVICE")
public interface ProductItemRestClient {
    @CrossOrigin("http://localhost:4200")
    @GetMapping("/products?projection=fullProduct")
    PagedModel<Product> pageProducts();
    @GetMapping(path = "/products/{id}?projection=fullProduct")
    Product getProductById(@PathVariable (name="id") Long id);


}