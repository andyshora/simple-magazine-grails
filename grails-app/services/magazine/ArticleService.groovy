package magazine

class ArticleService {

	Article createArticle(String title, String content, String imageURL) {
		def article = new Article(title: title, publishDate: new Date(), content: content, imageURL: imageURL)
		article.save()
		article
	}

	void updateArticle(Article article, String title, String content, String imageURL) {
		article.title = title
		article.content = content
		article.imageURL = imageURL
		article.save()
	}

}
