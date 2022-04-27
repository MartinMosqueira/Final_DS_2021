package model;

import java.io.File;

public class HomeDark implements HomeButton{
    private File file;

    public HomeDark(File file) {
        this.file = new File("img/casa.svg");
    }

    @Override
    public void getButton() {
    }
}
