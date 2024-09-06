FROM openjdk:18
COPY . ./var/www/java
WORKDIR ./var/www/java
RUN javac Patterns.java
CMD ["java", "Patterns"]
