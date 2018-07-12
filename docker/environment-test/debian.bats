@test "[TEST] - Linux Test" {
  run uname
  [ "$status" -eq 0 ]
  [ "$output" = "Linux" ]
}

@test "[TEST] - Debian version Test" {
  run ./bin/check-debian.sh
  [ "$status" -eq 0 ]
  [ "$output" -gt 8 ]
}

@test "[TEST] - Memory Size Test" {
  run ./bin/check-memory.sh
  [ "$status" -eq 0 ]
  [ "$output" -le 32812424 ]
}

@test "[TEST] - CPU Count Test" {
  run ./bin/check-cpu.sh
  [ "$status" -eq 0 ]
  [ "$output" -gt 2 ]
}
