package br.com.cronos.mscredit.appraiser.infra.clients;

import br.com.cronos.mscredit.appraiser.domain.model.ClientCardsResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "mscards", path = "/cards")
public interface CardsResourseClient {

    @GetMapping(params = "cpf")
    ResponseEntity<List<ClientCardsResponse>> listCardsByClient(@RequestParam String cpf);
}
