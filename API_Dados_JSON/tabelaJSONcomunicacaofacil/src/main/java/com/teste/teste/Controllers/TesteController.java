/*Não é pra dizer nada, mas eu fiquei das 22:00 até as 05:35 tentando implementar algo que eu
pensei que seria fácil, mas no final eu simplesmente destrui todo o meu código, então eu fiz isso
aí agora correndo pq eu percebi que o Sol tá batendo na minha cara, tenha um bom feriado e um ótimo final de semana*/

package com.teste.teste.Controllers;

import com.teste.teste.Services.TesteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class TesteController {

    @Autowired
    private TesteService testeService;

    @GetMapping("/sobre")
    public ResponseEntity<Map<String, String>> sobre() {
        Map<String, String> resposta = new HashMap<>();
        resposta.put("projeto", "Tabela de comunicação em JSON");
        resposta.put("estudante", "Michel Almeida da Rosa");
        return ResponseEntity.ok(resposta);
    }

    @GetMapping("/posts")
    public ResponseEntity<String> getPosts() {
        String response = testeService.pegaOsPosts();
        return ResponseEntity.ok(response);
    }

    @PostMapping("/posts")
    public ResponseEntity<String> createPost(@RequestBody Map<String, Object> request) {
        String response = testeService.criaPosts(request);
        return ResponseEntity.ok(response);
    }
}
