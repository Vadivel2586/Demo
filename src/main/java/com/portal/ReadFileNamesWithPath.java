package com.portal;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ReadFileNamesWithPath {
    public static class VolDataBean{
        String vol;
        String chapter;
        String fileName;

        VolDataBean(){}

        public String getVol() {
            return vol;
        }

        public void setVol(String vol) {
            this.vol = vol;
        }

        public String getChapter() {
            return chapter;
        }

        public void setChapter(String chapter) {
            this.chapter = chapter;
        }

        public String getFileName() {
            return fileName;
        }

        public void setFileName(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public String toString() {
            return "VolDataBean{" +
                    "vol='" + vol + '\'' +
                    ", chapter='" + chapter + '\'' +
                    ", fileName='" + fileName + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) {
        String path = "D:\\Work"; // Specify your desired path here
        List<VolDataBean> volDataBeans = new ArrayList<>();
        new ReadFileNamesWithPath().listFoldersAndFiles(path,volDataBeans);
        System.out.println(volDataBeans.toString());
    }

    public List<VolDataBean> readFilesName(String path){
        List<VolDataBean> volDataBeans = new ArrayList<>();
        new ReadFileNamesWithPath().listFoldersAndFiles(path,volDataBeans);
        return volDataBeans;
    }

    private void listFoldersAndFiles(String directoryPath, List<VolDataBean> volDataBeans) {
        File directory = new File(directoryPath);
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    String[] splitData = file.getAbsolutePath().split("\\\\");
                    if(splitData.length>=4) {
                        VolDataBean volDataBean = new VolDataBean();
                        String vol = splitData[splitData.length - 3];
                        String chapter = splitData[splitData.length - 2];
                        String fileName = splitData[splitData.length - 1];

                        volDataBean.setVol(vol);
                        volDataBean.setChapter(chapter);
                        volDataBean.setFileName(fileName);
                        volDataBeans.add(volDataBean);
                        //insert query
                        //System.out.println(fileName);

                    }
                } else if (file.isDirectory()) {
                    listFoldersAndFiles(file.getAbsolutePath(), volDataBeans);
                }
            }
        }
    }
}
