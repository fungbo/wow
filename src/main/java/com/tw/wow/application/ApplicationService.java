package com.tw.wow.application;

import com.google.common.io.ByteStreams;
import com.google.common.io.Files;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.Base64;

@Service
public class ApplicationService {

    public String readPicture() throws IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        byte[] bytes = ByteStreams.toByteArray(classLoader.getResourceAsStream("pictures/signature.png"));

        return new String(Base64.getEncoder().encode(bytes));
    }

    public void writePicture() throws IOException {
        String content = readPicture();
        File file = new File("newPic.png");
        Files.write(Base64.getDecoder().decode(content), file);
    }
}
