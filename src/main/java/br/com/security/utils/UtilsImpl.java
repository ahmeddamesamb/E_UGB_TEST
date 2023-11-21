package br.com.security.utils;

import org.springframework.stereotype.Service;

import java.security.SecureRandom;

@Service
public class UtilsImpl implements Utils {
    @Override
    public String generateCodePin() {
        var random = new SecureRandom();
        random.nextBytes(new byte[20]);
        var tail = (int) Math.pow(10, 6);
        var codePin = random.nextInt(tail);
        while ((codePin + "").length() != 6) codePin = random.nextInt(tail);
        return (codePin + "");
    }
}
