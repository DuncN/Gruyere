exports.config = {
    framework: 'custom',
    // path relative to the current config file
    frameworkPath: 'node_modules/protractor-cucumber-framework',
    // seleniumAddress: 'http://localhost:4444/wd/hub',
    specs: ['features/**/*.feature'],
    baseUrl: 'https://google-gruyere.appspot.com/626647763078',
    capabilities: {
        browserName: 'chrome'
    },
    cucumberOpts: {
        // Require files before executing the features.
        require: ['step_definitions/**/*.js', 'hooks.js', 'world.js'],
        // Only execute the features or scenarios with tags matching @dev.
        // This may be an array of strings to specify multiple tags to include.
        //tags: '@dev',
        //tags: '@smoke',
        // How to format features (default: progress)
        format: 'pretty'
        // Other options include `coffee`, `noSnippets`, and `dryRun`
    }
};
