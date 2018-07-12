#!/bin/bash
cat /proc/meminfo | head -n1 | tr ' ' ',' | cut -d',' -f8
