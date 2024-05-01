package br.com.cronos.mscredit.appraiser.service;

import br.com.cronos.mscredit.appraiser.domain.model.ClientSituation;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CreditAppraiserService {

    public Optional<ClientSituation> getCreditApraiserByCPF(String cpf) {
        // obter dados do cliente
        // obter dados do cartao
        return Optional.empty();
    }
}
