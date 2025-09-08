[![Published on Vaadin Directory](https://img.shields.io/badge/Vaadin%20Directory-published-00b4f0.svg)](https://vaadin.com/directory/component/github-buttons-add-on)
[![Stars on vaadin.com/directory](https://img.shields.io/vaadin-directory/star/github-buttons-add-on.svg)](https://vaadin.com/directory/component/github-buttons-add-on)
[![Build Status](https://jenkins.flowingcode.com/job/GithubButtons-addon/badge/icon)](https://jenkins.flowingcode.com/job/GithubButtons-addon)
[![Javadoc](https://img.shields.io/badge/javadoc-00b4f0)](https://javadoc.flowingcode.com/artifact/org.vaadin.addons.flowingcode/github-buttons-addon)

# GitHub Buttons Add-on

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

Contributions are welcome. There are two primary ways you can contribute: by reporting issues or by submitting code changes through pull requests. To ensure a smooth and effective process for everyone, please follow the guidelines below for the type of contribution you are making.

#### 1. Reporting Bugs and Requesting Features

Creating an issue is a highly valuable contribution. If you've found a bug or have an idea for a new feature, this is the place to start.

* Before creating an issue, please check the existing issues to see if your topic is already being discussed.
* If not, create a new issue, choosing the right option: "Bug Report" or "Feature Request". Try to keep the scope minimal but as detailed as possible.

> **A Note on Bug Reports**
> 
> Please complete all the requested fields to the best of your ability. Each piece of information, like the environment versions and a clear description, helps us understand the context of the issue.
> 
> While all details are important, the **[minimal, reproducible example](https://stackoverflow.com/help/minimal-reproducible-example)** is the most critical part of your report. It's essential because it removes ambiguity and allows our team to observe the problem firsthand, exactly as you are experiencing it.

#### 2. Contributing Code via Pull Requests

As a first step, please refer to our [Development Conventions](https://github.com/FlowingCode/DevelopmentConventions) page to find information about Conventional Commits & Code Style requirements.

Then, follow these steps for creating a contribution:
 
- Fork this project.
- Create an issue to this project about the contribution (bug or feature) if there is no such issue about it already. Try to keep the scope minimal.
- Develop and test the fix or functionality carefully. Only include minimum amount of code needed to fix the issue.
- For commit message, use [Conventional Commits](https://github.com/FlowingCode/DevelopmentConventions/blob/main/conventional-commits.md) to describe your change.
- Send a pull request for the original project.
- Comment on the original issue that you have implemented a fix for it.

## License & Author

This add-on is distributed under Apache License 2.0. For license terms, see LICENSE.txt.

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
