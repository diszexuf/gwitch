package ru.diszexuf.gwitch.service;

import ru.diszexuf.gwitch.model.Stream;

public interface StreamService {
    Stream getStreamByUser(String username);
    Stream deleteStreamByUser(String username);
}
