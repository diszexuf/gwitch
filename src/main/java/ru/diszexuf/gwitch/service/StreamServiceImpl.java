package ru.diszexuf.gwitch.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.diszexuf.gwitch.model.Stream;
import ru.diszexuf.gwitch.repository.StreamRepository;

@Service
@AllArgsConstructor
public class StreamServiceImpl implements StreamService {

    private StreamRepository streamRepository;

    @Override
    public Stream getStreamByUser(String username) {
        return null;
    }

    @Override
    public Stream deleteStreamByUser(String username) {
        return null;
    }
}
