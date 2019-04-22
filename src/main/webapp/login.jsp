<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" type="text/css" href="css/button.css">
    <link rel="shortcut icon" type="image/png" href="favicon.png" />
    <title>Document</title>
</head>

<body>

    <div id="fb-root"></div>
    <script async defer crossorigin="anonymous" src="https://connect.facebook.net/es_ES/sdk.js#xfbml=1&version=v3.2&appId=261823598101084&autoLogAppEvents=1"></script>

    <script>
        window.fbAsyncInit = function() {
            FB.init({
                appId: '261823598101084',
                cookie: true,
                xfbml: true,
                version: 'v3.2'
            });

            FB.AppEvents.logPageView();

        };

        (function(d, s, id) {
            var js, fjs = d.getElementsByTagName(s)[0];
            if (d.getElementById(id)) {
                return;
            }
            js = d.createElement(s);
            js.id = id;
            js.src = "https://connect.facebook.net/en_US/sdk.js";
            fjs.parentNode.insertBefore(js, fjs);
        }(document, 'script', 'facebook-jssdk'));


        FB.getLoginStatus(function(response) {
            statusChangeCallback(response);
        });
    </script>
</body>

<body>

    <fb:login-button scope="public_profile,publish_pages,manage_pages,email" onlogin="checkLoginState();">
    </fb:login-button>
    <div class="fb-login-button" data-width="280" data-size="large" data-button-type="login_with" data-auto-logout-link="false" data-use-continue-as="false"></div>
</body>

</html>