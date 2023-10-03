package hello.core.authwired;

import hello.core.member.Member;
import jakarta.annotation.Nullable;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import java.util.Optional;

public class AutoWiredTest {

    @Test
    void autowiredOption() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);
    }

    @Configuration
    static class TestBean {

        @Autowired(required = false)
        public void setBean1(Member noBean1) {
            System.out.println("noBean1 = " + noBean1);
        }

        @Autowired(required = false)
        public void setBean2(@Nullable Member noBean2) {
            System.out.println("noBean2 = " + noBean2);
        }

        @Autowired(required = false)
        public void setBean3(Optional<Member> noBean3) {
            System.out.println("noBean3 = " + noBean3);
        }


    }
}
