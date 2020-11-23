package be.veraghtert.tutorial.semver.client;

import be.veraghtert.tutorial.semver.library.*;

public class EnhancedName extends Name {

    public EnhancedName(Name wrapped) {
        super(wrapped.getValue());
    }

    public long length() {
        return getValue().length();
    }

}
