PROJECT_NAME = webwork-0.1.0

help:
	@echo	""
	@echo	"Author: Olaolu Akinsete"
	@echo "Commands"
	@echo "	help - generates this"
	@echo " run - run the application"
	@echo " clean - generate the jar and run"

run:
	./mvnw spring-boot:run


clean:
	@echo "generating jar"
	./mvnw clean package
	@echo "running jar"
	java -jar target/$PROJECT_NAME.jar
