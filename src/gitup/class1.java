package gitup;

public class class1 {
	/*
	 * Basic commands:
		pwd   => print working directory => show where you are
		cd    => change directory (forward)
		cd .. => change directory (going back)
		mkdir => make directory => creates a folder
		rmdir => delete directory => delete folder
		ls    => list all
		dir   => list all (directory items)
		cls   => clean screen => delete all previous commands
		
        If you use Git and gitHub, what are the benefits of them for the company?
		They can secure their code.
		Team members can collaborate with each other
		Time and money saving
		Reach the codes easily
		Run codes from remote machine / you do not need your local machine everywhere
		
		We have 2 repos:
		Local and remote
		Git => local repo
		Eclipse / Staging area / local repository
		
		GitHub => remote repo
		Master branch / Development branch / My own branch
		
		Copy the project path: C:\Users\sam\eclipse-workspace\git_project001
		
		When you want to make your project a git repository, you should initialize it.
		git init
		Initialized empty Git repository in C:/Users/sam/eclipse-workspace/git_projec
		
		When you need to add files and folders,
		you should always use 
		git add fileName => this will add only one specified file
		git add .  => this will add everything(now in stating area)
		
		When you use 
		git status == nowthere are red color things
		it gives you all the current updates on your local git repository. So it is a user friendly git command
		When we add our files and folders on git, then they are on the staging area. 
		
		When we commit them, then will be created with an ID numer(hashcode) on the local repository
		git commit -m "First local commit"
		When you commit your changes, then they will be created on the local git repo
		5 files changed, 47 insertions(+)
		 create mode 100644 .classpath
		 create mode 100644 .project
		 create mode 100644 .settings/org.eclipse.jdt.core.prefs
		 create mode 100644 bin/first_package/FirstClass.class
		 create mode 100644 src/first_package/FirstClass.java
		
		Where is our id now for the commit?
		git log => commits history
		
		How can we see our branch or branches?
		git branch
		
		When we need to copy our main branch, we can copy it and create a new branch out of it.
		git branch branchName
		
		Then we can check the branch status with
		git branch
		
		Let say that you have some changes on your eclipse?
		How can you commit them following step by step instructions?
		git add . => takes everything from eclipse and brings them to staging area,
		Then 
		git commit -m "message"
		This creates a commit for your local changes on the local git repo.
		
		to check the status of cureent branch, we use 
		git branch
		it shows us on which branch we are currently.
		git branch branchName
		this creates a brand new branch 
		When we want to switch from one branch to another, we should use;
		git checkout branchName
		we should see the message below
		Switched to branch 'settar' 
		
		git merge means you can merge and get any thing from the merging branch.
		git merge  
		
		it will merge everything from merging branch
		Updating ab0dc01..ed7eec7
		Fast-forward
		 bin/first_package/FirstClass.class | Bin 639 -> 685 bytes
		 src/first_package/FirstClass.java  |   1 +
		 2 files changed, 1 insertion(+)
		
		When you have some codes on the same lines and you merge them, then you may face merge conflicts
		git merge branchName
		
		git init => when we initialize a project / git repository for the first time. 
		git add . => adds all files and folders on the staging area
		git commit -m "your commit message" => creates a commit with a unique hashcode and everthing gets saved in local repo.
		git status => user friendly commit that shows all status of your current branches and situations.
		git branch => shows you how many branches you have and on which you are currently.
		git branch branchName => creates a new branch on the local repo
		git checkout branchName => swtches from one branch to another
		git log => shows you all commit history
		git show (5 digits of commit hashCode) => gives you all details about that commit changes.
		git merge => merges a branch to another.
		
		git fetch => everything will be brought to your local repo.
		git push => this will normally send all your codes to remote repository.
		
		If you have new commits on the remote repository, 
		you cannot push your local commits before merging them.
		When you have new commits on the remote repo, 
		you should first merge them to your current branch, then you can commit and psuh them.
		
		When you have new commits on the remote repository, you should do 
		git fetch=remoteden getir
		git merge =icine yerlestir
		Then you can join them to your local branch
		
		git pull => git fetch => git merge

	 */
}
