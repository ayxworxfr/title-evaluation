package com.evildoer.evaluation.utils;

import io.github.swagger2markup.GroupBy;
import io.github.swagger2markup.Language;
import io.github.swagger2markup.Swagger2MarkupConfig;
import io.github.swagger2markup.Swagger2MarkupConverter;
import io.github.swagger2markup.builder.Swagger2MarkupConfigBuilder;
import io.github.swagger2markup.markup.builder.MarkupLanguage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URL;
import java.nio.file.Paths;

/**
 * @ClassName SwaggerGenerator
 * @Description TODO
 * @Author 安羽兮
 * @Date 2020/12/1418:06
 * @Version 1.0
 **/
public class SwaggerGenerator {
    @RunWith(SpringRunner.class)
    @SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
    public class DemoApplicationTests {
        @Test
        public void generateAsciiDocs() throws Exception {
            // 输出Ascii格式
            Swagger2MarkupConfig config = new Swagger2MarkupConfigBuilder()
                    .withMarkupLanguage(MarkupLanguage.ASCIIDOC) //设置生成格式
                    .withOutputLanguage(Language.ZH) //设置语言中文还是其他语言
                    .withPathsGroupedBy(GroupBy.TAGS)
                    .withGeneratedExamples()
                    .withoutInlineSchema()
                    .build();

            Swagger2MarkupConverter.from(new URL("http://localhost:8486/v2/api-docs"))
                    .withConfig(config)
                    .build()
                    .toFile(Paths.get("src/main/resources/docs/asciidoc"));
        }
    }
}
