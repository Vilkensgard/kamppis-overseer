package vilkensgard.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

/**
 * Created by skaipio on 24/04/17.
 */

@Entity
class Notice {
    @Id
    @GeneratedValue
    var id: Long = 0
}