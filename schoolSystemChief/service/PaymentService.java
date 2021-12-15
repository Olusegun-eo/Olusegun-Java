package schoolSystemChief.service;

import schoolSystemChief.models.Student;

import java.math.BigInteger;

public interface PaymentService {
    public void process(Student student, BigInteger amount);
}
