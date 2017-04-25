package vilkensgard.repository

import vilkensgard.domain.Notice
import org.springframework.data.repository.CrudRepository

/**
 * Created by skaipio on 24/04/17.
 */
interface NoticeRepository : CrudRepository<Notice, Long>