FROM openjdk:11-jdk
ENV APP_ROOT /app

COPY . $APP_ROOT
WORKDIR $APP_ROOT

ENTRYPOINT ["sh", "./gradlew", "bootRun"]
