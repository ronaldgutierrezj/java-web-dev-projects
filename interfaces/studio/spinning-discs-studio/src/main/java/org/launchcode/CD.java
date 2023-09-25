package org.launchcode;

public class CD extends Media implements Rewritable {

    private boolean isMusicCd;

    public CD(String name,  boolean isMusicCd) {
        super(name,  "", 800, 700);
        this.isMusicCd = isMusicCd;

        setDiscType(isMusicCd? "music CD": "CD-RW");
    }

    public CD(String name){
     this(name,false);
    }

    public boolean isMusicCd() {
        return isMusicCd;
    }

    public void setMusicCd(boolean musicCd) {
        isMusicCd = musicCd;
    }

    @Override
    public String toString() {
        String header = isMusicCd? "Tracks": "Files";
        return super.toString() + getFormattedFileList(header);
    }
    // TODO: Implement your custom interface.

    @Override
    public void writeFile(File file) {
        spinDisc();
        String fileType = isMusicCd? "Track" : "Files";
        if(getFiles().contains(file)){
            System.out.println("The " + fileType + " " + file.getName() + " has already been added");
        } else if (getSpaceUsed() + file.getSize() > getCapacity()) {
            System.out.println("WARNING: there is not enough space on the " + getDiscType() + " for " + file.getName() + ".");
        } else {
            getFiles().add(file);
            System.out.println("The " + fileType + file.getName() + " has been added to " + getName() + ".");
        }


    }

    @Override
    public void removeFile(File file) {
        if(isMusicCd){
            System.out.println("files can not be removed from music cd");
        } else {
            spinDisc();
            if(filePresent(file)){
                getFiles().remove(file);
                System.out.println("The file " + file.getName() + " has been removed");
            }

        }

    }

    @Override
    public void reformatDisc() {
        spinDisc();
        getFiles().clear();
        setMusicCd(false);
        setDiscType("CD-RW");
        setName("unamed cd");

    }

    @Override
    public void runFile(File file) {
        if(filePresent(file)){
            spinDisc();
            String verb = isMusicCd? "playing" : "openning file";
            System.out.println(verb + file.getName() + "...");
        }

    }


    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
