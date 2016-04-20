'use strict';

var url = require('url');


var Participants = require('./ParticipantsService');


module.exports.documentIdParticipantGET = function documentIdParticipantGET (req, res, next) {
  Participants.documentIdParticipantGET(req.swagger.params, res, next);
};
