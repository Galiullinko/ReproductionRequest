'use strict';

exports.documentIdParticipantGET = function(args, res, next) {
  /**
   * parameters expected in the args:
  * id (BigDecimal)
  **/
    var examples = {};
  examples['application/json'] = {
  "idOfTaxpayer" : 1.3579000000000001069366817318950779736042022705078125,
  "mainStateRegistrationNumber" : 1.3579000000000001069366817318950779736042022705078125,
  "participant_id" : 1.3579000000000001069366817318950779736042022705078125,
  "isIE" : true,
  "surnameOfIE" : "aeiou",
  "partonymicOfIE" : "aeiou",
  "nameOfEntity" : "aeiou",
  "location" : "aeiou",
  "nameOfIE" : "aeiou"
};
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
}

