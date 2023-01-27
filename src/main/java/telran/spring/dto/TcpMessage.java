package telran.spring.dto;

import jakarta.validation.constraints.*;

public class TcpMessage extends Message {
public String ipAddress;
@Max(value = 50000) @Min(value = 1024)
public int port;
}
