# CMPSC 101 Participation: Activity 7

## Introduction

Designed for use with [GitHub Classroom](https://classroom.github.com/), this
repository contains the class participation  activity seven for Computer Science 101.

* Please note that GatorGrader and GitHub Actions CI are not used for class activities to allow for more free-flowing exploration.*

## Commands

### Using Gradle via Docker

If you are using Docker Desktop you will run a `docker run` command to execute and test your programs.
First, navigate to your "class_activities" directory.
To ensure that the `docker run` command will work correctly, you
should have the cache directory by running the command `mkdir
$HOME/.dockagator`.
To enter an "interactive terminal" that will
allow you to repeatedly run commands within the Docker container, enter the following
`docker run` command into your terminal.

```bash
docker run -it --rm --name dockagator \
  -v "$(pwd)":/project \
  -v "$HOME/.dockagator":/root/.local/share \
  gatoreducator/dockagator /bin/bash
```

This command will use `"$(pwd)"` (i.e., the current directory) as
the project directory and `"$HOME/.dockagator"` as the cached GatorGrader
directory. Please note that both of these directories must exist, although only
the project directory must contain something. Generally, the project directory
should contain the source code as
provided to a student through GitHub. Additionally, the cache directory should
not contain anything other than directories and programs created by DockaGator,
thus ensuring that they are not otherwise overwritten during the completion of
the assignment.

If you are using a Windows machine, you should use the following command, replacing "user" with
the username of your machine.

```bash
docker run -it --rm --name dockagator -v "%cd%":/project -v "C:\Users\user/.dockagator":/root/.local/share gatoreducator/dockagator /bin/bash
```

Now you can type `gradle build` to compile your class program and `gradle run` or `gradle -q --console plain run` to execute it.


## Assistance

If you are having trouble completing any part of this activity, then please talk
with either the course instructor or a technical leader . Alternatively, you may ask questions in the Slack workspace for this
course. 