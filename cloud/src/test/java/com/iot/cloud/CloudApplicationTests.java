package com.iot.cloud;

import com.iot.cloud.entity.DHT;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CloudApplicationTests {

    @Test
    public void contextLoads() {
    DHT dht = new DHT();
    dht.setId(12);
    System.err.println(dht.toString());
    }

}
