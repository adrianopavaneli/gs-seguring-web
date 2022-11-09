package org.springframework.gssecuringweb.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

    //FIXME: #### quando tudo já estiver ok, e o usuário já criado, remover o mapeamento new-user ####

@Controller
public class UsuarioController {

    @Autowired
    MyUserDetailService usuarioService;

    @GetMapping("/")
    public String root() {
        return "login";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/new-user")
    public String newUser() {
        User usuario = new User();
        usuario.setId(1L);
        usuario.setUsername("danilo");
        usuario.setPassword("123");
        usuarioService.save(usuario);
        return usuario.toString();
    }

}
