#!/bin/bash
docker image inspect mongo --format='{{.RepoTags}}'
