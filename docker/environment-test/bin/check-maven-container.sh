#!/bin/bash
docker image inspect maven --format='{{.RepoTags}}'
