package me.whiteship.refactoring._02_duplicated_code._04_extract_function;

import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class StudyDashboard {

    private void printNamesById(int printId) throws IOException {
        GHIssue issue = getGhIssue(printId);
        print(getUserName(issue));
    }

    private void print(Set<String> participants) {
        participants.forEach(System.out::println);
    }

    private Set<String> getUserName(GHIssue issue) throws IOException {
        Set<String> userNames = new HashSet<>();
        issue.getComments().forEach(c -> userNames.add(c.getUserName()));
        return userNames;
    }

    private GHIssue getGhIssue(int eventId) throws IOException {
        GitHub gitHub = GitHub.connect();
        GHRepository repository = gitHub.getRepository("whiteship/live-study");
        return repository.getIssue(eventId);
    }

    public static void main(String[] args) throws IOException {
        final int participantsId = 15;
        final int reviewerId = 30;
        StudyDashboard studyDashboard = new StudyDashboard();
        studyDashboard.printNamesById(participantsId);
        studyDashboard.printNamesById(reviewerId);
    }

}
