FROM ubuntu:latest

RUN apt-get update && apt-get install -y \
    openjdk-17-jdk \
    maven \
    git && \
    apt-get clean && rm -rf /var/lib/apt/lists/*

RUN git clone https://github.com/marioreste/calculator.git

WORKDIR /calculator

RUN mvn package

WORKDIR target

CMD [ "java", "-jar", "calculator-1.0-SNAPSHOT.jar" ]