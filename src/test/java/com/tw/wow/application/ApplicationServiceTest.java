package com.tw.wow.application;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.io.IOException;

@Slf4j
class ApplicationServiceTest {

    private ApplicationService service = new ApplicationService();

    @Test
    void should_read_picture_from_classpath() throws IOException {
        String picture = service.readPicture();

        log.debug("picture: {}", picture);
    }

    @Test
    void should_write_picture() throws IOException {
        service.writePicture();
    }
}