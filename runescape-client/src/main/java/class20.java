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

@ObfuscatedName("af")
public class class20 {
	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	@Export("archive10")
	static Archive archive10;
	@ObfuscatedName("nt")
	@ObfuscatedGetter(
		intValue = 1684666697
	)
	@Export("menuX")
	static int menuX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 490221581
	)
	final int field111;
	@ObfuscatedName("al")
	final Map field110;
	@ObfuscatedName("ac")
	final String field116;

	class20(String var1) {
		this.field111 = 400; // L: 35
		this.field110 = null; // L: 36
		this.field116 = ""; // L: 37
	} // L: 38

	class20(HttpURLConnection var1) throws IOException {
		this.field111 = var1.getResponseCode(); // L: 17
		var1.getResponseMessage(); // L: 18
		this.field110 = var1.getHeaderFields(); // L: 19
		StringBuilder var2 = new StringBuilder(); // L: 20
		InputStream var3 = this.field111 >= 300 ? var1.getErrorStream() : var1.getInputStream(); // L: 21
		if (var3 != null) { // L: 22
			InputStreamReader var4 = new InputStreamReader(var3); // L: 23
			BufferedReader var5 = new BufferedReader(var4); // L: 24

			String var6;
			while ((var6 = var5.readLine()) != null) { // L: 26
				var2.append(var6); // L: 27
			}

			var3.close(); // L: 29
		}

		this.field116 = var2.toString(); // L: 31
	} // L: 32

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-273056484"
	)
	public int method285() {
		return this.field111; // L: 41
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Map;",
		garbageValue = "559887748"
	)
	public Map method283() {
		return this.field110; // L: 45
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-2017193459"
	)
	public String method286() {
		return this.field116; // L: 49
	}

	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "11"
	)
	static final void method291(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : class19.guestClanChannel; // L: 12022
		if (var2 != null && var1 >= 0 && var1 < var2.method3329()) { // L: 12023
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1); // L: 12024
			if (var3.rank == -1) {
				String var4 = var3.username.getName(); // L: 12026
				PacketBufferNode var5 = UserComparator9.getPacketBufferNode(ClientPacket.field3066, Client.packetWriter.isaacCipher); // L: 12027
				var5.packetBuffer.writeByte(3 + WorldMapLabel.stringCp1252NullTerminatedByteSize(var4)); // L: 12028
				var5.packetBuffer.writeByte(var0); // L: 12029
				var5.packetBuffer.writeShort(var1); // L: 12030
				var5.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 12031
				Client.packetWriter.addNode(var5); // L: 12032
			}
		}
	} // L: 12025 12033
}
