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
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("d")
public class class10 {
	@ObfuscatedName("ih")
	@ObfuscatedGetter(
		intValue = -2103251145
	)
	static int field58;
	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	static Widget field59;
	@ObfuscatedName("o")
	HttpsURLConnection field54;
	@ObfuscatedName("q")
	final Map field49;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	class399 field48;
	@ObfuscatedName("u")
	Map field51;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "La;"
	)
	final class9 field52;
	@ObfuscatedName("w")
	boolean field55;
	@ObfuscatedName("z")
	boolean field50;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1068233369
	)
	int field53;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;La;Z)V"
	)
	public class10(URL var1, class9 var2, boolean var3) throws IOException {
		this.field55 = false; // L: 20
		this.field50 = false; // L: 21
		this.field53 = 300000; // L: 22
		if (!var2.method68()) {
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.method79()); // L: 25
		} else {
			this.field54 = (HttpsURLConnection)var1.openConnection(); // L: 26
			if (!var3) { // L: 27
				this.field54.setSSLSocketFactory(class15.method190()); // L: 28
			}

			this.field52 = var2; // L: 30
			this.field49 = new HashMap(); // L: 31
			this.field51 = new HashMap(); // L: 32
		}
	} // L: 33

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1915450795"
	)
	public void method84(String var1, String var2) {
		if (!this.field55) { // L: 36
			this.field49.put(var1, var2); // L: 37
		}
	} // L: 38

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "877061987"
	)
	String method85() {
		ArrayList var1 = new ArrayList(this.field51.entrySet()); // L: 41
		Collections.sort(var1, new class18(this)); // L: 42
		StringBuilder var2 = new StringBuilder(); // L: 55
		Iterator var3 = var1.iterator(); // L: 56

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next(); // L: 57
			if (var2.length() > 0) { // L: 59
				var2.append(",");
			}

			var2.append(((class398)var4.getKey()).method7126()); // L: 60
			float var5 = (Float)var4.getValue(); // L: 61
			if (var5 < 1.0F) { // L: 62
				String var6 = Float.toString(var5).substring(0, 4); // L: 63
				var2.append(";q=" + var6); // L: 64
			}
		}

		return var2.toString(); // L: 68
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "111"
	)
	void method86() throws ProtocolException {
		if (!this.field55) { // L: 72
			this.field54.setRequestMethod(this.field52.method79()); // L: 73
			if (!this.field51.isEmpty()) { // L: 74
				this.field49.put("Accept", this.method85());
			}

			Iterator var1 = this.field49.entrySet().iterator(); // L: 75

			while (var1.hasNext()) {
				Entry var2 = (Entry)var1.next(); // L: 76
				this.field54.setRequestProperty((String)var2.getKey(), (String)var2.getValue()); // L: 78
			}

			if (this.field52.method70() && this.field48 != null) { // L: 81
				this.field54.setDoOutput(true); // L: 82
				ByteArrayOutputStream var13 = new ByteArrayOutputStream(); // L: 83

				try {
					var13.write(this.field48.vmethod7142()); // L: 85
					var13.writeTo(this.field54.getOutputStream()); // L: 86
				} catch (IOException var11) { // L: 88
					var11.printStackTrace(); // L: 89
				} finally {
					if (var13 != null) { // L: 92
						try {
							var13.close(); // L: 94
						} catch (IOException var10) { // L: 96
							var10.printStackTrace(); // L: 97
						}
					}

				}
			}

			this.field54.setConnectTimeout(this.field53); // L: 102
			this.field54.setInstanceFollowRedirects(this.field50); // L: 103
			this.field55 = true; // L: 104
		}
	} // L: 105

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1451597922"
	)
	boolean method87() throws IOException, SocketTimeoutException {
		if (!this.field55) { // L: 108
			this.method86();
		}

		this.field54.connect(); // L: 109
		return this.field54.getResponseCode() == -1; // L: 110
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Le;",
		garbageValue = "-1467171906"
	)
	class21 method88() {
		try {
			if (!this.field55 || this.field54.getResponseCode() == -1) { // L: 116
				return new class21("No REST response has been received yet.");
			}
		} catch (IOException var10) { // L: 118
			this.field54.disconnect(); // L: 119
			return new class21("Error decoding REST response code: " + var10.getMessage()); // L: 120
		}

		class21 var1 = null; // L: 122

		class21 var3;
		try {
			var1 = new class21(this.field54); // L: 124
			return var1; // L: 132
		} catch (IOException var8) { // L: 126
			var3 = new class21("Error decoding REST response: " + var8.getMessage()); // L: 127
		} finally {
			this.field54.disconnect(); // L: 130
		}

		return var3;
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1562727950"
	)
	static void method97() {
		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) { // L: 5020
			Tile.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false); // L: 5021
		}

	} // L: 5023
}
