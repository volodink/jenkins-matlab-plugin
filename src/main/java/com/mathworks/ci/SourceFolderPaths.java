package com.mathworks.ci;

/**
 * Copyright 2019-2020 The MathWorks, Inc.
 *
 * Describable class for Repeatable Source Folder text boxes in Source Folder option
 * in RunMATLABTest Build step.
 *
 */

import hudson.Extension;
import hudson.model.AbstractDescribableImpl;
import hudson.model.Descriptor;
import org.kohsuke.stapler.DataBoundConstructor;

public class SourceFolderPaths extends AbstractDescribableImpl<SourceFolderPaths> {

    private String srcFolderPath;

    @DataBoundConstructor
    public SourceFolderPaths(String srcFolderPath){
        this.srcFolderPath = srcFolderPath;
    }

    public String getSrcFolderPath() {
        return this.srcFolderPath;
    }

    @Extension
    public static final class DescriptorImpl extends Descriptor<SourceFolderPaths> {

        @Override
        public String getDisplayName() {
            return "";
        }
    }
}
