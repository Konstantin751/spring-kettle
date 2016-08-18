
class HelloWorld {

	static main(args) {
		def javaString = 'java'
		def groovyString = "${javaString}"
		def j = '${javaString}'
		def bigGroovyString = """
			${javaString}
			${groovyString}
			${j}
			${2 + 2}
		"""
		
		println bigGroovyString
	}

}
