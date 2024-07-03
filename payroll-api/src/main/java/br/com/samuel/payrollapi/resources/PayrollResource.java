package br.com.samuel.payrollapi.resources;

import br.com.samuel.payrollapi.domain.Payroll;
import br.com.samuel.payrollapi.services.PayrollService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/payments")
public class PayrollResource {
    private final PayrollService service;
    @GetMapping(value = "/{workerId}")
    public ResponseEntity<Payroll> getPayment(@PathVariable Long workerId, @RequestBody Payroll payroll) {
        return ResponseEntity.ok().body(service.getPayment(workerId, payroll));
    }
}
