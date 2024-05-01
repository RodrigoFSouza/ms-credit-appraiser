package br.com.cronos.mscredit.appraiser.service;

import br.com.cronos.mscredit.appraiser.domain.model.ClientData;
import br.com.cronos.mscredit.appraiser.domain.model.ClientSituation;
import br.com.cronos.mscredit.appraiser.infra.clients.ClientResourceClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CreditAppraiserService {
    private final ClientResourceClient clientResource;
    public ClientSituation getCreditApraiserByCPF(String cpf) {
        // obter dados do cliente
        ResponseEntity<ClientData> clientData = clientResource.getClientByCpf(cpf);
        // obter dados do cartao
        return ClientSituation.builder()
                .client(clientData.getBody())
                .build();
    }
}
