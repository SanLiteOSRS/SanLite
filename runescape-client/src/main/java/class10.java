import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("x")
public class class10 {
	@ObfuscatedName("rz")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;
	@ObfuscatedName("i")
	HttpsURLConnection field46;
	@ObfuscatedName("w")
	final Map field40;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	class360 field41;
	@ObfuscatedName("a")
	Map field42;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lb;"
	)
	final class9 field43;
	@ObfuscatedName("g")
	boolean field44;
	@ObfuscatedName("e")
	boolean field45;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 592251103
	)
	int field47;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Lb;)V"
	)
	public class10(URL var1, class9 var2) throws IOException {
		this.field44 = false;
		this.field45 = false;
		this.field47 = 300000;
		if (!var2.method76()) {
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.method78());
		} else {
			this.field46 = (HttpsURLConnection)var1.openConnection();
			this.field46.setSSLSocketFactory(new class15());
			this.field43 = var2;
			this.field40 = new HashMap();
			this.field42 = new HashMap();
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1308010097"
	)
	public void method86(String var1, String var2) {
		if (!this.field44) {
			this.field40.put(var1, var2);
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1722889443"
	)
	String method87() {
		ArrayList var1 = new ArrayList(this.field42.entrySet());
		Collections.sort(var1, new class18(this));
		StringBuilder var2 = new StringBuilder();
		Iterator var3 = var1.iterator();

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next();
			if (var2.length() > 0) {
				var2.append(",");
			}

			var2.append(((class359)var4.getKey()).method6418());
			float var5 = (Float)var4.getValue();
			if (var5 < 1.0F) {
				String var6 = Float.toString(var5).substring(0, 4);
				var2.append(";q=" + var6);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-268892273"
	)
	void method88() throws ProtocolException {
		if (!this.field44) {
			this.field46.setRequestMethod(this.field43.method78());
			if (!this.field42.isEmpty()) {
				this.field40.put("Accept", this.method87());
			}

			Iterator var1 = this.field40.entrySet().iterator();

			while (var1.hasNext()) {
				Entry var2 = (Entry)var1.next();
				this.field46.setRequestProperty((String)var2.getKey(), (String)var2.getValue());
			}

			if (this.field43.method70() && this.field41 != null) {
				this.field46.setDoOutput(true);
				ByteArrayOutputStream var13 = new ByteArrayOutputStream();

				try {
					var13.write(this.field41.method6423(1606591795));
					var13.writeTo(this.field46.getOutputStream());
				} catch (IOException var11) {
					var11.printStackTrace();
				} finally {
					if (var13 != null) {
						try {
							var13.close();
						} catch (IOException var10) {
							var10.printStackTrace();
						}
					}

				}
			}

			this.field46.setConnectTimeout(this.field47);
			this.field46.setInstanceFollowRedirects(this.field45);
			this.field44 = true;
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "315003479"
	)
	boolean method89() throws IOException, SocketTimeoutException {
		if (!this.field44) {
			this.method88();
		}

		this.field46.connect();
		return this.field46.getResponseCode() == -1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Lm;",
		garbageValue = "-347704447"
	)
	class21 method100() {
		try {
			if (!this.field44 || this.field46.getResponseCode() == -1) {
				return new class21("No REST response has been received yet.");
			}
		} catch (IOException var10) {
			this.field46.disconnect();
			return new class21("Error decoding REST response code: " + var10.getMessage());
		}

		class21 var1 = null;

		class21 var3;
		try {
			var1 = new class21(this.field46);
			return var1;
		} catch (IOException var8) {
			var3 = new class21("Error decoding REST response: " + var8.getMessage());
		} finally {
			this.field46.disconnect();
		}

		return var3;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	static void method104() {
		Login.worldSelectOpen = false;
		RouteStrategy.leftTitleSprite.drawAt(Login.xPadding, 0);
		class139.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
		class16.logoSprite.drawAt(Login.xPadding + 382 - class16.logoSprite.subWidth / 2, 18);
	}
}
