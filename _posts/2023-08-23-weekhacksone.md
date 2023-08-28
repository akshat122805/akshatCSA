---
comments: True
layout: post
title: VSCode, GitHub Pages Setup HACKS
description: Overview of github pages setup and HACKS
type: hacks
courses: {'csse': {'week': 1}, 'csp': {'week': 1}, 'csa': {'week': 0}}
categories: ['C4.1']
---

Installation Insights:

During the development phase, version control is a tool frequently employed by developers. As I went through the setup, I jotted down my observations about version control. Essentially, version control is a method of systematically monitoring changes made to a specific repository.

I've always emphasized the significance of version control, especially during the initial setup phase.

It's crucial to keep a record of all the varied software tools we install for different tasks, along with their respective versions, compatibility considerations, and so on.

Local Machine and GitHub Files:

On my computer, files from GitHub are stored in a distinct "Linux" subsystem directory.

To access these files, I use the File Explorer and navigate to Ubuntu > home > vardaan > vscode. Here, I can view all my repositories and the files within them.

Alternatively, I can also access these files by launching a WSL shell and changing the directory to the home folder.

Accessing Files on GitHub Cloud:

To access files from a specific repository on GitHub Cloud, I can use GitHub Desktop and clone the desired repository.

Another option is to use GitHub's online platform to log into my account, view my repositories, and search for specific files.

Updating a Fork or Template:

If I need to update my fork with changes from the main student repository, I would use the terminal within my repository and execute the git fetch upstream command. This fetches all modifications from the original repository.

Subsequently, I would run the git merge upstream/main command to integrate all updates from the main branch into my fork.

Localhost vs. Deployed Server:

Viewing GitHub Pages on a localhost machine offers the advantage of immediate feedback during development. It allows for real-time error detection and quick adjustments. On the other hand, running on a deployed server is more suited for near-completion or finalized projects, offering a more polished presentation for peers to review.

Localhost URL and Accessibility:

The localhost URL for my distribution is localhost:4200/student. Since it's hosted on my personal machine, others cannot access it.

GitHub Pages URL and Accessibility:

The URL for my distribution on GitHub Pages is https://vardaansinha.github.io/vsstudent/. This URL is public, so anyone can view it.

Domain Name System (DNS) Insights:

DNS functions as the internet's address book. I haven't yet delved into changing the domain name of my student repository due to some setup delays with AWS. As such, I haven't modified the address.