package ru.itis.inform.RequestReproduction.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.inform.RequestReproduction.DAO.Models.Document;
import ru.itis.inform.RequestReproduction.DAO.Models.Participant;
import ru.itis.inform.RequestReproduction.Services.DocumentServiceImpl;
import ru.itis.inform.RequestReproduction.Services.ParticipantServiceImpl;
import ru.itis.inform.RequestReproduction.Services.UserService;

import java.util.List;

/**
 * Created by Galiullin_ko on 07/04/16.
 */
@RestController
public class UsersController {
    @Autowired
    private DocumentServiceImpl documentService;
    @Autowired
    private ParticipantServiceImpl participantService;
    @Autowired
    private UserService usersService;

    @RequestMapping(value = "/document/{id}", method = RequestMethod.GET)
    public Document getDocumentById(@PathVariable int id){
        return documentService.getDocumentById(id);
    }

    @RequestMapping(value = "/document/{documentId}/additional", method = RequestMethod.GET)
    public List<Participant> getAdditionalToDocument(@PathVariable int documentId){
        return participantService.getParticipants();
    }
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHello() {
        return "HELLO!";
    }
}
