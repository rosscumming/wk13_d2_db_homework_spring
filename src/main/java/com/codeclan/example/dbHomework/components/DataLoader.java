package com.codeclan.example.dbHomework.components;

import com.codeclan.example.dbHomework.models.File;
import com.codeclan.example.dbHomework.models.Folder;
import com.codeclan.example.dbHomework.models.User;
import com.codeclan.example.dbHomework.repositories.FileRepository;
import com.codeclan.example.dbHomework.repositories.FolderRepository;
import com.codeclan.example.dbHomework.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args) {
        User john = new User("John");
        userRepository.save(john);

        User barry = new User("Barry");
        userRepository.save(barry);

        Folder work = new Folder("work", john);
        folderRepository.save(work);

        Folder pictures = new Folder("pictures", barry);
        folderRepository.save(pictures);

        File contacts = new File("contacts", ".txt", 23, work);
        fileRepository.save(contacts);

        File selfie = new File("selfie", ".txt", 42, pictures);
        fileRepository.save(selfie);

        File cats = new File("cats", ".txt", 76, pictures);
        fileRepository.save(cats);


    }
}
