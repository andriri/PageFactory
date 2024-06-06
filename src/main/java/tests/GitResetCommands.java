package tests;

public class GitResetCommands {
	
	/*
	 * 1. Reset all files from staging area
	 * git reset (muta toate fisierele din staging inapoi in working directory)
	 * 
	 * 2. Reset single file from staging area
	 * git reset filename (muta un singur fisier din staging in working directory)
	 * 
	 * 
	 * 3.Reset a commit
	 * git reset HEAD^
	 * 
	 * 4. reset multiple commits
	 * git reset HEAD^~3 (nr de commit-uri)
	 * 
	 * --> git reset flags: (3 tipuri)
	 * 
	 * git reset --soft (sterge commitul din istoric si muta fisierele in staging area)
	 * git reset--soft HEAD^
	 * 
	 * git reset --mixed (sterge commitul din istoric si muta fisierele in working directory)
	 * 
	 * git reset --hard (sterge commitul din istoric si  fisierele)- NU o rulam decat la nevoie
	 *                                                             - NU se mai pot recupera
	 * 
	 * 5. delete a commit from remote repo
	 * a> delete commit from local
	 * 		git reset HEAD^
	 * b> push the change to remote which will delete the commit also from remote
	 * 		git push origin +HEAD
	 * 
	 * 
	 * 
	 * git reset - muta dintr-un loc in altul
	 * git stash- lucreaza cu 2 versiuni diferite ale aceluiasi fisier
	 * 
	 */
	
	

}
