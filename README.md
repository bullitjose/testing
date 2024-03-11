# Maven (from java-functional-programming)



[managing remote repositories](https://docs.github.com/en/get-started/getting-started-with-git/managing-remote-repositories#switching-remote-urls-from-https-to-ssh)


>Bootstrapping Application
1st, at intellij:

Start new Project at Intellij- New Project From VCS
		Url: "https://github.com/amigoscode/java-functional-programming.git"
		
2nd, create, same name project at our gitHub

3rd, locally, at our project directory:

**which git remote?**
```
git remote -v   
origin	https://github.com/amigoscode/java-functional-programming.git (fetch)
origin	https://github.com/amigoscode/java-functional-programming.git (push)
```
**remove origin!!**
```
git remote -v   
origin	https://github.com/amigoscode/java-functional-programming.git (fetch)
origin	https://github.com/amigoscode/java-functional-programming.git (push)
```
**add our new origin, to our github**
```
git remote add origin git@github.com:bullitjose/java-functional-programming.git
```
**add changes at local to origin, at github**
```
git push -u origin master

```
**download changes at github to local**
```
git pull origin master
```

# git and github

>…or create a new repository on the command line

```
echo "# testing" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/bullitjose/testing.git
git push -u origin main
```

> …or push an existing repository from the command line

```
git remote add origin https://github.com/bullitjose/testing.git
git branch -M main
git push -u origin main
```

#JUnit 5. (Java Master Class, amigosCode, lesson274)

[JUnit 5](https://junit.org/junit5/)

JUnit 5 = JUnit Platform + JUnit Jupiter + JUnit Vintage
