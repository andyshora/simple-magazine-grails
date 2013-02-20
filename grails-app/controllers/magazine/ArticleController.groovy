package magazine

import grails.converters.JSON

class ArticleController {

    def index() {
    	// backbone will order client-side
    	render( Article.findAll() as JSON )
    }

    // create from posting form data
    def add() {

    	// should compartmentalise into ArticleService if we had more time
		if (request.method == 'POST') {

			def article = new Article(title: params.title, content: params.content, imageURL: params.imageURL, publishDate: new Date())
			article.save()

			if (article.hasErrors()) {
				return [article: article]
			}

			render( article as JSON )

		}

	}

	def update() {

		// should compartmentalise into ArticleService if we had more time
		if (request.method == 'POST') {

			def article = Article.get(params.id);

			if (params.title)
				article.title = params.title

			if (params.content)
				article.content = params.content

			if (params.imageURL)
				article.imageURL = params.imageURL

			article.save()
			
			if (article.hasErrors()) {
				
				return [article: article]
				render( article as JSON )
			}
			else {
				render( article as JSON )
			}

		}
	}
    
	def delete() {
		def article = Article.findById(params.id)
		article?.delete()
		render(article as JSON );
	}
	
	def edit() {
		def article = Article.findById(params.id)
		bindData(article, request.JSON)
		render(article.save() as JSON )				
	}
	def details() {
		def article = Article.get(params.id)

    	render view: 'details', model: [article: article]
	}
}

