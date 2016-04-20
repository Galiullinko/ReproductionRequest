'use strict';

exports.loginGET = function(args, res, next) {
  /**
   * parameters expected in the args:
  * userName (String)
  * password (String)
  **/
    var examples = {};
  examples['application/json'] = "aeiou";
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
}

exports.logoutGET = function(args, res, next) {
  /**
   * parameters expected in the args:
  **/
  // no response value expected for this operation
  res.end();
}

exports.profileGET = function(args, res, next) {
  /**
   * parameters expected in the args:
  **/
    var examples = {};
  examples['application/json'] = {
  "patronymic" : "aeiou",
  "user_id" : 1.3579000000000001069366817318950779736042022705078125,
  "phone" : "aeiou",
  "surname" : "aeiou",
  "name" : "aeiou",
  "numberOfThePassport" : 1.3579000000000001069366817318950779736042022705078125,
  "email" : "aeiou",
  "seriesOfThePassport" : 1.3579000000000001069366817318950779736042022705078125
};
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
}

exports.profileUpdatePUT = function(args, res, next) {
  /**
   * parameters expected in the args:
  * data (User)
  **/
  // no response value expected for this operation
  res.end();
}

exports.signinPOST = function(args, res, next) {
  /**
   * parameters expected in the args:
  * userName (String)
  * email (String)
  * city (String)
  * age (BigDecimal)
  * gender (String)
  * snils (String)
  * password (String)
  **/
    var examples = {};
  examples['application/json'] = "aeiou";
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
}

