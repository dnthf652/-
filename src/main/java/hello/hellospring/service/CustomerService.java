package hello.hellospring.service;

import hello.hellospring.dto.CustomerDto;
import hello.hellospring.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class CustomerService {

    private final CustomerRepository customerRepository;
    public CustomerDto customerInsert(CustomerDto dto){
        customerRepository.save(new CustomerDto().entityToDto(dto));
        log.info(new CustomerDto().entityToDto(dto).toString());
        return dto;
    }
}
