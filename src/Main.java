
/*
Objectives for Today

By the end of today, you will:
   * Understand how Version Control Systems allow us to save "checkpoints" as we work through writing code.
   * Define common terms associated with version control.
   * Identify ways to interact with the VCS "git" from the command line and through the IDE.
 */


/*
Vocabulary for the Day

Version Control System - A Version Control System (VCS) is a piece of software that is able to keep track of a history
of changes. VCS software comes in two major variants: centralized version control, which keeps track of a linear
history on a single server, and distributed version control, which keeps track of separate timelines each place the
software is duplicated.

Commit - The smallest unit of change in a VCS is called a "commit". A commit is stored as a list of differences between
a previous version and the new current version, along with metadata about who made a change and when.

Repository - A repository iis the name for an entire commit history related to a particular software project.

Branch - A series of commits that form a linear timeline is called a 'branch'. All branches of the same repository
share a single common ancestor.

 */


public class Main {
    public static void main(String[] args) {
        /*
        As we write code, we often find situations where we are afraid to make a change because we're not entirely sure
        of its effects.
        (Does anyone have an example? What did you do?)

        Often, this ends up incentivizing us to create many copies of our code, or many copies of entire files with
        version information in the filename.
         */
        fizzbuzz(100);

        /*
        Instead of keeping our old copies of the code in the file, we can use a "version control system" to track all
        our changes over time.

        This version control software lets us save 'checkpoints' in the code called commits, and at any point we're
        able to compare different checkpoints or restore a previous point in our history.

        There are many different VCS products out there, but we are going to use one of the most popular, called 'git'.

        We have two ways to interact with git:
           - We can use the command line interface
           - We can use a GUI tool, either in our IDE or standalone.

        I will try to show examples of how to do things both ways for most of the commands we're going to learn about
        today.

        (Questions?)

        To create a new repository for our code, the first thing we need to do is initialize a repository in our current
        folder. If we're in a command prompt, we can do this by typing the words:

        git init

        In IntelliJ, we can go up to the VCS menu on top of our project, select "Enable Version Control Integration...",
        and select Git from the menu.

        However, by default, the git repo won't save anything. The git repository creates a 'stage' with all the files
        that exist in this folder. This stage has information about which aren't tracked yet at all, which are tracked
        and have been changed, and which will be added/removed. We can always view the current statis of the stage with
        the 'git status' command.


        If we want to save a file, we have to do two steps:
           - Add the file to the list of things from our stage that we want to commit.
           - Perform the actual commit.

        There are a few different ways to add the file. We can either use 'git add <file>' in the terminal, right click
        the file and select add, or go directly to the commit dialog and check all the checkboxes for the files we want
        to commit.

        Then, we can commit, either by typing 'git commit -m "<message>"', or by going to the Git menu and selecting the
        "Commit" option. In the commit dialog, we're able to write a helpful descriptive message of the changes we made.

        Afterward, we can hit 'commit' to save those changes! Now those changes are saved, and we can even see a history
        of our past changes in the git panel under the "Log" tab.
        (Questions?)

        Now, let's say we want to update FizzBuzz to instead return a string rather than print out immediately.

        Now, let's go take a look at our stage again.
        (What do we expect to see?)
        We can see that our Main.java file appears in the list of unstaged changes. Let's take a look at what the file
        looks like when we view it.
        (What do you think those lines mean?)
        Our file is showing us line by line what changed in the file:
           - Green lines are the 'new' version of the code.
           - Grey/Red lines are the 'old' version of the code.

        In addition to viewing this in IntelliJ, we can view the same thing using the 'git diff' command.
        (How would I save these changes?)
        To save the changes and my second version of the command, I can just create a second commit.
         */
    }

    /*
    public static void fizzbuzz_attempt1(int limit) {
        int counter;
        for ( counter=0; counter < limit; counter++ ) {
            if ( counter % 3 == 0 ) {
                System.out.println("Fizz");
            }
            else if ( counter % 5 == 0 ) {
                System.out.println("Buzz");
            } else if ( counter % 3 == 0 && counter % 5 == 1) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(counter);
            }
        }
    }
     */

    public static String fizzbuzz(int limit) {
        String result = "";
        int counter;
        for ( counter=0; counter < limit; counter++ ) {
            if ( counter % 3 == 0 && counter % 5 == 1) {
                result = result + " " + "FizzBuzz";
            } else if ( counter % 3 == 0 ) {
                result = result + " " + "Fizz";
            }
            else if ( counter % 5 == 0 ) {
                result = result + " " + "Buzz";
            } else {
                result = result + " " + counter;
            }
        }
        return result;
    }


    /*
    public static void fizzbuzz(int limit) {
        int counter;
        for ( counter=0; counter < limit; counter++ ) {
            if ( counter % 3 == 0 && counter % 5 == 1) {
                System.out.println("FizzBuzz");
            } else if ( counter % 3 == 0 ) {
                System.out.println("Fizz");
            }
            else if ( counter % 5 == 0 ) {
                System.out.println("Buzz");
            } else {
                System.out.println(counter);
            }
        }
    }
     */

}
