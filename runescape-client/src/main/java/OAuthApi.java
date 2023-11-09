import com.jagex.oldscape.pub.OtlTokenRequester;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@Implements("OAuthApi")
@ObfuscatedName("com/jagex/oldscape/pub/OAuthApi")
public interface OAuthApi {
	boolean isOnLoginScreen();

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
	)
	void setRefreshTokenRequester(RefreshAccessTokenRequester var1);

	long getAccountHash();

	void setOtlTokenRequester(OtlTokenRequester var1);
}
