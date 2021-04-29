
/*
Objectives for Today

By the end of today, you will:
   * Understand how we can store a git repository on a remote hosting service.
   * Identify the commands to:
        * sync remote changes to our local files
        * sync our local changes to the remote files
        * make a new local copy of a remote repository
   * Describe good practices for committing to repositories shared by multiple users.

 */

public class Collaboration {
    public static void main(String[] args) {
        /*
        Last class, we had discussed tracking changes over time using a version control system.
        We had seen how we can use git to create a 'commit'.
        (Can someone remind me what a 'commit' is?)
        These commits let us create a saved point in the history of our code that we could rewind to or branch off of.
        (make a commit.)

        Today, we're going to see how we can link our local git changes to a remote server so that the code can be
        shared to the public.

        In order to share a repository, we first have to add a 'remote' URL to the repository. However, before we do that,
         we have to create a remote copy of the repository. This can be done by creating your own git server on a
         computer somewhere, but more often, we use a website like GitHub, GitLab, or BitBucket.

         Once we create an account and log in, we have the ability to generate new uniquely-named repositories with the
         click of a button.

         Now that we've done this, we're ready to link our code to this remote repo. On the command line,
         we can do this by typing 'git remote add <name> <url>', or in IntelliJ, we can click the Git dropdown, select
         "Manage Remotes...", then click the + and set up our repository URL.
         */

        /*
        Once we've set up a remote branch, we're able to "push" our changes to the remote branch.
        We can do this by typing "git push" on the command line, or navigating to a branch and clicking the "push" option.

        (Click around in GitHub. Commits on left near code list. Show only master branch. Insights -> Network. )

        We can see that only the branch we pushed is visible to github, and right now github has a linear view of our
        history. However, every commit is visible, and we can see the whole history of our repository.
        (Questions?)

         */
    }

}
