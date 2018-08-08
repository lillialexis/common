#!/bin/bash
# Delete arcpatch branches

git co --force master

for b in $(git branch | grep arcpatch); do
    git branch -D $b
done
