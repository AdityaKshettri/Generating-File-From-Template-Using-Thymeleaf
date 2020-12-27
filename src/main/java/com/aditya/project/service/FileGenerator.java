package com.aditya.project.service;

import com.aditya.project.config.ThymeleafConfig;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

@Service
public class FileGenerator {

    private static final String FILE_NAME = "file";

    public void generateFileUsingTemplate() throws IOException {
        Context context = new Context();
        context.setVariable("title", "Aditya");
        context.setVariable("name", "Aditya Kshettri");
        Writer writer = new FileWriter(FILE_NAME);
        writer.write(ThymeleafConfig.getTemplateEngine().process("template", context));
        writer.close();
    }
}
