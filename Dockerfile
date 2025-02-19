FROM ubuntu:latest

RUN apt-get update

RUN apt-get install -y maven

RUN apt-get install -y git

RUN apt-get clean \
    && rm -rf /var/lib/apt/lists/

RUN git clone https://github.com/marioreste/calculator.git

WORKDIR /calculator

RUN mvn package

WORKDIR target

CMD [ "java", "-jar", "calculator-1.0-SNAPSHOT.jar" ]