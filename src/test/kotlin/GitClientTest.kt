import com.onetatwopi.jandi.network.GitClient
import org.junit.Test

class GitClientTest {
    @Test
    fun `로그인 테스트`() {
//        GitClient.login("")
        println(GitClient.loginId)
        println(GitClient.userToken)
    }
}