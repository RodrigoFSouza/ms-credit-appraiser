package br.com.cronos.mscredit.appraiser.service;

import br.com.cronos.mscredit.appraiser.domain.model.ClientCardsResponse;
import br.com.cronos.mscredit.appraiser.domain.model.ClientData;
import br.com.cronos.mscredit.appraiser.domain.model.ClientSituation;
import br.com.cronos.mscredit.appraiser.infra.clients.CardsResourseClient;
import br.com.cronos.mscredit.appraiser.infra.clients.ClientResourceClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CreditAppraiserService {
    private final ClientResourceClient clientResource;
    private final CardsResourseClient cardsResourseClient;
    public ClientSituation getCreditApraiserByCPF(String cpf) {

        ResponseEntity<ClientData> clientData = clientResource.getClientByCpf(cpf);
        ResponseEntity<List<ClientCardsResponse>> clientCardsResponse = cardsResourseClient.listCardsByClient(cpf);

        return ClientSituation.builder()
                .client(clientData.getBody())
                .cards(clientCardsResponse.getBody())
                .build();
    }
}
