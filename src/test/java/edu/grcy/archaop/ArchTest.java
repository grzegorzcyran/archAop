package edu.grcy.archaop;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;
import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.RestController;

import static com.tngtech.archunit.core.domain.JavaClass.Predicates.resideInAPackage;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

public class ArchTest {

    @Test
    public void sampleTest() {
        JavaClasses classes = new ClassFileImporter().importPackages("edu.grcy.archaop");

        // add your rules here
        ArchRule rule = classes().that(resideInAPackage("edu.grcy.archaop.account"))
                .should().onlyBeAccessed().byAnyPackage("edu.grcy.aspect", "edu.grcy.archaop.account");

        rule.check(classes);
    }

    @Test
    public void failingTest() {
        JavaClasses classes = new ClassFileImporter().importPackages("edu.grcy.archaop");

        // add your rules here
        ArchRule rule = classes().that().resideInAPackage("edu.grcy.archaop.account")
                .and().haveNameNotMatching(".*AccessPoint")
                .or().resideInAPackage("edu.grcy.archaop.account")
                .and().areNotAnnotatedWith(RestController.class)
                        .should().notBePublic()
                .because("We want to keep our classes not visible to the outside world");

        rule.check(classes);
    }
}
