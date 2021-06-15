package org.anuj.yoga;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@Slf4j
public class AsanaController {



    private AsanaRepository asanaRepository;

    public AsanaController (@Autowired AsanaRepository asanaRepository) {
        this.asanaRepository = asanaRepository;
    }

    @GetMapping ("api/v1/asanas")
    public List<Asana> getAllAsanas() {
        log.debug("-> get all asanas");
        return asanaRepository.findAll();
       /* return Arrays.asList(
                new Asana (1, "Savasana", "Relaxes, Balances flow of energy"),
                new Asana (2, "Sirsasana", "Cures Anxiety, Cures Nervousness, Improves memory")
        );*/
    }

    @PostMapping ("api/v1/asana")
    public Asana saveAsana(@RequestBody Asana asana) {
        log.debug("-> save asana");
        return asanaRepository.save(asana);
    }
}
