<!DOCTYPE html>
<html>

  <head>
    <title>Bleep Magazine</title>
    <r:require module="magazine" />
    <meta name="layout" content="main">
  </head>

  <body>
  	<div id="body_wrap">

    <!-- Magazine App Interface -->

    <div id="magazineapp">

      <div class="title">
        <h1>Simple Magazine</h1>
      </div>

      <div class="content">

        <div id="articles">
          <ul id="article-list"></ul>
        </div>

      </div>

    </div>

    
    <!-- Templates -->

    <script type="text/template" id="article-template">
      <div class="article animated">
        <div class="display">
          <h2 class="article-title"><a class="article-link"></a></h2>
          <span class="publish-date"></span>
          <a class="article-link article-pic-square"><img class="article-img grow" src="" width="220" height="220" /></a>
        </div>
      </div>
    </script>

    </div>
  </body>

</html>