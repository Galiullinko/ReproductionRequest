package ru.itis.inform.RequestReproduction.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.itis.inform.RequestReproduction.controllers.dto.AuthPairDTO;
import ru.itis.inform.RequestReproduction.controllers.dto.DocumentDTO;
import ru.itis.inform.RequestReproduction.controllers.dto.UserDTO;
import ru.itis.inform.RequestReproduction.controllers.dto.converters.DTOConverter;
import ru.itis.inform.RequestReproduction.controllers.dto.DocumentsDTO;
import ru.itis.inform.RequestReproduction.dao.models.AuthPair;
import ru.itis.inform.RequestReproduction.dao.models.User;
import ru.itis.inform.RequestReproduction.services.*;

/**
 * Created by Galiullin_ko on 07/04/16.
 */
@RestController
public class UsersController {
    @Autowired
    private DocumentService documentService;
    @Autowired
    private UserService userService;
    @Autowired
    private TokenService tokenService;
    @Autowired
    private AuthPairService authPairService;
    @Autowired
    private DTOConverter converter;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHello() {
        return "HELLO!";
    }

    @RequestMapping(value = "/documents", method = RequestMethod.GET)
    public DocumentsDTO getDocuments(@RequestHeader(value = "auth-token") String token) {
        tokenService.verifyToken(token);
        return converter.getDocumentsDTO(documentService.getDocuments());
    }

    @RequestMapping(value = "/document/{id}", method = RequestMethod.GET)
    public DocumentDTO getDocumentById(@PathVariable(value = "id") int id) {
        return new DocumentDTO(documentService.getDocumentById(id));
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public void login(@RequestHeader(value = "auth-token") String token) {
        tokenService.verifyToken(token);
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public void signUp(@RequestBody UserDTO userDTO, @RequestBody AuthPairDTO authPairDTO) {
        User user = converter.getUserDAO(userDTO);
        AuthPair authPair = converter.getAuthPairDAO(authPairDTO);
        userService.addUser(user);
        authPairService.addAuthPair(authPair);
        tokenService.setToken(user, authPair);
    }
}
