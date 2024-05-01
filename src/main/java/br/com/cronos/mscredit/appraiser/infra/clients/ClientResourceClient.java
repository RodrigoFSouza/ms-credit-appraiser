package br.com.cronos.mscredit.appraiser.infra.clients;

import br.com.cronos.mscredit.appraiser.domain.model.ClientData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "msclients", path = "/clients")
public interface ClientResourceClient {

    @GetMapping(params = "cpf")
    ResponseEntity<ClientData> getClientByCpf(@RequestParam("cpf") String cpf);
}
