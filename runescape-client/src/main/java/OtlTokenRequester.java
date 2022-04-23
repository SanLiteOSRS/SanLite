import java.net.URL;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@Implements("OtlTokenRequester")
@ObfuscatedName("com/jagex/oldscape/pub/OtlTokenRequester")
public interface OtlTokenRequester {
	@Export("request")
	@ObfuscatedName("request")
	Future request(URL var1);
}
