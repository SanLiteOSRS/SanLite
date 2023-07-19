import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ae")
public class class20 {
	@ObfuscatedName("ae")
	public static String field99;
	@ObfuscatedName("gq")
	@ObfuscatedGetter(
		intValue = 687129681
	)
	@Export("currentPort")
	static int currentPort;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1591900797
	)
	final int field98;
	@ObfuscatedName("aj")
	final Map field94;
	@ObfuscatedName("ac")
	final String field96;

	class20(String var1) {
		this.field98 = 400; // L: 35
		this.field94 = null; // L: 36
		this.field96 = ""; // L: 37
	} // L: 38

	class20(HttpURLConnection var1) throws IOException {
		this.field98 = var1.getResponseCode(); // L: 17
		var1.getResponseMessage(); // L: 18
		this.field94 = var1.getHeaderFields(); // L: 19
		StringBuilder var2 = new StringBuilder(); // L: 20
		InputStream var3 = this.field98 >= 300 ? var1.getErrorStream() : var1.getInputStream(); // L: 21
		if (var3 != null) { // L: 22
			InputStreamReader var4 = new InputStreamReader(var3); // L: 23
			BufferedReader var5 = new BufferedReader(var4); // L: 24

			String var6;
			while ((var6 = var5.readLine()) != null) { // L: 26
				var2.append(var6); // L: 27
			}

			var3.close(); // L: 29
		}

		this.field96 = var2.toString(); // L: 31
	} // L: 32

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "115"
	)
	public int method310() {
		return this.field98; // L: 41
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/Map;",
		garbageValue = "1"
	)
	public Map method311() {
		return this.field94;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1175413617"
	)
	public String method312() {
		return this.field96; // L: 49
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([BZI)Ljava/lang/Object;",
		garbageValue = "1841455026"
	)
	public static Object method324(byte[] var0, boolean var1) {
		if (var0 == null) { // L: 7
			return null;
		} else if (var0.length > 136) { // L: 8
			DirectByteArrayCopier var2 = new DirectByteArrayCopier(); // L: 10
			var2.set(var0); // L: 11
			return var2; // L: 12
		} else {
			return var0; // L: 16
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1175700108"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null; // L: 117

		try {
			var0 = class106.getPreferencesFile("", class6.field15.name, true); // L: 119
			Buffer var1 = ScriptFrame.clientPreferences.toBuffer(); // L: 120
			var0.write(var1.array, 0, var1.offset); // L: 121
		} catch (Exception var3) { // L: 123
		}

		try {
			if (var0 != null) { // L: 125
				var0.closeSync(true); // L: 126
			}
		} catch (Exception var2) { // L: 129
		}

	} // L: 130

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Llc;",
		garbageValue = "-67"
	)
	public static PacketBufferNode method320() {
		PacketBufferNode var0 = VertexNormal.method5010(); // L: 42
		var0.clientPacket = null; // L: 43
		var0.clientPacketLength = 0; // L: 44
		var0.packetBuffer = new PacketBuffer(5000); // L: 45
		return var0; // L: 46
	}
}
