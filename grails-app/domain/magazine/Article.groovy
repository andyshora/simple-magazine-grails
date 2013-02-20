package magazine

class Article {

	Date publishDate
    String title
    String imageURL
    String content

    /*static mapping = {
	   content type: 'text' // content should be TEXT type in database, VARCHAR(255) by default
	}*/

    static constraints = {
    	title 	blank:false
    	content blank:false, maxSize: 2000
    	imageURL	blank:false
        publishDate blank:false
    }
}
