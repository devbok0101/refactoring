package me.whiteship.refactoring._02_duplicated_code._06_pull_up_method;

import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class ReviewerDashboard extends Dashboard {

    public void printReviewers() throws IOException {
        printUserName(30);
    }

    private void printUserName(int eventId) throws IOException {
        // Get github issue to check homework
        GitHub gitHub = GitHub.connect();
        GHRepository repository = gitHub.getRepository("whiteship/live-study");
        GHIssue issue = repository.getIssue(eventId);

        // Get userNames
        Set<String> userNames = new HashSet<>();
        issue.getComments().forEach(c -> userNames.add(c.getUserName()));

        // Print userNames
        userNames.forEach(System.out::println);
    }

}
