package by.bsu.study;

import by.bsu.study.service.TextHandler;

import java.io.File;
import java.io.IOException;

/*В каждом слове сонета Вильяма Шекспира заменить первую букву слова
на прописную.*/
public class Main {
    public static void main(String[] args) {
        Main menu = new Main();
        menu.showUI();
    }

    private void showUI(){
        System.out.println("Lab 9 A, C. Work with text streams\n------\n");
        TextHandler handler = new TextHandler();
        String configPath = "./res/config.ini";

        //файл handledSonnet.txt и папка removedWords генерируются и спокойно могут быть удалены

        try {
            // get paths to input and output files
            String sonnetPathIn = handler.getConfigValue(configPath, "sonnetPathInput");
            String sonnetPathOut = handler.getConfigValue(configPath, "sonnetPathOutput");
            String removedWordsOut = handler.getConfigValue(configPath, "removedWordsOutput");

            // create directory for new file
            File file = new File(removedWordsOut);
            if(!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
                System.out.println("Cannot create directory!");
            }

            // get handled text from file and write it to the new file
            // A part
            String sonnet = handler.getTextWithCapitalLetters(sonnetPathIn);
            handler.writeTextFile(sonnetPathOut, sonnet); // write handler sonnet

            // C part
            String removedWords = handler.getTextWithRemovedWords(sonnetPathIn);
            handler.writeTextFile(removedWordsOut, removedWords);

            // output handled sonnet to console
            //A part
            System.out.println("Sonnet where all words starts with capital letter:\n");
            System.out.println(sonnet);
            System.out.println("-----\n");
            // C part
            System.out.println("Sonnet where removed words:\n");
            System.out.println(removedWords);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("------");
    }
}
