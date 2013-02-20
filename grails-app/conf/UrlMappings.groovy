class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"/articles"(controller: "article") {
			action = [GET:"index"]
		}

		"/article/$id?"(controller: "article") {
			action = [GET:"details", DELETE: "delete", PUT: "edit"]
		}

		"/add"(controller: "article") {
			action = [POST:"add"]
		}

		"/update"(controller: "article") {
			action = [POST:"update"]
		}

		"/"(view:"/index")
		"500"(view:'/error')
	}
}
