#!/bin/bash
docker version | grep Version | head -n1 | cut -d':' -f2 | tr -d ' ' | cut -d'.' -f1
