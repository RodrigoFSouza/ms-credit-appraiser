package br.com.cronos.mscredit.appraiser.application;

import br.com.cronos.mscredit.appraiser.domain.model.ClientSituation;
import br.com.cronos.mscredit.appraiser.service.CreditAppraiserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("credit-appraiser")
public class CreditAppraiserResource {
    private final CreditAppraiserService service;

    @GetMapping(value = "", params = "cpf")
    public ResponseEntity<ClientSituation> getCreaditApraiser(@RequestParam("cpf") String cpf) {
        var client = service.getCreditApraiserByCPF(cpf);

        if (client.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(client.get());
    }
}
