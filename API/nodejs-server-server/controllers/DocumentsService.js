'use strict';

exports.documentIdGET = function(args, res, next) {
  /**
   * parameters expected in the args:
  * id (BigDecimal)
  **/
    var examples = {};
  examples['application/json'] = {
  "yearOfWorks" : 1.3579000000000001069366817318950779736042022705078125,
  "sourceOfResources" : "aeiou",
  "dateOfEndOfTheWork" : "2000-01-23T04:56:07.000+0000",
  "weightOfCreatures" : 1.3579000000000001069366817318950779736042022705078125,
  "numberOfCreatures" : 1.3579000000000001069366817318950779736042022705078125,
  "nameOfWorkLocation" : "aeiou",
  "dateOfFillingTheDocumnet" : "aeiou",
  "typeOfCreature" : "aeiou",
  "document_id" : 1.3579000000000001069366817318950779736042022705078125,
  "stateOfCreature" : "aeiou",
  "averegePieceOfWaterResources" : "aeiou"
};
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
}

exports.documentsGET = function(args, res, next) {
  /**
   * parameters expected in the args:
  **/
    var examples = {};
  examples['application/json'] = "";
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
}

exports.documentsPOST = function(args, res, next) {
  /**
   * parameters expected in the args:
  * body (Document)
  **/
  // no response value expected for this operation
  res.end();
}

