<!DOCTYPE html>

<html lang="en" dir="ltr">
   <head>
      <meta charset="utf-8">
      <title>Login Page</title>
      <link rel="stylesheet" href="style.css">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
   </head>
   <body>
      <div class="wrapper">
         <div class="title-text">
            <div class="title login" style="margin-bottom: 10px;">
               Login
            </div>
         </div>
         <div class="form-container">
            <div class="form-inner">
               <form method="get" action="espace-abonne" style="display: inline-grid;">
                  <div style="margin-bottom: 1em">
                     <label for="login">Username :</label>
                     <input type="text" id="login" name="login" required="required">
                  </div>
                  <div style="margin-left: 6px">
                     <label for="password">Password :</label>
                     <input type="password" id="password" name="password" required="required">
                     <!-- An element to toggle between password visibility -->
                  </div>
                  <div style="margin-top: 1em; margin-left: 7em">
                     <input type="checkbox" onclick="showPassword()">
                     <text>Show Password</text>
                  </div>
                  <input type="submit" value="Login" style="margin-top: 1em">
               </form>
            </div>
         </div>
      </div>
   </body>
   <script>
      function showPassword() {
         var x = document.getElementById("password");
         if (x.type === "password") {
            x.type = "text";
         } else {
            x.type = "password";
         }
      }
   </script>
</html>