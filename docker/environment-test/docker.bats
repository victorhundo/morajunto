@test "[TEST] - Docker version Test" {
  run ./bin/check-docker.sh
  [ "$status" -eq 0 ]
  [ "$output" -gt 14 ]
}

@test "[TEST] - Docker Compose version Test" {
  run ./bin/check-docker-compose.sh
  [ "$status" -eq 0 ]
  [ "$output" = "1.17" ]
}

@test "[TEST] - Mongo Container Test" {
  run ./bin/check-mongo-container.sh
  [ "$status" -eq 0 ]
  [ "$output" = "[mongo:latest]" ]
}


@test "[TEST] - Maven Container Test" {
  run ./bin/check-maven-container.sh
  [ "$status" -eq 0 ]
  [ "$output" = "[maven:latest]" ]
}
