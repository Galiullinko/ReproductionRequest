'use strict';

var url = require('url');


var Users = require('./UsersService');


module.exports.loginGET = function loginGET (req, res, next) {
  Users.loginGET(req.swagger.params, res, next);
};

module.exports.logoutGET = function logoutGET (req, res, next) {
  Users.logoutGET(req.swagger.params, res, next);
};

module.exports.profileGET = function profileGET (req, res, next) {
  Users.profileGET(req.swagger.params, res, next);
};

module.exports.profileUpdatePUT = function profileUpdatePUT (req, res, next) {
  Users.profileUpdatePUT(req.swagger.params, res, next);
};

module.exports.signinPOST = function signinPOST (req, res, next) {
  Users.signinPOST(req.swagger.params, res, next);
};
