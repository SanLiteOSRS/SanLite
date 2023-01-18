import com.jagex.oldscape.pub.OtlTokenRequester;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@Implements("OAuthApi")
@ObfuscatedName("com/jagex/oldscape/pub/OAuthApi")
public interface OAuthApi {
	void setOtlTokenRequester(OtlTokenRequester var1);

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
	)
	void setRefreshTokenRequester(RefreshAccessTokenRequester var1);

	long getAccountHash();

	boolean isOnLoginScreen();
}
