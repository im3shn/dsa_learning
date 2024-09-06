FROM openjdk:18
COPY . ./var/www/java
WORKDIR ./var/www/java
RUN javac Practice.java
CMD ["java", "Practice"]
