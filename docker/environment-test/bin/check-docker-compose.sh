#!/bin/bash
docker-compose version | head -n1 | cut -d' ' -f3 | cut -d'.' -f1-2
