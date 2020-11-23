package be.veraghtert.tutorial.semver.client;

import be.veraghtert.tutorial.semver.client.util.*;
import be.veraghtert.tutorial.semver.library.*;

public class Main {

    public static void main(String[] args) {
        Person fons = new Person("Fons");
        Name name = fons.getName();
        Util.print("Name is %s", name.getValue());
        Util.print("Name length is %s", new EnhancedName(name).length());
    }

}
