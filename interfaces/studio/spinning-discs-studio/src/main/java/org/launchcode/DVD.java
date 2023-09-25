package org.launchcode;

public class DVD extends Media implements Rewritable{

    public DVD(String name) {
        super(name, "DVD", 1200, 4700);
    }

    @Override
    public String toString() {
        return super.toString() + getFormattedFileList("video files");
    }

    // TODO: Implement your custom interface.

    @Override
    public void writeFile(File file) {
        spinDisc();
        if(getFiles().contains(file)){
            System.out.println("The  video " + file.getName() + " has already been added");
        } else if (getSpaceUsed() + file.getSize() > getCapacity()) {
            System.out.println("WARNING: there is not enough space on the " + getDiscType() + " for " + file.getName() + ".");
        } else {
            getFiles().add(file);
            System.out.println("The video" + file.getName() + " has been added to " + getName() + ".");
        }
    }

    @Override
    public void removeFile(File file) {
        spinDisc();
        if (filePresent(file)) {
            getFiles().remove(file);
            System.out.println("The file " + file.getName() + " has been removed");

        }
    }

    @Override
    public void reformatDisc() {
        spinDisc();
        getFiles().clear();

    }

    @Override
    public void runFile(File file) {
        if(filePresent(file)){
            spinDisc();
            System.out.println("watching" + file.getName() + "...");
        }

    }


    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
