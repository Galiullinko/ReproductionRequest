package ru.itis.inform.RequestReproduction.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.inform.RequestReproduction.controllers.dto.Converters.DTOConverter;
import ru.itis.inform.RequestReproduction.controllers.dto.DocumentsDTO;
import ru.itis.inform.RequestReproduction.controllers.dto.TokenDTO;
import ru.itis.inform.RequestReproduction.services.*;

/**
 * Created by Galiullin_ko on 07/04/16.
 */
@RestController
public class UsersController {
    @Autowired
    private DocumentService documentService;
    @Autowired
    private ParticipantService participantService;
    @Autowired
    private UserService usersService;
    @Autowired
    private TokenService tokensService;
    @Autowired
    private AuthPairService passwordService;
    @Autowired
    private DTOConverter converter;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHello() {
        return "HELLO!";
    }

    @RequestMapping(value = "/documents", method = RequestMethod.GET)
    public DocumentsDTO getDocuments(@RequestBody TokenDTO tokenDTO) {
        return null;
    }
}
