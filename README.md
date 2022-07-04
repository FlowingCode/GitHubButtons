[![Published on Vaadin Directory](https://img.shields.io/badge/Vaadin%20Directory-published-00b4f0.svg)](https://vaadin.com/directory/component/github-buttons-add-on)
[![Stars on vaadin.com/directory](https://img.shields.io/vaadin-directory/star/github-buttons-addon.svg)](https://vaadin.com/directory/component/github-buttons-add-on)
[![Build Status](https://jenkins.flowingcode.com/job/GithubButtons-addon/badge/icon)](https://jenkins.flowingcode.com/job/GithubButtons-addon)

# GithHub Buttons Add-on

This is the server-side component of [@flowingcode/wc-ngx-github-buttons](https://github.com/FlowingCode/wc-ngx-github-buttons) Web Component. This Web Component is a wrapper of [ngx-github-buttons library](https://github.com/scttcper/ngx-github-buttons).
The component allows you to create three different types of GitHub Buttons to represent a given user/repository:

- Basic GitHub Button -> only allows to add a STAR button.
- Mdo GitHub Button -> allows to add STAR, FOLLOW, WATCH & FORK buttons.
- Ntkme GitHub Button -> allows to add the same as Mdo style plus ISSUE & DOWNLOAD buttons.

## Features

* Select button type
* Show count
* Show button size large (only mdo & ntkme)
* Show standard icon (only ntkme)
* Select target type

## Online demo

[Online demo here](http://addonsv23.flowingcode.com/githubbuttons)

## Download release

[Available in Vaadin Directory](https://vaadin.com/directory/component/github-buttons-add-on)

## Building and running demo

- git clone repository
- mvn clean install jetty:run

To see the demo, navigate to http://localhost:8080/

## Release notes

See [here](https://github.com/FlowingCode/GitHubButtons/releases)

## Issue tracking

The issues for this add-on are tracked on its github.com page. All bug reports and feature requests are appreciated. 

## Contributions

Contributions are welcome, but there are no guarantees that they are accepted as such. Process for contributing is the following:

- Fork this project
- Create an issue to this project about the contribution (bug or feature) if there is no such issue about it already. Try to keep the scope minimal.
- Develop and test the fix or functionality carefully. Only include minimum amount of code needed to fix the issue.
- Refer to the fixed issue in commit
- Send a pull request for the original project
- Comment on the original issue that you have implemented a fix for it

## License & Author

Add-on is distributed under Apache License 2.0. For license terms, see LICENSE.txt.

GitHub Buttons Add-on is written by Flowing Code S.A.

# Developer Guide

## Getting started

Basic GitHub Button 
```java
GitHubButton githubButton = new GitHubButton("GoogleMapsAddon", "FlowingCode");
githubButton.setCount(true);
githubButton.setTarget("_blank");
```
![gb-basic](https://user-images.githubusercontent.com/30666649/173442893-f53e5de9-60e5-45bc-aeac-92a6b873b6bc.png)

Mdo Github Button
```java
MdoGitHubButton mdoGithubButton = new MdoGitHubButton("GoogleMapsAddon", "FlowingCode");
mdoGithubButton.setType(MdoGitHubButtonType.FOLLOW);
mdoGithubButton.setSize(ButtonSize.LARGE);      
```
![gb-mdo](https://user-images.githubusercontent.com/30666649/173442928-ee2eed28-e42a-4185-961c-8d7381a72e89.png)

Ntkme GitHub Button
```java
NtkmeGitHubButton ntkmeGithubButton = new NtkmeGitHubButton("GoogleMapsAddon", "FlowingCode");
ntkmeGithubButton.setType(NtkmeGitHubButtonType.WATCH);
ntkmeGithubButton.setCount(true);
ntkmeGithubButton.setSize(ButtonSize.LARGE);
ntkmeGithubButton.setTarget("_blank");
```
![gb-ntkme](https://user-images.githubusercontent.com/30666649/173442968-a7bb507c-c25d-45ab-85ba-df11104fc0b3.png)
