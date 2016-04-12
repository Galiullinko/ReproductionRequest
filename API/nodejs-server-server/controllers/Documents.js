'use strict';

var url = require('url');


var Documents = require('./DocumentsService');


module.exports.documentIdGET = function documentIdGET (req, res, next) {
  Documents.documentIdGET(req.swagger.params, res, next);
};

module.exports.documentsGET = function documentsGET (req, res, next) {
  Documents.documentsGET(req.swagger.params, res, next);
};

module.exports.documentsPOST = function documentsPOST (req, res, next) {
  Documents.documentsPOST(req.swagger.params, res, next);
};
