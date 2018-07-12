@test "[TEST] - Public IP Test" {
  run ./bin/check-ip.sh
  [ "$status" -eq 0 ]
  [ "$output" = "150.165.98.42" ]
}

@test "[TEST] - DNS morajunto.splab Test" {
  run ./bin/check-dns.sh
  [ "$status" -eq 0 ]
}
