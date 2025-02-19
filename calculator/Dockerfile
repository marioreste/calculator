FROM maven:3.9-amazoncorretto-17-alpine

WORKDIR /app

RUN apk update && apk add --no-cache git

RUN git clone https://github.com/marioreste/calculator

WORKDIR calculator/calculator

RUN mvn clean install

CMD [ "java", "-jar", "target/calculator-1.0-SNAPSHOT.jar" ]