<html>
	<head>
		<title>${title}</title>
		<r:require module="magazine" />
    	<meta name="layout" content="main">
	</head>

	<body>
		<div class="article_full">
			<img src="${article.imageURL}" />
			<h2 class="article-title">${article.title}</h2>
			<span class="publish-date"><g:formatDate format="EEE, d MMM yyyy" date="${article.publishDate}"/></span>
			<hr />
			<p>${article.content}</p>
		</div>
		<p><a href="/magazine" title="back to articles">&larr; back to Articles</a></p>
	</body>
</html>