modules = {
    magazine {
    	dependsOn 'jquery, underscore, backbone'

    	resource url:'css/main.css'
        resource url:'css/animate.min.css'
        resource url:'js/magazine.js'
    }
    backbone {
    	resource url: 'js/backbone-min.js'
    }
    underscore {
        resource url: 'js/underscore-min.js'
    }
}
