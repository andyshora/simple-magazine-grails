import grails.converters.JSON
import magazine.Article

class BootStrap {

    def init = { servletContext ->

        // return dates in a custom format
        JSON.registerObjectMarshaller(Date) {
            return it?.format("d MMM yyyy")
         }

        // preload some articles
    	def a1 = new Article(
    					title:"Tincidunt nec magna tempor", 
    					content: "Eros augue enim! In et turpis habitasse tincidunt odio nunc rhoncus amet, porta! Scelerisque turpis parturient tristique sed, elit in, mattis? Porta massa? Tortor, mauris tristique dapibus facilisis integer magnis tristique ac? Velit augue, elit? Natoque nisi lacus elementum nec adipiscing dis, elit vut ultricies a adipiscing magna! Vel urna.", 
    					imageURL: "https://d3kegqx9p35g1q.cloudfront.net/media/images/r/l/40384.jpg", 
    					publishDate: (new GregorianCalendar(2013,1,7,0,0,0)).getTime())
    	def a2 = new Article(
    					title:"Elit pid penatibus natoque purus", 
    					content: "Tincidunt ut ac placerat. Nunc porta cum urna massa! Augue pid aliquam rhoncus! Lacus ac? Nisi! Porta dis, enim porta massa? Tristique in odio, et! Velit! Dis lorem, ac augue est et! Turpis mus pulvinar eros purus augue ultricies. Elit pid penatibus natoque purus. Et magna! Natoque risus. Eu a.", 
    					imageURL: "https://d3kegqx9p35g1q.cloudfront.net/media/images/r/l/41081.jpg", 
    					publishDate: (new GregorianCalendar(2013,1,8,0,0,0)).getTime())
    	def a3 = new Article(
    					title:"Cras ultricies ac mauris sit sagittis", 
    					content: "Facilisis vel auctor! Turpis in? Dictumst platea dis montes massa integer pulvinar lectus, scelerisque natoque pid eros enim phasellus porta tempor, odio a? Proin magna aliquet vut. Placerat cum, cum integer lacus. Enim nunc eros ac habitasse dapibus ac? Cras ultricies ac mauris sit sagittis, et nunc ultrices nisi.", 
    					imageURL: "https://d3kegqx9p35g1q.cloudfront.net/media/images/r/l/41647.jpg", 
    					publishDate: (new GregorianCalendar(2013,1,9,0,0,0)).getTime())
    	def a4 = new Article(
    					title:"Ultricies ac nunc enim augue", 
    					content: "Lorem adipiscing mus, nunc magna, aliquet dis vel, vel, a rhoncus, sed proin penatibus nascetur et penatibus ultrices ultricies! Sed rhoncus ultricies ac nunc enim augue tristique egestas, augue aliquam integer sit integer velit. Augue, aenean nascetur tristique odio, urna? Nec. Aenean tincidunt? Nec placerat porta etiam sit integer.", 
    					imageURL: "https://d3kegqx9p35g1q.cloudfront.net/media/images/r/l/41292.jpg", 
    					publishDate: (new GregorianCalendar(2013,1,10,0,0,0)).getTime())
    	def a5 = new Article(
    					title:"Eros hac montes sociis dapibus", 
    					content: "Mid, elementum ultricies vel a, dignissim odio elit sed et, aliquet augue lorem rhoncus amet porta aliquam! Nec integer, placerat sit rhoncus penatibus odio facilisis sociis aliquam velit sed! Rhoncus pulvinar nisi mid massa massa etiam sed, magna adipiscing, natoque nec platea egestas tortor penatibus quis turpis, augue urna. Mattis, augue a sagittis et vel in! Risus et mid et? Natoque, a turpis nunc. Eros hac montes, sociis dapibus nisi diam cursus amet egestas vut enim, placerat parturient cursus! Porttitor urna auctor pulvinar magna, dolor, nec sit nec a sit, ac magnis velit lorem, ac? Porta! Turpis ultrices.", 
    					imageURL: "https://d3kegqx9p35g1q.cloudfront.net/media/images/r/l/41231.jpg", 
    					publishDate: (new GregorianCalendar(2013,1,12,0,0,0)).getTime())

        def a6 = new Article(
                        title:"Tincidunt nec magna tempor", 
                        content: "Eros augue enim! In et turpis habitasse tincidunt odio nunc rhoncus amet, porta! Scelerisque turpis parturient tristique sed, elit in, mattis? Porta massa? Tortor, mauris tristique dapibus facilisis integer magnis tristique ac? Velit augue, elit? Natoque nisi lacus elementum nec adipiscing dis, elit vut ultricies a adipiscing magna! Vel urna.", 
                        imageURL: "https://d3kegqx9p35g1q.cloudfront.net/media/images/r/l/40384.jpg", 
                        publishDate: (new GregorianCalendar(2013,1,14,0,0,0)).getTime())
        def a7 = new Article(
                        title:"Elit pid penatibus natoque", 
                        content: "Tincidunt ut ac placerat. Nunc porta cum urna massa! Augue pid aliquam rhoncus! Lacus ac? Nisi! Porta dis, enim porta massa? Tristique in odio, et! Velit! Dis lorem, ac augue est et! Turpis mus pulvinar eros purus augue ultricies. Elit pid penatibus natoque purus. Et magna! Natoque risus. Eu a.", 
                        imageURL: "https://d3kegqx9p35g1q.cloudfront.net/media/images/r/l/41081.jpg", 
                        publishDate: (new GregorianCalendar(2013,1,16,0,0,0)).getTime())
        def a8 = new Article(
                        title:"Cras ultricies ac mauris sit", 
                        content: "Facilisis vel auctor! Turpis in? Dictumst platea dis montes massa integer pulvinar lectus, scelerisque natoque pid eros enim phasellus porta tempor, odio a? Proin magna aliquet vut. Placerat cum, cum integer lacus. Enim nunc eros ac habitasse dapibus ac? Cras ultricies ac mauris sit sagittis, et nunc ultrices nisi.", 
                        imageURL: "https://d3kegqx9p35g1q.cloudfront.net/media/images/r/l/41647.jpg", 
                        publishDate: (new GregorianCalendar(2013,1,17,0,0,0)).getTime())
        def a9 = new Article(
                        title:"Ultricies ac nunc enim augue", 
                        content: "Lorem adipiscing mus, nunc magna, aliquet dis vel, vel, a rhoncus, sed proin penatibus nascetur et penatibus ultrices ultricies! Sed rhoncus ultricies ac nunc enim augue tristique egestas, augue aliquam integer sit integer velit. Augue, aenean nascetur tristique odio, urna? Nec. Aenean tincidunt? Nec placerat porta etiam sit integer.", 
                        imageURL: "https://d3kegqx9p35g1q.cloudfront.net/media/images/r/l/41292.jpg", 
                        publishDate: (new GregorianCalendar(2013,1,18,0,0,0)).getTime())
        def a10 = new Article(
                        title:"Eros hac montes sociis", 
                        content: "Mid, elementum ultricies vel a, dignissim odio elit sed et, aliquet augue lorem rhoncus amet porta aliquam! Nec integer, placerat sit rhoncus penatibus odio facilisis sociis aliquam velit sed! Rhoncus pulvinar nisi mid massa massa etiam sed, magna adipiscing, natoque nec platea egestas tortor penatibus quis turpis, augue urna. Mattis, augue a sagittis et vel in! Risus et mid et? Natoque, a turpis nunc. Eros hac montes, sociis dapibus nisi diam cursus amet egestas vut enim, placerat parturient cursus! Porttitor urna auctor pulvinar magna, dolor, nec sit nec a sit, ac magnis velit lorem, ac? Porta! Turpis ultrices.", 
                        imageURL: "https://d3kegqx9p35g1q.cloudfront.net/media/images/r/l/41231.jpg", 
                        publishDate: (new GregorianCalendar(2013,1,19,0,0,0)).getTime())

    	a1.save(failOnError: true)
    	a2.save(failOnError: true)
    	a3.save(failOnError: true)
    	a4.save(failOnError: true)
    	a5.save(failOnError: true)
        a6.save(failOnError: true)
        a7.save(failOnError: true)
        a8.save(failOnError: true)
        a9.save(failOnError: true)
        a10.save(failOnError: true)

    }
    def destroy = {
    }
}
