package vilkensgard.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vilkensgard.domain.Notice;
import vilkensgard.repository.NoticeRepository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * Created by skaipio on 25/04/17.
 */
@RestController
@RequestMapping("/notice")
public class NoticeController {
    private final NoticeRepository noticeRepository;

    public NoticeController(NoticeRepository noticeRepository) {
        this.noticeRepository = noticeRepository;
    }

    @GetMapping
    public List<Notice> getNotices() {
        return StreamSupport.stream(noticeRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }
}
