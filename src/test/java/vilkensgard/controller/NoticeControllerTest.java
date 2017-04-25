package vilkensgard.controller;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import vilkensgard.domain.Notice;
import vilkensgard.repository.NoticeRepository;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by skaipio on 25/04/17.
 *
 * Let's do the BDD approach given-when-then. It's nicely concise and readable.
 * https://martinfowler.com/bliki/GivenWhenThen.html
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class NoticeControllerTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private NoticeRepository noticeRepository;

    @Test
    public void getNotices() throws Exception {
        givenThereAreNoticesInTheDatabase();
        ResultActions resultActions = whenGetNoticesIsCalled();
        thenItShouldReturnAllNoticesInTheDatabase(resultActions);
    }

    private void givenThereAreNoticesInTheDatabase() {
        noticeRepository.deleteAll();
        noticeRepository.save(new Notice());
        noticeRepository.save(new Notice());
    }

    private ResultActions whenGetNoticesIsCalled() throws Exception {
        return mvc.perform(MockMvcRequestBuilders.get("/notice").accept(MediaType.APPLICATION_JSON));
    }

    private void thenItShouldReturnAllNoticesInTheDatabase(ResultActions resultActions) throws Exception {
        resultActions.andExpect(status().isOk())
                .andExpect(content().json(getExpectedNoticeJson()));
    }

    private static String getExpectedNoticeJson() throws JSONException {
        return new JSONArray()
                .put(createSingleNoticeJson(1))
                .put(createSingleNoticeJson(2))
                .toString();
    }

    private static JSONObject createSingleNoticeJson(long id) throws JSONException {
        return new JSONObject().put("id", id);
    }
}