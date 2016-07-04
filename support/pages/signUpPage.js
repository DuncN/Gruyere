var signUpPage = function() {

    var self = this;

    //Step 1 Input fields
    var userName = element(by.name('uid'));
    var password = element(by.name('pw'));

    //Buttons
    var createAccount = element(by.css('input[type="submit"][value="Create account"]'));

    self.url = '/newaccount.gtl';

    self.fillInForm = function(user) {

        userName.sendKeys(username);
        password.sendKeys(password);

        return createAccount.click();
    };

};

module.exports = new signUpPage();
