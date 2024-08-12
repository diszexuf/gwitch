package ru.diszexuf.gwitch.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.diszexuf.gwitch.model.Stream;
import ru.diszexuf.gwitch.service.StreamService;

@RestController
@RequestMapping("api/stream")
@AllArgsConstructor
public class StreamController {

    private StreamService streamService;

    @GetMapping("/get_{username}")
    public Stream getStreamByUser(@PathVariable String username) {
        return streamService.getStreamByUser(username);
    }

    @DeleteMapping("/delete_{username}")
    public void deleteStreamByUser(@PathVariable String username) {
        streamService.deleteStreamByUser(username);
    }
}
