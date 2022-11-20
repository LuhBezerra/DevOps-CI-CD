#!/bin/bash

CURRENT_VERSION=$(eval "git describe --abbrev=0 --tags")

UPDATED_VERSION=$((CURRENT_VERSION+1))
git tag ${VERSION}
git push --tags

echo "#################### NEW TAG ${CURRENT_VERSION} ####################"