var signUpPage = require('../support/pages/signUpPage.js');

var myStepDefinitionsWrapper = function () {

    this.Given(/^I am on "([^"]*)" page$/, function (arg1, callback) {
        // Write code here that turns the phrase above into concrete actions
        callback.pending();
    });

    this.Given(/^I have entered (.*) and (.*)$/, function (userName, password, callback) {
        // Write code here that turns the phrase above into concrete actions
        callback.pending();
    });

    this.When(/^I click on the "([^"]*)" button$/, function (arg1, callback) {
        // Write code here that turns the phrase above into concrete actions
        callback.pending();
    });

    this.Then(/^I land on the "([^"]*)" page$/, function (arg1, callback) {
        // Write code here that turns the phrase above into concrete actions
        callback.pending();
    });


module.exports = myStepDefinitionsWrapper;
}


