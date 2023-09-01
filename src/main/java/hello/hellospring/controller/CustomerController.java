package hello.hellospring.controller;

import hello.hellospring.dto.CustomerDto;
import hello.hellospring.entity.Customer;
import hello.hellospring.repository.CustomerRepository;
import hello.hellospring.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequiredArgsConstructor
@Log4j2
public class CustomerController {

    private final CustomerService customerService;
    @GetMapping("/customers")
    public void showForm(){}

    @PostMapping("/submit")
    public ResponseEntity<CustomerDto> processForm(@RequestBody CustomerDto dto) {
        return new ResponseEntity<>(customerService.customerInsert(dto), HttpStatus.OK);
    }
}
