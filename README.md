Simple Magazine in Grails
===================

Example curl post to add a new article
----------
	sudo curl -d "title=abc&content=def&imageURL=https://d3kegqx9p35g1q.cloudfront.net/media/images/r/l/41081.jpg" http://localhost:8080/magazine/add -X POST

Example Curl to update an article with a new title
----------
	sudo curl -d "id=10&title=abcdef" http://localhost:8080/magazine/update -X POST

Scaffolding setup for articles
----------
(but then replaced once add and update available via Curl)

Allow user to add/update articles
----------
About to implement via backbone, server-side setup, but ran out of time.

Design
----------
Layout is fluid, articles wrap to responsive width. Quickly added some CSS3 animations, which probably cause problems in old IE as I haven't defined custom stylesheets for old browsers yet.

Tests
----------
Ran out of time.
